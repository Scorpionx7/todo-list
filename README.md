# To-Do List API

## Descrição
Esta é uma API REST para gerenciar tarefas (To-Do List), desenvolvida utilizando **Java 21**, **Spring Boot** e **SQL Server** como banco de dados. 
A aplicação está contida em um ambiente **Docker** para facilitar a configuração e o deploy. 
A documentação da API é gerada automaticamente utilizando **Swagger**.

## Pré-requisitos
Antes de rodar a aplicação, certifique-se de que os seguintes itens estão instalados:

- **Java 21** ou superior
- **Docker** e **Docker Compose**
- **SQL Server**

## Configuração do Banco de Dados
A API utiliza o **SQL Server** como banco de dados. Certifique-se de que o serviço do SQL Server está em execução e que você tenha um banco de dados configurado com as seguintes credenciais (ajuste conforme necessário no arquivo `application.properties`):

```properties
spring.datasource.url=jdbc:sqlserver://sqlserver:1433;databaseName=todo_db
spring.datasource.username=esther
spring.datasource.password=avatim123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.SQLServerDialect 
````

## Instalação e Execução

## Passo 1: Clonar o Repositório
```bash
git clone https://github.com/Scorpionx7/todo-list-backend.git
```
## Passo 2: Navegue até o diretório do projeto:
```bash
cd zip
```
## Passo 3: Rodar a Aplicação com Docker

- Utilize o Docker Compose para construir e rodar a aplicação:

```bash
docker-compose up --build
```
- Isso irá construir as imagens Docker e iniciar a aplicação, incluindo o banco de dados SQL Server e a API.
Certifique-se de que as portas necessárias estão livres (a API roda na porta 8080 por padrão). 

## Passo 4: Acessar a Aplicação

- Após a execução bem-sucedida, a API estará disponível em: `http://localhost:8080/api/tarefas`. 

## Passo 5: Acessar a Documentação da API

- A documentação da API, gerada automaticamente pelo Swagger, pode ser acessada em: `http://localhost:8080/swagger-ui.html`

## Tecnologias Utilizadas
- **Java 21**: Linguagem de programação utilizada para desenvolver o backend da aplicação.
- **Spring Boot**: Framework para construção de APIs REST.
- **JPA Hibernate**: Implementação do Java Persistence API (JPA), que facilita a interação entre a aplicação e o banco de dados.
- **SQL Server**: Banco de dados relacional utilizado para armazenar as tarefas.
- **Docker**: Utilizado para containerizar a aplicação e simplificar a execução.
- **Swagger**: Ferramenta para gerar e visualizar a documentação da API.


## Autora
- Nome: Esther Rezende
- Email: rezendealvesesther@gmail.com
- LinkedIn: https://www.linkedin.com/in/estherrezende/

## Licença
- Este projeto é licenciado sob a [MIT License](LICENSE).












