// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo lendo um vetor A de 3 elementos do tipo inteiro. Mostre esses elementos
do vetor A. Reordene os elementos em ordem crescente, atualize o vetor A com os elementos na ordem
crescente e mostre novamente o vetor A.}*/

#include <conio.h>
#include <stdio.h>
main()
{
     int A[] = {50,21,14};
     int Aux;
     printf("O Vetor A em ordem Original");
     printf("\nO valor de A[1] =%d",A[0]);
     printf("\nO valor de A[2] =%d",A[1]);
     printf("\nO valor de A[3] =%d",A[2]);          
     for(int percorre=0;percorre <= 1;percorre++)
        for(int i=0;i <= 1;i++)
           if (A[i] > A[i+1])
           {
              Aux = A[i];
              A[i] = A[i+1];
              A[i+1] = Aux;
           };
     printf("\n\nO Vetor A em ordem crescente");
     printf("\nO valor de A[1] =%d",A[0]);
     printf("\nO valor de A[2] =%d",A[1]);
     printf("\nO valor de A[3] =%d",A[2]);          


      printf("\n\n\\n.................FIM.................."); 
      getch();   // esperar uma tecla 
}
