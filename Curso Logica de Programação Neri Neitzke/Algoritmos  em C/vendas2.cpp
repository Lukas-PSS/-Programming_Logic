// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/* Problema.: Uma Empresa de desenvolvimento de softwares paga a seu vendedor 
um fixo de R$ 500,00 por mês, mais um bônus de R$ 50,00 por sistema vendido. 
Faça uma algoritmo que leia quantos softwares o funcionário vendeu e determine
 o salário total do funcionário. Mostre as informações que você achar necessário.
*/
#include <conio.h>
#include <stdio.h>
main()
{
   float fixo, bonus, qtd_softw_vend,  salario_total ;
   fixo = 500;
   printf("\nDigite a quantidade de software vendido ");
   scanf("%f",&qtd_softw_vend);
   bonus = qtd_softw_vend * 50;            
   salario_total = fixo + bonus;
   printf("\nO salário fixo = %f",fixo);
   printf("\no valor de bonus = %f",bonus);
   printf("\no salario total  = %f",salario_total);
   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
