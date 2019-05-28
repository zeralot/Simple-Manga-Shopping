<%@page import="model.ConnectionDB"%>
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
            <h1 align="center">Shopping Cart Details</h1>
            <div class="row col-md-12 col-md-offset-0 custyle">
                <table  class="table table-striped custab">


                    <!--<form action="showCart.jsp" method="Post">-->
                    <tr>
                        <th>PID</th>
                        <th>Product Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total</th>
                        <th>Update</th>
                        <th>Remove</th>
                    </tr>
                    <%
                        ConnectionDB conDB = new ConnectionDB();
                        String service = request.getParameter("service");
                        if (service == null || service.equals("")) {
                            service = "displayCart";
                        }
                        if (service.equals("update")) {

                            session.setAttribute(request.getParameter("id"), request.getParameter("quantity"));
                            out.println(request.getParameter("quantity"));

                            response.sendRedirect("showCart.jsp");
                        }
                        if (service.equals("remove")) {
                            session.removeAttribute(request.getParameter("id"));

                            response.sendRedirect("showCart.jsp");
                        }
                        if (service.equals("removeall")) {
                            java.util.Enumeration em = session.getAttributeNames();
                            for (; em.hasMoreElements();) {
                                session.removeAttribute(em.nextElement().toString());
                            }

                            response.sendRedirect("showCart.jsp");
                        }
                        java.util.Enumeration em = session.getAttributeNames();
                        for (; em.hasMoreElements();) {
                            String id = em.nextElement().toString();

                            ResultSet rs = conDB.getData("Select * from Product where pid ='" + id + "'");

                            //get value from session object (see HttpSession)
                            String count = session.getAttribute(id).toString();
                            if (service.equals("displayCart")) {
                                if (rs.next()) {%>
                    <form action ="showCart.jsp" method ="Post">

                        <tr>
                            <td><%=rs.getString(1)%></td>
                            <td><%=rs.getString(2)%></td>
                            <td><input type ="text" name="quantity" value ="<%=count%>" ></td>
                            <td><%=rs.getDouble(4)%></td>
                            <td><%=(rs.getDouble(4) * Integer.parseInt(count))%></td>

                            <td><a onclick="window.location.href = 'showCart.jsp'"><button  class="btn btn-primary"><i class="fa fa-edit "></i> Update </button></a></td>
                            <td><a href = "showCart.jsp?id=<%=rs.getString(1)%>&service=remove"><button class="btn btn-danger"  ><i class="fa fa-pencil"></i> Delete </button></a></td>

                        </tr>           
                        <input type ="hidden" name ="service" value ="update">
                        <input type ="hidden" name ="id" value ="<%=rs.getString(1)%>"
                    </form>
                    <%               }
                            }

                        }%>

                    <tr> <a href ="showCart.jsp?service=removeall" class="btn btn-warning">Remove All</a></tr>
                </table>
            </div>

            <!--</form>-->
            <a href="ProControllerClient" class="btn btn-default btn-lg">Back to shop</a>
            <a href="checkout.jsp"><button type="button" class="btn btn-info btn-circle"  ><i class="fa fa-check"></i>
                </button></a>

        </main>

    </body>
</html>
