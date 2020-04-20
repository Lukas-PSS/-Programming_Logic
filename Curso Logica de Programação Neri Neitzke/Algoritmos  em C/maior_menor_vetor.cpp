// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Fazer um algoritmo que analize 10 valores inteiros  informa
qual o maior e qual o menor deles.*/

#include <conio.h>
#include <stdio.h>
main()
{
       int maior_menor [] = {22,3,7,8,15,9,11,7,6,4};
       int i, maior=0, menor=99999;
       for (i=0;i<9;i++)
       {
               if (maior_menor[i] > maior)
                    maior = maior_menor[i];
               if (maior_menor[i] < menor)
                    menor = maior_menor[i];
      }
      printf("o maior valor .: %d e o menor valor .: %d ",maior,menor);
      printf("\n\n\\n.................FIM.................."); 
      getch();   // esperar uma tecla 
}
