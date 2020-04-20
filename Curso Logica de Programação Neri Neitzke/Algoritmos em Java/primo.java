// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que leia um numero inteiro, e diga se ele é um numero primo ou não.*/
import javax.swing.JOptionPane;
class primo
{
   public static void main(String args[])
   {
       int numero,contador,i;
       contador = 0;
       i = 2;
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número .: "));
       while(i <  numero)
       {
          if (numero % i == 0)
             contador = contador +1;
          i = i+1;
       }
       if (contador > 0)
           JOptionPane.showMessageDialog(null,"O numero "+numero+" não é primo");
       else
           JOptionPane.showMessageDialog(null,"O numero "+numero+"  é primo");

   }
}