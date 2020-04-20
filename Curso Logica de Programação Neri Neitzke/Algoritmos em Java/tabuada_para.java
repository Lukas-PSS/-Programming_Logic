// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler uma variável de numero inteiro e mostrar a tabuada desse número.*/
import javax.swing.JOptionPane;
class tabuada_para
{
   public static void main(String args[])
   {
        int i, numero;
        String mensagem = "";
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero.:"));
        for(i=1;i <= 9;i=i+1)      //i++ é igual a i=i+1;
            mensagem = mensagem + "\n"+numero + " x "+i+" = "+(numero * i);
        System.out.println(mensagem);
        JOptionPane.showMessageDialog(null, mensagem);

  }
}