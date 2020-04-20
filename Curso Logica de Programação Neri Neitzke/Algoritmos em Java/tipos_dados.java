// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
import javax.swing.JOptionPane;
class tipos_dados
{
   public static void main(String args[])
   {
      float salario;
      int idade;
      String nome;
      //salario = 2000;
      //idade = 18;
      //nome = "Neri Neitzke";
      nome = JOptionPane.showInputDialog("Digite o nome");
      idade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
      salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario"));



      System.out.println("O nome = "+nome);
      System.out.println("Sua idade = "+idade);
      System.out.println("Seu salário = "+salario);

     JOptionPane.showMessageDialog(null,"O nome = "+nome);
     JOptionPane.showMessageDialog(null,"Sua idade = "+idade);
     JOptionPane.showMessageDialog(null,"O salario = "+salario);            }
}