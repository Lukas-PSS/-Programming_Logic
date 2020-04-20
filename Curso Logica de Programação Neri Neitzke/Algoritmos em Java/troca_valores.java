// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Duas variáveis (A e B) possuem valores distintos (A:=5 e B:= 10),
Crie um algoritmo que armazene esses dois valores nessas duas variáveis,
e efetue a troca dos valores de forma que a variável A passe a possuir
o valor da variável B e que a variável B passe a possuir o valor da variável A.
Por fim, apresentar os valores trocado;*/

import javax.swing.JOptionPane;
class troca_valores
{
   public static void main(String args[])
   {
      int A, B, Auxiliar;
      A = 5;
      B = 10;
      JOptionPane.showMessageDialog(null,"Antes da troca : \nA = "+A+" e \nB = "+B);
      Auxiliar = A;
      A = B;
      B = Auxiliar;
      JOptionPane.showMessageDialog(null,"Depois da troca: \nA = "+A+" e \nB = "+B);
    }
}