// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que leia um numero inteiro, e diga se ele � um numero primo ou n�o.*/
import javax.swing.JOptionPane;
class primo
{
   public static void main(String args[])
   {
       int numero,contador,i;
       contador = 0;
       i = 2;
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero .: "));
       while(i <  numero)
       {
          if (numero % i == 0)
             contador = contador +1;
          i = i+1;
       }
       if (contador > 0)
           JOptionPane.showMessageDialog(null,"O numero "+numero+" n�o � primo");
       else
           JOptionPane.showMessageDialog(null,"O numero "+numero+"  � primo");

   }
}