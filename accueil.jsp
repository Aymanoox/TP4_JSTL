<c:forEach var="contact" items="${requestScope.listContacts}">
<tr>
    <td>${contact.idContact}</td>
    <td>${contact.firstName}</td>
    <td>${contact.lastName}</td>
    <td>${contact.email}</td>
    <td>${contact.phone}</td>
    <td>${contact.address}</td>
</tr>
</c:forEach>
