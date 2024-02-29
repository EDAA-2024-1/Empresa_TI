# Empresa_TI

Crie um programa em Java para gerenciar funcionários de uma empresa utilizando os conceitos de herança, polimorfismo e enumerações. Sua solução deve incluir as seguintes classes e enumerações:

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

