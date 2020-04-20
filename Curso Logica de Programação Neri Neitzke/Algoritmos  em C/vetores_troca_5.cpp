// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo lendo dois vetores (A e B) de 5 elementos cada do tipo inteiro,
 liste os elementos destes dois vetores. Faça com que os elementos do vetor A passem para
  o vetor B, e os elementos do vetor B passem para o vetor A. Mostre os 2 vetores atualizados.*/

#include <conio.h>
#include <stdio.h>
main()
{
     int A[] = {9,3,7,6,21};
     int B[] = {6,4,9,2,28};
     int C[5];
     printf("\nValores Originais");
     for(int i=0;i <= 4;i++)
     {
          printf("\nA[%d] = %d - ",i,A[i]);
          printf("\nB[%d] = %d - ",i,B[i]);          

     }
     for(int i=0;i <= 4;i++)
     {
         C[i] = A[i];
         A[i] = B[i];
         B[i] = C[i];
     };
     printf("\n\nValores Trocados");
     for(int i=0;i <= 4;i++)
     {
          printf("\nA[%d] = %d - ",i,A[i]);
          printf("\nB[%d] = %d - ",i,B[i]);          

     }


      printf("\n\n\\n.................FIM.................."); 
      getch();   // esperar uma tecla 
}
