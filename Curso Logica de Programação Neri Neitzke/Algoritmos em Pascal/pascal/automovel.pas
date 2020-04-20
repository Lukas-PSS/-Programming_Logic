// Prof Neri Aldoir Neitzke
// www.INFORMATICON.com.br - videoaulasneri@gmail.com
{Problema: O custo ao consumidor de um carro novo, é a soma do custo de fábrica
com a percentagem do revendedor e com o custo dos impostos (aplicados ao custo
de fábrica). Supondo que a percentagem do revendedor seja de 25% do custo de
fábrica e que os impostos custam 45 % do custo de fábrica, faça um algoritmo que
 leia o valor de custo de fábrica e determine o preço final do automóvel
 (custo ao consumidor). }

program automovel;
var custo_fabrica, perc_revendedor,  impostos, preco_final : Real;
begin
    write('Digite o valor do custo de fabrica do automovel .: ');
    readln(custo_fabrica);//    custo_fabrica := 20000;
    perc_revendedor :=(25 * custo_fabrica) / 100;
    impostos := (45 * custo_fabrica) / 100;
    preco_final := custo_fabrica + perc_revendedor + impostos;
    writeln('Custo de Fabrica ......: ',custo_fabrica:6:2);
    writeln('Percentual revendedor .: ',perc_revendedor:6:2);
    writeln('impostos ..............: ',impostos:6:2);
    writeln('O preco Final e .......: ',preco_final:6:2);
    writeln('..................Final do Sistema..................... ');
    readln();
end.
