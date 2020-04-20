// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Faça um algoritmo que gere a seguinte série: 10, 20, 30, 40, ..... 980, 990, 1000.*/
import javax.swing.JOptionPane;
class serie_for
{
   public static void main(String args[])
   {
        int i;
        String mensagem = "";
        for(i=10;i<=300;i=i+10)
        {
            mensagem = mensagem + i +" - ";
            if ((i == 100) || (i == 200) || (i ==300))
               mensagem = mensagem + "\n";
        }
        System.out.println(mensagem);
        JOptionPane.showMessageDialog(null, mensagem);
  }
}