// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Analisando a f�rmula " Presta��o = valor + (valor * (taxa/100) * tempo)",
crie um algoritmo para efetuar o c�lculo do valor de uma presta��o em atraso.
 (Voc� dever� ler o VALOR da presta��o, a TAXA  de juros imposta pelo banco,
 e o n�mero de dias em ATRASO
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