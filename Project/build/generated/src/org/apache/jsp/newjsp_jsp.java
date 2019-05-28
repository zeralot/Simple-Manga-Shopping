package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"css/signUp.css\" rel='stylesheet' type='text/css'>\n");
      out.write("<div class='login'>\n");
      out.write("    <h2>Register</h2>\n");
      out.write("    <input name='userName' placeholder='Username' type='text'>\n");
      out.write("    <input name='password' placeholder='Password' type='password'>\n");
      out.write("    <input name='fname' placeholder='FullName' type='text'>\n");
      out.write("    <input name='address' placeholder='Address' type='text'>\n");
      out.write("    <input name='phone' placeholder='Phone' type='text'>\n");
      out.write("    <input name='email' placeholder='Email' type='text'>\n");
      out.write("    <div class='agree'>\n");
      out.write("        <input type=\"radio\" name=\"status\" value=\"1\" checked=\"checked\" /> Enable\n");
      out.write("        <input type=\"radio\" name=\"status\" value=\"0\" /> Disable\n");
      out.write("    </div>\n");
      out.write("    <input class='animated' type='submit' value='Register'>\n");
      out.write("</div>");
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
