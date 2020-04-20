// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Fazer um algoritmo que analize 3 valores inteiros (através das variáveis n1, n2 e n3),
e informa qual o maior e qual o menor deles. */
#include <conio.h>
#include <stdio.h>
main()
{
   int n1, n2, n3;
   printf("Digite o valor para N1.: ");
   scanf("%d",&n1);
   printf("Digite o valor para N2.: ");
   scanf("%d",&n2);
   printf("Digite o valor para N3.: ");
   scanf("%d",&n3);
   if ((n1 >= n2) && (n1 >= n3))
   {
      printf("\no maior e o  .: %d",n1);
      if (n2 <= n3)
         printf("\no menor e o  .: %d",n2);
      else
         printf("\no menor e o  .: %d",n3);   
   }       
   else if ((n2 >= n1) && (n2 >= n3)) 
   {
        printf("\no maior e o  .: %d",n2);
        if (n1 <= n3)
           printf("\no menor e o  .: %d",n1);
        else
           printf("\no menor e o  .: %d",n3);   
   }
   else
   {
        printf("\no maior e o  .: %d",n3);
        if (n2<= n1)
           printf("\no menor e o  .: %d",n2);
        else
           printf("\no menor e o  .: %d",n1);        
   }       


   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
