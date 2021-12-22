# Funcionamento:
A aplicação tem arquitetura o padrão MVC (Model, View, Controller) por vários motivos, dentre eles a alta eficiência e segurança.

### Obtenção inicial de dados:
A aplicação conta com 4 entradas livres e 1 com valores pré-programados:
- Entradas livres:
  - Idade atual;
  - Idade que entrou na escola;
  - Idade que começou a trabalhar;
  - Idade estudando.

- Entrada com valor pré-programado:
  - Salário mínimo: varia entre R$ 1.100 e R$ 5.667,67 (salário de mercado e salário DIEESE)

### Usos do dados coletados pelo aplicativo:
|Dados| Uso(s)|
|-----|-----|
|Idade atual|Anos faltantes para aposentar (usando 65 como idade de aposentadoria e cálculo do valor já restituido|
|Idade de entrada na escola|Média de horas diárias na escola|
|Idade que começou trabalhar|Cálculo do valor já restituido|
|Idade estudando|Horas escolares totais|

### Fórmulas e raciocínio usados:
Para começar, faz-se necessária a implementação de uma condicional com a idade de entrada na escola para obteção da média de horas diárias na mesma
