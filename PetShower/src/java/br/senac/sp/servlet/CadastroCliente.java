package br.senac.sp.servlet;

import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.model.Cliente;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastroCliente", urlPatterns = {"/CadastroCliente"})
public class CadastroCliente extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/CadastroCliente.jsp";
    private static String LIST_CLIENTE = "/listarCliente.jsp";
    private ClienteDAO dao;

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("Delete")) {
            int Cli_id = Integer.parseInt(request.getParameter("action"));
            dao.deletarCliente(Cli_id);
            forward = LIST_CLIENTE;
            request.setAttribute("cliente", dao.listarClientes());
        } else if (action.equalsIgnoreCase("Update")) {
            forward = INSERT_OR_EDIT;
            int userId = Integer.parseInt(request.getParameter("cli_id"));
            Cliente cli = dao.getUserById(userId);
            request.setAttribute("cliente", cli);
        } else if (action.equalsIgnoreCase("ListCliente")) {
            forward = LIST_CLIENTE;
            request.setAttribute("clientes", dao.listarClientes());
        } else {
            forward = INSERT_OR_EDIT;
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cli = new Cliente();
        cli.setCli_nome(request.getParameter("cli_nome"));
        cli.setCli_cpf(request.getParameter("cli_cpf"));

        try {
            Date data = null;
            String teste = request.getParameter("cli_dataNascimento");
            System.out.println(teste);
            if (request.getParameter("cli_dataNascimento") != null) {
                data = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("cli_dataNascimento"));
            } else {
                data = null;
            }

            cli.setCli_dataNascimento(data);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        cli.setCli_rua(request.getParameter("cli_rua"));
        cli.setCli_cidade(request.getParameter("cli_cidade"));
        cli.setCli_uf(request.getParameter("cli_uf"));
        cli.setCli_telefone(request.getParameter("cli_telefone"));
        String cliId = request.getParameter("cli_id");
        if (cliId == null || cliId.isEmpty()) {
            dao.adicionarCliente(cli);
        } else {
            cli.setCli_id(Integer.parseInt(cliId));
            dao.editarCliente(cli);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_CLIENTE);
        request.setAttribute("cli_nome", dao.listarClientes());
        view.forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
