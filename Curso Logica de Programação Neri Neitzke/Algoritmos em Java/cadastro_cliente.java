// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Crie um algoritmo que leia para um cadastro de cliente, o seu nome,
sua idade e o seu salário. E por fim, mostre os valores.  */
import javax.swing.JOptionPane;
class cadastro_cliente
{
   public static void main(String args[])
   {
     cadastro dados_cliente = new cadastro();
     dados_cliente.nome = JOptionPane.showInputDialog("Digite o nome do Cliente");
     dados_cliente.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade Cliente"));
     dados_cliente.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario do Cliente"));

     JOptionPane.showMessageDialog(null,"Nome do Cliente .: "+dados_cliente.nome+
                                        "\nIdade do Cliente .: "+dados_cliente.idade+
                                        "\nSalario do cliente .: "+dados_cliente.salario);
   }
}
class cadastro
{
    String nome;
    int idade;
    float salario;
}

