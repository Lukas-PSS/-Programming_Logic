// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Analisando a fórmula " Prestação = valor + (valor * (taxa/100) * tempo)",
crie um algoritmo para efetuar o cálculo do valor de uma prestação em atraso.
 (Você deverá ler o VALOR da prestação, a TAXA  de juros imposta pelo banco,
 e o número de dias em ATRASO
*/
#include <conio.h>
#include <stdio.h>
main()
{
       float prestacao, valor_prest, taxa;
       int dias_atraso;
       printf("\nDigite o valor da prestacao.: ");
       scanf("%f",&valor_prest);
       printf("\ndigite a taxa de juros.: ");
       scanf("%f",&taxa);
       printf("\ndigite o numero de dias em atraso: ");
       scanf("%d",&dias_atraso);
     
       prestacao = valor_prest + (valor_prest * (taxa/100)*dias_atraso);
 
       printf("\nO valor corrigido da prestacao = %f",prestacao);

       printf("\n\n\\n.................FIM.................."); 
       getch();   // esperar uma tecla 
}
