package br.senac.sp.servicos;

import java.sql.SQLException;
import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.servicos.ClienteException;
import br.senac.sp.model.Cliente;
import java.util.List;

public class ClienteService {

    private ClienteDAO clienteDAO = new ClienteDAO();

    public List<Cliente> listarClientes() throws ClienteException {
        try {
            System.out.println("Listagem de Clientes");
            return clienteDAO.listarClientes();
        } catch (SQLException e) {
            throw new ClienteException("Erro na lista de Clientes", e);
        }
    }

    private boolean isValid(Cliente cliente) {
        return cliente != null && cliente.getCli_nome() != null && cliente.getCli_cpf() != null;
    }

    public void adicionarCliente(Cliente cliente) throws ClienteException {
        try {
            if (isValid(cliente)) {
                System.out.println("Cadastrando");
                clienteDAO.adicionarCliente(cliente);
            } else {
                throw new ClienteException("Dados Inválidos!", null);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ClienteException("ERRO!", e);
        }
    }

    public Cliente buscarClienteId(int cli_id) throws ClienteException {

        try {
            System.out.println("Pesquisando cliente");
            return clienteDAO.buscarClienteId(cli_id);
        } catch (SQLException e) {
            throw new ClienteException("ERRO!", e);
        }

    }

    public void editarCliente(Cliente cliente) throws ClienteException {

        try {
            if (isValid(cliente)) {
                System.out.println("Alterando dados");
                clienteDAO.editarCliente(cliente);
            } else {
                throw new ClienteException("Dados Inválidos", null);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ClienteException("ERRO!", e);
        }

    }
}
