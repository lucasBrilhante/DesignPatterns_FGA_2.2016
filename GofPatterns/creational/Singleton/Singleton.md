#Singleton
##1 - Introdução
Muitas vezes é necessário o compartilhamento de alguma informação entre várias instancias de uma mesma classe. Isso é resolvido pelo padrão Singleton, que garante que só será criada apenas uma instancia de uma classe, dessa forma garantindo que em duas chamadas diferentes, informações não serão perdidas.

##2 - Finalidade
O singleton se monstra necessário quando há a necessidade de uma única instância de uma classe no sistema inteiro. Um bom exemplo seria quando se precisa criar uma conexão com o banco de dados, e não se deseja mais de uma conexão no sistema.
Neste exemplo foi mostrada uma controladora que precisava compartilhar uma informação independente de onde fosse chamada, a lista de itens vendidos. O singleton também é um bom candidato para quando se precisa de uma controladora de fachada.

##3 - Pros e Cons
* Positivas: Resolve um problema de compartilhamento e ao mesmo tempo evita o problema de variaveis globais.
* Negativos: Se não tratado com cuidado pode trazer grandes buracos para o sistema, mesmo problema causado por usos de variáveis globais. Esse problema faz com que o padrão seja caracterizado por muitos atores como anti pattern.