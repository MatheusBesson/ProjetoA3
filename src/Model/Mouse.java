/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Produto;
import DAO.MouseDAO;
import java.sql.SQLException;
import java.util.ArrayList;

// *
  // @author pedro
public class Mouse extends Produto{
private int botoes; //qnts botoes
private int dpi;
private final MouseDAO dao;
    public Mouse() {
        this.dao = new MouseDAO();
    }

// Método Construtor de Objeto, inserindo dados

    public Mouse(int botoes, int dpi, MouseDAO dao) {
        this.botoes = botoes;
        this.dpi = dpi;
        
        this.dao=new MouseDAO();
    }

    public Mouse(int botoes, int dpi, int id, String nome, String tipo, float preco, String descricao, String marca, String modelo,
            int qtd_estoque, String data_cadastro) {
        super(id, nome, tipo, preco, descricao, marca, modelo,qtd_estoque,  data_cadastro);
        this.botoes = botoes;
        this.dpi = dpi;
        
        this.dao = new MouseDAO();
    }

// Métodos GET e SET

    public int getBotoes() {
        return botoes;
    }

    public void setBotoes(int botoes) {
        this.botoes = botoes;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    



@Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Preço: " + this.getPreco()
                + "\n Tipo: " + this.getTipo()               
                +"\n Botões: " + this.getBotoes()                
                +"\n Dpi: " + this.getDpi()                
                +"\n Modelo: " + this.getModelo()
                +"\n Marca: " + this.getMarca()
                + "\n Descrição:" + this.getDescricao()
                    + "\n Quantidade de estoque:" + this.getQtd_estoque()
               + "\n Data de cadastro " + this. getData_cadastro()
                + "\n -----------";
    }

    
    
 // Retorna
    public ArrayList getListaMouse() {
        return dao.getListaMouse();
    }

    // Cadastrar  novo Mouse
    public boolean InsertMouseBD(int botoes,int dpi, String nome,String tipo, float preco, String descricao, String marca, String modelo,int qtd_estoque, String data_cadastro)
    throws SQLException{    
int id = this.maiorID() + 1;
        Mouse objeto = new Mouse(botoes,dpi,id,nome,tipo,preco,descricao,marca,modelo,qtd_estoque,data_cadastro);
        dao.InsertMouseBD(objeto);
        return true;

    }

    // Deleta um mouse específico pelo seu campo ID
    public boolean DeleteMouseBD(int id) {
    // int indice = this.procuraIndice(id);
        dao.DeleteMouseBD(id);
        return true;
    }

    // carrega dados de um Mouse especifico pelo seu id
    public Mouse carregaMouse(int id) {

    dao.carregaMouse(id);
    return null;
    }

    // retorna o maior ID da nossa base de dados
   
    
    public int maiorID() throws SQLException {
        return dao.maiorID();
    }
}
 

