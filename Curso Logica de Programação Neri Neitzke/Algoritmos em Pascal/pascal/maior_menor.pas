// Prof Neri Aldoir Neitzke    Ulbra - Universidade
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Fazer um algoritmo que analize 3 valores inteiros (atrav�s das vari�veis n1, n2 e n3),
e informa qual o maior e qual o menor deles.}
program maior_menor;
var n1, n2, n3 : integer;
begin
    write('Digite o valor para N1: ');
    readln(n1);
    write('Digite o valor para N2: ');
    readln(n2);
    write('Digite o valor para N3: ');
    readln(n3);
    if ((n1 >= n2) and (n1 >= n3)) then
       writeln('o maior e o  .: ',n1)
    else if ((n2 >= n1) and (n2 >= n3)) then
         writeln('o maior e o  .: ',n2)
    else writeln('o maior e o  .: ',n3);

    if ((n1 <= n2) and (n1 <= n3)) then
       writeln('o menor e o  .: ',n1)
    else if ((n2 <= n1) and (n2 <= n3)) then
         writeln('o menor e o  .: ',n2)
    else writeln('o menor e o  .: ',n3);
    writeln('..................Final do Sistema..................... ');
    readln();
end.
