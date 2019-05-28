package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import java.util.Vector;
import java.sql.ResultSet;

public final class DisplayProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
            Vector<Product> vector = (Vector<Product>) request.getAttribute("vector");
        
      out.write("\n");
      out.write("        <h2 align=\"center\">Product Manager</h2>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" align=\"center\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Product name</th>\n");
      out.write("                <th>Quantity</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Images</th>\n");
      out.write("                <th>Description</th>\n");
      out.write("                <th>Category ID</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("                <th>Update</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("                <th>Shop</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
    while (rs.previous()) {
      out.write("   \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString(1));
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
      out.write("                <td><img src=\"");
      out.print(rs.getString(5));
      out.write("\" width=\"152\" height=\"152\"/></td>\n");
      out.write("                <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                <td>");
      out.print((rs.getInt(7) == 1 ? "Active" : "Deactive"));
      out.write("</td>\n");
      out.write("                <td><a href=\"ProController?id=");
      out.print(rs.getString(1));
      out.write("&service=preUpdate\">update</a></td>\n");
      out.write("                <td><a href=\"ProController?id=");
      out.print(rs.getString(1));
      out.write("&service=delete\" \n");
      out.write("                       onclick=\"return confirm('Are you sure?')\">delete</a></td>\n");
      out.write("                <td><a href=add2Cart.jsp?id=");
      out.print(rs.getString(1));
      out.write(">Add to cart</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("    <td><a href=\"ProductRegisterScreen.jsp\">\n");
      out.write("        <input type=\"submit\" value=\"Register\" /></td>\n");
      out.write("</body>\n");
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
