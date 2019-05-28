<%-- 
    Document   : Login
    Created on : Jul 6, 2017, 2:33:02 AM
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>

        <meta charset="UTF-8">

        <title>Admin Login</title>

        <link rel="stylesheet" href="css/login.css" media="screen" type="text/css" />

    </head>

    <body>

    <html lang="en-US">
        <head>

            <meta charset="utf-8">

            <title>Login</title>

            <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">


        </head>

        <body>

            <div class="container">

                <div id="login">

                    <form action="LoginAdminController" method="post">

                        <fieldset class="clearfix">

                            <p><span class="fontawesome-user"></span><input type="text" name="userName" value="ADMIN" onBlur="if (this.value == '')
                                        this.value = 'ADMIN'" onFocus="if (this.value == 'ADMIN')
                                                    this.value = ''" required></p> 
                            <p><span class="fontawesome-lock"></span><input type="password" name="password" value="Password" onBlur="if (this.value == '')
                                        this.value = 'Password'" onFocus="if (this.value == 'Password')
                                                    this.value = ''" required></p> 
                            <p><input type="submit" value="Sign In"></p>

                        </fieldset>

                    </form>

                  
                </div> <!-- end login -->

            </div>

        </body>
    </html>

</body>

</html>