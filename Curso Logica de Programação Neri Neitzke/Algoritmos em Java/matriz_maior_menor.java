// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que gere uma matriz exerc_matriz 3x3, inserir dados nos elementos
 dessa matriz, por fim, mostre os dados contidos na matriz e mostre qual é o maior e qual
 é o menor valor da matriz.*/
import javax.swing.JOptionPane;
class matriz_maior_menor
{
   public static void main(String args[])
   {
     int maior = 0, menor = 99999;
     int exerc_matriz [][] = new int [3][3];
     String mensagem = "";
     for(int l=0;l<=2;l++)
       for(int c=0;c<=2;c++)
       {
              exerc_matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para exerc_matriz["+l+","+c+"].: "));
              mensagem = mensagem +  "\nO valor de exerc_matriz["+l+","+c+"].: "+exerc_matriz[l][c];
              if (exerc_matriz[l][c] > maior)
                 maior = exerc_matriz[l][c];
              if (exerc_matriz[l][c] < menor)
                  menor = exerc_matriz[l][c];
       };
     mensagem = mensagem +"\n\n O maior valor da matriz .: "+maior+
                          "\nO menor valor da matriz .: "+menor;
     JOptionPane.showMessageDialog(null,mensagem);


  }
}