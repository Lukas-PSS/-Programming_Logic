// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo lendo dois vetores (A e B) de 5 elementos cada do tipo inteiro,
 liste os elementos destes dois vetores. Faça com que os elementos do vetor A passem para
  o vetor B, e os elementos do vetor B passem para o vetor A. Mostre os 2 vetores atualizados.*/
import javax.swing.JOptionPane;
class vetores_troca_5
{
   public static void main(String args[])
   {
     int A[] = {9,3,7,6,21};
     int B[] = {6,4,9,2,28};
     int C[] = new int[5];
     String mensagem = "Valores Originais\n";
     for(int j=0;j <= 4;j++)
     {
          mensagem = mensagem+ "A["+j+"] ="+A[j]+" - \n";
          mensagem = mensagem+ "B["+j+"] ="+B[j]+" - \n";
     }
     for(int i=0;i <= 4;i++)
     {
         C[i] = A[i];
         A[i] = B[i];
         B[i] = C[i];
     };
     mensagem = mensagem + "\n\nValores Ordenados\n";
     for(int j=0;j <= 4;j++)
     {
          mensagem = mensagem+ "A["+j+"] ="+A[j]+" - \n";
          mensagem = mensagem+ "B["+j+"] ="+B[j]+" - \n";
     }
    JOptionPane.showMessageDialog(null, mensagem);


   }
}