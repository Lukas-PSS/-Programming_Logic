// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/* Problema.: Uma Empresa de desenvolvimento de softwares paga a seu vendedor
um fixo de R$ 500,00 por m�s, mais um b�nus de R$ 50,00 por sistema vendido.
Fa�a uma algoritmo que leia quantos softwares o funcion�rio vendeu e determine
 o sal�rio total do funcion�rio. Mostre as informa��es que voc� achar necess�rio.
*/
import javax.swing.JOptionPane;
class vendas2
{
   public static void main(String args[])
   {
       float fixo, bonus, qtd_softw_vend,  salario_total ;
       fixo = 500;
       qtd_softw_vend = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de software vendido "));
       bonus = qtd_softw_vend * 50;
       salario_total = fixo + bonus;
       JOptionPane.showMessageDialog(null,"O salario Fixo = "+fixo+
                                          "\nO bonus  = " + bonus+
                                          "\nO salario total = "+salario_total);
   }
}