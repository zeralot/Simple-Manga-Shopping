package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Cow - The Best Manga Shop</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <link href=\"templatemo_style.css\" type=\"text/css\" rel=\"stylesheet\" /> \n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script> \n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.scrollTo-min.js\"></script> \n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.localscroll-min.js\"></script> \n");
      out.write("        <script type=\"text/javascript\" src=\"js/init.js\"></script> \n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slimbox2.css\" type=\"text/css\" media=\"screen\" /> \n");
      out.write("        <script type=\"text/JavaScript\" src=\"js/slimbox2.js\"></script> \n");
      out.write("\n");
      out.write("    </head> \n");
      out.write("    <body style =\"background: url(images/gallery/bg7.png);\n");
      out.write("          background-size: 100% 100%;\n");
      out.write("          background-repeat: no-repeat;\" > \n");
      out.write("        <div id=\"templatemo_header\">\n");
      out.write("            <div id=\"site_title\"><h1><a href=\"#\">CowManga</a></h1></div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"templatemo_main\">\n");
      out.write("            <div id=\"content\"> \n");
      out.write("                <div id=\"home\" class=\"section\">\n");
      out.write("\n");
      out.write("                    <div id=\"home_about\" class=\"box\">\n");
      out.write("                        <h2>WELCOME!</h2>\n");
      out.write("                        <p>A lot of people ask us this, but no, we don’t have a brick-and-mortar store yet. We’re just people making our love of manga and anime into a small business. We do hope, though, that we could also put up a store in the future.</p>\n");
      out.write("                        <p>Please feel free to look around! And thank you for dropping by!</p>\n");
      out.write("                        <p>All the best, Your Cow Family ^^</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"home_gallery\" class=\"box no_mr\">\n");
      out.write("                        <a href=\"images/gallery/01-l.jpg\" rel=\"lightbox[gallery]\"><img width=\"152\" height=\"152\" src=\"images/gallery/01.jpg\" alt=\"image 1\" /></a>\n");
      out.write("                        <a href=\"images/gallery/02.jpg\" rel=\"lightbox[gallery]\"><img  width=\"152\" height=\"152\" src=\"images/gallery/02-l.jpg\" alt=\"image 2\" /></a>\n");
      out.write("                        <a href=\"Login.jsp\" class=\"no_mr\" ><img width=\"152\" height=\"152\" src=\"images/gallery/box5.jpg\" /></a>\n");
      out.write("                        <a href=\"images/gallery/03-l.jpg\" rel=\"lightbox[gallery]\"><img  width=\"152\" height=\"152\" src=\"images/gallery/03.jpg\" alt=\"image 3\" /></a>\n");
      out.write("                        <a href=\"images/gallery/04-l.jpg\" rel=\"lightbox[gallery]\"><img  width=\"152\" height=\"152\" src=\"images/gallery/04.jpg\" alt=\"image 4\" /></a>\n");
      out.write("                        <a href=\"LoginAdmin.jsp\"  class=\"no_mr\"><img width=\"152\" height=\"152\" src=\"images/gallery/box3.jpg\"  /></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"box home_box1 color1\">\n");
      out.write("                        <a href=\"#services\"><img width=\"152\" height=\"152\" src=\"images/gallery/box2.jpg\"  /></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"box home_box1 color2\">\n");
      out.write("                        <a href=\"#testimonial\"><img width=\"152\" height=\"152\" src=\"images/gallery/box1.jpg\"  /></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"box home_box2 color3\">\n");
      out.write("                        <div id=\"social_links\">\n");
      out.write("                            <a href=\"https://www.facebook.com/\"><img src=\"images/facebook.png\" alt=\"Facebook\" /></a>\n");
      out.write("                            <a href=\"https://www.flickr.com/\"><img src=\"images/flickr.png\" alt=\"Flickr\" /></a>\n");
      out.write("                            <a href=\"https://twitter.com/?lang=en\"><img src=\"images/twitter.png\" alt=\"Twitter\" /></a>\n");
      out.write("                            <a href=\"https://youtu.be/O0kqkRvrO88\"><img src=\"images/youtube.png\" alt=\"Youtube\" /></a>\n");
      out.write("                            <a href=\"https://vimeo.com/\"><img src=\"images/vimeo.png\" alt=\"Vimeo\" /></a>\n");
      out.write("                            <div class=\"clear h20\"></div>\n");
      out.write("                            <h3>Social</h3>\n");
      out.write("                        </div>\t\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"box home_box1 color4 no_mr\">\n");
      out.write("                        <a href=\"#contact\"><img width=\"152\" height=\"152\" src=\"images/gallery/box4.jpg\"  /></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("                <div class=\"section section_with_padding\" id=\"services\"> \n");
      out.write("                    <h2>Services</h2>\n");
      out.write("                    <div class=\"img_border img_fl\">\n");
      out.write("                        <img src=\"images/templatemo_image_03.jpg\" alt=\"image\" />\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"half right\">\n");
      out.write("                        <ul class=\"list_bullet\">\n");
      out.write("                            <li>Maecenas ac odio ipsum donec cursus</li>\n");
      out.write("                            <li>Fusce risus tortor, interdum</li>\n");
      out.write("                            <li>Proin facilisis ullamcorper</li>\n");
      out.write("                            <li>Sed vel justo quis ligula</li>\n");
      out.write("                            <li>Ut tristique sagittis arcu</li>\n");
      out.write("                            <li>Maecenas ac odio ipsum donec cursus</li>\n");
      out.write("                            <li>Fusce risus tortor, interdum</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear h40\"></div>\n");
      out.write("                    <div class=\"img_border img_fr\">\n");
      out.write("                        <img src=\"images/templatemo_image_04.jpg\" alt=\"image\" />\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"half left\">                \n");
      out.write("                        <p><em>Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nam mauris ipsum, pulvinar sit amet varius at, placerat ut felis.</em></p>\n");
      out.write("                        <p>Donec vitae tortor non ipsum tristique condimentum ac ac nulla. Etiam sagittis iaculis dolor ut euismod. Nam faucibus, risus at consequat malesuada, urna turpis sagittis libero, sodales hendrerit dui arcu et nisi. Praesent pulvinar, dolor id lacinia pulvinar, mi ligula tempor libero, et semper sem dolor et elit. </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <a href=\"#home\" class=\"slider_nav_btn home_btn\">home</a> \n");
      out.write("                    <a href=\"#home\" class=\"slider_nav_btn previous_btn\">Previous</a>\n");
      out.write("                    <a href=\"#testimonial\" class=\"slider_nav_btn next_btn\">Next</a> \n");
      out.write("\n");
      out.write("                </div> \n");
      out.write("                <div class=\"section section_with_padding\" id=\"testimonial\"> \n");
      out.write("                    <h2>Testimonial</h2>\n");
      out.write("                    <p><em>Aliquam venenatis, quam a semper blandit, lectus mi convallis orci, ut dictum ante leo non leo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris placerat, urna in gravida rhoncus, mi elit luctus nibh, a luctus erat elit vel quam. </em></p>\n");
      out.write("                    <div class=\"clear h40\"></div>\n");
      out.write("                    <div class=\"half left\">\n");
      out.write("                        <div class=\"img_border img_fl\">\n");
      out.write("                            <img src=\"images/templatemo_image_01.jpg\" alt=\"image 1\" />\n");
      out.write("                        </div>\n");
      out.write("                        <p>Fusce nec felis id lacus sollicitudin vulputate. Proin tincidunt, arcu id pellentesque accumsan, neque dolor imperdiet ligula. </p>\n");
      out.write("                        <cite>Walker - <span>CEO</span></cite>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"half right\">\n");
      out.write("                        <div class=\"img_border img_fl\">\n");
      out.write("                            <img src=\"images/templatemo_image_01.jpg\" alt=\"image 2\" />\n");
      out.write("                        </div>\n");
      out.write("                        <p>Fusce nec felis id lacus sollicitudin vulputate. Proin tincidunt, arcu id pellentesque accumsan, neque dolor imperdiet ligula. </p>\n");
      out.write("                        <cite>Jason - <span>CFO</span></cite>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear h40\"></div>\n");
      out.write("                    <div class=\"half left\">\n");
      out.write("                        <div class=\"img_border img_fl\">\n");
      out.write("                            <img src=\"images/templatemo_image_01.jpg\" alt=\"image 3\" />\n");
      out.write("                        </div>\n");
      out.write("                        <p>Fusce nec felis id lacus sollicitudin vulputate. Proin tincidunt, arcu id pellentesque accumsan, neque dolor imperdiet ligula. </p>\n");
      out.write("                        <cite>Danny - <span>CTO</span></cite>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"half right\">\n");
      out.write("                        <div class=\"img_border img_fl\">\n");
      out.write("                            <img src=\"images/templatemo_image_01.jpg\" alt=\"image 4\" />\n");
      out.write("                        </div>\n");
      out.write("                        <p>Fusce nec felis id lacus sollicitudin vulputate. Proin tincidunt, arcu id pellentesque accumsan, neque dolor imperdiet ligula. </p>\n");
      out.write("                        <cite>Katey - <span>KCOO</span></cite> \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <a href=\"#home\" class=\"slider_nav_btn home_btn\">home</a> \n");
      out.write("                    <a href=\"#services\" class=\"slider_nav_btn previous_btn\">Previous</a>\n");
      out.write("                    <a href=\"#contact\" class=\"slider_nav_btn next_btn\">Next</a> \n");
      out.write("                </div> \n");
      out.write("                <div class=\"section section_with_padding\" id=\"contact\"> \n");
      out.write("                    <h2>Contact</h2> \n");
      out.write("                    <div class=\"half left\">\n");
      out.write("                        <h4>Quick Contact Form</h4>\n");
      out.write("                        <p>We have hundreds of books on-hand but if you can't find what you're looking for - whether books or other merchandise - let us know and we would be happy to help you get it.</p>\n");
      out.write("                        <div id=\"contact_form\">\n");
      out.write("                            <form method=\"post\" name=\"contact\" action=\"#contact\">\n");
      out.write("                                <div class=\"left\">\n");
      out.write("                                    <label for=\"author\">Name:</label> <input name=\"author\" type=\"text\" class=\"input_field\" id=\"author\" maxlength=\"40\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"right\">                           \n");
      out.write("                                    <label for=\"email\">Email:</label> <input name=\"email\" type=\"text\" class=\"input_field\" id=\"email\" maxlength=\"40\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clear\"></div>\n");
      out.write("                                <label for=\"text\">Message:</label> <textarea id=\"text\" name=\"text\" rows=\"0\" cols=\"0\"></textarea>\n");
      out.write("                                <input type=\"submit\" class=\"submit_btn float_l\" name=\"submit\" id=\"submit\" value=\"Send\" />\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"half right\">\n");
      out.write("                        <h4>Mailing Address</h4>\n");
      out.write("                        B501 <br />\n");
      out.write("                        Kí túc xá, Đại Học FPT<br />\n");
      out.write("                        Hoà Lạc, Thạch Thất, Hà Nội<br />\n");
      out.write("                        <strong>Email: vinhptse04963@fpt.edu.vn</strong><br />\n");
      out.write("\n");
      out.write("                        <div class=\"clear h20\"></div>\n");
      out.write("                        <div class=\"img_nom img_border\"><span></span>\n");
      out.write("\n");
      out.write("                            <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.4813693452575!2d105.52427821417962!3d21.013416793679465!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x313454b32ca5086d%3A0xa3c62e29d8ab37e4!2zRlBUIFVuaXZlcnNpdHkgSMOyYSBM4bqhYw!5e0!3m2!1sen!2s!4v1499287678266\" width=\"320\" height=\"240\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#home\" class=\"slider_nav_btn home_btn\">home</a> \n");
      out.write("                        <a href=\"#testimonial\" class=\"slider_nav_btn previous_btn\">Previous</a>\n");
      out.write("\n");
      out.write("                    </div> \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"templatemo_footer\">\n");
      out.write("            Copyright © 2017 <a href=\"https://www.facebook.com/vinh.pham.3103\">zeralot</a>\n");
      out.write("        </div>\n");
      out.write("        <!-- templatemo 363 metro -->\n");
      out.write("    </body> \n");
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
