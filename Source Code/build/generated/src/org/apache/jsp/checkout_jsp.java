package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.CusController;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;
import java.sql.ResultSet;
import entity.BillDetail;
import model.DAOBillDetail;
import model.ConnectionDB;
import model.DAOBill;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1 align=\"center\">Checkout!</h1>\r\n");
      out.write("        ");

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
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("            <!-- Text input-->\r\n");
      out.write("            <div class =\"center-block\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-md-4 control-label\">Customer Name</label>  \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <input name=\"cid\" type=\"text\" value=\"");
      out.print(cname);
      out.write("\" class=\"form-control input-md\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-md-4 control-label\">Customer Adress</label>  \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <input name=\"cid\" type=\"text\" value=\"");
      out.print(cadress);
      out.write("\" class=\"form-control input-md\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-md-4 control-label\">Customer Phone</label>  \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <input name=\"cid\" type=\"text\" value=\"");
      out.print(cphone);
      out.write("\" class=\"form-control input-md\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-md-4 control-label\">Total</label>  \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <input name=\"cid\" type=\"text\" value=\"");
      out.print(Total);
      out.write("\" class=\"form-control input-md\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h2><a href=\"HomePage.jsp\" align=\"center\">Finish</h2>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
