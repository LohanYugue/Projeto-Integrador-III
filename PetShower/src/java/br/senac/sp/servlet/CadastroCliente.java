package br.senac.sp.servlet;

import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.model.Cliente;
import br.senac.sp.servicos.ClienteException;
import br.senac.sp.servicos.ClienteService;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CadastroCliente", urlPatterns = {"/CadastroCliente"})
public class CadastroCliente extends HttpServlet {

    private ClienteService service = new ClienteService();

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String Cli_nome = request.getParameter("Cli_nome");
        String Cli_cpf = request.getParameter("Cli_cpf");
        String Cli_dataNascimento = request.getParameter("Cli_dataNascimento");
        String Cli_rua = request.getParameter("Cli_rua");
        String Cli_cidade = request.getParameter("Cli_cidade");
        String Cli_uf = request.getParameter("Cli_uf");
        String Cli_telefone = request.getParameter("Cli_telefone");

        Cliente cliente = new Cliente();

        cliente.setCli_nome(Cli_nome);
        cliente.setCli_cpf(Cli_cpf);
        cliente.setCli_dataNascimento(new java.sql.Date(cliente.getCli_dataNascimento().getTime()));
        cliente.setCli_rua(Cli_rua);
        cliente.setCli_cidade(Cli_cidade);
        cliente.setCli_uf(Cli_uf);
        cliente.setCli_telefone(Cli_telefone);

        HttpSession sessao = request.getSession();
        try {
            service.adicionarCliente(cliente);
            sessao.setAttribute("msgSucesso", "Cliente salvo com sucesso");
        } catch (ClienteException ex) {
            sessao.setAttribute("msgErro", "Erro ao salvar cliente - " + ex.getMessage());
            response.sendRedirect(request.getContextPath() + "/ListarCliente");

        }
    }
}
