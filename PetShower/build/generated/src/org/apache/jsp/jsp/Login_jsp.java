package org.apache.jsp.jsp;

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"https://fonts.googleeapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/font/fontawesome-all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\r\n");
      out.write("        <link href=\"../css/CadastroCliente.css\" rel=\"stylesheet\">\r\n");
      out.write("       \r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- start header-->\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class =\"content\">\r\n");
      out.write("                <div class=\"logo fl-left \" >\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <img src=\"../img/background/logo_size.png\" alt=\"LogoPetShower\"/>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- end /header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- start form -->\r\n");
      out.write("        <fieldset class=\"fieldset-login \">\r\n");
      out.write("            <h1><center>Login</center></h1>\r\n");
      out.write("            <form action=\"Logint\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\" >\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <label for=\"nome\">Login:</label> \r\n");
      out.write("                        <input type=\"text\" size=\"21\" maxlength=\"25\" class=\"form-control\" placeholder=\"Insira seu Login\" id=\"nome\" name=\"cliNome\">\r\n");
      out.write("                    </center> \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <label for=\"nome\">Senha: </label>\r\n");
      out.write("                        <input type=\"password\" size=\"20\" maxlength=\"25\" class=\"form-control\" placeholder=\"Insira sua senha\" id=\"nome\" name=\"cliNome\">\r\n");
      out.write("                    </center>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <button type=\"submit\" class=\"btnSalvar\">Salvar</button>\r\n");
      out.write("                        <button type=\"reset\" value=\"Reset\" class=\"btnLimpar\">Limpar</button>\r\n");
      out.write("                        <input type=\"button\" value=\"Voltar\" class=\"btnVoltar\" onClick=\"history.go(-1)\">\r\n");
      out.write("                    </center>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        <!-- end form -->\r\n");
      out.write("    </body>\r\n");
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
