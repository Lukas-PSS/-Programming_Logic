// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que leia um numero inteiro, e diga se ele é um numero primo ou não.*/
#include <conio.h>
#include <stdio.h>
main()
{
    int numero,contador,i;
    contador = 0;
    i = 2;
    printf("Digite um número .: ");
    scanf("%d",&numero);
    while((i <=  (numero/2)) && (contador == 0))
    {
       printf("%d",i);      
       if (numero % i == 0)
          contador = contador +1;
       i=i+1;    
    } 
    if (contador > 0)
        printf("\nO numero %d nao e primo",numero);
    else
        printf("\nO numero %d e primo",numero);

   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
