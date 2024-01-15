### Premissas

Deve ser um sistema que possua um modelo de domínio relativamente simples,
porém abrangente, ou seja, que explore vários tipos de relacionamentos entre as
entidades de negócio (muitos-para-um, muitos-para-muitos, etc.).

O sistema deve possibilitar a aplicação de vários conhecimentos importantes das
disciplinas de fundamentos.

O sistema deve conter as principais funcionalidades que se espera de um
profissional iniciante deve saber construir, tais como telas de cadastro e fluxos de
caso de uso.

### Visão geral do sistema

O sistema deve manter um cadastro de usuário, produtos e suas categorias. Cada
usuário possui nome, email, telefone, data de nascimento e uma senha de acesso. Os
dados dos produtos são: nome, descrição, preço e imagem. O sistema deve apresentar
um catálogo de produtos, os quais podem ser filtrados pelo nome do produto. A partir
desse catálogo, o usuário pode selecionar um produto para ver seus detalhes e para
decidir se o adiciona a um carrinho de compras. 

O usuário pode incluir e remover itens do carrinho de compra, bem como alterar as quantidades de cada item. Uma vez que o
usuário decida encerrar o pedido, o pedido deve então ser salvo no sistema com o status
de "aguardando pagamento". Os dados de um pedido são: instante em que ele foi salvo,
status, e uma lista de itens, onde cada item se refere a um produto e sua quantidade no
pedido. 

O status de um pedido pode ser: aguardando pagamento, pago, enviado,
entregue e cancelado. Quando o usuário paga por um pedido, o instante do pagamento
deve ser registrado. Os usuários do sistema podem ser clientes ou administradores,
sendo que todo usuário cadastrado por padrão é cliente. Usuários não identificados
podem se cadastrar no sistema, navegar no catálogo de produtos e no carrinho de
compras. 

Clientes podem atualizar seu cadastro no sistema, registrar pedidos e visualizar
seus próprios pedidos. Usuários administradores tem acesso à área administrativa onde
pode acessar os cadastros de usuários, produtos e categorias.

### Modelo conceitual

Este é o modelo conceitual do sistema DSCommerce. Considerações:

Cada item de pedido (OrderItem) corresponde a um produto no pedido, com uma
quantidade. Sendo que o preço também é armazenado no item de pedido por
questões de histórico (se o preço do produto mudar no futuro, o preço do item de
pedido continua registrado com o preço real que foi vendido na época).

Um usuário pode ter um ou mais "roles", que são os perfis de acesso deste usuário
no sistema (client, admin).

<img width="579" alt="Modelo de domínio DSCommerce" src="https://github.com/MaiconSB/DScommerce/assets/118266551/53552413-7173-47a9-a20e-6dd6559263d3">

### Figma

Este projeto foi desenvolvido utilizando o Figma para o design, proporcionando uma experiência visual intuitiva e colaborativa. Confira aqui conceitos:

#### Cart
<img width="579" alt="Cart" src="https://github.com/MaiconSB/DScommerce/assets/118266551/65f4d822-bdf4-4b1a-a68c-de446ec66bec">

#### Catolog
<img width="579" alt="Catolog" src="https://github.com/MaiconSB/DScommerce/assets/118266551/9d37511c-2bb0-427c-8a4b-0364ab4a8b5a">

#### Confirmation
<img width="579" alt="Confirmation" src="https://github.com/MaiconSB/DScommerce/assets/118266551/aec8f024-b4f4-476e-8bf2-09131862d361">

#### Login
<img width="579" alt="Login" src="https://github.com/MaiconSB/DScommerce/assets/118266551/fb6ef2b4-9b03-46f6-839f-5dbffbf25a96">

         
### [Para saber mais!](https://www.figma.com/file/ZrGNVNG0kZL6txDv4G8P6s/DSCommerce?type=design&node-id=0-1&mode=design&t=TLZjfi697KL8R4Hp-0)
 






