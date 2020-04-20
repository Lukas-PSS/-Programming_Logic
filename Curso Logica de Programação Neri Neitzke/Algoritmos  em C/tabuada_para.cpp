// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler uma variável de numero inteiro e mostrar a tabuada desse número.*/
#include <conio.h>
#include <stdio.h>
main()
{
   int numero,i;
   printf("Digite um numero: ");
   scanf("%d",&numero);
   for(i=1;i <= 20;i=i+1)      //i++ é igual a i=i+1;
      printf("\n%d x %d = %d",numero,i,(numero * i));
   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}

