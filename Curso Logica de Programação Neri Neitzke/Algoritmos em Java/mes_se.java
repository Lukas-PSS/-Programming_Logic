// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler para uma vari�vel INTEIRA um n�mero de 1 a 12 e mostrar o nome do m�s correspondente.
 Caso o m�s n�o existir, mostrar essa informa��o.*/
import javax.swing.JOptionPane;
class mes_se
{
   public static void main(String args[])
   {
        int mes;
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de 1 a 12 "));
        if (mes == 1) JOptionPane.showMessageDialog(null,"O mes = Janeiro");
        else if (mes == 2) JOptionPane.showMessageDialog(null,"O mes = Fevereiro");
        else if (mes == 3) JOptionPane.showMessageDialog(null,"O mes = Marco");
        else if (mes == 4) JOptionPane.showMessageDialog(null,"O mes = Abril");
        else if (mes == 5) JOptionPane.showMessageDialog(null,"O mes = Maio");
        else if (mes == 6) JOptionPane.showMessageDialog(null,"O mes = Junho");
        else if (mes == 7) JOptionPane.showMessageDialog(null,"O mes = Julho");
        else if (mes == 8) JOptionPane.showMessageDialog(null,"O mes = Agosto");
        else if (mes == 9) JOptionPane.showMessageDialog(null,"O mes = Setembro");
        else if (mes == 10) JOptionPane.showMessageDialog(null,"O mes = Outubro");
        else if (mes == 11) JOptionPane.showMessageDialog(null,"O mes = Novembro");
        else if (mes == 12) JOptionPane.showMessageDialog(null,"O mes = Dezembro");
        else JOptionPane.showMessageDialog(null,"O mes nao EXISTE");

   }
}