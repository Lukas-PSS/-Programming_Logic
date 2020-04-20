Program trab;
uses crt;

TYPE cliente = RECORD  {clientes}
   cod_cli : INTEGER;
   nome_cli, fone_cli, ende_cli, bairro_cli, cidade_cli, cep_cli, cel_cli : STRING;
   ativo: integer
END;
TYPE produto = RECORD  {produtos}
   cod_prod, qtd_prod : INTEGER;
   desc_prod : STRING;
   valorunit_prod, valortot_prod: REAL;
   ativo: integer;
END;
type venda = Record
     cod_venda,dia_a,mes_a,ano_a,dia_e,mes_e,ano_e,cod_cli,cod_prod,qtd_venda: integer;
     vlr_venda,valortot_venda: real;
     ativo: integer;
end;
loja = file of cliente;
loja1 = file of produto;
loja2 = file of venda;
var clientes,auxiliar: loja;
    produtos: loja1;
    vendas: loja2; 
    c,aux_c: cliente;
    p,aux_p: produto;
    v,aux_v: venda;
    posi,k,i,cod_venda,cod_cli,cod_prod,qtd_venda,op: integer;
    achou: boolean;
    dia_a,mes_a,ano_a,dia_e,mes_e,ano_e,qtd: integer;
    vlr_venda,vlrtotal_venda,valorunit: real;
    nome,desc: string;

Begin{inicio prog.}
Repeat
      clrscr;
      writeln('Menu de Opções');
      writeln(' ');
      writeln('01. Criar Arquivo Clientes,Produtos e Vendas - Somente 1 vez');
      writeln('02. Incluir Clientes');
      writeln('03. Incluir Produtos');
      writeln('04. Incluir Vendas');
      writeln('05. Excluir Clientes');
      writeln('06. Excluir Produtos');
      writeln('07. Excluir Vendas');
      writeln('08. Alterar Clientes');
      writeln('09. Alterar Produtos');
      writeln('10. Alterar Vendas');
      writeln('11. Consultar Clientes');
      writeln('12. Consultar Produtos');
      writeln('13. Consultar Vendas');
      writeln('14. Sair');
      writeln(' ');
      write('Digite sua opção: ');
      readln(op);
      while(op<1) or (op>14) do
      Begin
           write('Opção Inválida!Digite Novamente: ');
           readln(op);
      end;

Case op of
     1:Begin
         clrscr;
         assign(clientes,'c:\clientes.dat');
         rewrite(clientes);
         close(clientes);
         writeln('Arquivo Clientes Criado Com Sucesso!');
         readln;
         assign(produtos,'c:\produtos.dat');
         rewrite(produtos);
         close(produtos);
         writeln('Arquivo Produtos Criado Com Sucesso!');
         readln;
         assign(vendas,'c:\vendas.dat');
         rewrite(vendas);
         close(vendas);
         writeln('Arquivo Vendas Criado Com Sucesso!');
         readln;
     end;
     2:Begin
        clrscr;
        assign(clientes,'c:\clientes.dat');
        reset(clientes);
        k:= filesize(clientes);
        write('Digite o Código do Cliente a ser incluido: ');
        readln(cod_cli);
        if k = 0 then
          Begin
             write('Digite o nome do cliente: ');
             readln(nome);
             
          c.cod_cli:= cod_cli;
          c.nome_cli:= nome;
          {com campo ativo}c.ativo:= 1;
          write(clientes,c);
          writeln('Cliente Incluido!');
          end
          Else{se ñ for o 1º}
          Begin
             i:= 0;
             achou:= false;
             while (i <= (k-1)) do
             Begin
                read(clientes,c);{lê arq. alunos}
                if c.cod_cli = cod_cli then
                Begin
                   achou:= true;
                   i:= k+1;
                end
                Else
                Begin
                   i:= i+1;{guarda posi. incluir}
                   seek(clientes,i);{posiciona no reg. a incluir}
                end;                                            
             end;
             if achou = true then
                writeln('Cliente Já Está Cadastrado!')
             Else
             Begin
                write('Digite o nome do cliente: ');
                readln(nome);
                seek(clientes,k);
                c.cod_cli:= cod_cli;
                c.nome_cli:= nome;
                {com campo ativo}c.ativo:= 1;
                write(clientes,c);
                writeln('Cliente Incluido Com Sucesso!');
             end;
            end;
            readln;
            close(clientes);
     end;{fim case 2}
     3:Begin
          clrscr;
          assign(produtos,'c:\produtos.dat');
          reset(produtos);
          k:= filesize(produtos);
          write('Digite o Código do Produto a ser incluido: ');
          readln(cod_prod);
           if k = 0 then
          Begin
             write('Digite a descrição do produto: ');
             readln(desc);
             write('Digite a qtd em estoque: ');
             readln(qtd);
             write('Digite o Preço: ');
             readln(valorunit);

          p.cod_prod:= cod_prod;
          p.desc_prod:= desc;
          p.qtd_prod:= qtd;
          p.valorunit_prod:= valorunit;
          {com campo ativo}p.ativo:= 1;
          write(produtos,p);
          writeln('Produto Incluido Com Sucesso!');
          end
          Else{se ñ for o 1º}
          Begin
             i:= 0;
             achou:= false;
             while (i <= (k-1)) do
             Begin
                read(produtos,p);{lê arq. alunos}
                if p.cod_prod = cod_prod then
                Begin
                   achou:= true;
                   i:= k+1;
                end
                Else
                Begin
                   i:= i+1;{guarda posi. incluir}
                   seek(produtos,i);{posiciona no reg. a incluir}
                end;
             end;
             if achou = true then
                writeln('Produto Já Está Cadastrado!')
             Else
             Begin
                write('Digite a descrição do produto: ');
                readln(desc);
                write('Digite a qtd em estoque: ');
                readln(qtd);
                write('Digite o Preço: ');
                readln(valorunit);
                seek(produtos,k);
                p.cod_prod:= cod_prod;
                p.desc_prod:= desc;
                p.qtd_prod:= qtd;
                p.valorunit_prod:= valorunit;
                {com campo ativo}p.ativo:= 1;
                write(produtos,p);
                writeln('Produto Incluido Com Sucesso!');
             end;
            end;
            readln;
            close(produtos);
     end;
     4:Begin
         clrscr;
         assign(vendas,'c:\vendas.dat');
         reset(vendas);
         k:= filesize(vendas);
         write('Digite o código da venda a ser incluida: ');
         readln(cod_venda);
         if k = 0 then
         Begin
           write('Código do Cliente que está Efetuando a Compra: ');
           readln(cod_cli);
           achou:= false;
           posi:= 0;
         Begin
            if c.cod_cli = cod_cli then
           Begin
             achou:= true;
             posi:= i;
            writeln('Nome do Cliente: ',c.nome_cli);
           end;
         end;
         if achou = false then
            writeln('Não Existe Cliente Cadastrado com esse Código!')
         Else
         Begin
            write('Código do Produto que está sendo Comprado: ');
            readln(cod_prod);
            achou:= false;
            posi:= 0;
         Begin
            if p.cod_prod = cod_prod then
              Begin
                achou:= true;
                posi:= i;
                writeln('Descrição do Produto: ',p.desc_prod);
                writeln('Valor Unitário: R$',p.valorunit_prod:5:2);
              end;
         end;
         if achou = false then
           writeln('Não Existe Produto Cadastrado com esse Códdigo!')
         Else
         Begin
         write('Quantidade Comprada: ');
         readln(qtd);
         write('Digite a data de abertura da venda: ');
         readln(dia_a,mes_a,ano_a);
         write('Digite a data de encerramento da venda: ');
         readln(dia_e,mes_e,ano_e);
          if (qtd > p.qtd_prod) or (p.qtd_prod <= 0) then
            writeln('Qunatidade Inválida!Consulte o Estoque deste Produto!')

         Else
         Begin
         v.cod_venda:= cod_venda;
         v.cod_cli:= cod_cli;
         v.cod_prod:= cod_prod;
         v.dia_a:= dia_a;
         v.mes_a:= mes_a;
         v.ano_a:= ano_a;
         v.dia_e:= dia_e;
         v.mes_e:= mes_e;
         v.ano_e:= ano_e;
         v.qtd_venda:= qtd_venda;
         v.valortot_venda:= qtd * p.valorunit_prod;
         writeln('Valor Total da Venda: R$',v.valortot_venda:5:2);
         v.ativo:= 1;
         write(vendas,v);
         writeln('Venda Cadastrada com Sucesso!');
         end;
         end;
         end;
         end
      Else
      Begin
         i:= 0;
         achou:= false;
         while (i<= (k-1)) do
         Begin
            read(vendas,v);
            if v.cod_venda = cod_venda then
            Begin
               achou:= true;
               i:= k+1;
            end
            Else
            Begin
               i:= i+1;
               seek(vendas,i);
            end;
         end;
         if achou = true then
            write('Venda Já Está Cadastrada!')
      Else
      Begin
         write('Quantidade Comprada: ');
         readln(qtd);
         write('Digite a data de abertura da venda: ');
         readln(dia_a,mes_a,ano_a);
         write('Digite a data de encerramento da venda: ');
         readln(dia_e,mes_e,ano_e);
         if (qtd > p.qtd_prod) or (p.qtd_prod <= 0) then
            writeln('Quantidade Inválida!Consulte o Estoque deste Produto!');
         
      end;
      seek(vendas,k);
      v.cod_venda:= cod_venda;
      v.cod_cli:= cod_cli;
      v.cod_prod:= cod_prod;
      v.dia_a:= dia_a;
      v.mes_a:= mes_a;
      v.ano_a:= ano_a;
      v.dia_e:= dia_e;
      v.mes_e:= mes_e;
      v.ano_e:= ano_e;
      v.qtd_venda:= qtd_venda;

      v.ativo:= 1;
      write(vendas,v);
      writeln('Venda Cadastrada com Sucesso!');
    end;
   
   readln;
   close(vendas);
   end;
end;   
until op = 14;
end.
