// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler uma vari�vel de numero inteiro e mostre se ele � par ou se ele � impar. */
import javax.swing.JOptionPane;
class par_impar
{
   public static void main(String args[])
   {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero.:"));
        if (numero % 2 == 0)
            JOptionPane.showMessageDialog(null,"O numero "+numero+" e par");
        else
            JOptionPane.showMessageDialog(null,"O numero "+numero+" e impar");

   }
}