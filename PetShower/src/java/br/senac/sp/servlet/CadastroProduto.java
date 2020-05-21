package br.senac.sp.servlet;

import br.senac.sp.model.Produto;
import br.senac.sp.servicos.ProdutoException;
import br.senac.sp.servicos.ProdutoService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CadastroProduto", urlPatterns = {"/CadastroProduto"})
public class CadastroProduto extends HttpServlet {

    private ProdutoService service = new ProdutoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String proNome = request.getParameter("proNome");
        String proValor = request.getParameter("proValor");
        String proEstoque = request.getParameter("proEstoque");
        String proDataCadastro = request.getParameter("proDataCadastro");

        Produto produto = new Produto();
        produto.setProNome(proNome);
        produto.setProValor(Double.parseDouble(proValor));
        produto.setProEstoque(Integer.parseInt(proEstoque));
        produto.setProDataCadastro(new java.sql.Date(produto.getProDataCadastro().getTime()));

        HttpSession sessao = request.getSession();
        try {
            service.adicionarProduto(produto);
            sessao.setAttribute("msgSucesso", "Produto salvo com sucesso");
        } catch (ProdutoException ex) {
            sessao.setAttribute("msgErro", "Erro ao salvar produto - " + ex.getMessage());
            response.sendRedirect(request.getContextPath() + "/ListarProduto");

        }
    }

}
