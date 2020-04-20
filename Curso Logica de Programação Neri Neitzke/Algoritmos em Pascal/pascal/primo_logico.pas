// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Crie um algoritmo que leia um numero inteiro, e diga se ele é um numero primo ou não. }
program primo;
Var numero,i : integer;
    num_primo : boolean; //lógico
begin
     num_primo := true;
     I := 2;
     write('Digite um numero .: ');
     readln(numero);
     while((i <=  (numero/2)) and (num_primo = true))  do
     begin
        writeln(i);
        if (numero mod i = 0) then
           num_primo := false;
        I := I + 1;
     end;
     if num_primo then       //if num_primo = true  then
           writeln('O numero ',numero,' e primo')
     else
           writeln('O numero ',numero,' nao e primo');

    writeln('..................Final do Sistema..................... ');
    readln();
end.
