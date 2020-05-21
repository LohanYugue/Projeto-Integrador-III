package br.senac.sp.servlet;

import br.senac.sp.model.Produto;
import br.senac.sp.servicos.ProdutoException;
import br.senac.sp.servicos.ProdutoService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListarProduto", urlPatterns = {"/ListarProduto"})
public class ListarProduto extends HttpServlet {

    private ProdutoService service = new ProdutoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Produto> produto = service.listarProdutos();
            request.setAttribute("listarProdutos", produto);
        } catch (ProdutoException e) {
            String message = e.getMessage();
            request.setAttribute("msgErro", message);
        }
        request.getRequestDispatcher("/WEB-INF/jsp/ListarProduto.jsp").forward(request, response);

    }

}
