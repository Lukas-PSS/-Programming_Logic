// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Ler 2 n�meros, efetuar as 4 opera��es matem�ticas e mostrar os resultados.}
program operacoes;
    var num1, num2, soma, multiplicacao, divisao, subtracao : real;
begin

   //num1 := 10;
   //num2 := 5;

   write('Digite o numero 1 .: ');
   readln(num1);

   write('Digite o numero 2 .: ');
   readln(num2);


   soma := num1 + num2;
   multiplicacao := num1 * num2;
   divisao := num1 / num2;
   subtracao := num1 - num2;

   writeln('A soma = ',soma:6:2);  //sa�da
   writeln('A multiplicacao = ',multiplicacao:6:2);  //sa�da
   writeln('A divisao = ',divisao:6:2);  //sa�da
   writeln('A subtracao = ',subtracao:6:2);  //sa�da
   write('...................Final do Sistema..................... ');
   readln();
end.
