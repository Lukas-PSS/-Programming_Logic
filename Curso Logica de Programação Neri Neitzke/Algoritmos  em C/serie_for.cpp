// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Faça um algoritmo que gere a seguinte série: 10, 20, 30, 40, ..... 980, 990, 1000.*/
#include <conio.h>
#include <stdio.h>
main()
{
   int i;
   for(i=10;i<=1000;i=i+10)
   {                      
      printf("%d - ",i);
      if ((i == 100) || (i == 200) || (i ==300))
         printf("\n");  
   } 
   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}

