// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema:Ler a nota de 5 alunos, calcular a media e mostrar essa média e mostrar também quantos alunos ficaram com a
 sua nota igual ou acima da média.*/
import javax.swing.JOptionPane;
class media_media_vetor
{
   public static void main(String args[])
   {
       float notas [] = new float[5];
       float calc_media, soma_notas;
       int contador;
       contador = 0;

       //notas[0] = 6;
       //notas[1] = 8;
       //notas[2] = 9;
       //notas[3] = 2;
       //notas[4] = 5;

       notas[0] = Float.parseFloat(JOptionPane.showInputDialog("digite a 1. nota.: "));
       notas[1] = Float.parseFloat(JOptionPane.showInputDialog("digite a 2. nota.: "));
       notas[2] = Float.parseFloat(JOptionPane.showInputDialog("digite a 3. nota.: "));
       notas[3] = Float.parseFloat(JOptionPane.showInputDialog("digite a 4. nota.: "));
       notas[4] = Float.parseFloat(JOptionPane.showInputDialog("digite a 5. nota.: "));

       soma_notas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
       calc_media = soma_notas / 5;
       if (notas[0] >= calc_media)
              contador++;
       if (notas[1] >= calc_media)
              contador++;
       if (notas[2] >= calc_media)
              contador++;
       if (notas[3] >= calc_media)
              contador++;
       if (notas[4] >= calc_media)
              contador++;
        JOptionPane.showMessageDialog(null," A media geral da turma foi de .: "+calc_media+"\n"+
                                             contador + " alunos ficaram com a nota acima da media");


   }
}