<%-- 
    Document   : CustomerRegister
    Created on : May 30, 2017, 3:37:27 PM
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/signUp.css" rel='stylesheet' type='text/css'>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="CusController" method="GET">
            <div class='login'>
                <h2>Register</h2>
                <input name='userName' placeholder='Username' type='text'>
                <input name='password' placeholder='Password' type='password'>
                <input name='fname' placeholder='FullName' type='text'>
                <input name='address' placeholder='Address' type='text'>
                <input name='phone' placeholder='Phone' type='text'>
                <input name='email' placeholder='Email' type='text'>
                <div class='agree'>
                    <input type="radio" name="status" value="1" checked="checked" /> Enable
                    <input type="radio" name="status" value="0" /> Disable
                </div>
                <input class='animated' type='submit' value='Register'>
            </div>
            <input type="hidden" name="service" value="register" />
        </form>
    </body>
</html>
