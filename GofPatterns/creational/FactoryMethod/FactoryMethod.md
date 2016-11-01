#Factory Method
##1 - Introdução
De forma geral todos os padrões Factory (Simple Factory, Factory Method, Abstract Factory) encapsulam a criação de objetos. O padrão Factory Method por sua vez encapsula a criação de objetos, no entanto, a diferença é que neste padrão encapsula-se a criação de objetos deixando as subclasses decidirem quais objetos criar.
##2 - Finalidade
Criar um objeto geralmente requere processos complexos não apropriados para incluir dentro da composição dele. a criação do objeto talvez leve uma significante duplicação de código, talvez necessite informações não acessível para a composição do objeto, talvez não providencie um grau de abstração suficiente, ou então não faça parte da composição das preocupações do objeto. o padrão de design método fabrica maneja/trata esses problemas definindo um método separado para criação dos objetos, no qual as subclasses possam sobrescrever para especificar o "tipo derivado" do produto que vai ser criado.
##3 - Pros e Cons
* Positivas: Baixo acoplamento, maior flexibilidade e elimina a necessidade de acoplar classes específicas para aplicação em nível de código.
* Negativas: Alto número de classes, podendo sobrecarregar o sistema.