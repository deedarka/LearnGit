<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="content-type" content="text/html">
  <title>JSP - Hello World</title>
</head>
<body>

<div align="center">
  <h1 background-color ="pink">BOOK STORE </h1>

    <table style="with: 100%">
      <P>
        <td>STORE  A NEW BOOK
      <tr>
      <form METHOD="GET" action="/src/main/webapps/add.jsp">
        <div align="=center"> <td><a href="add.jsp" ><button value="ADDDt"/>ADD</a>
        </div></form>
    <tr>
      <tr>
        <td>Book  Details </td>
        <tr>
      <form method = "get" action="/hello-servlet">
        <div align="=center"> <td><a href="hello-servlet" ><button value="ADDDt"/>BOOK DETAILS</a>
        </div></form>
      </tr>

    </table>


</div>
</body>
</html>