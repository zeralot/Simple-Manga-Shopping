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

        <title>Login</title>

        <link rel="stylesheet" href="css/login.css" media="screen" type="text/css" />

    </head>

    <body>

    <html lang="en-US">
        <head>

            <meta charset="utf-8">

            <title>Login</title>

            <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">

            <!--[if lt IE 9]>
          <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
         <![endif]-->

        </head>

        <body>

            <div class="container">

                <div id="login">

                    <form action="CusController" method="get">

                        <fieldset class="clearfix">

                          <p><span class="fontawesome-user"></span><input type="text" name="userName" value="UserName" onBlur="if (this.value == '')
                                        this.value = 'UserName'" onFocus="if (this.value == 'UserName')
                                                    this.value = ''" required></p> 
                            <p><span class="fontawesome-lock"></span><input type="password" name="password" value="Password" onBlur="if (this.value == '')
                                        this.value = 'Password'" onFocus="if (this.value == 'Password')
                                                    this.value = ''" required></p> 
                            <p><input type="submit" value="Sign In"></p>


                        </fieldset>
                         <input type="hidden" name="service" value="login" />

                    </form>
                    

                    <p>Not a member? <a href="CustomerRegisterScreen.jsp">Sign up now</a><span class="fontawesome-arrow-right"></span></p>

                </div> <!-- end login -->

            </div>

        </body>
    </html>

</body>

</html>