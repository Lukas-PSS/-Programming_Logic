// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Ler uma variável de numero inteiro e mostre se ele é par ou se ele é impar. }
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
