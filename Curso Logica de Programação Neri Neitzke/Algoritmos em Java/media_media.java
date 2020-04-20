// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema:Ler a nota de 5 alunos, calcular a media e mostrar essa média e mostrar também quantos alunos ficaram com a
 sua nota igual ou acima da média.*/
import javax.swing.JOptionPane;
class media_media
{
   public static void main(String args[])
   {
       float nota1, nota2, nota3, nota4, nota5, calc_media, soma_notas;
       int contador;
       contador = 0;
       nota1 = Float.parseFloat(JOptionPane.showInputDialog("digite a 1. nota.: "));
       nota2 = Float.parseFloat(JOptionPane.showInputDialog("digite a 2. nota.: "));
       nota3 = Float.parseFloat(JOptionPane.showInputDialog("digite a 3. nota.: "));
       nota4 = Float.parseFloat(JOptionPane.showInputDialog("digite a 4. nota.: "));
       nota5 = Float.parseFloat(JOptionPane.showInputDialog("digite a 5. nota.: "));

       soma_notas = nota1 + nota2 + nota3 + nota4 + nota5;
       calc_media = soma_notas / 5;
       if (nota1 > calc_media)
              contador++;
       if (nota2 > calc_media)
              contador++;
       if (nota3 > calc_media)
              contador++;
       if (nota4 > calc_media)
              contador++;
       if (nota5 > calc_media)
              contador++;
        JOptionPane.showMessageDialog(null," A media geral da turma foi de .: "+calc_media+"\n"+
                                             contador + " alunos ficaram com a nota acima da media");


   }
}