<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 21-10-19
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculation</title>
</head>
<body>
<h1>Calculation</h1>
<form action="/calculation" method="post">
    firstNumber: <input type ="text" name="number1"/></br>
    secondNumber: <input type ="text" name="number2"/></br>
    <select name="opera">
                <option value="addition">+</option>
                <option value="subtraction">-</option>
                <option value ="multiplication">*</option>
                <option value="division">/</option>
    </select>
    <input type="submit" value="Calculation"/>
    <h1> Result :${r}</h1>

</form>

</body>
</html>
