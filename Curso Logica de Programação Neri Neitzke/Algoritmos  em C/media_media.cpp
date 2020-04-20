// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema:Ler a nota de 5 alunos, calcular a media e mostrar essa média e mostrar também quantos alunos ficaram com a
 sua nota igual ou acima da média.*/

#include <conio.h>
#include <stdio.h>
main()
{
       float nota1, nota2, nota3, nota4, nota5, calc_media, soma_notas;
       int contador;
       contador = 0;
       printf("digite a 1. nota.: ");
       scanf("%f",&nota1);
       printf("digite a 2. nota.: ");
       scanf("%f",&nota2);
       printf("digite a 3. nota.: ");
       scanf("%f",&nota3);
       printf("digite a 4. nota.: ");
       scanf("%f",&nota4);
       printf("digite a 5. nota.: ");
       scanf("%f",&nota5);

       soma_notas = nota1 + nota2 + nota3 + nota4 + nota5;
       calc_media = soma_notas / 5; 
       if (nota1 > calc_media) 
              contador = contador + 1;
       if (nota2 > calc_media) 
              contador = contador + 1;
       if (nota3 > calc_media) 
              contador = contador + 1;
       if (nota4 > calc_media) 
              contador = contador + 1;
       if (nota5 > calc_media) 
              contador = contador + 1;

        printf("\n a media geral foi .: %f",calc_media);
        printf("\n%i alunos ficaram com a nota acima da media",contador);

        printf("\n\n\\n.................FIM.................."); 
        getch();   // esperar uma tecla 
}
