package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DAOCustomer;
import model.ConnectionDB;
import java.sql.ResultSet;

public final class CustomerManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Admin</title>\n");
      out.write("        <!-- BOOTSTRAP STYLES-->\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- FONTAWESOME STYLES-->\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- MORRIS CHART STYLES-->\n");
      out.write("        <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("        <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- GOOGLE FONTS-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">Admin</a> \n");
      out.write("                </div>\n");
      out.write("                <div style=\"color: white;\n");
      out.write("                     padding: 15px 50px 5px 50px;\n");
      out.write("                     float: right;\n");
      out.write("                     font-size: 16px;\"> Last access : 30 May 2014 &nbsp; <a href=\"#\" class=\"btn btn-danger square-btn-adjust\">Logout</a> </div>\n");
      out.write("            </nav>   \n");
      out.write("            <!-- /. NAV TOP  -->\n");
      out.write("            <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("                <div class=\"sidebar-collapse\">\n");
      out.write("                    <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("                        <li class=\"text-center\">\n");
      out.write("                            <img src=\"assets/img/find_user.png\" class=\"user-image img-responsive\"/>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a  href=\"ProController\"><i class=\"fa fa-dashboard fa-3x\"></i> Product Manager </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a  class=\"active-menu\" href=\"CustomerManager.jsp\"><i class=\"fa fa-desktop fa-3x\"></i> Customer Manager</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a  href=\"CatController\"><i class=\"fa fa-qrcode fa-3x\"></i> Category Manager</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li  >\n");
      out.write("                            <a   href=\"chart.html\"><i class=\"fa fa-bar-chart-o fa-3x\"></i> Bill Manager</a>\n");
      out.write("                        </li>\t\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </nav>  \n");
      out.write("            <!-- /. NAV SIDE  -->\n");
      out.write("              <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("            ");
 ConnectionDB conn = new ConnectionDB();
            DAOCustomer dao = new DAOCustomer(conn);
        
      out.write("\n");
      out.write("        ");
 String id=request.getParameter("id");
           if(id!=null){
               dao.removeCustomer(Integer.parseInt(id));
           }
        
        
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
 ResultSet rs = conn.getData("select * from Customer");
                    while (rs.next()) { 
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
      out.print((rs.getInt(8)==1?"Active":"Deactive"));
      out.write("</td>\n");
      out.write("                <td><a href=\"CustomerUpdateScreen.jsp?id=");
      out.print(rs.getInt(1));
      out.write("\">update</a></td>\n");
      out.write("                <td><a href=\"CustomerManager.jsp?id=");
      out.print(rs.getInt(1));
      out.write("\" \n");
      out.write("                       onclick=\"return confirm('Are you sure?')\">delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("            <td><a href=\"CustomerRegisterScreen.jsp\">\n");
      out.write("                <input type=\"submit\" value=\"Register\" /></td>\n");
      out.write("            <!-- /. PAGE WRAPPER  -->\n");
      out.write("        </div>\n");
      out.write("              </div>\n");
      out.write("        <!-- /. WRAPPER  -->\n");
      out.write("        <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\n");
      out.write("        <!-- JQUERY SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("        <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- METISMENU SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("        <!-- MORRIS CHART SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/morris/morris.js\"></script>\n");
      out.write("        <!-- CUSTOM SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/custom.js\"></script>\n");
      out.write("\n");
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
