✅ Resumo do Projeto: API de Cadastro de Clientes para Locadora de Carros
Este projeto é uma API REST desenvolvida com Spring Boot para gerenciar o cadastro de clientes de uma locadora de carros. A API permite o registro de novos clientes com os seguintes dados:

Nome

CPF (com validação de formato e duplicidade)

Telefone

A API realiza validações automáticas e retorna mensagens apropriadas em caso de erros, como campos vazios ou CPF já cadastrado.

🧪 Funcionalidade Principal
Cadastrar Cliente:
POST /clientes
Recebe um JSON com nome, CPF e telefone, valida os dados e salva no banco de dados em memória (H2).

📁 Estrutura de Pastas e Arquivos

car-rental/
├── pom.xml

├── src/

│   ├── main/

│   │   ├── java/

│   │   │   └── com/

│   │   │       └── example/

│   │   │           └── carrental/

│   │   │               ├── CarRentalApplication.java

│   │   │               ├── controller/

│   │   │               │   └── ClienteController.java

│   │   │               ├── model/

│   │   │               │   └── Cliente.java

│   │   │               └── repository/

│   │   │                   └── ClienteRepository.java

│   │   └── resources/

│   │       └── application.properties

🐱‍👤 RAMON MARINHO PENACHIO - RA: 172320117

