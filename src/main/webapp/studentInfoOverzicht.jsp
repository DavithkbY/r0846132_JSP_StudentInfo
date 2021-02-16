<%@ page import="domain.model.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.db.StudentDB" %>
<%
    StudentDB database = new StudentDB();

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <title>Student Info: Overzicht</title>
    <link rel="stylesheet" type="text/css" href="styling/style.css">
</head>
<body>

<table>
    <thead>
    <tr>
        <th>Naam</th>
        <th>Voornaam</th>
        <th>Leeftijd</th>
        <th>Studierichting</th>
    </tr>
    </thead>
    <tbody>
    <%
        for (Student student: database.students) {
        %>
        <tr>
            <td><%=student.getNaam() %></td>
            <td><%=student.getVoornaam() %></td>
            <td><%=student.getLeeftijd() %></td>
            <td><%=student.getStudierichting() %></td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

</body>
</html>
