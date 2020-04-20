// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler uma variável de numero inteiro e mostrar a tabuada desse número.*/
import javax.swing.JOptionPane;
class tabuada
{
   public static void main(String args[])
   {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero.:"));
        JOptionPane.showMessageDialog(null,"\n"+numero + " x 1 = "+(numero * 1)+
                                           "\n"+numero + " x 2 = "+(numero * 2)+
                                           "\n"+numero + " x 3 = "+(numero * 3)+
                                           "\n"+numero + " x 4 = "+(numero * 4)+
                                           "\n"+numero + " x 5 = "+(numero * 5)+
                                           "\n"+numero + " x 6 = "+(numero * 6)+
                                           "\n"+numero + " x 7 = "+(numero * 7)+
                                           "\n"+numero + " x 8 = "+(numero * 8)+
                                           "\n"+numero + " x 9 = "+(numero * 9));
   }
}