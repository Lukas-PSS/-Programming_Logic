// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Considerando que para um consórcio, sabe-se o número total de 
prestações, a quantidade de prestações pagas e o valor atual da prestação, 
escreva um algoritmo que determine o total pago pelo consorciado e o 
saldo devedor.
*/
#include <conio.h>
#include <stdio.h>
main()
{
   float valor_prest, total_pago, saldo_devedor;
   int total_prest, qtd_prest_pagas;
   printf("\nDigite o total das prestacoes..: ");
   scanf("%d",&total_prest);
   printf("\nDigite a quantidade de prestacoes pagas.: ");
   scanf("%d",&qtd_prest_pagas);
   printf("\nDigite o valor de cada prestacao.: ");
   scanf("%f",&valor_prest);
   
   total_pago = qtd_prest_pagas * valor_prest;
   saldo_devedor = valor_prest * (total_prest - qtd_prest_pagas);

   printf("\nO total pago = %f \n E o saldo devedor = %f",total_pago,saldo_devedor);

   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
