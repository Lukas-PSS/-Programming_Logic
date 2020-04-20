// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Considerando que para um consórcio, sabe-se o número total de
prestações, a quantidade de prestações pagas e o valor atual da prestação,
escreva um algoritmo que determine o total pago pelo consorciado e o
saldo devedor.
*/
import javax.swing.JOptionPane;
class consorcio
{
   public static void main(String args[])
   {
      float valor_prest, total_pago, saldo_devedor;
      int total_prest, qtd_prest_pagas;
      total_prest = Integer.parseInt(JOptionPane.showInputDialog("Digite o total das prestacoes"));
      qtd_prest_pagas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade das prestacoes pagas"));
      valor_prest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de cada prestacao"));

      total_pago = qtd_prest_pagas * valor_prest;
      saldo_devedor = valor_prest * (total_prest - qtd_prest_pagas);

      JOptionPane.showMessageDialog(null,"O total pago = "+total_pago+
                                          "\nO saldo devedor = "+saldo_devedor);
   }
}