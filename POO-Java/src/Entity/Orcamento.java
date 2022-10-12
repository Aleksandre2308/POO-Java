package Entity;

// permite utilizar listas contendo vários objetos
import java.util.ArrayList;

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
  
    //this.calcularTotal();            //chama o método que calcula o total do orçamento, para não retornar um valor incorreto.
    
    return this.valorParaAutomovel;
  
  } // Fim do método getValorParaAutomovel
  
  
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
    
    
    // Adiciona as informações no array
    this.servicos.add(identificador);
  
  } // Fim do método adicionarServico
  
  
  // Acrescenta um item na lista de serviços, é necessário fornecer o id. Funciona como se fosse setPeca().
  //
  public void adicionarPeca(int identificador){
    //consulta os dados pelo id
    
    
    //adiciona as informações no array
    this.pecas.add(identificador);
  
  } // fim do método adicionarPeca
  
  
  

} //fim da classe Orçamento

/*

//Exemplo de uso dessa classe

orcamento = new Orcamento();

orcamento.adicionarServico(6);
orcamento.adicionarServico(3);
orcamento.adicionarPeca(15);
orcamento.adicionarPeca(34);
orcamento.getValorParaAutomovel();

*/
