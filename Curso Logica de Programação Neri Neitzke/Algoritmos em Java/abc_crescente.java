// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Problema: Ler 3 valores INTEIROS para as variáveis A, B, C. Apresentar os valores dispostos em
ordem crescente. */
import javax.swing.JOptionPane;
class abc_crescente
{
   public static void main(String args[])
   {
        int a,b,c;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para C: "));
        if ((a <= b) && (a <= a))
          if (b <= c)
               JOptionPane.showMessageDialog(null,"Em ordem crescente ficou.: "+a+"-"+b+"-"+c);
          else
               JOptionPane.showMessageDialog(null,"Em ordem crescente ficou.: "+a+"-"+c+"-"+b);
        else  if ((b <= a) && (b <= c))
          if (a <= c)
               JOptionPane.showMessageDialog(null,"Em ordem crescente ficou.: "+b+"-"+a+"-"+c);
          else
               JOptionPane.showMessageDialog(null,"Em ordem crescente ficou.: "+b+"-"+c+"-"+a);
        else  if (a <= b)
               JOptionPane.showMessageDialog(null,"Em ordem crescente ficou.: "+c+"-"+a+"-"+b);
          else
               JOptionPane.showMessageDialog(null,"Em ordem crescente ficou.: "+c+"-"+b+"-"+a);


   }
}