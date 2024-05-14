/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.Mouse;
import java.util.*;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import Model.Produto;



public class MouseDAO{ 
public static ArrayList<Mouse> ListaMouse = new ArrayList<Mouse>();
public int maiorID() throws SQLException{
    int maiorID = 0;
    try{
        java.sql.Statement stmt = this.getConexao().createStatement();
        //troca
        ResultSet res = stmt.executeQuery("SELECT MAX (id_Mouse) id_Mouse FROM produtos.tb_mouse"); 
        res.next();
        maiorID= res.getInt("id_Mouse");
        stmt.close();
        
    }catch (SQLException ex){
}
    return maiorID;}

    public java.sql.Connection getConexao(){
        java.sql.Connection connection=null; //instanciar conexao
        try{
            //carregando do JDBC DRIVER
            String driver ="com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
                 //configurar  conexao
                    String server = "localhost"; //caminho do MySQL
                    String database = "produtos";
                    String url = "jdbc:mysql://"+ server + ":3306/"+ database + "?useTimezone=true&serverTimezone=UTC";
                    String user = "root";
                    String password = "rootpass";
            connection = DriverManager.getConnection(url,user,password);
           
            
        if (connection !=null){System.out.println("Status: Conectado!");
            
            }else{System.out.println("Status: NÃO CONECTADO!");
            
            }
            return connection;
      } catch (ClassNotFoundException e) {  //driver nao  foi encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    // Retorna a Lista de mouses
    public ArrayList getListaMouse() {

        ListaMouse.clear(); // Limpa nosso ArrayList

        try {
            java.sql.Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM peodutos.tb_mouse");
            while (res.next()) {
                 int id = res.getInt("id");
                String nome = res.getString("nome");
                String tipo = res.getString("tipo");
                float preco = res.getFloat("preco");
                String marca = res.getString("marca");
                String modelo = res.getString("modelo");
                int qtd_estoque = res.getInt("quantidade estoque");
                String data_cadastro = res.getString("data"); 
                int botoes = res.getInt("botoes");                
                int dpi = res.getInt("dpi");
                String dimensao = res.getString("dimensão");
                int rate = res.getInt("polling rate");
                int peso = res.getInt("peso");
                float cabo = res.getFloat("cabo");
                
                String descricao = res.getString("descrição");
               

                Mouse objeto = new Mouse(botoes,dpi,dimensao,rate,peso,cabo,id,nome, tipo, preco, descricao, marca, modelo,qtd_estoque,
                data_cadastro);

                ListaMouse.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return ListaMouse;
    }

    // Cadastra novo Mouse
    public boolean InsertMouseBD(Mouse objeto) {
        String sql = "INSERT INTO produtos.tb_Mouse(id_Mouse,nome, tipo, preco, marca, modelo, qtd_estoque, data_cadastro,botoes,dpi,dimensao,rate,peso,cabo, descricao)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);


            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTipo());
            stmt.setFloat(4, objeto.getPreco());                                   
            stmt.setString(5, objeto.getMarca());
            stmt.setString(6, objeto.getModelo());            
            stmt.setString(7,objeto.getData_cadastro());
            stmt.setString(8, objeto.getDimensao());
            stmt.setInt(9, objeto.getBotoes());
            stmt.setInt(10, objeto.getDpi());
            stmt.setString(11, objeto.getDimensao());
            stmt.setInt(12, objeto.getRate());
            stmt.setInt(13, objeto.getPeso());
            stmt.setFloat(14, objeto.getCabo());
            stmt.setString(15, objeto.getDescricao());
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    // Deleta um Mouse especifico pelo seu campo ID
    public boolean DeleteMouseBD(int id) {
        try {
            java.sql.Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM produtos.tb_mouse WHERE id_Mouse " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    // Edita um Mouse especifico pelo seu campo ID
    public boolean UpdateMouseBD(Mouse objeto) {

        String sql = "UPDATE produtos.tb_mouse set nome = ? ,tipo = ? , preco = ? , marca = ? , modelo = ? , qtd_estoque = ?, data_cadastro = ?, botoes = ?, dpi = ? ,dimensao = ? ,rate = ? ,peso = ? ,cabo = ? , descricao = ? WHERE id_Mouse = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTipo());
            stmt.setFloat(3, objeto.getPreco());
            stmt.setString(4, objeto.getMarca());
            stmt.setString(5, objeto.getModelo());
            stmt.setInt(6, objeto.getQtd_estoque());
            stmt.setString(7, objeto.getData_cadastro());
            stmt.setInt(8, objeto.getBotoes());
            stmt.setInt(9, objeto.getDpi());
            stmt.setString(10, objeto.getDimensao());
            stmt.setInt(11, objeto.getRate());
            stmt.setInt(12, objeto.getPeso());
            stmt.setFloat(13, objeto.getCabo());
            stmt.setString(14, objeto.getDescricao());
            stmt.setInt(15, objeto.getId());
            
            

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Mouse carregaMouse(int id) {

        Mouse objeto = new Mouse();
        objeto.setId(id);

        try {
            java.sql.Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM produtos.tb_Mouse WHERE id_Mouse = " + id);
            res.next();

           objeto.setNome (res.getString("nome"));
           objeto.setTipo (res.getString("tipo"));
           objeto.setPreco(res.getFloat("preco"));
           objeto.setMarca (res.getString("marca"));
           objeto.setModelo (res.getString("modelo"));
           objeto.setQtd_estoque (res.getInt("quantidade estoque"));
           objeto.setData_cadastro (res.getString("data")); 
           objeto.setBotoes (res.getInt("botoes"));                
           objeto.setDpi ( res.getInt("dpi"));
           objeto.setDimensao (res.getString("dimensão"));
           objeto.setRate (res.getInt("polling rate"));
           objeto.setPeso (res.getInt("peso"));
           objeto.setCabo (res.getFloat("cabo"));
                
           objeto.setDescricao(res.getString("descrição"));
            //fecha declaraçao
            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }}


        
