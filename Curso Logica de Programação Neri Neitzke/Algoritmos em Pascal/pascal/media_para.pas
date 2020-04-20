// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
//Problema:Ler a nota de 10 alunos, calcular a media e mostrar essa média

program media_para;
var
   nota,calc_media, soma_notas: real;  //definição variáveis
   i:integer;
begin
   soma_notas :=0;
   for i:=1 to 10 do
   begin
       write('Insira a ',i,'. de 10 notas.: ');
       readln(nota);
       Soma_notas :=soma_notas + nota;
   end;
   calc_media := soma_notas / 10;
   writeln('A media geral dos 10 alunos .: ',calc_media:6:2);  //saída
   write('...................Final do Sistema..................... ');
   readln();
end.
