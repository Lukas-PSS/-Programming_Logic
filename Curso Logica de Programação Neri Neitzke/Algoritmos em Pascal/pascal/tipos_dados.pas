// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com

program tipos_dados;
var
   salario: real;  //definição variáveis
   idade:integer;
   nome:String[30];
begin
   //nome := 'Neri';
   //idade := 21;
   //salario := 2000;
   write('Digite o nome.: ');
   readln(nome);
   write('Digite a idade.: ');
   readln(idade);
   write('Digite o salario .: ');
   readln(salario);

   writeln('O nome = ',nome);  //saída
   writeln('Sua idade = ',idade);  //saída
   writeln('Seu salario = ',salario);  //saída
   write('...................Final do Sistema..................... ');
   readln();
end.
