// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/* Problema: O sistema de avalia��o de determinada disciplina,
� composto por tr�s provas. A primeira prova tem peso 2,  a
Segunda tem peso 3 e a terceira prova tem peso 5. Fa�a um algoritmo para
calcular a m�dia final de um aluno desta disciplina.
*/
import javax.swing.JOptionPane;
class avaliacao
{
   public static void main(String args[])
   {
        float prova1, prova2, prova3, media;
        prova1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 1.: "));
        prova2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 2.: "));
        prova3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 3.: "));
        //prova1 := 6;
        //prova2 := 8;
        //prova3 := 4;

        prova1 = prova1 * 2 /10;
        prova2 = prova2 * 3 /10;
        prova3 = prova3 * 5 /10;
        media  = (prova1 + prova2 + prova3);

        JOptionPane.showMessageDialog(null," A media final foi........: " + media);
   }
}