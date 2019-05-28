package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import entity.Category;
import model.ConnectionDB;

public final class ProductRegisterScreen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 align=\"center\">Add Product</h2>\n");
      out.write("        <form action=\"ProController\" method=\"GET\">\n");
      out.write("            \n");
      out.write("            <table border=\"0\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Product ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pid\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Product Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pname\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Quantity</td>\n");
      out.write("                    <td><input type=\"text\" name=\"quantity\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Price</td>\n");
      out.write("                    <td><input type=\"text\" name=\"price\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Images</td>\n");
      out.write("                    <td><input type=\"text\" name=\"images\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Description</td>\n");
      out.write("                    <td><input type=\"text\" name=\"description\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Status</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"status\" value=\"1\" checked=\"checked\" /> Enable\n");
      out.write("                        <input type=\"radio\" name=\"status\" value=\"0\" /> Disable\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    ConnectionDB conDB = new ConnectionDB();

                    ArrayList<Category> categories = new ArrayList<>();
                    ResultSet res = conDB.getData("SELECT* FROM Category WHERE status=1");
                    out.println("<tr>\n<td>Category   </td><td><select name=\"Categories\" id=\"Categories\">");
                    try {
                        while (res.next()) {
                            Category c = new Category(res.getInt(1), res.getString(2), res.getInt(3));
                            categories.add(c);
                            out.println("<option value=" + c.getCtid() + ">" + c.getCname() + "</option>");
                        }
                    } catch (SQLException ex) {
                        System.out.println("Error at ProductController");
                    }
                
      out.write("\n");
      out.write("                </select></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Register\" /></td>\n");
      out.write("                    <td><input type=\"reset\" value=\"Clear\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"hidden\" name=\"service\" value=\"register\" />\n");
      out.write("\n");
      out.write("        </form>\n");
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
