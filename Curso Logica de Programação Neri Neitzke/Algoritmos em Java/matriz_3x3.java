// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que gere uma matriz exerc_matriz 3x3, inserir dados nos
elementos dessa matriz, por fim, mostre os dados contidos na matriz.*/
import javax.swing.JOptionPane;
class matriz_3x3
{
   public static void main(String args[])
   {
     int exerc_matriz [][] = new int [3][3];
     String mensagem = "";
     for(int l=0;l<=2;l++)
       for(int c=0;c<=2;c++)
       {
              exerc_matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para exerc_matriz["+l+","+c+"].: "));
              mensagem = mensagem +  "\nO valor de exerc_matriz["+l+","+c+"].: "+exerc_matriz[l][c];

       };
     JOptionPane.showMessageDialog(null,mensagem);
  }
}