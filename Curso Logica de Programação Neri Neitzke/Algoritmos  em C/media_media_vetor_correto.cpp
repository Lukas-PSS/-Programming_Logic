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
       int i,contador;
       contador = 0;
       soma_notas = 0;
       for(i=0;i<=4;i++)
       {             
           printf("digite a %d. nota.: ",i+1);
           scanf("%f",&notas[i]);
           soma_notas = soma_notas + notas[i];
       }    
       calc_media = soma_notas / 5; 
       for(i=1;i<=4;i++) 
          if (notas[i] >= calc_media) 
              contador = contador + 1;

        printf("\n a media geral foi .: %f",calc_media);
        printf("\n%i alunos ficaram com a nota acima da media",contador);

        printf("\n\n\\n.................FIM.................."); 
        getch();   // esperar uma tecla 
}
