// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que leia um numero inteiro, e diga se ele � um numero primo ou n�o.*/
import javax.swing.JOptionPane;
class primo_logico
{
   public static void main(String args[])
   {
       int numero,i;
       boolean contador = true;
       i = 2;
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero .: "));
       while((i <= (numero/2)) && (contador == true))
       {
          System.out.println(i);
          if (numero % i == 0)
             contador = false;
          i = i+1;
       }
       if (contador) //(contador == true)
           JOptionPane.showMessageDialog(null,"O numero "+numero+" e primo");
       else
           JOptionPane.showMessageDialog(null,"O numero "+numero+" nao e primo");

   }
}