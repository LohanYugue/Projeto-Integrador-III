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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>PetShower - O melhor site de pets do mundo</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleeapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/fontawesome-all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\r\n");
      out.write("        <link href=\"../css/PaginaInicial.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- start header-->\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class =\"content\">\r\n");
      out.write("                <div class=\"logo fl-left \" >\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <img src=\"../img/background/logo_size.png\" alt=\"LogoPetShower\"/>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <nav class=\"nav\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">Atendimento</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Lojas</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Relatórios</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- end /header -->\r\n");
      out.write("\r\n");
      out.write("        <!-- start search e estatisticas -->\r\n");
      out.write("        <section class=\"section\">\r\n");
      out.write("            <div class=\"search-box\">\r\n");
      out.write("                <header>\r\n");
      out.write("                    <h1>PetShower</h1>\r\n");
      out.write("                    <p class=\"tagline\">Aqui nós entendemos o que seu pet precisa!</p>\r\n");
      out.write("                </header>\r\n");
      out.write("                <form class=\"form-search\" method=\"post\" action=\"\">\r\n");
      out.write("                    <input type=\"search\" name=\"busca\" id=\"busca\" placeholder=\"Pesquisar\"/>\r\n");
      out.write("                    <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"estatisticas\">\r\n");
      out.write("                <div class=\"estatisticas-item\">\r\n");
      out.write("                    <a href=\"CadastroVenda.jsp\"> Cadastro de Venda</a><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"estatisticas-item\">\r\n");
      out.write("                    <a href=\"CadastroCliente.jsp\">Cadastro de Cliente</a><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"estatisticas-item\">\r\n");
      out.write("                    <a href=\"CadastroProduto.jsp\">Cadastro de Produto</a><br>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- end search e estatisticas -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- start Produtos -->\r\n");
      out.write("        <section class=\"section\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <header class=\"section-header\">\r\n");
      out.write("                    <h1> Aqui voce encontra os melhores produtos para seu pet</h1>\r\n");
      out.write("                    <p>Em diversas categorias!!</p>\r\n");
      out.write("                </header>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"produtos-col\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"box\">\r\n");
      out.write("                            <div class=\"box-name\">\r\n");
      out.write("                                Medicamentos\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"box-cover\">\r\n");
      out.write("                                <img src=\"../img/seleções/antipulgas.png\" alt=\"\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"box-detalhes\">\r\n");
      out.write("                                <div class=\"box-detalhes-info\">\r\n");
      out.write("                                    <h2>Os melhores medicamentos</h2>\r\n");
      out.write("                                    <p>Pets</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>   \r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"produtos-col\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"box\">\r\n");
      out.write("                            <div class=\"box-name\">\r\n");
      out.write("                                Rações\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"box-cover\">\r\n");
      out.write("                                <img src=\"../img/seleções/ração-seca.png\" alt=\"\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"box-detalhes\">\r\n");
      out.write("                                <div class=\"box-detalhes-info\">\r\n");
      out.write("                                    <h2>As melhores Rações</h2>\r\n");
      out.write("                                    <p>Pets</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>   \r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"produtos-col\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"box\">\r\n");
      out.write("                            <div class=\"box-name\">\r\n");
      out.write("                                Tapetes\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"box-cover\">\r\n");
      out.write("                                <img src=\"../img/seleções/tapetes.png\" alt=\"\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"box-detalhes\">\r\n");
      out.write("                                <div class=\"box-detalhes-info\">\r\n");
      out.write("                                    <h2>Os melhores Tapetes</h2>\r\n");
      out.write("                                    <p>Pets</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- end Produtos -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
