// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Fazer um algoritmo que leia o saldo inicial de cliente do banco
e leia tamb�m um cheque que entrou e ANALISE se o cheque poder� ser descontado
ou n�o , j� que este cliente n�o possui limite. Se o cheque n�o poder�
ser descontado, mostre essa informa��o, caso contr�rio, desconte o
cheque e informe o saldo na tela.}
program saldo_se;
var valor_saldo, cheque_entrou: Real;
begin
    write('Digite o saldo inicial.: ');
    readln(valor_saldo);
    write('Digite o valor do cheque par entrar.: ');
    readln(cheque_entrou);
    if cheque_entrou <= valor_saldo then
    begin
         valor_saldo := valor_saldo - cheque_entrou;
         writeln('Seu novo saldo .: ',valor_saldo:6:2);
    end
    else
    begin
        writeln('Este cheque ultrapassou o limite e nao pode ser descontado');
        writeln('Seu saldo continua.: ',valor_saldo:6:2);
    end;

    writeln('..................Final do Sistema..................... ');
    readln();
end.
