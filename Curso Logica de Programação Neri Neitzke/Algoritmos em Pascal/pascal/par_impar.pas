// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Ler uma vari�vel de numero inteiro e mostre se ele � par ou se ele � impar. }
program par_impar;
var numero: integer;
begin
    write('Digite o numero : ');
    readln(numero);
    if (numero mod 2 = 0) then
       writeln('esse numero e par')
    else
       writeln('esse numero e impar');

    writeln('..................Final do Sistema..................... ');
    readln();
end.
