// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Crie um algoritmo para calcular o salário líquido de um funcionário,
 considerando que seu salário bruto, incide um desconto de 9% em inss 
 para a previdência. O algoritmo deve mostrar o nome do funcionário,
  o seu salário bruto, o valor de desconto de inss e o seu salário 
  líquido.(dica.: Você deverá pedir (ler) o nome do funcionário e 
  o valor do salário bruto)
*/
#include <conio.h>
#include <stdio.h>
main()
{
   float salario_liquido, salario_bruto,  inss;
   char nome[30];// = "Neri Neitzke";  
   printf("\nDigite o nome do Funcionario ");
   scanf("%s",nome);
   printf("\nDigite o valor do salario bruto ");
   scanf("%f",&salario_bruto);
   inss = (salario_bruto * 9) / 100;
   salario_liquido = salario_bruto - inss;

   //printf("\nO nome do funcionario = %s",nome);
   //printf("\nO salario bruto = %f",salario_bruto);
   //printf("\nO desconto do INSS = %f",inss);
   //printf("\no salario liquido  = %f",salario_liquido);
   //                  ou
   printf("\nO nome do funcionario = %s \n O salario bruto = %f \n O desconto do Inss = %f \nO salario Liquido = %f",nome,salario_bruto,inss,salario_liquido);

   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
