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
        <ul id="cd-gallery-items" class="cd-container">

            <%
                ResultSet rs = (ResultSet) request.getAttribute("rs");
                Vector<Product> vector = (Vector<Product>) request.getAttribute("vector");
            %>
            <%    while (rs.previous()) {%> 
            <li>
                <img src="<%=rs.getString(5)%>" height="350" alt="Preview image">
                <div class="alert alert-info" width="350">
                    <%=rs.getString(6)%>
                </div>

                <a href="Add2Cart.jsp?id=<%=rs.getString(1)%>">
                    <button type="button" class="btn btn-danger btn-circle" >Buy
                    </button></a>
                <a href="#" class="btn btn-primary">$ <%=rs.getString(4)%></a>

                <a href="#" class="btn btn-success" ><%=rs.getString(2)%></a>

            </li>
            <%}%>

            <!-- cd-cart -->
        </ul> <!-- cd-gallery-items -->
    </main>
           
    <!-- cd-cart -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="SourceList/js/main.js"></script> <!-- Gem jQuery -->
</body>
</html>