// Prof Neri Aldoir Neitzke         - ULBRA
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: Crie um algoritmo que mostre os 10 primeiros números primos. }
program primo_10;
Var contador, numero,i : integer;
    num_primo : boolean; //lógico

begin                                           // 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 ........
     numero := 1;
     contador := 0;
     while(contador < 10)  do
     begin
        num_primo := true;
        //writeln('entrou no primeiro while');
        numero := numero + 1;
        //writeln('o numero = ',numero);
        I := 2;
        //writeln('i = ',i);
        //readln();
        while((i <=  (numero/2)) and (num_primo = true))  do
        begin
           //writeln('entrou no segundo while');
           if (numero mod i = 0) then
           begin
              num_primo := false;
           end;
           //writeln('i = ',i);
           I := I + 1;
        end;
        //readln();
        if num_primo = true then
        begin
            contador := contador + 1;
            writeln('O numero ',numero,' e o ',contador,'. numero primo');

        end;


      end;



    writeln('..................Final do Sistema..................... ');
    readln();
end.
