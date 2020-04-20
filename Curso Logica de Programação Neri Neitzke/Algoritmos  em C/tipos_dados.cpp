// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
#include <conio.h>
#include <stdio.h>
main()
{
   float salario;
   int idade;
   char nome[30];// = "Neri Neitzke";  
   //salario = 2000;
   //idade = 18;
  
   printf("Digite o seu nome.: ");
   scanf("%s",nome);
   printf("Digite a idade: ");
   scanf("%d",&idade);
   printf("Digite o salario.: ");
   scanf("%f",&salario);   
  
   
   printf("O nome = %s",nome);
   printf("\nSua idade = %d",idade);   //%D = tipo inteiro
   printf("\nO salario = %f",salario); 
   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
