<%--
  Created by IntelliJ IDEA.
  User: FD_Crash
  Date: 04.02.2019
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body bgcolor="#aaccff">
<Font color="green" size="10">
    Форма для работы со словарем
</Font>
<br>
<br>
<form name="frm" method="Get" action="MyServlet">
    <Font color="blue" size="6"> Введите слово:</Font><Input type="Text" name="text" value=""/>
    <br>
    <br>
    <h4>Кликни здесь для получения перевода :<Input type="submit" value="Перевести"/></h4>
</form>
</body>
</html>
