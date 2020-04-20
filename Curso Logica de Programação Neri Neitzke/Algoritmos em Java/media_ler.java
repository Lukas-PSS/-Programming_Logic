// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
import javax.swing.JOptionPane;
class media_ler
{
   public static void main(String args[])
   {
      float nota1,nota2,calc_media; //criei as variáveis
                                    //DataInputStream = manipula dados de entrada try catch
      nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
      nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
      calc_media = (nota1 + nota2) / 2;
      //System.out.println("A media = "+calc_media);
      JOptionPane.showMessageDialog(null,"A media = "+calc_media);
   }
}