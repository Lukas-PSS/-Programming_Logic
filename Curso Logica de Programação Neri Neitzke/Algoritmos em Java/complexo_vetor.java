// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que leia um vetor de 5 elementos. Calcule e mostre a soma desses elementos,
a media, quantos elementos s�o iguais ou maiores do que a m�dia, o percentual dos elementos que s�o maiores
ou iguais a media e mostrar quantos desses elementos s�o positivos e quantos s�o negativos.*/
import javax.swing.JOptionPane;
class complexo_vetor
{
   public static void main(String args[])
   {
       int vetor5[] = {9,-6,7,8,2};
       float media=0, soma=0,perc_maior=0;
       int i, iguais_maior=0, qtd_pos=0, qtd_neg=0;
       String mensagem = "";
       for(i=0;i<=4;i++)
           soma = soma + vetor5[i];

       media = soma / 5;
       for(i=0;i<=4;i++)
       {
            if (vetor5[i] > media)
               iguais_maior = iguais_maior + 1;
            if (vetor5[i] >= 0)
               qtd_pos = qtd_pos + 1;
            else
               qtd_neg = qtd_neg + 1;

            mensagem = mensagem + "Valor do vetor5["+i+"] = "+vetor5[i]+"\n";

       }
       perc_maior = (iguais_maior * 100) / 5;
       mensagem = mensagem + "\n\n A soma foi .: "+soma+
                                           "\n a media foi .: "+media+
                                           "\n"+perc_maior+"% dos elementos sao maoiores ou iguais a media geral"+
                                           "\n"+iguais_maior +" sao iguais ou maiores do que a media"+
                                           "\n"+qtd_pos +" sao positivos"+
                                           "\n"+qtd_neg + " sao negativos";
       JOptionPane.showMessageDialog(null,mensagem);


   }
}