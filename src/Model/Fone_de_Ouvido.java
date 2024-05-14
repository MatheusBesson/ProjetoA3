package Model;

import java.util.*;
import DAO.Fone_de_OuvidoDAO;
import java.sql.SQLException;
import java.util.Date;

public class Fone_de_Ouvido extends Produto {
    
    
    
    private String resposta_de_frequencia;
    private String microfone; //microfone destacavel ou integrado
    private String sensibilidade;
    private String material;
    private String cor;
    private String duracao_da_bateria; //caso aplicavel
    private final Fone_de_OuvidoDAO dao;
    
    // M�todo Construtor de Objeto Vazio
    public Fone_de_Ouvido(){
        this.dao = new Fone_de_OuvidoDAO(); // inicializado n�o importa em qual construtor
    }
    
    // M�todo Construtor de Objeto, inserindo dados

    public Fone_de_Ouvido(String resposta_de_frequencia, String microfone, String sensibilidade, String material,
           String cor, String duracao_da_bateria) {
        this.resposta_de_frequencia = resposta_de_frequencia;
        this.microfone = microfone;
        this.sensibilidade = sensibilidade;
        this.material = material;
        this.cor = cor;
        this.duracao_da_bateria = duracao_da_bateria;
        this.dao = new Fone_de_OuvidoDAO(); // inicializado n�o importa em qual construtor
    }
    
    // M�todo Construtor usando tamb�m o construtor da SUPERCLASSE
    public Fone_de_Ouvido(String resposta_de_frequencia, String microfone, String sensibilidade, String material,
           String cor, String duracao_da_bateria, int id, String nome, String tipo,float preco,
           String descricao, String marca, String modelo, int qtd_estoque, Date data_cadastro) {
            
        super(id, nome, tipo, preco, descricao, marca, modelo, qtd_estoque, data_cadastro);
        this.resposta_de_frequencia = resposta_de_frequencia;
        this.microfone = microfone;
        this.sensibilidade = sensibilidade;
        this.material = material;
        this.cor = cor;
        this.duracao_da_bateria = duracao_da_bateria;
        this.dao = new Fone_de_OuvidoDAO(); // inicializado n�o importa em qual construtor
    
    }

    public String getResposta_de_frequencia() {
        return resposta_de_frequencia;
    }

    public void setResposta_de_frequencia(String resposta_de_frequencia) {
        this.resposta_de_frequencia = resposta_de_frequencia;
    }

    public String getMicrofone() {
        return microfone;
    }

    public void setMicrofone(String microfone) {
        this.microfone = microfone;
    }

    public String getSensibilidade() {
        return sensibilidade;
    }

    public void setSensibilidade(String sensibilidade) {
        this.sensibilidade = sensibilidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDuracao_da_bateria() {
        return duracao_da_bateria;
    }

    public void setDuracao_da_bateria(String duracao_da_bateria) {
        this.duracao_da_bateria = duracao_da_bateria;
    }
    
    @Override
    public String toString() {
        return  "\n"+ super.toString()
        + "\n Resposta_de_frequencia " + this.getResposta_de_frequencia()
        + "\n Microfone " + this.getMicrofone()
        + "\n Sensibilidade " + this.getSensibilidade()
        + "\n Material " + this.getMaterial()
        + "\n Cor " + this.getCor()
        + "\n Duração da Bateria " + this.getDuracao_da_bateria();
    }
/*
    
        ABAIXO OS M�TODOS PARA USO JUNTO COM O DAO
        SIMULANDO A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS.
    
     */
    // Retorna a Lista de Fone_de_ouvido(objetos)
    public ArrayList getMinhaLista() {
        //return Fone_de_ouvidoDAO.MinhaLista;
        return dao.getMinhaLista();

    }
    // Cadastra novo Fone
    public boolean InsertFoneBD(String resposta_de_frequencia, String microfone, String sensibilidade,
            String material, String cor, String duracao_da_bateria,String nome, String tipo, float preco,
            String descricao, String marca, String modelo, int qtd_estoque, Date data_cadastro) throws SQLException {
        int id = this.maiorID() + 1;
        Fone_de_Ouvido objeto = new Fone_de_Ouvido(resposta_de_frequencia, microfone, sensibilidade, material, cor,
        duracao_da_bateria, id, nome, tipo, preco, descricao, marca, modelo, qtd_estoque, data_cadastro);
        dao.InsertFoneBD(objeto);
        return true;

    }
    // Deleta um aluno espec�fico pelo seu campo ID
    public boolean DeleteFoneBD(int id) {
        dao.DeleteFoneBD(id);
        return true;
    }
    // Edita um aluno espec�fico pelo seu campo ID
    public boolean UpdateFoneBD(String resposta_de_frequencia, String microfone, String sensibilidade,
            String material, String cor, String duracao_da_bateria, int id, String nome, String tipo, float preco,
            String descricao, String marca, String modelo, int qtd_estoque, Date data_cadastro) {
        Fone_de_Ouvido objeto = new Fone_de_Ouvido(resposta_de_frequencia, microfone, sensibilidade, material, cor,
        duracao_da_bateria, id, nome, tipo, preco, descricao, marca, modelo, qtd_estoque, data_cadastro);
//        int indice = this.procuraIndice(id);
//        AlunoDAO.MinhaLista.set(indice, objeto);
        dao.UpdateFoneBD(objeto);
        return true;
    }
    // carrega dados de um Fone espec�fico pelo seu ID
    public Fone_de_Ouvido carregaFone(int id) {
        dao.carregaFone(id);
        return null;
    }
    // retorna o maior ID da nossa base de dados
        public int maiorID() throws SQLException{
        return dao.maiorID();
    }
}
