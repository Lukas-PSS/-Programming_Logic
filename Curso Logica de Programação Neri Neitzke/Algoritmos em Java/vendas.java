// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/* Problema.:Uma Empresa de vendas de softwares paga a seu vendedor um fixo de R$ 800,00
por m�s, mais uma comiss�o de 15% pelo seu valor de vendas no m�s. Fa�a uma algoritmo
 que leia o valor da venda e determine o sal�rio total do funcion�rio. Mostre as
 informa��es que voc� achar necess�rio.
*/
import javax.swing.JOptionPane;
class vendas
{
   public static void main(String args[])
   {
       float fixo, comissao, vendas_mes, salario_total;
       fixo = 800;
       vendas_mes = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da venda no mes "));
       comissao = (vendas_mes * 15) / 100;
       salario_total = fixo + comissao;
       JOptionPane.showMessageDialog(null,"O salario Fixo = "+fixo+
                                          "\nA comissao  = " + comissao+
                                          "\nO salario total = "+salario_total);
   }
}