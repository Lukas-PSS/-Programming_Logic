// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
#include <conio.h>
#include <stdio.h>
//#include <string.h>
main()
{
   float nota1,nota2,calc_media;
   nota1 = 5; 
   nota2 = 7;
   calc_media = (nota1 + nota2) / 2;   
   printf("A media = %f",calc_media);  
   
   float salario = 5.5485962;
   int idade = 10;
   char nome[30];// = "Neri Neitzke";
   scanf("%s",nome);

   
   printf("O nome = %s",nome);
   printf("\nSua idade = %d",idade);   //%D = tipo inteiro
   printf("\nO salario = %f",salario); 
   printf("\n\n\\n.................FIM.................."); 
   getch();   // esperar uma tecla 

}

