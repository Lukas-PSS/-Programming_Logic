// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
//Problema:Ler a nota de 10 alunos, calcular a media e mostrar essa média. Só aceitar numeros de 0 a 10
import javax.swing.JOptionPane;
class media_para
{
   public static void main(String args[])
   {
      float nota,calc_media=0, soma_notas=0; //criei as variáveis
      int i;
      for(i=1;i<=10;i++)
      {
         nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a "+i+". nota de 10 notas. Somente notas de 0 a 10"));
         if ((nota >=0) && (nota <= 10))
            soma_notas = soma_notas + nota;
         else
            {
                JOptionPane.showMessageDialog(null,"Nota Invalida, digite apenas notas de  0 a 10");
                i=i-1;
             }
      }
      calc_media = soma_notas / 10;
      JOptionPane.showMessageDialog(null,"A media geral das notas .: "+calc_media);
   }
}