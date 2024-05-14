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
import Model.Produto;


/**
 *
 * @author pedro
 */
public class MouseDAO{ 
public static ArrayList<Mouse> ListaMouse = new ArrayList<Mouse>();
public int maiorID() throws SQLException{
    int maiorID = 0;
    try{
        java.sql.Statement stmt = this.getConexao().createStatement();
        ResultSet res = stmt.executeQuery("SELECT MAX (id)id FROM tb_mouse"); //trocar
        res.next();
        maiorID= res.getInt("id");
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
            //configurar a conexao
            String server = "localhost"; //caminho do MySQL
            String database = "db_mouse";
            String url = "jdbc:mysql://"+ server + ":3306"+ database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "rootpass";
            connection = DriverManager.getConnection(url,user,password);
            //testando
            if (connection !=null){System.out.println("Status: conectado!");
            
            }else{System.out.println("Status: NÃO CONECTADO!");
            
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

    // Retorna a Lista de mouses(objetos)
    public ArrayList getListaMouse() {

        ListaMouse.clear(); // Limpa nosso ArrayList

        try {
            java.sql.Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_mouse");
            while (res.next()) {
                int botoes = res.getInt("botões");                
                int dpi = res.getInt("dpi");
                int dimensao = res.getInt("dimensão");
                int rate = res.getInt("polling rate");
                int peso = res.getInt("peso");
                float cabo = res.getFloat("cabo");
                String tipo = res.getString("tipo");
                String descricao = res.getString("descrição");
                int id = res.getInt("id");
                String nome = res.getString("nome");
                float preco = res.getFloat("preco");
                String marca = res.getString("marca");
                String modelo = res.getString("modelo");

                Mouse objeto = new Mouse(botoes,dpi,dimensao,rate,peso,cabo,id,nome, tipo, preco, descricao, marca, modelo);

                ListaMouse.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return ListaMouse;
    }

    // Cadastra novo aluno
    public boolean InsertMouseBD(Mouse objeto) {
        String sql = "INSERT INTO tb_Mouse(id,nome,idade,curso,fase) VALUES(?,?,?,?,?)";  //<<<<----------------

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);


            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTipo());
            stmt.setDouble(4, objeto.getPreco());                        
            stmt.setInt(5, objeto.getBotoes());
            stmt.setInt(6, objeto.getDpi());
            stmt.setInt(7, objeto.getDimensao());
            stmt.setInt(8, objeto.getrate());
            stmt.setInt(9, objeto.getpeso());
            stmt.setFloat(10, objeto.getcabo());
            stmt.setString(11, objeto.getModelo());
            stmt.setString(12, objeto.getMarca());
            stmt.setString(13, objeto.getDescricao());

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
            stmt.executeUpdate("DELETE FROM tb_mouse WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    // Edita um teclado espec�fico pelo seu campo ID
    public boolean UpdateMouseBD(Mouse objeto) {

        String sql = "UPDATE tb_mouse set nome = ? ,idade = ? ,curso = ? ,fase = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTipo());
            stmt.setDouble(3, objeto.getPreco());
            stmt.setInt(4, objeto.getBotoes());
            stmt.setInt(5, objeto.getDpi());
            stmt.setInt(6, objeto.getDimensao());
            stmt.setInt(7, objeto.getrate());
            stmt.setInt(8, objeto.getpeso());
            stmt.setFloat(9, objeto.getcabo());
            stmt.setString(10, objeto.getModelo());
            stmt.setString(11, objeto.getMarca());
            stmt.setString(12, objeto.getDescricao());
            stmt.setInt(13, objeto.getId());

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
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_Mouse WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setPreco(res.getFloat("preco"));
            objeto.setTipo(res.getString("tipo"));
            objeto.setBotoes(res.getInt("Botoes"));
            objeto.setDpi(res.getInt("Dpi"));
            objeto.setDimensao(res.getInt("Dimensao"));
            objeto.setRate(res.getInt("Pollingrate"));
            objeto.setPeso(res.getInt("Peso"));
            objeto.setCabo(res.getFloat("Cabo"));
            objeto.setMarca(res.getString("marca"));
            objeto.setDescricao(res.getString("descricao"));
            //fecha declaraçao
            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }}


        
