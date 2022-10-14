package Entity;

// permite utilizar listas contendo vários objetos
import java.util.ArrayList;

// permite utilizar banco de dados nesta classe
import java.sql.*;


public class Orcamento {
  
  // VARIÁVEIS DE INSTÂNCIA ======================================================================
  
  // Esse array vai armazenar os serviços que serão colocados no orçamento
  private ArrayList<Servico> servicos = new ArrayList<Servico>();
  
  // Esse array vai armazenar as peças que serão colocadas no orçamento
  private ArrayList<Peca> pecas = new ArrayList<Peca>();

  // Essa variável vai armazenar a soma dos valores de todos os serviços e peças no orçamento
  private double valorParaAutomovel = 0;
  
  // CONSTRUTORES ================================================================================
  
    // Não requer nenhum construtor personalizado, uma vez que os serviços e peças serão acrescentados
    // após o objeto ser criado. O valor total só será calculado após os cadastros, então é inicializado com 0 (zero).
  
    
  // MÉTODOS DE ACESSO (GET/SET) =================================================================
  
  // Retorna o valor total do orçamento
  public double getValorParaAutomovel(){
  
    this.calcularTotal();   // Chama o método que calcula o total do orçamento, para não retornar um valor incorreto.
    
    return this.valorParaAutomovel;
  
  } // Fim do método getValorParaAutomovel
  
  
  // Retorna a lista dos serviços presentes no orçamento
  public ArrayList<Servico> getServicos(){
    
    return this.servicos;
    
  } // Fim do método getServicos
  
  
  // Retorna a lista das peças presentes no orçamento
  public ArrayList<Peca> getPecas(){
    
    return this.pecas;
    
  } // Fim do método getPecas
  
  
  // OUTROS MÉTODOS ===============================================================================
  
  // Esse método percorre as listas de Serviços e Peças, pegando o preço de cada item e somando tudo.
  // É private porque apenas o próprio objeto poderá realizar essa ação.
  private calcularTotal(){
    double soma = 0;
    
    for (Servico s : servicos){
      soma = soma + s.getPreco();
    }
    
    for (Peca p : pecas){
      soma = soma + p.getPreco();
    }
    
    this.valorParaAutomovel = soma;
  
  } // Fim do método calcularTotal
  
  
  // Acrescenta um item na lista de serviços, é necessário fornecer o id. Funciona como se fosse setServico().
  
  void adicionarServico(int identificador){

    //consulta os dados do servico pelo id
    // tratamento de erros que venham a acontecer ao trabalhar com o BD
    
    try{
      
      Connection conexao = BaseDAO.getConexao();
      String comando = "SELECT * FROM servicos WHERE id = " + identificador;
      PreparedStatement ps = conexao.prepareStatement(comando);
      ResultSet rs = ps.executeQuery();
      
      // verifica se encontrou o serviço desejado
      if rs.next(){
        
        Servico s = new Servico(); // cria um objeto da classe Serviço com os dados trazidos do banco
        s.setIdServico(rs.getInt("id"));
        s.setNomeServico(rs.getString("nome"));
        s.setPreco(rs.getDouble("preco"));
        
        this.servicos.add(s); // acrescenta o serviço na lista de serviços do orçamento
        
      }else{                     // se não encontrou o serviço, exibe uma mensagem
        System.out.println("Serviço não localizado");
      }
      
        
    }catch(SQLException e){  // captura e exibe erros de execução
      e.printStackTrace();
    }
    
  } // Fim do método adicionarServico
  
  
  
  
  // Acrescenta um item na lista de peças, é necessário fornecer o id. Funciona como se fosse setPeca().  
  
  public void adicionarPeca(int identificador){
    //consulta os dados pelo id
    
    // tratamento de erros que venham a acontecer ao trabalhar com o BD
    
    try{
      // estabelece a conexao com o bd
      Connection conexao = Conexao.getConexao();
      
      // pesquisa SQL a ser executada
      String comando = "SELECT * FROM pecas WHERE id = " + identificador;
      
      // cria o objeto que executa um comando sql
      PreparedStatement ps = conexao.prepareStatement(comando);
      
      // armazena o resultado da pesquisa nessa variável
      ResultSet rs = ps.executeQuery();
      
      // verifica se tem algo na variável
      if (rs.next()){
        
        Peca p = new Peca(); // cria um objeto da classe Peça com os dados trazidos do banco
        p.setIdPeca(rs.getString("id"));
        p.setNome(rs.getString("nome"));
        p.setPreco(rs.getDouble("preco"));
        p.setFab(rs.getString("fabricante"));
        
        this.pecas.add(p); // acrescenta a peça na lista de peças do orçamento
        
      }else{                     // se não encontrou a peça, exibe uma mensagem de erro
        System.out.println("Serviço não localizado");
      }
      
        
    }catch(SQLException e){  // captura e exibe erros de execução
      e.printStackTrace();
    }
  
  } // fim do método adicionarPeca
  

} //fim da classe Orçamento






/*

//Exemplo de uso dessa classe

orcamento = new Orcamento();

orcamento.adicionarServico(6);
orcamento.adicionarServico(3);
orcamento.adicionarPeca(15);
orcamento.adicionarPeca(34);

System.out.println("Total = " + orcamento.getValorParaAutomovel() );

*/
//Fim do código
