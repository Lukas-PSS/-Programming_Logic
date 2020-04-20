// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Um cliente de um banco tem um saldo positivo de R$ 500,00.
Fazer um algoritmo que leia um cheque que entrou e calcule o saldo,
mostrando (escrevendo) o saldo na tela.}
program saldo;
var valor_saldo, cheque_entrou: Real;
begin
    valor_saldo := 500;
    write('Digite o valor do cheque que entrou ......: ');
    readln(cheque_entrou);//
    valor_saldo := valor_saldo - cheque_entrou;

    writeln('O saldo atual  = ',valor_saldo:6:2);
    writeln('..................Final do Sistema..................... ');
    readln();
end.
