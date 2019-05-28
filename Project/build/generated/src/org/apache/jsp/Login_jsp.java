package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <html lang=\"en-US\">\n");
      out.write("        <head>\n");
      out.write("\n");
      out.write("            <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("            <title>Login</title>\n");
      out.write("\n");
      out.write("            <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,700\">\n");
      out.write("\n");
      out.write("            <!--[if lt IE 9]>\n");
      out.write("          <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("         <![endif]-->\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div id=\"login\">\n");
      out.write("\n");
      out.write("                    <form action=\"javascript:void(0);\" method=\"get\">\n");
      out.write("\n");
      out.write("                        <fieldset class=\"clearfix\">\n");
      out.write("\n");
      out.write("                            <p><span class=\"fontawesome-user\"></span><input type=\"text\" value=\"Username\" onBlur=\"if (this.value == '')\n");
      out.write("                                        this.value = 'Username'\" onFocus=\"if (this.value == 'Username')\n");
      out.write("                                                    this.value = ''\" required></p> <!-- JS because of IE support; better: placeholder=\"Username\" -->\n");
      out.write("                            <p><span class=\"fontawesome-lock\"></span><input type=\"password\"  value=\"Password\" onBlur=\"if (this.value == '')\n");
      out.write("                                        this.value = 'Password'\" onFocus=\"if (this.value == 'Password')\n");
      out.write("                                                    this.value = ''\" required></p> <!-- JS because of IE support; better: placeholder=\"Password\" -->\n");
      out.write("                            <p><input type=\"submit\" value=\"Sign In\"></p>\n");
      out.write("\n");
      out.write("                        </fieldset>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <p>Not a member? <a href=\"CustomerRegisterScreen.jsp\">Sign up now</a><span class=\"fontawesome-arrow-right\"></span></p>\n");
      out.write("\n");
      out.write("                </div> <!-- end login -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
