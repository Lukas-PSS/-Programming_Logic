// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que leia um numero inteiro, e diga se ele � um numero primo ou n�o.*/
import javax.swing.JOptionPane;
class primo_10
{
   public static void main(String args[])
   {
       int contador, numero,i;
       boolean num_primo;
       numero = 1;
       contador = 0;
       String escreva = "";
       while (contador < 10)
       {
             num_primo = true;
             numero = numero + 1;
             i = 2;
             while((i <=  (numero/2)) && (num_primo == true))
             {
                   if (numero % i == 0)
                      num_primo = false;
                   i++;
             }
             if (num_primo == true)
             {
                   contador = contador + 1;
                   escreva = escreva + "O numero "+numero+" e o "+contador+". numero primo\n";
             }
       }
       JOptionPane.showMessageDialog(null,escreva);

   }
}