// Prof Neri Aldoir Neitzke www.INFORMATICON.com.br - videoaulasneri@gmail.com
//Ler 2 números, efetuar as 4 operações matemáticas e mostrar os resultados. C/ parametros
#include <conio.h>
#include <stdio.h>
void leitura();
void calculos(float pn1, float pn2);
void imprimir(float mult, float div, float sub, float som);
float num1, num2, multiplicacao, divisao, soma, subtracao;
main()
{
   leitura();
   calculos(num1, num2);
   imprimir(multiplicacao, divisao, subtracao, soma); 
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
void calculos(float pn1, float pn2)
{
   soma = pn1 + pn2;
   subtracao = pn1 - pn2;
   divisao = pn1 / pn2;
   multiplicacao = pn1 * pn2;         
}
void imprimir(float mult, float div, float sub, float som)
{
   printf("\nA soma = %f",som);
   printf("\nA divisao = %f",div);
   printf("\nA multiplicacao = %f",mult);
   printf("\nA subtracao = %f",sub);   
}

