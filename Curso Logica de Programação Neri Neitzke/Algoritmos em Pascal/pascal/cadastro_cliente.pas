// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Crie um algoritmo que leia para um cadastro de cliente, o seu nome,
sua idade e o seu salário. E por fim, mostre os valores.  }
program cadastro_cliente;
type
     cadastro = record
         nome:string[20];
         idade:integer;
         salario:real;
end;
var dados_cliente : cadastro;
begin
        write('Digite o nome do cliente.: ');
        readln(dados_cliente.nome);
        write('Digite a idade do cliente.: ');
        readln(dados_cliente.idade);
        write('Digite o salario do cliente.: ');
        readln(dados_cliente.salario);
        writeln;
        writeln;
        writeln('O nome do cliente .: ',dados_cliente.nome);
        writeln('A idade do cliente .: ',dados_cliente.idade);
        writeln('O salario do cliente .: ',dados_cliente.salario:6:2);

    writeln('..................Final do Sistema..................... ');
    readln();
end.
