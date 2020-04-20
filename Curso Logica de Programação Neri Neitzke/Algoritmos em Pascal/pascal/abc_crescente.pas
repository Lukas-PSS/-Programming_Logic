// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Ler 3 valores INTEIROS para as variáveis A, B, C. Apresentar os valores dispostos em ordem crescente. }
program abc_crescente;
var a, b, c : integer;
begin
    write('Digite o valor de A.: ');
    readln(a);//
    write('Digite o valor de B.: ');
    readln(b);//
    write('Digite o valor de C.: ');
    readln(c);//
    if (a <= b) and (a <= c) then
        if (B <= C) then
               writeln('Em ordem crescente ficou.: ',A,'-',B,'-',C)
          else
               writeln('Em ordem crescente ficou.: ',A,'-',C,'-',B)
    else  if (b <= a) and (b <= c) then
        if (a <= C) then
               writeln('Em ordem crescente ficou.: ',b,'-',a,'-',C)
          else
               writeln('Em ordem crescente ficou.: ',b,'-',C,'-',a)
    else if (a <= b) then
               writeln('Em ordem crescente ficou.: ',C,'-',a,'-',b)
          else
               writeln('Em ordem crescente ficou.: ',C,'-',b,'-',a);
    writeln('..................Final do Sistema..................... ');
    readln();
end.
