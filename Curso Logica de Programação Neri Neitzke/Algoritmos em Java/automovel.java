// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: O custo ao consumidor de um carro novo, � a soma do custo de f�brica
com a percentagem do revendedor e com o custo dos impostos (aplicados ao custo
de f�brica). Supondo que a percentagem do revendedor seja de 25% do custo de
f�brica e que os impostos custam 45 % do custo de f�brica, fa�a um algoritmo que
 leia o valor de custo de f�brica e determine o pre�o final do autom�vel
 custo ao consumidor. */
import javax.swing.JOptionPane;
class automovel
{
   public static void main(String args[])
   {
       float custo_fabrica, perc_revendedor,  impostos, preco_final;
       custo_fabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do custo de fabrica deste autom�vel"));
       perc_revendedor =(25 * custo_fabrica) / 100;
       impostos =(45 * custo_fabrica) / 100;
       preco_final = custo_fabrica + perc_revendedor + impostos;
       JOptionPane.showMessageDialog(null,"\nCusto de Fabrica ............R$ "+custo_fabrica+
                                          "\nPercentual do revendedor ....R$ "+perc_revendedor+
                                          "\nValor dos impostos ..........R$ "+impostos+
                                          "\nPre�o Final .................R$ "+preco_final);

   }
}