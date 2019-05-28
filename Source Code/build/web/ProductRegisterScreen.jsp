<%@page import="java.sql.SQLException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="entity.Category"%>
<%@page import="model.ConnectionDB"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Admin</title>
        <!-- BOOTSTRAP STYLES-->
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FONTAWESOME STYLES-->
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- MORRIS CHART STYLES-->
        <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
        <link href="assets/css/custom.css" rel="stylesheet" />
        <!-- GOOGLE FONTS-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    </head>
    <body>
        <div id="wrapper">
            <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="AdminScreen.jsp">Admin</a> 
                </div>
                <div style="color: white;
                     padding: 15px 50px 5px 50px;
                     float: right;
                     font-size: 16px;"><%=session.getAttribute("userName")%> <a href="href="LogoutController"" class="btn btn-danger square-btn-adjust">Logout</a> </div>
            </nav>   
            <!-- /. NAV TOP  -->
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">
                        <li class="text-center">
                            <img src="assets/img/find_user.png" class="user-image img-responsive"/>
                        </li>
                        <li>
                            <a  class="active-menu" href="#"><i class="fa fa-dashboard fa-3x"></i> Product <span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="ProController">Product Manager</a>
                                </li>
                                <li>
                                    <a href="ProductRegisterScreen.jsp">Add Product</a>
                                </li>                 
                            </ul>
                        </li>  
                        <li>
                            <a  href="CusController"><i class="fa fa-desktop fa-3x"></i> Customer </a>
                        </li>                       
                        <li>
                            <a   href="#"><i class="fa fa-qrcode fa-3x"></i> Category <span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="CatController">Categories Manager</a>
                                </li>
                                <li>
                                    <a href="CategoryRegisterScreen.jsp">Add Category</a>
                                </li>                 
                            </ul>
                        </li>  
                    </ul>
                </div>
            </nav>  
            <div id="page-wrapper" >
                <div id="page-inner">
                    <h2 align="center"> Add Product </h2>
                    <form action="ProController" method="GET" class="form-horizontal">
                        <fieldset>
                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Product ID</label>  
                                <div class="col-md-4">
                                    <input name="pid" type="text" placeholder="Product ID" class="form-control input-md" required="">
                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Product Name</label>  
                                <div class="col-md-4">
                                    <input name="pname" type="text" placeholder="Product Name" class="form-control input-md" required="">
                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Quantity</label>  
                                <div class="col-md-4">
                                    <input name="quantity" type="text" placeholder="Quantity" class="form-control input-md" required="">
                                </div>
                            </div>


                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Prices</label>  
                                <div class="col-md-4">
                                    <input name="price" type="text" placeholder="Prices" class="form-control input-md" required="">
                                </div>
                            </div>


                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Images</label>  
                                <div class="col-md-4">
                                    <input name="images" type="file" >
                                </div>
                            </div>


                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Description</label>  
                                <div class="col-md-4">
                                    <input name="description" type="text" placeholder="Description" class="form-control input-md" required="">
                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Status</label>  
                                <div class="col-md-4">
                                    <input type="radio" name="status" value="1" checked="checked" /> Enable
                                    <input type="radio" name="status" value="0" /> Disable

                                </div>
                            </div>



                            <%
                                ConnectionDB conDB = new ConnectionDB();

                                ArrayList<Category> categories = new ArrayList<>();
                                ResultSet res = conDB.getData("SELECT* FROM Category WHERE status=1");
                                out.println("<div class=\"form-group\"><label class=\"col-md-4 control-label\">Category </label>  <select name=\"Categories\" id=\"Categories\">");
                                try {
                                    while (res.next()) {
                                        Category c = new Category(res.getInt(1), res.getString(2), res.getInt(3));
                                        categories.add(c);
                                        out.println("<option value=" + c.getCtid() + ">" + c.getCname() + "</option>");
                                    }
                                } catch (SQLException ex) {
                                    System.out.println("Error at ProductController");
                                }
                            %>
                            </select></div>

                            <!-- Button (Double) -->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="simpan"></label>
                                <div class="col-md-8">
                                    <button type="submit" class="btn btn-success">Register</button>
                                    <button type="reset" class="btn btn-danger">Clear</button>
                                </div>
                            </div>
                            <input type="hidden" name="service" value="register" />
                        </fieldset>
                    </form>




                </div>
            </div>
            <!-- /. WRAPPER  -->
            <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
            <!-- JQUERY SCRIPTS -->
            <script src="assets/js/jquery-1.10.2.js"></script>
            <!-- BOOTSTRAP SCRIPTS -->
            <script src="assets/js/bootstrap.min.js"></script>
            <!-- METISMENU SCRIPTS -->
            <script src="assets/js/jquery.metisMenu.js"></script>
            <!-- MORRIS CHART SCRIPTS -->
            <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
            <script src="assets/js/morris/morris.js"></script>
            <!-- CUSTOM SCRIPTS -->
            <script src="assets/js/custom.js"></script>

    </body>
</html>

