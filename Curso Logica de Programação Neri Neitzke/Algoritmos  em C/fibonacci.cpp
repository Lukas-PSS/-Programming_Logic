// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Mostrar os 10 primeiros numeros da sequencia Fibonacci. Ex: 1 1 2 3 5 8  13 21 34 55 89 .....*/

#include <conio.h>
#include <stdio.h>
main()
{
       int i, num_anterior, num_atual, novo_numero;
       num_anterior = 0;
       num_atual = 1;
       printf("o 1. numero fibonaccci e 1\n");
       for(i=2;i<=10;i++)
       {
             novo_numero = num_atual + num_anterior;
             num_anterior = num_atual;
             num_atual = novo_numero;
             printf("o %d numero fibonaccci e %d\n",i,novo_numero);
       }

   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
