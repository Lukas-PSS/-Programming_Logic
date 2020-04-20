// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/* 1.	Problema: Um cliente de um banco tem um saldo positivo de R$ 500,00. 
Fazer um algoritmo que leia um cheque que entrou e calcule o saldo, 
mostrando (escrevendo) o saldo na tela.
*/
#include <conio.h>
#include <stdio.h>
main()
{
   float valor_saldo, cheque_entrou;
   valor_saldo = 500;
   printf("Digite o valor do cheque que entrou ......: ");
   scanf("%f",&cheque_entrou);//
   valor_saldo = valor_saldo - cheque_entrou;
   printf("\n O saldo Atual =........: %f",valor_saldo);         
   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
