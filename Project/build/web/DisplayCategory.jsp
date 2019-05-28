<%@page import="entity.Category"%>
<%@page import="java.util.Vector"%>
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
                     font-size: 16px;"> <%=session.getAttribute("userName")%><a href="LogoutController" class="btn btn-danger square-btn-adjust">Logout</a> </div></nav>   
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
                            <a  href="CusController"><i class="fa fa-desktop fa-3x"></i> Customer </a>
                        </li>                       
                        <li>
                            <a  class="active-menu" href="#"><i class="fa fa-qrcode fa-3x"></i> Category <span class="fa arrow"></span></a>
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
                    <%
                        ResultSet rs = (ResultSet) request.getAttribute("rs");
                        Vector<Category> vector = (Vector<Category>) request.getAttribute("vector");
                    %>
                    <h2 align="center"> Category Manager </h2>
                    <div class="row col-md-6 col-md-offset-3 custyle">
                        <table  class="table table-striped custab">


                            <tr>
                                <th>Category Name</th>
                                <th>Status</th>
                                <th class="text-center">Action</th>             
                            </tr>
                            <%    while (rs.previous()) {%>    
                            <tr>
                                <td><%=rs.getString(2)%></td>
                                <td><%=(rs.getInt(3) == 1 ? "Active" : "Deactive")%></td>
                                <td class="text-center"><a class='btn btn-info btn-xs' href="CatController?id=<%=rs.getInt(1)%>&service=preUpdate"><span class="glyphicon glyphicon-edit"></span>Edit</a>
                                    <a href="CatController?id=<%=rs.getInt(1)%>&service=delete" 
                                       onclick="return confirm('Are you sure?')" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Delete</a>
                                </td>
                            </tr>
                            <%}%>
                        </table>
                    </div>
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

