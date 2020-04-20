// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
import javax.swing.JOptionPane;
class operacoes
{
   public static void main(String args[])
   {
      float num1, num2, soma, multiplicacao, subtracao, divisao;
      //num1=50;
      //num2=10;
      num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 1"));
      num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 2"));

      soma = num1 + num2;
      multiplicacao = num1 * num2;
      divisao = num1 / num2;
      subtracao = num1 - num2;
      //JOptionPane.showMessageDialog(null,"A soma = "+soma);
      //JOptionPane.showMessageDialog(null,"A divisao = "+divisao);
      //JOptionPane.showMessageDialog(null,"A multiplicacao = "+multiplicacao);
      //JOptionPane.showMessageDialog(null,"A subtracao = "+subtracao);

      JOptionPane.showMessageDialog(null,"A soma = "+soma+ "\nA divisao = "+divisao+
      "\nA multiplicacao = "+multiplicacao+"\nA subtracao = "+subtracao);


    }
}