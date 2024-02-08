# DSCommerce
### Visão Geral
O DSCommerce é uma plataforma de comércio eletrônico desenvolvida para facilitar a experiência de compra de produtos oferecidos pela DevSuperior, proporcionando aos clientes uma interface intuitiva e funcionalidades essenciais para realizar suas compras de forma rápida e conveniente.

## Como Funciona o DSCommerce

### Funcionalidades Principais

#### Consultar Catálogo de Produtos
Os usuários podem navegar pelo catálogo de produtos disponíveis na plataforma, explorando os itens oferecidos pela DevSuperior. Eles podem visualizar detalhes dos produtos, como nome, descrição, preço e imagem.

#### Gerenciar Carrinho de Compras
Os clientes podem adicionar produtos ao carrinho de compras, remover itens e alterar as quantidades conforme desejado. O carrinho de compras fornece uma visão consolidada dos produtos selecionados e o valor total da compra.

#### Realizar Pedidos
Após selecionar os produtos desejados, os clientes podem proceder para o checkout e registrar um pedido. O sistema armazena informações sobre os itens selecionados, gerando um registro de pedido com um status inicial de "aguardando pagamento".

#### Autenticação de Usuários
O DSCommerce oferece funcionalidades de autenticação de usuários, permitindo que os clientes façam login em suas contas para acessar recursos adicionais, como visualizar o histórico de pedidos e atualizar suas informações pessoais.

#### Administração do Sistema
Os administradores têm acesso a recursos adicionais para gerenciar o sistema, incluindo a capacidade de adicionar, atualizar e excluir produtos, categorias e usuários. Eles também podem visualizar relatórios de pedidos e marcar pedidos como pagos após receberem confirmação de pagamento.



### Resumo das Funcionalidades
- Consultar catálogo de produtos.
- Manter produtos: CRUD de produtos, filtragem por nome (disponível apenas para administradores).
- Manter categorias: CRUD de categorias, filtragem por nome (disponível apenas para administradores).
- Gerenciar carrinho: adicionar, remover e alterar quantidades de itens no carrinho de compras.
- Login: autenticação de usuários.
- Registrar pedido: salvar um pedido com base nos itens no carrinho de compras.
- Atualizar perfil: permitir que os usuários atualizem suas informações pessoais.
- Visualizar pedidos: ver o histórico de pedidos do usuário.
- Registrar pagamento: marcar um pedido como pago (disponível apenas para administradores).
- Reportar pedidos: gerar relatórios de pedidos (disponível apenas para administradores).

### Tecnologias Utilizadas
O DSCommerce foi desenvolvido utilizando tecnologias modernas e frameworks populares, incluindo:
- Spring Boot: framework utilizado para desenvolver aplicativos em Java de forma rápida e fácil.
- Hibernate: framework ORM (Object-Relational Mapping) para mapeamento objeto-relacional.
- H2 Database: banco de dados em memória para desenvolvimento e testes.
- Spring Security: para autenticação e controle de acesso.
- ModelMapper: para mapeamento de objetos DTO (Data Transfer Object).
- Bean Validation: para validação de dados.
- JWT (JSON Web Tokens): para autenticação baseada em tokens.

### Protótipos de Tela
Protótipos das telas do sistema podem ser encontrados [aqui](https://www.figma.com/file/ZrGNVNG0kZL6txDv4G8P6s/DSCommerce).

### Modelo Conceitual
O modelo conceitual do sistema DSCommerce inclui entidades como Usuário, Produto, Categoria e Pedido, com relacionamentos entre elas. 

### Como Executar o Projeto
1. Clone o repositório do GitHub.
2. Abra o projeto em sua IDE preferida.
3. Certifique-se de que você tem o JDK e o Maven instalados.
4. Configure as dependências do projeto conforme necessário (o arquivo `pom.xml` contém as dependências).
5. Execute a aplicação Spring Boot.
6. Acesse `http://localhost:8080` em seu navegador para interagir com o sistema.

#### Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork do projeto, adicionar suas melhorias e enviar uma solicitação de pull request.

