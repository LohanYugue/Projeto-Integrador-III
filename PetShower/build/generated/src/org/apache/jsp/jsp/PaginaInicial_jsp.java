package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaginaInicial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>PetShower O melhor site de pets do mundo</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleeapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/fontawesome-all.min.css\">\n");
      out.write("        <link href=\"../css/PaginaInicial.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- start header-->\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class =\"header-content\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img src=\"../img/background/logo_size.jpg\" alt=\"LogoPetShower\"/>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"nav\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Atendimento</a></li>\n");
      out.write("                        <li><a href=\"#\">Lojas</a></li>\n");
      out.write("                        <li><a href=\"#\">testemunhas</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- end /header -->\n");
      out.write("\n");
      out.write("        <!-- start search e estatisticas -->\n");
      out.write("        <section class=\"section\">\n");
      out.write("            <div class=\"search-box\">\n");
      out.write("                <header>\n");
      out.write("                    <h1>PetShower</h1>\n");
      out.write("                    <p class=\"tagline\">Aqui nós entendemos o que seu pet precisa</p>\n");
      out.write("                </header>\n");
      out.write("                <form class=\"form-search\" method=\"post\" action=\"\">\n");
      out.write("                    <input type=\"search\" name=\"busca\" id=\"busca\" placeholder=\"Pesquisar\"/>\n");
      out.write("                    <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"estatisticas\">\n");
      out.write("                <div class=\"estatisticas-item\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- end search e estatisticas -->\n");
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
