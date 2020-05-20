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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"tabela\">\n");
      out.write("            <h1>Lista de Produtos</h1>\n");
      out.write("            <table border=1>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Nome</th>\n");
      out.write("                        <th>Valor</th>\n");
      out.write("                        <th>Estoque</th>\n");
      out.write("                        <th>Data de Cadastro</th>\n");
      out.write("                        <th colspan=2>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"produto\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.idProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.proNome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.proValor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.proEstoque}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.proDataCadastro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                    <td><a href=\"CadastroProduto?action=edit&idProduto=<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.idProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\">Update</a></td>\n");
      out.write("                    <td><a href=\"CadastroProduto?action=delete&idProduto=<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.idProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\">Delete</a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </c:forEach>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
