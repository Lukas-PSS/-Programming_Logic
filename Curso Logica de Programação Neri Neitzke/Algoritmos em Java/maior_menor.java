// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Fazer um algoritmo que analize 3 valores inteiros (atrav�s das vari�veis n1, n2 e n3),
e informa qual o maior e qual o menor deles. */
import javax.swing.JOptionPane;
class maior_menor
{
   public static void main(String args[])
   {
        int n1, n2, n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para N1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para N2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para N3: "));

        if ((n1 >= n2) && (n1 >= n3))
           JOptionPane.showMessageDialog(null,"o maior e o  .: "+n1);
        else if ((n2 >= n1) && (n2 >= n3))
           JOptionPane.showMessageDialog(null,"o maior e o  .: "+n2);
        else
            JOptionPane.showMessageDialog(null,"\no maior e o  .: "+n3);

        if ((n1 <= n2) && (n1 <= n3))
           JOptionPane.showMessageDialog(null,"\no menor e o  .: "+n1);
        else if ((n2 <= n1) && (n2 <= n3))
           JOptionPane.showMessageDialog(null,"\no menor e o  .: "+n2);
        else
            JOptionPane.showMessageDialog(null,"\no menor e o  .: "+n3);

   }
}