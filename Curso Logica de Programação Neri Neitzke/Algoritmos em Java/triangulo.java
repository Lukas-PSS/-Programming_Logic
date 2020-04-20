// Prof Neri Aldoir Neitzke   ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Problema: Crie um algoritmo que leia tr�s valores le,ld,li e verifique se eles podem ser os comprimentos dos
lados de um tri�ngulo, e se forem, verificar se � um tri�ngulo equil�tero, is�sceles ou escaleno. Se eles n�o
formarem um tri�ngulo, escrever a mensagem "N�o � um tri�ngulo".
Antes da elabora��o do algoritmo, torna-se necess�ria a revis�o de algumas propriedades e defini��es.
Propriedade - O comprimento de cada lado de um tri�ngulo � menor do que a soma dos comprimentos dos outros dois
lados, fora desta condi��o as medidas n�o s�o consideradas de um tri�ngulo.
Defini��o 1 - Chama-se tri�ngulo equil�tero os que tem os comprimentos dos tr�s lados iguais,
Defini��o 2 - Chama-se tri�ngulo is�sceles ao tri�ngulo que tem os comprimentos de dois lados guais.
Defini��o 3 - Chama-se tri�ngulo escaleno ao tri�ngulo que tem os comprimentos dos tr�s lados diferentes. */
import javax.swing.JOptionPane;
class triangulo
{
   public static void main(String args[])
   {
        float le, ld, li;
        le = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para LE: "));
        ld = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para LD: "));
        li = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para LI: "));

        if ((li < (le + ld)) && (le < (ld + li)) && (ld < (li + le)))
           if ((le == ld) && (le == li))
                 JOptionPane.showMessageDialog(null,"triangulo  equilatero");
           else  if ((li == ld) || (li == le) || (le == ld))
                 JOptionPane.showMessageDialog(null,"triangulo  isosceles");
           else   // if ((ld != le) && (ld != li) && (li != le))
                  JOptionPane.showMessageDialog(null,"triangulo  escaleno");
        else
              JOptionPane.showMessageDialog(null,"nao e um triangulo");
   }
}