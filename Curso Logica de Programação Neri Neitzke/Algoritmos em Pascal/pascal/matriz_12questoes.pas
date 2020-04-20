// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Crie uma matriz 4x4 chamada Mat4 e leia os valores para todos os elementos da matriz e :
1) mostre essa matriz;
2) Calcule a soma dos elementos e mostre a soma;
3) calcule e mostre a média dos elementos da matriz; 
4) mostre os elementos da diagonal principal; 
5) que mostre os elementos da diagonal secundária; 
6) mostre os elementos da linha 3; 
7) mostre os elementos da Coluna 2; 
8) calcule e mostre quantos elementos são números maiores que a média (e mostre esses elementos); 
9) mostre em que posição se encontra o maior e o menor elemento da matriz; 
10) crie uma segunda matriz MatNeri de 4x4 e armazene o conteúdo de cada elemento da matriz multiplicado por 2, mostre os elementos dessa nova matriz; 
11) Que mostre os elementos pares e Impares da matriz, e dizer também quantos são pares e quantos são impares; 
12) Crie um vetor chamado Vetor_neri que contenha os elementos da 2º linha e mostre este vetor }
program matriz_12questoes;
Var Mat4:array [1..4,1..4] of integer;
    MatNeri:array [1..4,1..4] of integer;
    Vetor_neri:array[1..4] of integer;
    l, c, maior, menor, com_media, conta_pares, conta_impares, lpmaior, cpmaior, lpmenor, cpmenor : integer;
    media, soma: real;
begin
     Maior := 0; menor := 99999; soma := 0; com_media := 0; conta_pares := 0;
     conta_impares   := 0; media :=0; soma:=0; lpmaior:=0; cpmaior := 0; lpmenor := 0; cpmenor:=0;

     for l := 1 to 4 do
         for c := 1 to 4 do
         begin
            write('Digite valor para Mat4[',l,',',c,'].: ');
            readln(mat4[l,c]);
            soma := soma + mat4[l,c];
         end;
     media := soma / 16;
     for l := 1 to 4 do
         for c := 1 to 4 do
         begin
            writeln('Mostrar valor original para Mat4[',l,',',c,'].: ',mat4[l,c]);
            if mat4[l,c] >= media then
                 com_media := com_media + 1;
            if mat4[l,c] > maior then
            begin
               maior := mat4[l,c];
               lpmaior :=l;
               cpmaior := c;
            end;
            if mat4[l,c] < menor then
            begin
               menor := mat4[l,c];
               lpmenor :=l;
               cpmenor := c;
            end;
            MatNeri[l,c] := Mat4[l,c] * 2;
            if mat4[l,c] mod 2 = 0 then
               Conta_pares := conta_pares + 1
            else
                Conta_impares := conta_impares + 1;

       end;
       writeln('A soma dos elementos da matriz .: ',soma:6:2);
       writeln('A media dos valores da matriz .: ',media:6:2);
       writeln('o maior valor está em mat4[',lpmaior,',',cpmaior,']  e o menor valor está em mat4[',lpmenor,',',cpmenor,']');

     for l := 1 to 4 do
         for c := 1 to 4 do
            if l = c then
               writeln('Elementos diagonal principal.: ',mat4[l,c]);

     for l := 1 to 4 do
         for c := 1 to 4 do
            if c = (5-l) then
               writeln('Elem diagonal secundária .:',mat4[l,c]);

     for l := 1 to 4 do
         for c := 1 to 4 do
            if l = 3 then
               writeln('Elementos da linha 3.: ', mat4[l,c]);
     for l := 1 to 4 do
         for c := 1 to 4 do
            if l = 2 then
                begin
                     Vetor_neri[c] := mat4[l,c];
                     writeln('Vetor Neri .: ',vetor_neri[c]);
                end;
     writeln(conta_pares,' sao pares, abaixo estao eles.: ');
     for l := 1 to 4 do
         for c := 1 to 4 do
            if mat4[l,c] mod 2 = 0 then
                     writeln('Os pares sao ',mat4[l,c]);
     writeln(conta_impares,' sao impares, abaixo estao eles.: ');
     for l := 1 to 4 do
         for c := 1 to 4 do
            if mat4[l,c] mod 2 <> 0 then
                     writeln('Os impares sao ',mat4[l,c]);
     writeln(com_media,' Atingiram a media');
     for l := 1 to 4 do
         for c := 1 to 4 do
            if mat4[l,c] >= media then
                 writeln('Atingiram a média .: ', mat4[l,c]);

     for l := 1 to 4 do
         for c := 1 to 4 do
            if c = 2 then
               writeln('Elementos da Coluna 2 .: ', mat4[l,c]);
     for l := 1 to 4 do
         for c := 1 to 4 do
            writeln('Mostrar matriz MatNeri[',l,',',c,'].: ',matNeri[l,c]);


    writeln('..................Final do Sistema..................... ');
    readln();
end.
