package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import java.util.Vector;
import java.sql.ResultSet;

public final class ShoppingList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- FONTAWESOME STYLES-->\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("        <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- GOOGLE FONTS-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> \n");
      out.write("\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"SourceList/css/reset.css\"> <!-- CSS reset -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"SourceList/css/style.css\"> <!-- Gem style -->\n");
      out.write("        <script src=\"SourceList/js/modernizr.js\"></script> <!-- Modernizr -->\n");
      out.write("\n");
      out.write("        <title>Shopping</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div id=\"logo\"><img src=\"SourceList/img/cd-logo.svg\" alt=\"Homepage\"></div>\n");
      out.write("            <div id=\"cd-hamburger-menu\"><a class=\"cd-img-replace\" href=\"#0\">Menu</a></div>\n");
      out.write("            <div id=\"cd-cart-trigger\"><a class=\"cd-img-replace\" href=\"#0\">Cart</a></div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <nav id=\"main-nav\">\n");
      out.write("            <ul>\n");
      out.write("\n");
      out.write("                <li><a class=\"current\" href=\"#0\">User</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <ul id=\"cd-gallery-items\" class=\"cd-container\">\n");
      out.write("                ");

                    ResultSet rs = (ResultSet) request.getAttribute("rs");
                    Vector<Product> vector = (Vector<Product>) request.getAttribute("vector");
                
      out.write("\n");
      out.write("                ");
    while (rs.previous()) {
      out.write(" \n");
      out.write("                <li>\n");
      out.write("                    <img src=\"");
      out.print(rs.getString(5));
      out.write("\" height=\"350\" alt=\"Preview image\">\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary btn-lg\">Buy</a>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger btn-circle\">$ ");
      out.print(rs.getString(4));
      out.write("\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-default\">");
      out.print(rs.getString(2));
      out.write("</a>\n");
      out.write("                   \n");
      out.write("                </li>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul> <!-- cd-gallery-items -->\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <div id=\"cd-shadow-layer\"></div>\n");
      out.write("\n");
      out.write("        <!-- cd-cart -->\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"SourceList/js/main.js\"></script> <!-- Gem jQuery -->\n");
      out.write("    </body>\n");
      out.write("</html>");
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
