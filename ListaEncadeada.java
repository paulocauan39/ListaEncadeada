
public class ListaEncadeada {

    private No inicio;

    // 1. Inserir no início
    public void inserirInicio(int valor) {
        No novo = new No(valor);

        novo.proximo = inicio;
        inicio = novo;

        System.out.println("Elemento inserido no início!");
    }

    // 2. Inserir no final
    public void inserirFinal(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;

            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = novo;
        }

        System.out.println("Elemento inserido no final!");
    }

    // 3. Inserir em uma posição específica
    public void inserirPosicao(int valor, int posicao) {

        if (posicao < 1) {
            System.out.println("Posição inválida!");
            return;
        }

        if (posicao == 1) {
            inserirInicio(valor);
            return;
        }

        No atual = inicio;

        for (int i = 1; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Posição inválida!");
            return;
        }

        No novo = new No(valor);

        novo.proximo = atual.proximo;
        atual.proximo = novo;

        System.out.println("Elemento inserido na posição " + posicao + "!");
    }

    // 4. Remover do início
    public void removerInicio() {

        if (inicio == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        inicio = inicio.proximo;

        System.out.println("Elemento removido do início!");
    }

    // 5. Remover do final
    public void removerFinal() {

        if (inicio == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        if (inicio.proximo == null) {
            inicio = null;
        } else {
            No atual = inicio;

            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = null;
        }

        System.out.println("Elemento removido do final!");
    }

    // 6. Remover de uma posição específica
    public void removerPosicao(int posicao) {

        if (inicio == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        if (posicao < 1) {
            System.out.println("Posição inválida!");
            return;
        }

        if (posicao == 1) {
            removerInicio();
            return;
        }

        No atual = inicio;

        for (int i = 1; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null || atual.proximo == null) {
            System.out.println("Posição inválida!");
            return;
        }

        atual.proximo = atual.proximo.proximo;

        System.out.println("Elemento removido da posição " + posicao + "!");
    }

    // 7. Buscar um elemento
    public void buscar(int valor) {

        No atual = inicio;
        int posicao = 1;

        while (atual != null) {

            if (atual.valor == valor) {
                System.out.println("Elemento encontrado na posição " + posicao + "!");
                return;
            }

            atual = atual.proximo;
            posicao++;
        }

        System.out.println("Elemento não encontrado!");
    }

    // 8. Exibir a lista
    public void exibir() {

        if (inicio == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        No atual = inicio;

        System.out.println("\nElementos da lista:");

        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }

        System.out.println("null");
    }

    // 9. Contar elementos
    public int contarElementos() {

        int quantidade = 0;
        No atual = inicio;

        while (atual != null) {
            quantidade++;
            atual = atual.proximo;
        }

        return quantidade;
    }
}
