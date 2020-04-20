// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Considerando que para um consórcio, sabe-se o número total de prestações,
a quantidade de prestações pagas e o valor atual da prestação, escreva um algoritmo
que determine o total pago pelo consorciado e o saldo devedor.}
program consorcio;
Var valor_prest, total_pago, saldo_devedor :Real;
    total_prest, qtd_prest_pagas: Integer;

begin
       write('Digite o total das prestações.: ');
       readln(total_prest);
       write('Digite a quantidade de prestações pagas.: ');
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
