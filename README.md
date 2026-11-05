Sistema de banco
Descrição
Projeto desenvolvido em Java para demonstrar os conceitos de Programação Orientada a Objetos:
Feito por Aureliano Corrêa


fecharMes() está na interface porque é uma ação comum que diferentes tipos de contas devem obrigatoriamente implementar, porém com regras de negócio totalmente distintas para cada uma; já o depositar() está na herança (classe base) porque o ato de somar um valor ao saldo é um comportamento idêntico e compartilhado por todas as contas, permitindo a reutilização direta do código.
