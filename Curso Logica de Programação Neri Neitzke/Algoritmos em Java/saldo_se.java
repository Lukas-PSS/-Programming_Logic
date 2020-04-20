// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Fazer um algoritmo que leia o saldo inicial de cliente do banco
e leia também um cheque que entrou e ANALISE se o cheque poderá ser descontado
ou não , já que este cliente não possui limite. Se o cheque não poderá
ser descontado, mostre essa informação, caso contrário, desconte o
cheque e informe o saldo na tela.
*/
import javax.swing.JOptionPane;
class saldo_se
{
   public static void main(String args[])
   {
        float valor_saldo, cheque_entrou;
        valor_saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saldo inicial: "));
        cheque_entrou = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cheque que entrou: "));
        if (cheque_entrou <= valor_saldo)
        {
              valor_saldo = valor_saldo - cheque_entrou;
              JOptionPane.showMessageDialog(null,"O seu novo saldo ....: "+valor_saldo);
         }
         else
         {
             JOptionPane.showMessageDialog(null," Atencao, este cheque nao pode ser descontado.: "+
                                                "\nO seu saldo continua....: "+valor_saldo);
         }
   }
}