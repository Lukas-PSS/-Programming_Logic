// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler para uma variável INTEIRA um número de 1 a 12 e mostrar o nome do mês correspondente.
 Caso o mês não existir, mostrar essa informação.*/
#include <conio.h>
#include <stdio.h>
main()
{
   int mes;
   printf("Digite o mes de 1 a 12: ");
   scanf("%d",&mes);
   
   if (mes == 1) printf("O mes = Janeiro");
   else if (mes == 2) printf("O mes = Fevereiro"); 
   else if (mes == 3) printf("O mes = Marco"); 
   else if (mes == 4) printf("O mes = Abril"); 
   else if (mes == 5) printf("O mes = Maio"); 
   else if (mes == 6) printf("O mes = Junho"); 
   else if (mes == 7) printf("O mes = Julho"); 
   else if (mes == 8) printf("O mes = Agosto"); 
   else if (mes == 9) printf("O mes = Setembro"); 
   else if (mes == 10) printf("O mes = Outubro"); 
   else if (mes == 11) printf("O mes = Novembro"); 
   else if (mes == 12) printf("O mes = Dezembro"); 
   else printf("O mes nao EXISTE");                                     
   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}

