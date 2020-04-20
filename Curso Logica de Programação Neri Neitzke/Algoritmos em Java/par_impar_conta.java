// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler dois números (inicial e final).
Escreva quantos número pares  e quantos numeros impares encontran-se entre os
dois números fornecidos pelo usuário.*/
import javax.swing.JOptionPane;
class par_impar_conta
{
   public static void main(String args[])
   {
      int numero_inicial, numero_final, numeros_pares, numeros_impares,i;
      numeros_pares  = 0;
      numeros_impares = 0;
      numero_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o número Inicial.: "));
      i = numero_inicial;
      numero_final = Integer.parseInt(JOptionPane.showInputDialog("Digite o número Final.: "));
      while(i <= numero_final)
      {
             if (i % 2 == 0)
                numeros_pares++; // igual a numeros_pares = numeros_pares + 1;
             else
                numeros_impares++; //igual a numeros_impares = numeros_impares + 1;

             i++; //igual ao i = i + 1;
      }
      JOptionPane.showMessageDialog(null,"Entre o numero "+numero_inicial+" e o numero "+
                                          numero_final+" existem "+numeros_pares+" pares e "+
                                          numeros_impares+" impares");

   }
}