# Empresa_TI

1. Crie um programa em Java para gerenciar funcionários de uma empresa utilizando os conceitos de herança, polimorfismo e enumerações. Sua solução deve incluir as seguintes classes e enumerações:

- Enumeração 
   - **Cargo**: Define os possíveis cargos na empresa: DESENVOLVEDOR, GERENTE, SUPORTE.
- Classes 
   - **Funcionario**: Classe base para todos os funcionários. Deve conter:
        - Atributos comuns como nome, id e salario.
        - Um construtor para inicializar os atributos.
        - Um método abstrato calcularSalario(double salarioBase).
   - **Desenvolvedor, Gerente, Suporte**: Estas classes herdam de Funcionario e implementam o método calcularSalario(double salarioBase) de forma específica para cada cargo:
        - **Desenvolvedor**: Recebe um bônus de 10% sobre o salarioBase.
        - **Gerente**: Recebe um bônus de 20% sobre o salarioBase mais um adicional fixo de R$ 1000.
        - **Suporte**: Recebe um bônus de 5% sobre o salarioBase.
  - **Empresa**: Contém uma lista de Funcionario e métodos para adicionar funcionários e calcular a folha salarial total.
  - **Principal**: onde contém o método main e um método lerDadosFuncionario(int id, double salarioBase) para ler os dados de cada funcionário e criar o objeto.

2. Crie um sistema em Java para que simule o comportamento básico de um celular através do uso de interfaces e classes. O programa deve ser capaz de simular ações como ligar/desligar, fazer ligações e enviar mensagens. Sua solução deve incluir as seguintes classes e interface:

- **Interface Celular**: Deve definir os métodos ligar(), desligar(), fazerLigacao(String numero) e enviarMensagem(String numero, String mensagem).

- **Classe ModeloBasico**: Deve implementar a interface Celular. Esta classe representa um modelo básico de celular que apenas registra em console as ações executadas (por exemplo, exibir uma mensagem quando uma ligação é feita ou uma mensagem é enviada).

- **Classe ModeloAvancado**: Deve também implementar a interface Celular. Esta classe representa um modelo mais avançado de celular que, além de registrar as ações, mantém um histórico das ligações feitas e mensagens enviadas.

- **Classe Principal**: Uma classe com um método main para testar as funcionalidades dos modelos de celular. Deve criar instâncias de ModeloBasico e ModeloAvancado, usar todos os métodos definidos e demonstrar o funcionamento das funcionalidades.
