// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Mostre os 10 primeiros números pares.*/
#include <conio.h>
#include <stdio.h>
main()
{
   int numero = 1, conta_pares = 0;
   while (conta_pares < 10)
   {
         if  (numero % 2 == 0)
         {
                printf("\no numero %d = par.",numero);
                conta_pares = conta_pares + 1;
         }
         numero = numero + 1;
   }
 

   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}

