<%@page import="java.util.Vector"%>
<%@page import="entity.Customer"%>
<%@page import="model.DAOCustomer"%>
<%@page import="model.ConnectionDB"%>
<%@page import="java.sql.ResultSet"%>
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
                     font-size: 16px;"> <%=session.getAttribute("userName")%> <a href="href="LogoutController"" class="btn btn-danger square-btn-adjust">Logout</a> </div>
            </nav>   
            <!-- /. NAV TOP  -->
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">
                        <li class="text-center">
                            <img src="assets/img/find_user.png" class="user-image img-responsive"/>
                        </li>
                        <li>
                            <a   href="#"><i class="fa fa-dashboard fa-3x"></i> Product <span class="fa arrow"></span></a>
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
                            <a class="active-menu"  href="CusController"><i class="fa fa-desktop fa-3x"></i> Customer </a>
                        </li>                       
                        <li>
                            <a  href="#"><i class="fa fa-qrcode fa-3x"></i> Category <span class="fa arrow"></span></a>
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
            <!-- /. NAV SIDE  -->
            <div id="page-wrapper" >
                <div id="page-inner">
                    <%
                        Customer cus = (Customer) request.getAttribute("cus");
                    %>
                    <form action="CusController" method="POST" class="form-horizontal">
                        <fieldset>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Customer id</label>  
                                <div class="col-md-4">
                                    <input name="cid" type="text" value="<%= cus.getCid()%>" class="form-control input-md" readonly>
                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">FullName</label>  
                                <div class="col-md-4">
                                    <input name="fname" type="text" value="<%= cus.getFullname()%>" class="form-control input-md" required="">
                                </div>
                            </div>


                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Address</label>  
                                <div class="col-md-4">
                                    <input name="address" type="text" value="<%= cus.getAddress()%>" class="form-control input-md" required="">
                                </div>
                            </div>


                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Phone</label>  
                                <div class="col-md-4">
                                    <input name="phone" type="text" value="<%= cus.getPhone()%>"  class="form-control input-md" required="">
                                </div>
                            </div>


                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">E-mail</label>  
                                <div class="col-md-4">
                                    <input name="email" type="text" value="<%= cus.getEmail()%>" class="form-control input-md" required="">
                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">User Name</label>  
                                <div class="col-md-4">
                                    <input name="userName" type="text" value="<%= cus.getUsername()%>"  class="form-control input-md" required="">
                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">PassWord</label>  
                                <div class="col-md-4">
                                    <input name="password" type="password" value="<%= cus.getPassword()%>" class="form-control input-md" required="">
                                </div>
                            </div>
                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label">Status</label>  
                                <div class="col-md-4">
                                    <input type="radio" name="status" value="1" <%= cus.getStatus() == 1 ? "checked" : ""%> /> Enable
                                    <input type="radio" name="status" value="0" <%= cus.getStatus() == 0 ? "checked" : ""%> /> Disable

                                </div>
                            </div>

                            <!-- Button (Double) -->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="simpan"></label>
                                <div class="col-md-8">
                                    <button type="submit" class="btn btn-success">Update</button>
                                    <button type="reset" class="btn btn-danger">Clear</button>
                                </div>
                            </div>
                            <input type="hidden" name="service" value="update" />

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
