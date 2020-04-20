// Prof Neri Aldoir Neitzke    www.INFORMATICON.com.br - videoaulasneri@gmail.com
//Ler 2 números, efetuar as 4 operações matemáticas e mostrar os resultados.
import javax.swing.JOptionPane;
class operacoes_subalgoritmos_modularizando
{
   static float num1, num2, soma, multiplicacao, subtracao, divisao;
   public static void main(String args[])
   {
      leitura();
      calculos();
      imprimir();
    }
    public static void leitura()
    {
      num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 1"));
      num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 2"));
    }
    public static void calculos()
    {
      soma = num1 + num2;
      multiplicacao = num1 * num2;
      divisao = num1 / num2;
      subtracao = num1 - num2;
    }
    public static void imprimir()
    {
       JOptionPane.showMessageDialog(null,"A soma = "+soma+ "\nA divisao = "+divisao+
      "\nA multiplicacao = "+multiplicacao+"\nA subtracao = "+subtracao);
    }
}