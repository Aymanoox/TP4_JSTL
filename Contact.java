package model;

public class Contact {
    private int idContact;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;

    public Contact() {}

    // Getters and Setters
    public int getIdContact() { return idContact; }
    public void setIdContact(int idContact) { this.idContact = idContact; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
