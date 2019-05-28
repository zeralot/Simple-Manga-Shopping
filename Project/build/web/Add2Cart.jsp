<%@page import="entity.Product"%>
<%@page import="java.util.Vector"%>
<%@page import="java.sql.ResultSet"%>
<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FONTAWESOME STYLES-->
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
        <link href="assets/css/custom.css" rel="stylesheet" />
        <!-- GOOGLE FONTS-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> 

        <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="SourceList/css/reset.css"> <!-- CSS reset -->
        <link rel="stylesheet" href="SourceList/css/style.css"> <!-- Gem style -->
        <script src="SourceList/js/modernizr.js"></script> <!-- Modernizr -->

        <title>Shopping</title>
    </head>
    <body>
        <header>
            <div id="logo"><img src="SourceList/img/cd-logo.svg" alt="Homepage"></div>
            <div id="cd-hamburger-menu"><a class="cd-img-replace" href="#0">Menu</a></div>
            <div id="cd-cart-trigger"><a class="cd-img-replace" href="#0">Cart</a></div>
        </header>

        <nav id="main-nav">
            <ul>
                <li><a class="current" ><%=session.getAttribute("userName")%></a></li>
                <li><a  href="LogoutController">Log Out</a></li>
            </ul>
        </nav>
        <main>
            <%
                String id = request.getParameter("id");
                Object value = session.getAttribute(id);
                //the first time the product is selected
                if (value == null) {
                    //put name-value pair into session object (see HttpSession)
                    session.setAttribute(id, "1");
                } //the second/third... time the product is selected
                else {
                    int count = Integer.parseInt(value.toString()) + 1;
                    //put name-value pair into session object (see HttpSession)
                    session.setAttribute(id, String.valueOf(count));

                }
            %>
            <div class="panel-body">
                <div class="progress">
                    <div class="progress-bar progress-bar-success" style="width: 33%">
                        <span class="sr-only">33% Complete (success)</span>
                    </div>
                    <div class="progress-bar progress-bar-warning" style="width: 33%">
                        <span class="sr-only">33% Complete (warning)</span>
                    </div>
                    <div class="progress-bar progress-bar-danger" style="width: 33%">
                        <span class="sr-only">33% Complete (danger)</span>
                    </div>
                </div>
            </div>
            <div class="alert alert-info" align="center">
                <h1>Item with id=<%=id%> was added to the Shopping Cart</h1>
            </div>
            <a href="showCart.jsp" class="btn btn-success btn-lg center-block">Show Shopping Cart</a>
        </main>
    </body>
</html>
