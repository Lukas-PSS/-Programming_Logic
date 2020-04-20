// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/* Problema.: Uma Empresa de desenvolvimento de softwares paga a seu vendedor
um fixo de R$ 500,00 por mês, mais um bônus de R$ 50,00 por sistema vendido.
Faça uma algoritmo que leia quantos softwares o funcionário vendeu e determine
 o salário total do funcionário. Mostre as informações que você achar necessário.
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