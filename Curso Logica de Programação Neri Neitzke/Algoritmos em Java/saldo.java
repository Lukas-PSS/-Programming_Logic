// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/* Problema: Um cliente de um banco tem um saldo positivo de R$ 500,00.
Fazer um algoritmo que leia um cheque que entrou e calcule o saldo,
mostrando (escrevendo) o saldo na tela.
*/
import javax.swing.JOptionPane;
class saldo
{
   public static void main(String args[])
   {
        float valor_saldo, cheque_entrou;
        valor_saldo = 500;
        cheque_entrou = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cheque que entrou: "));
        valor_saldo = valor_saldo - cheque_entrou;
        JOptionPane.showMessageDialog(null," O Saldo atual = " + valor_saldo);
   }
}