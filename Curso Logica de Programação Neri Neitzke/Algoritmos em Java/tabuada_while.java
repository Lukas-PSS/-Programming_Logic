// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler uma variável de numero inteiro e mostrar a tabuada desse número.*/
import javax.swing.JOptionPane;
class tabuada_while
{
   public static void main(String args[])
   {
        int i, numero;
        String mensagem = "";
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero.:"));
        i = 1;

        while(i <= 9)      //i++ é igual a i=i+1;
        {
            mensagem = mensagem + "\n"+numero + " x "+i+" = "+(numero * i);
            i++;     //igual ao i=i+1;
        }
        System.out.println(mensagem);
        JOptionPane.showMessageDialog(null, mensagem);

  }
}