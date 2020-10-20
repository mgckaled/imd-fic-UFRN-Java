# Aula 07 - Herança

### Definição
<p>Herança é o mecanismo que permite a uma classe 
herdar todos os atributos e métodos de outra classe. 
Ela permite definir a implementação de uma nova classe 
na definição de uma classe previamente implementada.
</p>

<p>
<strong>Hierarquia de Classe</strong>:
 ou de Herança: é o mapeamento do tipo árvore de 
 relacionamentos que se formam entre as classes como 
 resultado da herança. Exemplo: a Figura 2 representa 
 uma hierarquia de herança ou hierarquia de classe.
</p>

### Termos Usados para Herança

*CLASSES QUE FORNECEM HERANÇA*:
1. Superclasse 
2. Mãe
3. Tipo

*CLASSES QUE HERDAM HERANÇA*:
1. Subclasse
2. Filha
3. Subtipo

***Nota***: *a classe filha não pode remover os atributos e métodos da classe mãe. Abaixo, são apresentados outros termos que são também comumente usados.*

- **Ancestral**: é uma classe que aparece na hierarquia de classes em uma posição acima da progenitora (mãe).
- **Descendente**: dada uma classe, toda classe que aparece abaixo dela na hierarquia é uma descendente da classe dada.
- **Raiz (ou Base)**: é a classe topo da hierarquia.
- **Folha**: é uma classe sem filhas.

### Especialização e Generalização

- GENERALIZAÇÃO: Classes mais genéricas e abstratas disponíveis, as quais podem ser usadas para outras descenderem delas
- ESPECIALIZAÇÃO: Classes que estão numa posição inferior na hierarquia possuem estado e comportamento mais especializados, ou seja, com mais detalhes de informações.

### Herança Múltipla e Simples

- **Herança Múltipla**: é a capacidade de uma classe possuir mais de uma superclasse e herdar as variáveis e métodos combinados de todas as superclasses.  
- **Herança Simples**: Cada classe pode ter apenas uma superclasse, embora uma superclasse possa ter várias subclasses.

Na linguagem Java, a herança é simples e na codificação usa-se a palavra reservada `extends` para declarar que uma classe é herdeira de outra. Para simular a herança múltipla em Java, usa-se `Interfaces`.