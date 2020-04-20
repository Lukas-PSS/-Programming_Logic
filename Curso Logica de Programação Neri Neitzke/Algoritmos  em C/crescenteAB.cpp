// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie 2 variáveis (A e B) e leia 1 valor para cada um deles.
Disponibilize eles de forma crescente.
*/
#include <conio.h>
#include <stdio.h>
main()
{
       int a,b;
       printf("\nDigite o valor de A.: ");
       scanf("%d",&a);
       printf("\nDigite o valor de B.: ");
       scanf("%d",&b);
       if (a > b) 
          printf("Em ordem crescente B=%d - A=%d",b,a);
       else
        printf("Em ordem crescente A=%d - B=%d",a,b);
 

       printf("\n\n\\n.................FIM.................."); 
       getch();   // esperar uma tecla 
}
