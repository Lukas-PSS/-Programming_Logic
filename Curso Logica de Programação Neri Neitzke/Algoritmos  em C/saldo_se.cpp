// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Fazer um algoritmo que leia o saldo inicial de cliente do banco
e leia também um cheque que entrou e ANALISE se o cheque poderá ser descontado
ou não , já que este cliente não possui limite. Se o cheque não poderá
ser descontado, mostre essa informação, caso contrário, desconte o
cheque e informe o saldo na tela.
*/
#include <conio.h>
#include <stdio.h>
main()
{
   float valor_saldo, cheque_entrou;
   printf("Digite o valor do saldo inicial ......: ");
   scanf("%f",&valor_saldo);
   printf("Digite o valor do cheque para entrar...: ");
   scanf("%f",&cheque_entrou);
   if (cheque_entrou <= valor_saldo)
   {
        valor_saldo = valor_saldo - cheque_entrou;
        printf("\n O seu novo saldo ....: %f",valor_saldo);
   }
   else
   {
        printf("\n Atencao, este cheque nao pode ser descontado.: ");
        printf("\n O seu saldo continua....: %f",valor_saldo);
   }              
   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
