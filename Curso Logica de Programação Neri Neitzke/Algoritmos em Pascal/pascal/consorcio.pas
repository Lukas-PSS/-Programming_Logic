// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Considerando que para um cons�rcio, sabe-se o n�mero total de presta��es,
a quantidade de presta��es pagas e o valor atual da presta��o, escreva um algoritmo
que determine o total pago pelo consorciado e o saldo devedor.}
program consorcio;
Var valor_prest, total_pago, saldo_devedor :Real;
    total_prest, qtd_prest_pagas: Integer;

begin
       write('Digite o total das presta��es.: ');
       readln(total_prest);
       write('Digite a quantidade de presta��es pagas.: ');
       readln(qtd_prest_pagas);
       write('Digite o valor de cadas prestacao.: ');
       readln(valor_prest);
       total_pago := qtd_prest_pagas * valor_prest;
       saldo_devedor := valor_prest * (total_prest - qtd_prest_pagas);
       writeln('O total pago = ',total_pago:6:2);
       writeln('O saldo a pagar = ',saldo_devedor:6:2);
       writeln('..................Final do Sistema..................... ');
       readln();
end.
