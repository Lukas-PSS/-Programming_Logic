// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
//Problema:Ler a nota de 10 alunos, calcular a media e mostrar essa m�dia. So aceitar notas de 0 a 10

program media_para2;
var
   nota,calc_media, soma_notas: real;  //defini��o vari�veis
   i:integer;
begin
   soma_notas :=0;
   for i:=1 to 10 do
   begin
       write('Insira a ',i,'. de 10 notas.: ');
       readln(nota);
       if ((nota >=0) and (nota <= 10)) then
          Soma_notas :=soma_notas + nota
       else
          begin
              writeln('Nota invalida, digitar somente notas de 0 a 10');
              i:=i-1;
          end;
   end;
   calc_media := soma_notas / 10;
   writeln('A media geral dos 10 alunos .: ',calc_media:6:2);  //sa�da
   write('...................Final do Sistema..................... ');
   readln();
end.
