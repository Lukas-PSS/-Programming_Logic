// Prof Neri Aldoir Neitzke    www.INFORMATICON.com.br - videoaulasneri@gmail.com
//Ler 2 números, efetuar as 4 operações matemáticas e mostrar os resultados.
import javax.swing.JOptionPane;
class subalgoritmos_metodo
{
   static float num1, num2, soma, multiplicacao, subtracao, divisao;
   public static void main(String args[])
   {
      leitura();
      calculos(num1, num2);
      imprimir(multiplicacao, divisao, subtracao,soma);
    }
    public static void leitura()
    {
      num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 1"));
      num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 2"));
    }
    public static void calculos(float pn1, float pn2)
    {
      soma = pn1 + pn2;
      multiplicacao = pn1 * pn2;
      divisao = pn1 / pn2;
      subtracao = pn1 - pn2;
    }
    public static void imprimir(float mult, float div, float sub, float som)
    {
       JOptionPane.showMessageDialog(null,"A soma = "+som+ "\nA divisao = "+div+
      "\nA multiplicacao = "+mult+"\nA subtracao = "+sub);
    }
}