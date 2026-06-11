Sistema de Atendimento de Clínica Veterinária
Descrição
Este projeto foi desenvolvido para simular o funcionamento de uma clínica veterinária, permitindo o cadastro e gerenciamento de atendimentos de animais.
O sistema controla:


Situações do atendimento;


Envio automático de notificações;


Cálculo do valor final com descontos e acréscimos.


Durante o desenvolvimento foram utilizados três padrões de projeto (Design Patterns) para tornar o sistema mais organizado, flexível e fácil de manter.

Padrões de Projeto Utilizados
1. State (Estado)
Por que foi utilizado?
O atendimento pode assumir diferentes estados:


Agendado


Em Atendimento


Finalizado


Cancelado


Cada estado possui regras próprias sobre quais mudanças são permitidas.
Sem o padrão State seria necessário utilizar diversos if e switch, deixando o código mais difícil de manter.

Como funciona?
Foi criada uma interface chamada:
Situacao
E uma classe para cada estado:
AgendadoEmAtendimentoFinalizadoCancelado
Cada classe é responsável por validar suas próprias transições.
Exemplo
Um atendimento agendado pode:
Agendado├── EmAtendimento└── Cancelado
Já um atendimento finalizado não permite alterações.
Finalizado└── Não pode mudar
Benefícios


Menos uso de if e switch;


Código mais organizado;


Fácil inclusão de novos estados.



2. Observer (Observador)
Por que foi utilizado?
O sistema precisa enviar avisos automáticos sempre que a situação do atendimento mudar.
Exemplos:


Avisar o tutor quando o atendimento iniciar;


Avisar o veterinário quando for cancelado;


Avisar a recepção quando finalizar.


Sem o Observer seria necessário alterar diretamente a classe Atendimento toda vez que um novo aviso fosse criado.

Como funciona?
Foi criada a interface:
Observador
Com o método:
atualizar()
As classes que recebem notificações são:
TutorObserverVeterinarioObserverRecepcaoObserver
Quando ocorre uma mudança de situação:
Atendimento      ↓Notifica todos os observadores cadastrados
Benefícios


Baixo acoplamento;


Fácil inclusão de novos tipos de aviso;


Classe Atendimento permanece simples.



3. Decorator (Decorador)
Por que foi utilizado?
O valor final do atendimento pode receber diversas regras ao mesmo tempo:


Desconto para animal adotado;


Taxa de atendimento domiciliar;


Banho pós-consulta.


Essas regras podem ser combinadas livremente.

Como funciona?
Foi criada a interface:
ValorAtendimento
Com o método:
calcular()
As implementações são:
ValorBaseDescontoAdocaoTaxaDomiciliarBanhoPosConsulta
Cada classe adiciona ou remove um valor do cálculo anterior.
Exemplo
Valor inicial:
100
Aplicando desconto:
100 - 20 = 80
Aplicando taxa domiciliar:
80 + 50 = 130
Aplicando banho:
130 + 30 = 160
Resultado final:
160
Benefícios


Permite combinar regras livremente;


Evita criar várias classes para cada combinação possível;


Facilita a criação de novas taxas e descontos.



Estrutura do Projeto
src/├── Atendimento.java├── Tutor.java├── Animal.java├── ServicoVeterinario.java├── Situacao.java├── Agendado.java├── EmAtendimento.java├── Finalizado.java├── Cancelado.java├── Observador.java├── TutorObserver.java├── VeterinarioObserver.java├── RecepcaoObserver.java├── ValorAtendimento.java├── ValorBase.java├── DescontoAdocao.java├── TaxaDomiciliar.java├── BanhoPosConsulta.java└── testes/    ├── TesteMudancaValida.java    ├── TesteMudancaInvalida.java    ├── TesteAvisoAutomatico.java    └── TesteValorFinal.java

Casos de Teste Implementados
Teste 1 – Mudança válida
Valida a transição:
Agendado → EmAtendimento

Teste 2 – Mudança inválida
Valida uma tentativa não permitida:
EmAtendimento → Cancelado

Teste 3 – Aviso automático
Verifica se os observadores recebem notificações quando a situação muda.

Teste 4 – Valor final
Verifica o cálculo utilizando:
Desconto de adoção+Taxa domiciliar+Banho pós-consulta
Resultado esperado:
R$ 160,00

Conclusão
A utilização dos padrões State, Observer e Decorator permitiu desenvolver um sistema simples, organizado e extensível. Cada padrão resolve um problema específico do sistema:
PadrãoResponsabilidadeStateControlar as situações do atendimentoObserverEnviar notificações automáticasDecoratorAplicar descontos e acréscimos no valor
Essa abordagem reduz o acoplamento entre classes, melhora a manutenção do código e facilita futuras expansões do sistema.
