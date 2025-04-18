<form action="ControllerServlet" method="POST">
    <input type="hidden" name="do_this" value="create"/>
    <table>
        <tr><td>First Name</td><td><input type="text" name="firstName"/></td></tr>
        <tr><td>Last Name</td><td><input type="text" name="lastName"/></td></tr>
        <tr><td>Email</td><td><input type="email" name="email"/></td></tr>
        <tr><td>Phone</td><td><input type="text" name="phone"/></td></tr>
        <tr><td>Address</td><td><input type="text" name="address"/></td></tr>
        <tr><td></td><td><input type="submit" value="Save"/></td></tr>
    </table>
</form>
