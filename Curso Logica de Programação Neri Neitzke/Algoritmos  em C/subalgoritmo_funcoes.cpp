// Prof Neri Aldoir Neitzke www.INFORMATICON.com.br - videoaulasneri@gmail.com
//Ler 2 números, efetuar as 4 operações matemáticas e mostrar os resultados. C/ funções
#include <conio.h>
#include <stdio.h>
void leitura();
float somar(float pn1, float pn2);
float multiplicar(float pn1, float pn2);
float subtrair(float pn1, float pn2);
float dividir(float pn1, float pn2);
float num1, num2, multiplicacao, divisao, soma, subtracao;
main()
{
   leitura();
   printf("\\n\nA soma deu .: %f",somar(num1, num2));
   printf("\nA multiplicacao deu .: %f",multiplicar(num1, num2));
   printf("\nA subtracao deu .: %f",subtrair(num1, num2));
   printf("\nA divisao deu .: %f",dividir(num1, num2));         
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
float somar(float pn1, float pn2)
{
   soma = pn1 + pn2;
   return(soma);
}
float multiplicar(float pn1, float pn2)
{
   multiplicacao = pn1 * pn2;
   return(multiplicacao);
}
float dividir(float pn1, float pn2)
{
   divisao = pn1 / pn2;
   return(divisao);
}
float subtrair(float pn1, float pn2)
{
   subtracao = pn1 - pn2;
   return(subtracao);
}


