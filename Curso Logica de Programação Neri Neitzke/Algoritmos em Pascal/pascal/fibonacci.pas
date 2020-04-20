// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Mostrar os 10 primeiros numeros da sequencia Fibonacci. Ex: 1 1 2 3 5 8  13 21 34 55 89 ..... }
program fibonacci;
Var i, num_anterior, num_atual, novo_numero : integer;
begin
       Num_anterior := 0;
       Num_atual := 1;
       writeln('o 1. numero fibonaccci é 1');
       for i := 2 to 15 do
       begin
             Novo_numero := num_atual + num_anterior;
             Num_anterior := num_atual;
             Num_atual := novo_numero;
             writeln('o ',i,'. numero fibonaccci é ',novo_numero);
       end;

    writeln('..................Final do Sistema..................... ');
    readln();
end.
