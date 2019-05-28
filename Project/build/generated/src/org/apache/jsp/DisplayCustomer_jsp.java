package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import entity.Customer;
import java.sql.ResultSet;

public final class DisplayCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ResultSet rs = (ResultSet) request.getAttribute("rs");
            Vector<Customer> vector = (Vector<Customer>) request.getAttribute("vector");
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <caption>Customer manager</caption>\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Full Name</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Phone</th>\n");
      out.write("                <th>UserName</th>\n");
      out.write("                <th>PassWord</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("                <th>Update</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
    while (rs.previous()) {
      out.write("    \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getInt(1));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                <td>");
      out.print((rs.getInt(8) == 1 ? "Active" : "Deactive"));
      out.write("</td>\n");
      out.write("                <td><a href=\"CusController?id=");
      out.print(rs.getInt(1));
      out.write("&service=preUpdate\">update</a></td>\n");
      out.write("                <td><a href=\"CusController?id=");
      out.print(rs.getInt(1));
      out.write("&service=delete\" \n");
      out.write("                       onclick=\"return confirm('Are you sure?')\">delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("            <td><a href=\"CustomerRegisterScreen.jsp\">\n");
      out.write("                <input type=\"submit\" value=\"Register\" /></td>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
