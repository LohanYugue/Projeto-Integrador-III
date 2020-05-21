package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listarProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \r\n");
      out.write("        <title>Lista</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("           <!-- start header-->\r\n");
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
      out.write("        <fieldset class=\"fieldset \">\r\n");
      out.write("            <div class=\"tabela\">\r\n");
      out.write("                <h1><center>Lista de Produtos</center> </h1>\r\n");
      out.write("                <table border=1>\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>ID</th>\r\n");
      out.write("                            <th>Nome</th>\r\n");
      out.write("                            <th>Valor</th>\r\n");
      out.write("                            <th>Estoque</th>\r\n");
      out.write("                            <th>Data de Cadastro</th>\r\n");
      out.write("                            <th colspan=2>Ações</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"produto\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.idProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.proNome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.proValor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.proEstoque}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.proDataCadastro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("                        <td><a href=\"CadastroProduto?action=edit&idProduto=<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.idProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/>Update</a></td>\r\n");
      out.write("                        <td><a href=\"CadastroProduto?action=delete&idProduto=<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.idProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/>Delete</a></td>\r\n");
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </c:forEach>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
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
