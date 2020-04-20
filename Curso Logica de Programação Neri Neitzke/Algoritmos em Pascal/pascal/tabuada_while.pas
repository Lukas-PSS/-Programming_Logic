// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Ler uma variável de numero inteiro e mostrar a tabuada desse número. }
program tabuada_while;
var numero,i: integer;
begin
    write('Digite o numero : ');
    readln(numero);
    i := 1;
    while(i <= 9) do
    begin
        writeln(numero  ,' x ',i,' = ',(numero * i));
        i:= i +1;
    end;
    writeln('..................Final do Sistema..................... ');
    readln();
end.
