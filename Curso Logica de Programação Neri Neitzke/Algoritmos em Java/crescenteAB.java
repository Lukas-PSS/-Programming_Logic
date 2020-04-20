// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie 2 variáveis (A e B) e leia 1 valor para cada um deles.
Disponibilize eles de forma crescente.
*/
import javax.swing.JOptionPane;
class crescenteAB
{
   public static void main(String args[])
   {
       int a,b;
       a = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de A"));
       b = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de B"));
       if (a > b)
          JOptionPane.showMessageDialog(null,"Em ordem crescente B="+b+" - A="+a);
       else
          JOptionPane.showMessageDialog(null,"Em ordem crescente A="+a+" - B="+b);
   }
}