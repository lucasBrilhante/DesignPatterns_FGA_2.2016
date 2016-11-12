#Factory Method
##1 - Introdução
Pode acontecer algumas vezes de ocorrer a instanciação de muitos objetos, que podem eventualmente serem muito parecidos entre si, não mudando tantos dados. Essa instanciação pode ser custosa e portanto não se deseja fazer o processo normal de inicialização. Esse problema pode ser resolvido fazendo uma clonagem do objeto que foi instanciado uma vez e então setando apenas o dado que muda.

##2 - Finalidade
A finalidade do prototype é diminuir o gasto com instanciação de objetos. 

##3 - Pros e Cons
* Benefícios: Esconde os produtos do cliente, reduz o acoplamento e oferece maior flexibilidade para alterações nas classes produtos.
	Inicialmente é fácil ver que o padrão Prototype oferece as mesmas vantagens que outros padrões de criação, a diferença básica deste padrão é a flexibilidade. Por exemplo: o cliente instancia vários protótipos, quando um deles não é mais necessário, basta removê-lo. Se é preciso adicionar novos protótipos, basta incluir a instanciação no cliente. Essa flexibilidade pode ocorrer inclusive em tempo de execução.
* Malefícios: Se a instanciação não é custosa, provavelmente este padrão pode piorar a performance.