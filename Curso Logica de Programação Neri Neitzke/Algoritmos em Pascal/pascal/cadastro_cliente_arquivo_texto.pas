// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Crie um algoritmo que leia para um cadastro de cliente, o seu nome,
sua idade e o seu salário. E por fim, mostre os valores.  }
program cadastro_cliente_arquivo_texto;
uses crt;
type
     cadastro = record
         nome:string[20];
         idade:integer;
         salario:real;
end;
arquivo_texto = file of cadastro;
var dados_cliente : cadastro;
    opcao: char;
    banco_dados: arquivo_texto;

procedure gera_arquivo_banco;
begin
     writeln('Pronto para gerar o arquivo no banco, pressione uma tecla para continuar');
     readln;
     writeln;
     assign(banco_dados, 'D:\videoaulas\algoritmos e programação\pascal\banco_dados_cliente.txt');
     rewrite(banco_dados);
     writeln('Parabens, arquivo texto do banco de dados foi gerado com sucesso!!!!!');
     writeln;
     writeln('Pressione uma tecla para voltar ao sistema principal!');
     readln;
     close(banco_dados);

end;

procedure novo_cliente;
begin
        clrscr;
        write('Digite o nome do cliente.: ');
        readln(dados_cliente.nome);
        write('Digite a idade do cliente.: ');
        readln(dados_cliente.idade);
        write('Digite o salario do cliente.: ');
        readln(dados_cliente.salario);
        //gravando os dados no arquivo
        assign(banco_dados, 'D:\videoaulas\algoritmos e programação\pascal\banco_dados_cliente.txt');
        reset(banco_dados);
        write(banco_dados,dados_cliente);
        writeln('Parabéns, os dados foram gravados no arquivo');
        readln;
        close(banco_dados);
end;

procedure mostrar_dados;
begin

      assign(banco_dados, 'D:\videoaulas\algoritmos e programação\pascal\banco_dados_cliente.txt');
      reset(banco_dados);
      read(banco_dados, dados_cliente);
      writeln('Dados extraidos com sucesso, os dados são: ');
      writeln('Nome do Cliente gravado .: ',dados_cliente.nome);
      writeln('Idade do Cliente gravado .: ',dados_cliente.idade);
      writeln('Salario do Cliente gravado .: ',dados_cliente.salario:6:2);
      writeln('Pressione uma tecla para continuar');
      close(banco_dados);
end;
begin
    repeat
    begin
        clrscr;
        writeln('Opções do sistema' );
        writeln('1 - Gerar arquivo Texto (banco dados)');
        writeln('2 - Cadastrar um novo Cliente');
        writeln('3 - Mostrar dados do cliente');
        writeln('4 - Finalizar o sistema');
        write('Escolha uma opcao.: ');
        readln(opcao);
        if opcao = '1' then   gera_arquivo_banco
        else if opcao = '2' then  novo_cliente
        else if opcao = '3' then   mostrar_dados;
    end;
    until opcao = '4';

    writeln('..................Final do Sistema..................... ');
    readln();
end.
