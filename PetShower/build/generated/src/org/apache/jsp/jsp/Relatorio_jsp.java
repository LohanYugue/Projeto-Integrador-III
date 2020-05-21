package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Relatorio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://fonts.googleeapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/font/fontawesome-all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <link href=\"../css/Relatorio.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Relatório Mensal</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- start header-->\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class =\"content\">\n");
      out.write("                <div class=\"logo fl-left \" >\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img src=\"../img/background/logo_size.png\" alt=\"LogoPetShower\"/>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- end /header -->\n");
      out.write("        <h2><center>Produtos mais vendidos</center></h2>\n");
      out.write("        <table class=\"table table-striped\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">#</th>\n");
      out.write("                    <th scope=\"col\">Produto</th>\n");
      out.write("                    <th scope=\"col\">Quantidade</th>\n");
      out.write("                    <th scope=\"col\">Valor</th>\n");
      out.write("                    <th scope=\"col\">ValorTotal</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">1</th>\n");
      out.write("                    <td>Ração Canina</td>\n");
      out.write("                    <td>50</td>\n");
      out.write("                    <td>R$40,00</td>\n");
      out.write("                    <td>R$2.000</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">2</th>\n");
      out.write("                    <td>Tapete</td>\n");
      out.write("                    <td>30</td>\n");
      out.write("                    <td>R$20,00</td>\n");
      out.write("                    <td>R$600,00</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">3</th>\n");
      out.write("                    <td>Veneno de Pulgas</td>\n");
      out.write("                    <td>10</td>\n");
      out.write("                    <td>R$50,00</td>\n");
      out.write("                    <td>R$500,00</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
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
