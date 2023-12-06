# Projeto CRUD Conta Bancária 💰

## Alunos 👩‍🎓
- Ladiane Pinheiro Santana (https://github.com/Ladiane-PS)
- Maria Valdete Vieira Figueiredo (https://github.com/valdete132/)

## Descrição
Este projeto implementa um CRUD (Create, Read, Update, Delete) para a classe Conta Bancária usando Spring Boot. Além disso, inclui operações concorrentes de depósito e retirada, testadas com JMeter.

## Tecnologias Utilizadas🖥️
- Spring Boot
- Spring Data JPA
- H2 Database (para ambiente de desenvolvimento)
- JMeter

## Estrutura do Projeto
- `src/main/java/com/example/demo/model/ContaBancaria.java`: Classe que representa a conta bancária.
- `src/main/java/com/example/demo/model/ContaBancariaVersionada.java`: Classe versionada da conta bancária.
- `src/main/java/com/example/demo/controller/ContaController.java`: Controlador Spring para manipulação da conta bancária.
- `src/test/java/com/example/demo/TestesConcorrencia.jmx`: Arquivo JMeter com testes de concorrência.

## Instruções de Configuração e Execução
### Pré-requisitos
- Java 8 ou superior instalado. [Download Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- Maven instalado. [Download Maven](https://maven.apache.org/download.cgi)
- JMeter instalado. [Download JMeter](https://jmeter.apache.org/download_jmeter.cgi)

### Configuração do Banco de Dados
1. As configurações do banco de dados estão no arquivo `src/main/resources/application.properties`.
2. Certifique-se de que as configurações do H2 estão adequadas para o ambiente de desenvolvimento.

### Execução do Projeto
1. Clone este repositório: `git clone https://github.com/seu-usuario/seu-repositorio.git`
2. Navegue até o diretório do projeto: `cd seu-repositorio`
3. Execute o projeto com Maven: `mvn spring-boot:run`

O aplicativo estará disponível em `http://localhost:8080`.

### Execução dos Testes com JMeter
1. Abra o JMeter e abra o arquivo de teste `TestesConcorrencia.jmx`.
2. Execute o teste no JMeter e analise os resultados.

Certifique-se de ajustar o arquivo `TestesConcorrencia.jmx` conforme necessário para refletir a configuração do seu ambiente de teste.

Lembre-se de substituir `seu-usuario` e `seu-repositorio` pelos seus dados reais.

### Pré-requisitos
- Java 8 ou superior
- Maven
- JMeter

### Configuração do Banco de Dados
1. As configurações do banco de dados estão no arquivo `src/main/resources/application.properties`.
2. Certifique-se de que as configurações do H2 estão adequadas para o ambiente de desenvolvimento.

### Execução do Projeto
1. Clone este repositório: `git clone https://github.com/seu-usuario/seu-repositorio.git`
2. Navegue até o diretório do projeto: `cd seu-repositorio`
3. Execute o projeto com Maven: `mvn spring-boot:run`

### Execução dos Testes com JMeter
1. Abra o JMeter e abra o arquivo de teste `TestesConcorrencia.jmx`.
2. Execute o teste no JMeter e analise os resultados.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar pull requests
