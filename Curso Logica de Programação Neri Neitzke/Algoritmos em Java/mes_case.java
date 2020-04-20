// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Ler para uma variável INTEIRA um número de 1 a 12 e mostrar o nome do mês correspondente.
 Caso o mês não existir, mostrar essa informação.*/
import javax.swing.JOptionPane;
class mes_case
{
   public static void main(String args[])
   {
        int mes;
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de 1 a 12 "));
        switch(mes)
        {
            case 1:JOptionPane.showMessageDialog(null,"O mes = Janeiro");break;
            case 2:JOptionPane.showMessageDialog(null,"O mes = Fevereiro");break;
            case 3:JOptionPane.showMessageDialog(null,"O mes = Marco");break;
            case 4:JOptionPane.showMessageDialog(null,"O mes = Abril");break;
            case 5:JOptionPane.showMessageDialog(null,"O mes = Maio");break;
            case 6:JOptionPane.showMessageDialog(null,"O mes = Junho");break;
            case 7:JOptionPane.showMessageDialog(null,"O mes = Julho");break;
            case 8:JOptionPane.showMessageDialog(null,"O mes = Agosto");break;
            case 9:JOptionPane.showMessageDialog(null,"O mes = Setembro");break;
            case 10:JOptionPane.showMessageDialog(null,"O mes = Outubro");break;
            case 11:JOptionPane.showMessageDialog(null,"O mes = Novembro");break;
            case 12:JOptionPane.showMessageDialog(null,"O mes = Dezembro");break;
            default:JOptionPane.showMessageDialog(null,"O mes nao EXISTE");
       }

   }
}