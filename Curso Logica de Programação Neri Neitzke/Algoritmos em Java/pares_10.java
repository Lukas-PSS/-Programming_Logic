// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Mostre os 10 primeiros números pares.*/
import javax.swing.JOptionPane;
class pares_10
{
   public static void main(String args[])
   {
        int numero = 1, conta_pares=0;
        String mensagem = "";
        while(conta_pares < 10)
        {
            if  (numero % 2 == 0)
            {
                mensagem = mensagem + "o numero "+numero+" = par\n";
                conta_pares = conta_pares + 1;
            }
            numero = numero + 1;
        }
        JOptionPane.showMessageDialog(null,mensagem);

   }
}