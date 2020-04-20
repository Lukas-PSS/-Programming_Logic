// Prof Neri Aldoir Neitzke - Universidade Ulbra
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Crie 2 variáveis (A e B) e leia 1 valor para cada um deles.
Disponibilize eles de forma crescente.}

program crescenteAB;
    var A, B : integer;
begin
    //A := 11;
    //B := 11;
    write('Digite o valor para A.: ');
    readln(A);
    write('Digite o valor para B.: ');
    readln(B);


    if A > B then
          writeln('Em ordem crescente B=', B ,' - A=',A)
    else
          writeln('Em ordem crescente A=', A ,' - B=',B);

   writeln('..................Final do Sistema..................... ');
   readln();
end.
