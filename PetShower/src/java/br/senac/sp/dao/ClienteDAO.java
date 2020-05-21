package br.senac.sp.dao;

import br.senac.sp.conexao.ConnectionFactory;
import br.senac.sp.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection connection;

    public ClienteDAO() {
        connection = ConnectionFactory.getConnection();
    }

    public void adicionarCliente(Cliente cliente) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO Cliente(cli_nome,cli_cpf,cli_dataNascimento,cli_rua,"
                            + "cli_cidade,cli_uf,cli_telefone)"
                            + " VALUES (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, cliente.getCli_nome());
            preparedStatement.setString(2, cliente.getCli_cpf());
            preparedStatement.setDate(3, new java.sql.Date(cliente.getCli_dataNascimento().getTime()));
            preparedStatement.setString(4, cliente.getCli_rua());
            preparedStatement.setString(5, cliente.getCli_cidade());
            preparedStatement.setString(6, cliente.getCli_uf());
            preparedStatement.setString(7, cliente.getCli_telefone());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deletarCliente(int idCliente) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("DELETE FROM Cliente WHERE cli_id=?");
            preparedStatement.setInt(1, idCliente);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editarCliente(Cliente cliente) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("UPDATE Cliente SET cli_nome=?, cli_cpf=?, cli_dataNascimento=?, cli_endereco=?"
                            + "cli_cidade=?, cli_uf=?, cli_telefone=?"
                            + "WHERE cli_id=?");
            preparedStatement.setString(1, cliente.getCli_nome());
            preparedStatement.setString(2, cliente.getCli_cpf());
            preparedStatement.setDate(3, new java.sql.Date(cliente.getCli_dataNascimento().getTime()));
            preparedStatement.setString(4, cliente.getCli_rua());
            preparedStatement.setString(5, cliente.getCli_cidade());
            preparedStatement.setString(6, cliente.getCli_uf());
            preparedStatement.setString(7, cliente.getCli_telefone());
            preparedStatement.setInt(8, cliente.getCli_id());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cliente BuscarClienteCpf(String cliCpf) {
        Cliente cliente = new Cliente();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Cliente WHERE cli_cpf=?");
            preparedStatement.setString(1, cliCpf);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                cliente.setCli_nome(rs.getString("cli_nome"));
                cliente.setCli_cpf(rs.getString("cli_cpf"));
                cliente.setCli_dataNascimento(rs.getDate("cli_dataNascimento"));
                cliente.setCli_rua(rs.getString("cli_rua"));
                cliente.setCli_cidade(rs.getString("cli_cidade"));
                cliente.setCli_uf(rs.getString("cli_uf"));
                cliente.setCli_telefone(rs.getString("cli_telefone"));
                cliente.setCli_id(rs.getInt("cli_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }

    public Cliente BuscarClienteId(int idCliente) {
        Cliente cliente = new Cliente();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Cliente WHERE cli_id=?");
            preparedStatement.setInt(1, idCliente);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                cliente.setCli_nome(rs.getString("cli_nome"));
                cliente.setCli_cpf(rs.getString("cli_cpf"));
                cliente.setCli_dataNascimento(rs.getDate("cli_dataNascimento"));
                cliente.setCli_rua(rs.getString("cli_endereco"));
                cliente.setCli_cidade(rs.getString("cli_cidade"));
                cliente.setCli_uf(rs.getString("cli_uf"));
                cliente.setCli_telefone(rs.getString("cli_telefone"));
                cliente.setCli_id(rs.getInt("cli_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }

    public List<Cliente> listarClientes() {
        List<Cliente> listaDeClientes = new ArrayList<Cliente>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Cliente");
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCli_nome(rs.getString("cli_nome"));
                cliente.setCli_cpf(rs.getString("cli_cpf"));
                cliente.setCli_dataNascimento(rs.getDate("cli_dataNascimento"));
                cliente.setCli_rua(rs.getString("cli_endereco"));
                cliente.setCli_cidade(rs.getString("cli_cidade"));
                cliente.setCli_uf(rs.getString("cli_uf"));
                cliente.setCli_telefone(rs.getString("cli_telefone"));
                cliente.setCli_id(rs.getInt("cli_id"));
                listaDeClientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeClientes;
    }

    public Cliente getUserById(int CliID) {
        Cliente cliente = new Cliente();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Cliente where Cli_id=?");
            preparedStatement.setInt(1, CliID);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                cliente.setCli_id(rs.getInt("userid"));
                cliente.setCli_nome(rs.getString("firstname"));
                cliente.setCli_dataNascimento(rs.getDate("dob"));
                cliente.setCli_uf(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }

}
