// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com

program media_ler;
var
   nota1, nota2, calc_media: real;  //definição variáveis
begin
   write('Insira a primeira nota.: ');
   readln(nota1); //nota1 := 5;      //entradas
   write('Insira a segunda nota.: ');
   readln(nota2); //nota2 := 7;
   calc_media := (nota1 + nota2) /2; //processamento
   writeln('A media = ',calc_media);  //saída
   write('...................Final do Sistema..................... ');
   readln();
end.
