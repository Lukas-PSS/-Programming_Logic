// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema:Ler a nota de 5 alunos, calcular a media e mostrar essa média e mostrar também quantos alunos ficaram com a
 sua nota igual ou acima da média.*/

#include <conio.h>
#include <stdio.h>
main()
{
       float notas[5];
       float calc_media, soma_notas;
       int contador;
       contador = 0;
/*     notas[0] = 6;
       notas[1] = 8;
       notas[2] = 4;
       notas[3] = 5;
       notas[4] = 6;                            
*/      
     printf("digite a 1. nota.: ");
       scanf("%f",&notas[0]);
       printf("digite a 2. nota.: ");
       scanf("%f",&notas[1]);
       printf("digite a 3. nota.: ");
       scanf("%f",&notas[2]);
       printf("digite a 4. nota.: ");
       scanf("%f",&notas[3]);
       printf("digite a 5. nota.: ");
       scanf("%f",&notas[4]);

       soma_notas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
       calc_media = soma_notas / 5; 
       if (notas[0] >= calc_media) 
              contador = contador + 1;
       if (notas[1] >= calc_media) 
              contador = contador + 1;
       if (notas[2] >= calc_media) 
              contador = contador + 1;
       if (notas[3] >= calc_media) 
              contador = contador + 1;
       if (notas[4] >= calc_media) 
              contador = contador + 1;

        printf("\n a media geral foi .: %f",calc_media);
        printf("\n%i alunos ficaram com a nota acima da media",contador);

        printf("\n\n\\n.................FIM.................."); 
        getch();   // esperar uma tecla 
}
