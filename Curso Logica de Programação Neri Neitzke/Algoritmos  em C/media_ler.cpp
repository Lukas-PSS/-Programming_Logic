// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
#include <conio.h>
#include <stdio.h>
main()
{
   float nota1,nota2,calc_media;
   printf("Digite a primeira nota.: ");
   scanf("%f",&nota1); //nota1 = 5; 
   printf("Digite a segunda nota.: ");
   scanf("%f",&nota2); //nota1 = 5;   
   calc_media = (nota1 + nota2) / 2;   
   printf("A media = %f",calc_media); 
   printf("\n.................FIM.................."); 
   getch();   // esperar uma tecla 
}
