// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*ie um algoritmo que leia para um cadastro de cliente, o seu nome, sua idade e o seu salário.
 E por fim, mostre os valores.*/
#include <conio.h>
#include <stdio.h>
struct cadastro
{
    char nome [30];
    int idade;
    float salario;
};
       
 main()
{
   struct cadastro dados_cliente;
   printf("Digite o nome do Cliente.: ");
   scanf("%s",&dados_cliente.nome);
   printf("Digite a idade do Cliente.: ");
   scanf("%d",&dados_cliente.idade);
   printf("Digite o salario do Cliente.: ");
   scanf("%f",&dados_cliente.salario);
   
   printf("\n\nNome do Cliente.: %s",dados_cliente.nome);
   printf("\nIdade do Cliente.: %d",dados_cliente.idade);
   printf("\nSalário do Cliente.: %f",dados_cliente.salario);      
   
   printf("\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}

