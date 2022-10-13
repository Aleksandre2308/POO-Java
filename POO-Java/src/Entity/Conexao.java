import java.sql.*;

public class Conexao{
	
  // permite usar a variável sem criar um objeto
  static Connection con;

  // permite chamar o método sem criar um objeto
  static Connection getConexao(){
  
    // tratamento de erro
    try {
      con = DriverManager.getConnection("jdbc:mysql://localhost/oficina","root","");
    }catch(SQLException e){
      e.printStackTrace();
    }

    return con;
	  
  }//fim de getConexao

}// fim da classe Conexao
