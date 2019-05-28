package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import model.ConnectionDB;

public final class showCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Check Out</title>\r\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- FONTAWESOME STYLES-->\r\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- MORRIS CHART STYLES-->\r\n");
      out.write("        <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- CUSTOM STYLES-->\r\n");
      out.write("        <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- GOOGLE FONTS-->\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Shopping Cart Details</h1>\r\n");
      out.write("\r\n");
      out.write("        <table border=\"1\">\r\n");
      out.write("            <caption>Shopping Cart</caption>\r\n");
      out.write("            <!--<form action=\"showCart.jsp\" method=\"Post\">-->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>PID</th>\r\n");
      out.write("                <th>Product Name</th>\r\n");
      out.write("                <th>Quantity</th>\r\n");
      out.write("                <th>Price</th>\r\n");
      out.write("                <th>Total</th>\r\n");
      out.write("                <th>Update</th>\r\n");
      out.write("                <th>Remove</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

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
                        if (rs.next()) {
      out.write("\r\n");
      out.write("            <form action =\"showCart.jsp\" method =\"Post\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(rs.getString(1));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("                    <td><input type =\"text\" name=\"quantity\" value =\"");
      out.print(count);
      out.write("\" ></td>\r\n");
      out.write("                    <td>");
      out.print(rs.getDouble(4));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print((rs.getDouble(4) * Integer.parseInt(count)));
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                    <td><button onclick=\"window.location.href = 'showCart.jsp'\" class=\"btn btn-primary\"><i class=\"fa fa-edit \"></i> Update </button></td>\r\n");
      out.write("                    <td><button class=\"btn btn-danger\"  href = \"showCart.jsp?id=");
      out.print(rs.getString(1));
      out.write("&service=remove\"><i class=\"fa fa-pencil\"></i> Delete </button></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </tr>           \r\n");
      out.write("                <input type =\"hidden\" name =\"service\" value =\"update\">\r\n");
      out.write("                <input type =\"hidden\" name =\"id\" value =\"");
      out.print(rs.getString(1));
      out.write("\"\r\n");
      out.write("            </form>\r\n");
      out.write("            ");
               }
                    }

                }
      out.write("\r\n");
      out.write("            <tr></tr>\r\n");
      out.write("            <tr><a href =\"showCart.jsp?service=removeall\">Remove All</a></tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <!--</form>-->\r\n");
      out.write("\r\n");
      out.write("    <h2><a href=\"ProControllerClient\">Items List</h2>\r\n");
      out.write("    <br>\r\n");
      out.write("    <h2><a href=\"checkout.jsp\">Check-out</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
