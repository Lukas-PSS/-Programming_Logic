// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{2.	Problema.: Uma Empresa de desenvolvimento de softwares paga a seu vendedor
 um fixo de R$ 500,00 por mês, mais um bônus de R$ 50,00 por sistema vendido.
 Faça uma algoritmo que leia quantos softwares o funcionário vendeu e determine
 o salário total do funcionário. Mostre as informações que você achar necessário.}
program vendas2;
var fixo, bonus, qtd_softw_vend,  salario_total : Real;
begin
      fixo := 500;
      write('Digite a quantiade de softwares vendidos.: ');
      readln(qtd_softw_vend);
      bonus := qtd_softw_vend * 50;
      Salario_total := fixo + bonus;
      writeln('O salário fixo = ',fixo:6:2);
      writeln('o valor de bonus = ',bonus:6:2);
      writeln('o salario total  = ',salario_total:6:2);
      writeln('..................Final do Sistema..................... ');
      readln();
end.
