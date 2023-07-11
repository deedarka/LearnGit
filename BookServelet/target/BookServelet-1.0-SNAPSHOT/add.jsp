<%--
  Created by IntelliJ IDEA.
  User: kaurd
  Date: 5/12/2023
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Book Information</title>

</head>
<div align="center">
    <h1 style="background-color:pink">BOOK STORE </h1>
<%--    <img align="image-2" src="/src/main/webapps/image-2.webp" style="width: 250px; height: 250px;">--%>
    <table style="with: 100%">
        <tr>
            <td>
        <tr>
            <form method = "Get" action="/hello-servlet">
                <br>
                Book Name: <input type="text" name ="Book Name" value="null"/>
                <br>
                Book Witter:<input type="text" name ="Book Witter" value="null"/>
                <br>
                Book Issue year:<input type="text" name ="Book Issue Year" value="null"/>
                <br>
                Pages of Book:<input type="text" name ="Book Pages" value="null"/>
                <br>
                <div align="=center"> <td>
                    <a href="hello-servlet" >
                        <button   type ="submit " value="btn1"/>ADD</a>
                </td>
                </div></form>
        </tr>
    </table>
</div>


</html>
