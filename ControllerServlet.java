
ContactFacade contactFacade = new ContactFacade();

...

} else if (do_this.equals("create")) {
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    String address = request.getParameter("address");

    if (lastName == null) {
        response.sendRedirect("addContact.jsp");
    } else {
        contactFacade.createContact(firstName, lastName, email, phone, address);
        response.sendRedirect("ControllerServlet");
    }

}
