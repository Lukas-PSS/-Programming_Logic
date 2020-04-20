// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que gere uma matriz exerc_matriz 3x3, inserir dados nos
elementos dessa matriz, por fim, mostre os dados contidos na matriz.*/

#include <conio.h>
#include <stdio.h>
main()
{
     int exerc_matriz [3][3];
     for(int l=0;l<=2;l++)
       for(int c=0;c<=2;c++)
       {
              printf("Digite valor para exerc_matriz[%d][%d].: ",l,c);
              scanf("%d",&exerc_matriz[l][c]); 
              
       };
     printf("\n");  
     for(int l=0;l<=2;l++)
       for(int c=0;c<=2;c++)
          printf("\nO valor de exerc_matriz[%d][%d].: %d",l,c,exerc_matriz[l][c]);

      printf("\n\n\\n.................FIM.................."); 
      getch();   // esperar uma tecla 
}
