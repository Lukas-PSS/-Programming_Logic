// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: O custo ao consumidor de um carro novo, é a soma do custo de fábrica
com a percentagem do revendedor e com o custo dos impostos (aplicados ao custo
de fábrica). Supondo que a percentagem do revendedor seja de 25% do custo de
fábrica e que os impostos custam 45 % do custo de fábrica, faça um algoritmo que
 leia o valor de custo de fábrica e determine o preço final do automóvel
 custo ao consumidor. */
import javax.swing.JOptionPane;
class automovel
{
   public static void main(String args[])
   {
       float custo_fabrica, perc_revendedor,  impostos, preco_final;
       custo_fabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do custo de fabrica deste automóvel"));
       perc_revendedor =(25 * custo_fabrica) / 100;
       impostos =(45 * custo_fabrica) / 100;
       preco_final = custo_fabrica + perc_revendedor + impostos;
       JOptionPane.showMessageDialog(null,"\nCusto de Fabrica ............R$ "+custo_fabrica+
                                          "\nPercentual do revendedor ....R$ "+perc_revendedor+
                                          "\nValor dos impostos ..........R$ "+impostos+
                                          "\nPreço Final .................R$ "+preco_final);

   }
}