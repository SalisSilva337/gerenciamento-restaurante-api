# RESTAURANTE API (GERENCIAMENTO)
![image](https://github.com/user-attachments/assets/b99b880e-a86e-4ccd-a89b-59a64c9e8841)


##


O projeto em Java consiste em um sistema de gerenciamento de restaurantes, desenvolvido com o padrão de arquitetura MVC (Model-View-Controller). A aplicação visa facilitar a administração de itens do cardápio, pedidos, mesas e garçons em um ambiente de restaurante.

O sistema é dividido em quatro principais módulos:

Item: Responsável por gerenciar os itens do cardápio, incluindo informações como nome, descrição e preço. Este modelo permite adicionar, editar e excluir itens.

Pedidos: Gerencia o processo de pedidos dos clientes, registrando quais itens foram solicitados, a mesa associada e o status do pedido (em andamento, concluído, cancelado, etc.). Ele se comunica diretamente com o modelo Item para obter as informações necessárias sobre os pratos pedidos.

Mesas: Gerencia as mesas do restaurante, incluindo informações sobre a capacidade, disponibilidade e o status da mesa (ocupada, reservada ou livre). O controlador Mesas interage com o modelo Pedidos para associar pedidos às mesas correspondentes.

Garçons: Representa os funcionários responsáveis por anotar e entregar os pedidos. O módulo permite registrar informações sobre os garçons, como nome, turno e mesas atribuídas. O controlador de Garçons também interage com os modelos Mesas e Pedidos, atribuindo tarefas e atualizando o status dos pedidos.

O uso do padrão MVC organiza bem a separação de responsabilidades, tornando o código mais modular e facilitando a manutenção e evolução do sistema. A interface de usuário é simples e intuitiva, permitindo que os operadores do restaurante gerenciem de forma eficiente os itens, pedidos, mesas e garçons.
