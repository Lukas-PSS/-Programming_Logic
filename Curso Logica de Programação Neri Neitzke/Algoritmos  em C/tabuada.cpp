// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler uma variável de numero inteiro e mostrar a tabuada desse número.*/
#include <conio.h>
#include <stdio.h>
main()
{
   int numero;
   printf("Digite um numero: ");
   scanf("%d",&numero);

   printf("\n\n%d x 1 = %d",numero,(numero * 1));
   printf("\n%d x 2 = %d",numero,(numero * 2));
   printf("\n%d x 3 = %d",numero,(numero * 3));
   printf("\n%d x 4 = %d",numero,(numero * 4));
   printf("\n%d x 5 = %d",numero,(numero * 5));
   printf("\n%d x 6 = %d",numero,(numero * 6));
   printf("\n%d x 7 = %d",numero,(numero * 7));
   printf("\n%d x 8 = %d",numero,(numero * 8));
   printf("\n%d x 9 = %d",numero,(numero * 9));


   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}

