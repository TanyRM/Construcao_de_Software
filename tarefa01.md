# Rest API

## Definição de conceitos

Uma API define um conjunto de regras e protocolos que definem como aplicativos e dispositivos se integram entre si. São a forma mais comum de conectar componentes em arquiteturas de microsserviços. REST é um estilo arquitetural que define um conjunto de restrições e princípios para o design de sistemas distribuídos que foca em escalabilidade, independência de componentes e a interoperabilidade entre sistemas.

Sendo assim, uma API REST é um estilo arquitetural de APIs que são utilizadas na comunicação entre sistemas computacionais. Nessa arquitetura, as operações são modeladas sobre recursos e depois mapeadas para operações HTTPS e cada requisição contém a informação necessária para ser processada sem precisar de informações do servidor.

## Características de uma API REST

Para ser considerada uma API do tipo REST, precisa ter as seguintes características:

- **Interface uniforme**: Isso vai permitir o desenvolvimento independente da aplicação entre usuário e servidor, a interface uniforme torna a comunicação entre esses dois padronizada e uma das condições para se alcançar isso é através da manipulação de recursos por meio de representações.

- **Desacoplamento do cliente-servidor**: Deve possuir uma arquitetura baseada em clientes, servidores e recursos onde as solicitações são realizadas via protocolos HTTP como forma de aumentar a independência entre o cliente e o servidor. Mudanças realizadas pelo usuário em sua aplicação não devem afetar o servidor e sua estrutura e o mesmo deve acontecer com mudanças realizadas pelos desenvolvedores, elas não devem afetar imediatamente a aplicação do usuário.

- **Sem estado definido (Stateless)**: A comunicação entre o cliente e o servidor deve ser sem estado definido, o que significa que não deve armazenar nenhuma informação entre as solicitações. Cada solicitação contém os dados necessários para que a mesma seja atendida, sem depender de informações armazenadas em outro momento.

- **Arquitetura de sistema em camadas**: Cada camada do sistema deve possuir uma funcionalidade específica, assim cada uma fica responsável por uma única etapa do processo. Essas camadas devem ser ordenadas hierarquicamente de maneira separada, mas devem interagir entre si.

- **Capacidade de armazenamento**: As APIs do tipo REST devem ser desenvolvidas de modo que consigam armazenar informações e dados em cache como forma de otimizar as solicitações e respostas entre cliente e servidor.

Por oferecer um alto nível de liberdade e flexibilidade, o uso de APIs REST é muito benéfico para aplicações em nuvem, também é muito benéfico para os usuários, pois elas permitem representações enviadas em diversos formatos. Essas APIs também tendem a utilizar menos largura de banda, o que torna o uso da internet mais eficiente. O padrão REST é o método de preferência na integração de aplicações e na conexão de componentes em um software, e a tendência é que seja cada vez mais confirmada como via de regra no desenvolvimento de aplicações.
