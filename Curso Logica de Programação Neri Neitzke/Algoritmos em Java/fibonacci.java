// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Mostrar os 10 primeiros numeros da sequencia Fibonacci. Ex: 1 1 2 3 5 8  13 21 34 55 89 .....*/
import javax.swing.JOptionPane;
class fibonacci
{
   public static void main(String args[])
   {
       int i, num_anterior, num_atual, novo_numero;
       num_anterior = 0;
       num_atual = 1;
       String mensagem = "o 1. numero fibonaccci é 1\n";
       for(i=2;i<=10;i++)
       {
             novo_numero = num_atual + num_anterior;
             num_anterior = num_atual;
             num_atual = novo_numero;
             mensagem = mensagem +  "o "+i+". numero fibonaccci é "+novo_numero+"\n";
       }
       JOptionPane.showMessageDialog(null,mensagem);

   }
}