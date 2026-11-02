# Trabalho avaliativo — Um algoritmo, diferentes linguagens: listas, arrays e repetições
    // Turma: ADS1AN-ESA1-90834648
    // Curso: Análise e desenvolvimento de sistemas
    // Professor: Alexandre de Oliveira 
    // Aluno: Guilherme Michelsen Silva de Oliveira 
    // Data: 01/11/2026


**1. Por que utilizamos laços de repetição?**
Utilizamos laços de repetição para executar o mesmo trecho de código várias vezes sem precisar escrevê-lo repetidamente, tornando o programa mais organizado e reduzindo a duplicação de código. **Momento da explicação do vídeo: 02:55.**

**2. Diferença entre `while` e `do-while`. Exemplo em que ela importa.**

O `while` verifica a condição antes de executar o bloco de código, podendo não executá-lo nenhuma vez. Já o `do-while` executa o código pelo menos uma vez, mesmo que a condição seja falsa.

**Exemplo:** Em um sistema de cadastro, o `while` pode ser utilizado para repetir o processo enquanto houver cadastros a realizar. Já o `do-while` pode ser usado para exibir um menu pelo menos uma vez, permitindo que o usuário escolha uma opção antes de verificar se deseja continuar. **Momento da explicação do vídeo: 11:04.**

**3. No exemplo dos times em C#, por que são necessários dois laços?**
Porque cada confronto envolve dois times. O laço externo escolhe o mandante (primeiro time) e o interno percorre todos os adversários possíveis (segundo time). Com um laço só, seria possível percorrer os times, mas não combiná-los dois a dois.

**4. Qual é a função do `if` que impede confrontos de um time contra ele mesmo?**
Os dois laços percorrem a mesma coleção, então em algum momento o índice do mandante é igual ao do adversário (`i == j`). O `if (i != j)` só deixa o jogo ser exibido (e contado) quando os índices são diferentes, evitando casos como "Cruzeiro x Cruzeiro".

**5. Java, C# e Rust: duas diferenças de sintaxe e um conceito lógico que permanece.**
- Diferença 1: o tamanho da coleção é `times.length` em Java (array), `times.Count` em C# e `times.len()` em Rust.
- Diferença 2: o laço em Rust é `for i in 0..times.len()`, sem declarar contador nem incremento como em `for (int i = 0; i < ...; i++)` de Java 


---

## 2. Leitura e relação com o livro

**Referência:** BHARGAVA, Aditya. *Entendendo Algoritmos: um guia ilustrado para programadores e outros curiosos*. Capítulo 2.

**1. Como os elementos de um array são organizados e acessados?**
Ficam em posições de memória vizinhas (contíguas), uma após a outra. Como cada elemento tem um índice e o computador sabe onde o array começa, ele calcula o endereço do elemento `i` diretamente, sem percorrer os anteriores. Por isso o acesso por índice é rápido.

**2. Como os elementos de uma lista encadeada são organizados?**
Cada elemento (nó) pode estar em qualquer lugar da memória e guarda, além do valor, o endereço do próximo nó. Para chegar ao terceiro elemento, é preciso passar pelo primeiro e pelo segundo.


**3. Por que inserir ou excluir pode exigir operações diferentes nas duas estruturas?**
Na lista encadeada, inserir ou remover no meio é só ajustar os ponteiros dos nós vizinhos, sem mover os demais. No array, os elementos precisam ficar contíguos: inserir no meio exige deslocar os seguintes, e se o array estiver cheio é preciso criar outro maior. Em compensação, o array acessa qualquer posição direto, enquanto a lista precisa percorrer os nós.

**4. Uma coleção chamada "lista" é necessariamente uma lista encadeada? 
Não.
- `List<string>` (C#): internamente usa um **array** que cresce. Quando a capacidade acaba, aloca um array maior e copia os elementos. Acessa por índice como um array.
- `Vec<String>` (Rust): é um **vetor dinâmico** (array redimensionável) com elementos contíguos na memória, e também cresce realocando quando necessário.


**5. Vantagens de uma estrutura baseada em array para guardar os times e percorrê-los repetidamente.**
- Acesso direto por índice (`times[i]` e `times[j]`), que é exatamente o que os laços aninhados usam.
- Percorrer em ordem é simples, com `i` indo de 0 até o tamanho.
- Os índices permitem resolver o turno único (`j = i + 1`) sem coleção auxiliar. Em uma lista encadeada isso seria bem mais trabalhoso.
- A quantidade de times é pequena e as inserções são raras, então o custo de crescer é irrelevante.

---
**Dificuldades de instalação das linguagens**

Durante a instalação e configuração do C# e do Rust no Zorin OS, encontrei algumas dificuldades ao tentar fazer login com minha conta Microsoft no VS Code, o sistema operacional travou e apresentou erros. 
No windows, Defender bloqueava alguns pacotes durante a instalação, impedindo a conclusão do processo. Além disso, 

Também tive problemas para executar projetos C# armazenados na partição do Windows, pois o sistema não permitia gravar os arquivos necessários para a compilação. Consegui instalar o .NET e executar um teste pelo terminal, mas não consegui concluir a configuração completa das ferramentas. Não consegui executar o "hello Word".

Por esses motivos, optei por desenvolver o trabalho em Java. Também não consegui combinar com algum colega para realizar a atividade em dupla, então decidi seguir sozinho. Utilizei o Claude como auxílio para entender e implementar os laços de repetição e optei por desenvolver a atividade dentro do meu nível de conhecimento, buscando compreender o que estava fazendo e entregar o que consegui realizar.
