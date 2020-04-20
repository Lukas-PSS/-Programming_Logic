// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Crie um algoritmo que leia para um cadastro de cliente, o seu nome,
sua idade e o seu salário e grave em arquivo. E por fim, mostre os valores.  */
import javax.swing.JOptionPane;
import java.io.*;
class cadastro_cliente_arquivo
{
 public static void main(String args[])
 {
     String menu = "Opcoes do Menu\n\n"+
                   "1 - Cadastrar novo Cliente\n"+
                   "2 - Mostra dados do Cliente\n"+
                   "3 - Sair do Sistema";
     int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
     if (opcao == 1)
     { cadastro dados_cliente = new cadastro();
       dados_cliente.nome = JOptionPane.showInputDialog("Digite o nome do Cliente");
       dados_cliente.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade Cliente"));
       dados_cliente.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario do Cliente"));
       try
       {
         FileOutputStream arquivo = new FileOutputStream ("banco_dados_cliente.txt");
         ObjectOutputStream  obj_dados_cliente  = new ObjectOutputStream(arquivo);
         obj_dados_cliente.writeObject(dados_cliente);
         obj_dados_cliente.flush();
         JOptionPane.showMessageDialog(null,"Parabéns, arquivo e dados do cliente gerados com sucesso");
        }  catch(Exception erro_grava)
          {}
     }
     else if (opcao == 2)
     {
         try
         {
            FileInputStream arquivo = new FileInputStream ("banco_dados_cliente.txt");
            ObjectInputStream  obj_dados_cliente  = new ObjectInputStream(arquivo);
            cadastro dados_cliente = (cadastro)obj_dados_cliente.readObject();
            JOptionPane.showMessageDialog(null,"Nome do Cliente .: "+dados_cliente.nome+
                                        "\nIdade do Cliente .: "+dados_cliente.idade+
                                        "\nSalario do cliente .: "+dados_cliente.salario);
          }
          catch(Exception erro_grava)
          {}


     }
     }

}
class cadastro implements Serializable
{
    String nome;
    int idade;
    float salario;
}