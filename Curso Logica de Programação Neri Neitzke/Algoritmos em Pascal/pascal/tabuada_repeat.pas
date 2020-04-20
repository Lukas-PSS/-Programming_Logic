// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Ler uma variável de numero inteiro e mostrar a tabuada desse número. }
program tabuada_repeat;
var numero,i: integer;
begin
    write('Digite o numero : ');
    readln(numero);
    i := 15;
    repeat
      begin
          writeln(numero  ,' x ',i,' = ',(numero * i));
          i:= i +1;
      end;
    until(i > 9);
    writeln('..................Final do Sistema..................... ');
    readln();
end.
