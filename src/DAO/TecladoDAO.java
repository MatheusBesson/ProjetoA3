/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Fone_de_Ouvido;
import Model.Teclado;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class TecladoDAO {

    public static ArrayList<Teclado> ListaTeclado = new ArrayList<Teclado>();

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            java.sql.Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_Teclado) id_Teclado FROM produtos.tb_teclado;");  // TROCAR
            res.next();
            maiorID = res.getInt("id_Teclado");
            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    public java.sql.Connection getConexao() {

        java.sql.Connection connection = null;  //inst�ncia da conex�o

        try {

            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conex�o
            String server = "localhost"; //caminho do MySQL
            String database = "produtos";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "vesku222skay";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: N�O CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    // Retorna a Lista de Teclados(objetos)
    public ArrayList getListaTeclado() {

        ListaTeclado.clear(); // Limpa nosso ArrayList

        try {
            java.sql.Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM produtos.tb_teclado");
            while (res.next()) {

                int id = res.getInt("id_Teclado");
                String nome = res.getString("nome");
                String tipo = res.getString("tipo");
                float preco = res.getFloat("preco");
                String marca = res.getString("marca");
                String modelo = res.getString("modelo");
                int qtd_estoque = res.getInt("qtd_estoque");
                String data_cadastro = res.getString("data_cadastro");
                String dimensao = res.getString("dimensao");
                String conectividade = res.getString("conectividade");
                String descricao = res.getString("descricao");

                Teclado objeto = new Teclado(dimensao, conectividade, id, nome, tipo, preco, descricao, marca, modelo, qtd_estoque, data_cadastro);

                ListaTeclado.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return ListaTeclado;
    }

    // Cadastra novo Teclado
    public boolean InsertTecladoBD(Teclado objeto) {
        String sql = "INSERT INTO produtos.tb_teclado(id_Teclado, nome, tipo, preco, marca, modelo, qtd_estoque, data_cadastro, dimensao, conectividade, descricao) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
// dimensao, conectividade, id, nome, tipo, preco, descricao, marca, modelo, qtd_estoque, data_cadatsro;

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTipo());
            stmt.setFloat(4, objeto.getPreco());
            stmt.setString(5, objeto.getMarca());
            stmt.setString(6, objeto.getModelo());
            stmt.setInt(7, objeto.getQtd_estoque());
            stmt.setString(8, objeto.getData_cadastro());
            stmt.setString(9, objeto.getDimensao());
            stmt.setString(10, objeto.getConectividade());
            stmt.setString(11, objeto.getDescricao());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    // Deleta um teclado espec�fico pelo seu campo ID
    public boolean DeleteTecladoBD(int id) {
        try {
            java.sql.Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM produtos.tb_teclado WHERE id_Teclado = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    // Edita um teclado espec�fico pelo seu campo ID
    public boolean UpdateTecladoBD(Teclado objeto) {

        String sql = "UPDATE produtos.tb_teclado set nome = ? ,tipo = ? ,preco = ? ,marca = ? ,modelo = ? ,qtd_estoque = ?, data_cadastro = ?, dimensao = ?, conectividade = ?, descricao = ? WHERE id_Teclado = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTipo());
            stmt.setFloat(3, objeto.getPreco());
            stmt.setString(4, objeto.getMarca());
            stmt.setString(5, objeto.getModelo());
            stmt.setInt(6, objeto.getQtd_estoque());
            stmt.setString(7, objeto.getData_cadastro());
            stmt.setString(8, objeto.getDimensao());
            stmt.setString(9, objeto.getConectividade());
            stmt.setString(10, objeto.getDescricao());
            stmt.setInt(11, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Teclado carregaTeclado(int id) {

        Teclado objeto = new Teclado();
        objeto.setId(id);

        try {
            java.sql.Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM produtos.tb_teclado WHERE id_Teclado = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setTipo(res.getString("tipo"));
            objeto.setPreco(res.getFloat("preco"));
            objeto.setMarca(res.getString("marca"));
            objeto.setModelo(res.getString("modelo"));
            objeto.setQtd_estoque(res.getInt("qtd_estoque"));
            objeto.setData_cadastro(res.getString("data_cadastro"));
            objeto.setDimensao(res.getString("Dimensão"));
            objeto.setConectividade(res.getString("conectividade"));
            objeto.setDescricao(res.getString("descricao"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }

    public ArrayList<Teclado> getListaOrdenadaPorID() {
        ArrayList<Teclado> listaOrdenada = new ArrayList<>();

        try (java.sql.Connection conn = getConexao(); java.sql.Statement stmt = conn.createStatement(); ResultSet res = stmt.executeQuery("SELECT * FROM produtos.tb_teclado ORDER BY id_Teclado")) {

            while (res.next()) {
                Teclado tec = new Teclado(
                        res.getString("dimensao"),
                        res.getString("conectividade"),
                        res.getInt("id_Teclado"),
                        res.getString("nome"),
                        res.getString("tipo"),
                        res.getFloat("preco"),
                        res.getString("descricao"),
                        res.getString("marca"),
                        res.getString("modelo"),
                        res.getInt("qtd_estoque"),
                        res.getString("data_cadastro")
                );
                listaOrdenada.add(tec);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listaOrdenada;
    }

    public ArrayList<Teclado> getListaOrdenadaPorPreco() {
        ArrayList<Teclado> listaOrdenada = new ArrayList<>();

        try (java.sql.Connection conn = getConexao(); java.sql.Statement stmt = conn.createStatement(); ResultSet res = stmt.executeQuery("SELECT * FROM produtos.tb_teclado ORDER BY preco")) {

            while (res.next()) {
                Teclado tec = new Teclado(
                        res.getString("dimensao"),
                        res.getString("conectividade"),
                        res.getInt("id_Teclado"),
                        res.getString("nome"),
                        res.getString("tipo"),
                        res.getFloat("preco"),
                        res.getString("descricao"),
                        res.getString("marca"),
                        res.getString("modelo"),
                        res.getInt("qtd_estoque"),
                        res.getString("data_cadastro")
                );
                listaOrdenada.add(tec);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listaOrdenada;
    }

    public ArrayList<Teclado> getProdutosEsgotados() {
        ArrayList<Teclado> produtosEsgotados = new ArrayList<>();

        try (java.sql.Connection conn = getConexao(); java.sql.Statement stmt = conn.createStatement(); ResultSet res = stmt.executeQuery("SELECT * FROM produtos.tb_teclado WHERE qtd_estoque = 0")) {

            while (res.next()) {
                Teclado tec = new Teclado(
                        res.getString("dimensao"),
                        res.getString("conectividade"),
                        res.getInt("id_Teclado"),
                        res.getString("nome"),
                        res.getString("tipo"),
                        res.getFloat("preco"),
                        res.getString("descricao"),
                        res.getString("marca"),
                        res.getString("modelo"),
                        res.getInt("qtd_estoque"),
                        res.getString("data_cadastro")
                );
                produtosEsgotados.add(tec);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return produtosEsgotados;
    }

}
