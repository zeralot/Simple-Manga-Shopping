<%@page import="entity.BillDetail"%>
<%@page import="controller.CusController"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page import="model.DAOBillDetail"%>
<%@page import="model.DAOBill"%>
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
        <h1 align="center">Checkout!</h1>
        <%
            ConnectionDB conDB = new ConnectionDB();
            //your business code come here
            DAOBill daoBill = new DAOBill(conDB);
            DAOBillDetail daoBD = new DAOBillDetail(conDB);
            String cusName = session.getAttribute("userName").toString();
            int cid = 0;
            String cname = null;
            String cadress = null;
            String cphone = null;
            ResultSet rs2 = conDB.getData("select * from Customer where username='" + cusName + "'");
            try {
                if (rs2.next()) {
                    cid = rs2.getInt(1);
                    cname = rs2.getString(2);
                    cadress = rs2.getString(3);
                    cphone = rs2.getString(5);

                }
            } catch (SQLException ex) {
                Logger.getLogger(CusController.class.getName()).log(Level.SEVERE, null, ex);
            }

            int bid = daoBill.createBill(cid, cname, cadress, cphone);
            double price = 0;

            session.removeAttribute("userName");
            session.removeAttribute("password");

            double Total = 0;

            java.util.Enumeration em = session.getAttributeNames();

            while (em.hasMoreElements()) {
                String pid = em.nextElement().toString();
                ResultSet rs = conDB.getData("Select price from Product where pid = '" + pid + "'");

                if (rs.next()) {
                    price = rs.getDouble(1);
                }

                int quantity = Integer.parseInt(session.getAttribute(pid).toString());
                System.out.println(quantity);
                double money = price * quantity;

                //            out.println("pid " + pid + " quantity " + quantity + " bid"+ bid);
                BillDetail bd = new BillDetail(bid, pid, quantity, money);

                daoBD.addBillDetail(bd);
                Total += money;
            }
            daoBill.updateBill(bid, Total);

            //kill session object
            session.invalidate();
        %>


        <!-- Text input-->
        <div class ="col-md-6 col-md-offset-3">
            <form role="form">
                <div class="form-group has-error">
                    <label class="control-label" for="inputError">Customer Name</label>
                    <input type="text" class="form-control" value="<%=cname%>" id="inputError" readonly="">
                </div>

                <div class="form-group has-success">
                    <label class="control-label" for="inputSuccess">Customer Adress</label>
                    <input type="text" class="form-control" value="<%=cadress%>" id="inputSuccess" readonly>
                </div>
                <div class="form-group has-warning">
                    <label class="control-label" for="inputWarning">Customer Phone</label>
                    <input type="text" class="form-control" value="<%=cphone%>" id="inputWarning" readonly>
                </div>
                <div class="form-group has-error">
                    <label class="control-label" for="inputError">Total</label>
                    <input type="text" class="form-control" value="<%=Total%>" id="inputError" readonly>
                </div>
                <a href="HomePage.jsp" align="center" class="btn btn-warning btn-sm">Finish</a>
            </form>
        </div>
               
     
    </main>
    </body>
</html>
