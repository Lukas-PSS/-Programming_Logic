// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/* Uma loja oferece para os seus clientes, um determinado desconto de acordo com
 o valor da compra efetuada. O desconto é de 10%, se o valor da compra for até
 R$200.00, 15% se for maior que R$ 200 e menor ou igual a R$ 500,00 e 20% se
 for acima de R$ 500,00. Crie um algoritmo que leia o nome do cliente e o valor
  da compra. Mostre ao final o nome do cliente, o valor da compra, o percentual
   de desconto e o seu valor e valor total a pagar deste cliente.
*/
import javax.swing.JOptionPane;
class compra_desconto
{
   public static void main(String args[])
   {
        float valor_compra, valor_desconto, valor_pagar;
        int  desconto;
        String nome;

        nome = JOptionPane.showInputDialog("Digite o nome do Cliente.: ");
        valor_compra = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da COmpra.: "));

        if (valor_compra <= 200)
            desconto = 10;
        else if(valor_compra <= 500)
            desconto = 15;
        else
            desconto = 20;

       valor_desconto = (valor_compra * desconto) / 100;
       valor_pagar = valor_compra - valor_desconto;
       JOptionPane.showMessageDialog(null, "Nome do Cliente .: "+nome+
                                           "\nValor da Compra .: "+valor_compra+
                                           "\nO percentual de desc: "+desconto+
                                           "\nValor do desconto .: "+valor_desconto+
                                           "\nValor a pagar .:" + valor_pagar);

   }
}