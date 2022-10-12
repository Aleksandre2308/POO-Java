package Entity;

public class Orcamento {
  // esse array vai armazenar os serviços que serão colocados no orçamento
  private ArrayList<Servico> servicos = new ArrayList<Servico>();
  
  // esse array vai armazenar as peças que serão colocadas no orçamento
  private ArrayList<Peca> pecas = new ArrayList<Peca>();

  
  //
  void adicionarServico(int identificador){
    //consulta os dados do servico pelo id
    
    
    //adiciona as informações no array
    this.servicos.add(identificador);
  }
  
  //
  public void adicionarPeca(int identificador){
    //consulta os dados pelo id
    
    
    //adiciona as informações no array
    this.pecas.add(identificador)
  }
  
  
  

}

/*

orcamento = new Orcamento();

orcamento.adicionarServico(6);
orcamento.adicionarServico(3);
orcamento.adicionarPeca(15);
orcamento.adicionarPeca(34);




*/
