// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
/*Crie um algoritmo para calcular o sal�rio l�quido de um funcion�rio,
 considerando que seu sal�rio bruto, incide um desconto de 9% em inss
 para a previd�ncia. O algoritmo deve mostrar o nome do funcion�rio,
  o seu sal�rio bruto, o valor de desconto de inss e o seu sal�rio
  l�quido.(dica.: Voc� dever� pedir (ler) o nome do funcion�rio e
  o valor do sal�rio bruto)
*/
import javax.swing.JOptionPane;
class salario
{
   public static void main(String args[])
   {
       float salario_liquido, salario_bruto,  inss;
       String nome;
       nome = JOptionPane.showInputDialog("Digite o nome do funcionario");
       salario_bruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salario bruto"));
       inss = (salario_bruto * 9) / 100;
       salario_liquido = salario_bruto - inss;
       JOptionPane.showMessageDialog(null,"O nome do funcionario = "+nome+
                                          "\nO salario bruto = "+salario_bruto+
                                          "\nO desconto do inss = " + inss+
                                          "\nO salario liquido = "+salario_liquido);
   }
}