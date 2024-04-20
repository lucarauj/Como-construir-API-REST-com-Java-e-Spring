# Como Construir uma API REST com Java e Spring

## O que é uma API REST ?

- Uma APIREST é um conjunto de regras que define como os aplicativos podem se comunicar pela internet de maneira eficiente. Ela se baseia nos princípios do REST, que é umestilo de arquitetura para sistemas distribuídos.

- As APIs REST são utilizadas para facilitar a integração entre diferentes aplicações e serviços em arquiteturas de microsserviços, oferecendo uma abordagem flexível e simplificada.

## Métodos de requisição HTTP

- Os métodos de requisição definidos pelo protocolo HTTP são responsáveis por especificar a ação a ser realizada em um determinado recurso. Embora frequentemente descritos como substantivos, são também conhecidos como verbos HTTP. Cada um desses métodos possui uma função semântica distinta.

- Exemplo de verbos HTTP: HEAD, GET, POST, PUT, PATCH, DELETE, CONNECT, OPTIONS e TRACE.

## Principais métodos HTTP utilizados em uma solicitação REST

- GET:  Solicita a representação de um recurso específico e deve retornar apenas dados.
- POST: Usado para enviar uma entidade a um recurso específico, podendo resultar em alterações no estado desse recurso.
- PUT:  Substitui as representações do recurso de destino pelos dados enviados na requisição.
- DELETE: Remove um recurso específico.

## Códigos de retornos em uma requisição HTTP

- Os códigos de status de resposta HTTP fornecem informações sobre o sucesso ou  falha de uma solicitação HTTP específica. Essas respostas são categorizadas em cinco classes distintas:

### 1. Respostas Informativas (1XX)
### 2. Respostas bem-sucedidas (2XX)
### 3. Mensagensde redirecionamento (3XX)
### 4. Respostas de erro do cliente (4XX)
### 5. Respostas de erro do servidor (5XX)

## Construindo uma API REST

### Passo a passo

- A seguir, um passo a passo que pode ser seguido para a construção de uma API REST utilizando a linguagem Java e o framework Spring:

### 1. Certifique-se de ter o Java JDK instalado juntamente com um ambiente de desenvolvimento (IDE), como Eclipse ou IntelliJ;
### 2. Crie um novo projeto e abra em sua IDE;
### 3. Defina as entidades, repositórios, controladores e classes onde a lógica de negócio será implementada;
### 4. Configure a conexão com o banco de dados, se necessário;
### 5. Teste sua API com ferramentas como Postman, Insomnia ou Swagger.

## Conclusão

- Após concluir o passo a passo fornecido nessa aula, alguns pontos podem ser implementados posteriormente, são eles:

### 1. Configurar conexão com o banco de dados;
### 2. Inserir paginação e filtros;
### 3. Incluir customização de erros;
### 4. Desenvolver outros métodos de busca;
### 5. Incrementar validação de dados de entrada e saída;

- Conclui-se que o desenvolvimento de uma API REST bem estruturada é fundamental para facilitar a comunicação eficiente entre sistemas e simplificar a integração entre aplicações.

