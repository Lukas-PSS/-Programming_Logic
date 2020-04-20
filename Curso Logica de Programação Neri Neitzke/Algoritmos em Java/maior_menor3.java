// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Fazer um algoritmo que analize 3 valores inteiros (através das variáveis n1, n2 e n3),
e informa qual o maior e qual o menor deles. */
import javax.swing.JOptionPane;
class maior_menor3
{
   public static void main(String args[])
   {
        int n1, n2, n3;
        String mensagem="";
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para N1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para N2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para N3: "));

        if ((n1 >= n2) && (n1 >= n3))
        {
           mensagem = mensagem + "O maior e o  .: "+n1;
           if (n2 <= n3)
              mensagem = mensagem + "\nO menor e o  .: "+n2;
           else
              mensagem = mensagem + "\nO menor e o  .: "+n3;
        }
        else if ((n2 >= n1) && (n2 >= n3))
        {
             mensagem = mensagem + "\nO maior e o  .: "+n2;
             if (n1 <= n3)
                mensagem = mensagem + "\nO menor e o  .: "+n1;
             else
                mensagem = mensagem + "\nO menor e o  .: "+n3;
        }
        else
        {
            mensagem = mensagem + "\nO maior e o  .: "+n3;
             if (n2 <= n1)
                mensagem = mensagem + "\n menor e o  .: "+n2;
             else
                mensagem = mensagem + "\nO menor e o  .: "+n1;
         }

         JOptionPane.showMessageDialog(null,mensagem);


   }
}