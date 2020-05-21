package br.senac.sp.servlet;

import br.senac.sp.model.Cliente;
import br.senac.sp.servicos.ClienteException;
import br.senac.sp.servicos.ClienteService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListarCliente", urlPatterns = {"/ListarCliente"})
public class ListarCliente extends HttpServlet {

    private ClienteService service = new ClienteService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Cliente> cliente = service.listarClientes();
            request.setAttribute("listarClientes", cliente);
        } catch (ClienteException e) {
            String message = e.getMessage();
            request.setAttribute("msgErro", message);
        }
        request.getRequestDispatcher("/jsp/ListarCliente.jsp").forward(request, response);

    }

}
