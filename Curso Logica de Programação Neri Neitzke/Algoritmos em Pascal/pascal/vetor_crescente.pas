// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Crie um algoritmo lendo um vetor A de 3 elementos do tipo inteiro. Mostre esses elementos
do vetor A. Reordene os elementos em ordem crescente, atualize o vetor A com os elementos na ordem
crescente e mostre novamente o vetor A.}
program vetor_crescente;
var  A: array[1..3] of integer;
     i,j, aux : integer;
begin
     A[1] := 50;
     A[2] := 21;
     A[3] := 14;

     writeln('O valor de A[1] =',A[1]);
     writeln('O valor de A[2] =',A[2]);
     writeln('O valor de A[3] =',A[3]);
     for j := 1 to 2 do
        for i := 1 to 2 do
           if A[i] > A[i+1] then
           begin
              Aux := A[i];
              A[i]:= A[i+1];
              A[i+1] := aux;
           end;
     writeln;  //linha em branco
     writeln;  //linha em branco
     writeln('O valor de A[1] =',A[1]);
     writeln('O valor de A[2] =',A[2]);
     writeln('O valor de A[3] =',A[3]);

    writeln('..................Final do Sistema..................... ');
    readln();
end.
