// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema:Ler a nota de 5 alunos, calcular a media e mostrar essa média e mostrar também quantos alunos ficaram com a
 sua nota igual ou acima da média.*/
import javax.swing.JOptionPane;
class media_media_vetor_correto
{
   public static void main(String args[])
   {
       float notas [] = new float[5];
       float calc_media, soma_notas;
       int contador;
       contador = 0;
       soma_notas = 0;
       for(int i=0;i<=4;i++)
       {
               notas[i] = Float.parseFloat(JOptionPane.showInputDialog("digite a "+i+". nota.: "));
               soma_notas = soma_notas + notas[i];
        }
        calc_media = soma_notas / 5;
        for(int i = 0;i<=4;i++)
           if (notas[i] >= calc_media)
              contador++;

        JOptionPane.showMessageDialog(null," A media geral da turma foi de .: "+calc_media+"\n"+
                                             contador + " alunos ficaram com a nota acima da media");


   }
}