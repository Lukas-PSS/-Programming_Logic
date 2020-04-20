// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Ler dois números (inicial e final, o numero final não pode ser menor do que o numero inicial).
Escreva quantos número pares  e quantos numeros impares encontran-se entre os dois números fornecidos pelo usuário.}
program par_impar_conta2;
Var numero_inicial, numero_final, numeros_pares, numeros_impares,i : integer;
begin
    numeros_pares := 0;
    numeros_impares := 0;
    write('Digite o numero inicial .: ');
    readln(numero_inicial);
    i := numero_inicial;
    repeat
    begin
        write('Digite o numero final maior do que o numero ',numero_inicial,' .: ');
        readln(numero_final);
        if (numero_final < numero_inicial) then
            writeln('Numero final invalido, digite novamente.....');
    end;
    until(numero_final >= numero_inicial);

    while(i <= numero_final) do
    begin
         if (i mod 2 = 0) then
            numeros_pares := numeros_pares + 1
         else
            numeros_impares := numeros_impares + 1;

         i := i + 1;
    end;
    writeln('Entre o numero ',numero_inicial,' e o numero ',numero_final,' existem ',numeros_pares,' pares e ',numeros_impares,' impares');

    writeln('..................Final do Sistema..................... ');
    readln();
end.
