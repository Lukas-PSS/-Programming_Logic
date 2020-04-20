// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Analisando a fórmula " Prestação = valor + (valor * (taxa/100) * tempo)",
crie um algoritmo para efetuar o cálculo do valor de uma prestação em atraso.
 (Você deverá ler o VALOR da prestação, a TAXA  de juros imposta pelo banco,
 e o número de dias em ATRASO
*/
import javax.swing.JOptionPane;
class prestacao
{
   public static void main(String args[])
   {
       float prestacao, valor_prest, taxa;
       int dias_atraso;

       valor_prest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da prestacao"));
       taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros"));
       dias_atraso = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de dias em atraso"));

      prestacao = valor_prest + (valor_prest * (taxa/100)*dias_atraso);

      JOptionPane.showMessageDialog(null,"O valor corrigido da prestacao =  "+prestacao);
   }
}