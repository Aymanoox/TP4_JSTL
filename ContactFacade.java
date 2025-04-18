package model;

import java.sql.*;
import java.util.*;

public class ContactFacade {
    private Connection conn;

    public ContactFacade() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/MyDBTP4", "root", "1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Contact> findAll() {
        List<Contact> list = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Contact");
            while (rs.next()) {
                Contact c = new Contact();
                c.setIdContact(rs.getInt("ID_CONTACT"));
                c.setFirstName(rs.getString("FIRSTNAME"));
                c.setLastName(rs.getString("LASTNAME"));
                c.setEmail(rs.getString("EMAIL"));
                c.setPhone(rs.getString("PHONE"));
                c.setAddress(rs.getString("ADDRESS"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void createContact(String firstName, String lastName, String email, String phone, String address) {
        try {
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO Contact(FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, address);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteContact(String id) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Contact WHERE ID_CONTACT=?");
            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
