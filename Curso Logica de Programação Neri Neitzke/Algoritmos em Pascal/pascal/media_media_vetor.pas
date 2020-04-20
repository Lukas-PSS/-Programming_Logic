// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema:Ler a nota de 5 alunos, calcular a media e mostrar essa média e mostrar também quantos alunos ficaram com a
 sua nota igual ou acima da média. }
program media_media_vetor;
var    notas : array[1..5] of real;
       calc_media, soma_notas : real;
       contador : integer;
begin
      contador := 0;
      notas[1] := 6;
      notas[2] := 2;
      notas[3] := 6;
      notas[4] := 9;
      notas[5] := 6;
{      write('digite a 1. nota.: ');
      readln(notas[1]);
      write('digite a 2. nota.: ');
      readln(notas[2]);
      write('digite a 3. nota.: ');
      readln(notas[3]);
      write('digite a 4. nota.: ');
      readln(notas[4]);
      write('digite a 5. nota.: ');
      readln(notas[5]);
}      soma_notas := notas[1] + notas[2] + notas[3] + notas[4] + notas[5];
      calc_media := soma_notas / 5;
      if (notas[1] >= calc_media) then
              contador := contador + 1;
      if (notas[2] >= calc_media) then
              contador := contador + 1;
      if (notas[3] >= calc_media) then
              contador := contador + 1;
      if (notas[4] >= calc_media) then
              contador := contador + 1;
      if (notas[5] >= calc_media) then
              contador := contador + 1;

      writeln('a media de todas as notas = ',calc_media:6:2);
      writeln(contador ,' alunos ficaram com a nota acima da media');
    writeln('..................Final do Sistema..................... ');
    readln();
end.
