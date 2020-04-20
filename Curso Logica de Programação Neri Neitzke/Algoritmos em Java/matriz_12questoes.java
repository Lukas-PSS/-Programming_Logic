// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie uma matriz 4x4 chamada Mat4 e leia os valores para todos os elementos da matriz e :
1) mostre essa matriz;
2) Calcule a soma dos elementos e mostre a soma;
3) calcule e mostre a média dos elementos da matriz;
4) mostre os elementos da diagonal principal;
5) que mostre os elementos da diagonal secundária;
6) mostre os elementos da linha 3;
7) mostre os elementos da Coluna 2;
8) calcule e mostre quantos elementos são números maiores que a média (e mostre esses elementos);
9) mostre em que posição se encontra o maior e o menor elemento da matriz;
10) crie uma segunda matriz MatNeri de 4x4 e armazene o conteúdo de cada elemento da matriz multiplicado por 2, mostre os elementos dessa nova matriz;
11) Que mostre os elementos pares e Impares da matriz, e dizer também quantos são pares e quantos são impares;
12) Crie um vetor chamado Vetor_neri que contenha os elementos da 2º linha e mostre este vetor */
import javax.swing.JOptionPane;
class matriz_12questoes
{
   public static void main(String args[])
   {
        int mat4[][] = new int[4][4];
        int matneri [][] = new int [4][4];
        int vetor_neri [] = new int[4];
        int l, c, maior, menor,soma, com_media, conta_pares, conta_impares;
        String elem_vert,elem_sec, elem_l3, elem_c2, mostra_com_media, pos_maior, pos_menor, mostra_pares, mostra_impares, vetNeri;
        maior = 0; menor = 99999; soma = 0; com_media = 0; conta_pares = 0;
        conta_impares  = 0;
        float media = 0;
        elem_vert = "";  elem_sec = ""; elem_l3 = ""; elem_c2 = ""; mostra_com_media = "";
        pos_maior = "";pos_menor = ""; mostra_pares = ""; mostra_impares = "";
        vetNeri = "";
        String mensagem_mat4 = "",mensagem_mat5 = "", mensagem_matneri ="", mensagem_mat6 = "";
        for(l=0;l<=3;l++)
         for(c=0;c<=3;c++)
         {
             mat4[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para Mat4["+l+"]["+c+"]"));
             soma = soma + mat4[l][c];
          }
        media = soma / 16;
        for(l=0;l<=3;l++)
         for(c=0;c<=3;c++)
         {
            mensagem_mat4 = mensagem_mat4 + "\nO valor de mat4["+l+"]["+c+"].: "+mat4[l][c];
            if (l == c)
               elem_vert = elem_vert + mat4[l][c] + " -  ";
            if (c == (3-l))
               elem_sec = elem_sec + mat4[l][c] + " -  ";
            if (l == 2)
               elem_l3 = elem_l3 + mat4[l][c] + " -  ";
            if (c == 1)
               elem_c2 = elem_c2 + mat4[l][c] + " -  ";
            if (mat4[l][c] >= media)
             {
                  com_media = com_media + 1;
                  mostra_com_media = mostra_com_media + mat4[l][c] + " - ";
             };
            if (mat4[l][c] > maior)
            {
               maior = mat4[l][c];
               pos_maior = "mat4["+l+"]["+c+"]";
            }
            if (mat4[l][c] < menor)
            {
               menor = mat4[l][c];
               pos_menor = "mat4["+l+"]["+c+"]";
            }

            matneri[l][c] = mat4[l][c] * 2;

            if (mat4[l][c] % 2 ==0)
            {
                 conta_pares = conta_pares + 1;
                 mostra_pares = mostra_pares + mat4[l][c] + " - ";
            }
            else
            {
                     conta_impares = conta_impares + 1;
                     mostra_impares = mostra_impares + mat4[l][c] + " - ";
            }
            if (l == 1)
            {
                  vetor_neri[c] = mat4[l][c];
                  vetNeri =  vetNeri + vetor_neri[c];
            }
       }
       mensagem_mat4 = mensagem_mat4 +  "\nA soma dos elementos da matriz .: "+soma;
       mensagem_mat4 = mensagem_mat4 +  "\nA media dos valores da matriz .: "+media;
       mensagem_mat4 = mensagem_mat4 +  "\no maior valor está em l"+pos_maior+" e o menor valor está em "+pos_menor;

       mensagem_mat5 = mensagem_mat5 +  "\nElementos da diagonal principal .: "+elem_vert;
       mensagem_mat5 = mensagem_mat5 +  "\nElementos da diagonal secundaria .: "+elem_sec;
       mensagem_mat5 = mensagem_mat5 +  "\nElementos da linha 3 .: "+elem_l3;
       mensagem_mat5 = mensagem_mat5 +  "\nElementos da Coluna 2 .: "+elem_c2;
       mensagem_mat5 = mensagem_mat5 +  "\n elementos atingiram a media, eles são.: "+mostra_com_media;


        for(l=0;l<=3;l++)
         for(c=0;c<=3;c++)
         {
                   mensagem_matneri = mensagem_matneri + "\nO valor de matNeri["+l+"]["+c+"].: "+matneri[l][c];
         }

       mensagem_mat6 = mensagem_mat6 + conta_pares+"\n sao pares, abaixo estao eles.: \n";
       mensagem_mat6 = mensagem_mat6 + mostra_pares;
       mensagem_mat6 = mensagem_mat6 + "\n\n"+conta_impares+"\n sao impares, abaixo estao eles.: \n";
       mensagem_mat6 = mensagem_mat6 + mostra_impares;

       mensagem_mat6 = mensagem_mat6 + "\nO Vetor_neri possui os elementos.: "+vetNeri;

       JOptionPane.showMessageDialog(null,mensagem_mat4);
       JOptionPane.showMessageDialog(null,mensagem_mat5);
       JOptionPane.showMessageDialog(null,mensagem_mat6);
   }
}