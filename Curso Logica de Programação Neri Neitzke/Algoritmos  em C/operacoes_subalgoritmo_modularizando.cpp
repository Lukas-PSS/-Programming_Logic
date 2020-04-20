// Prof Neri Aldoir Neitzke www.INFORMATICON.com.br - videoaulasneri@gmail.com
//Ler 2 números, efetuar as 4 operações matemáticas e mostrar os resultados.
#include <conio.h>
#include <stdio.h>
void leitura();
void calculos();
void imprimir();
float num1, num2, multiplicacao, divisao, soma, subtracao;
main()
{
   leitura();
   calculos();
   imprimir(); 
   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
void leitura()
{
  printf("Digite o numero 1 .: ");
  scanf("%f",&num1);
  printf("Digite o numero 2 .: ");
  scanf("%f",&num2);
}
void calculos()
{
   soma = num1 + num2;
   subtracao = num1 - num2;
   divisao = num1 / num2;
   multiplicacao = num1 * num2;         
}
void imprimir()
{
   printf("\nA soma = %f",soma);
   printf("\nA divisao = %f",divisao);
   printf("\nA multiplicacao = %f",multiplicacao);
   printf("\nA subtracao = %f",subtracao);   
}

