public class Vetor<T> {

    private int tamanho;
    private T[] vetor;

    private int hash;

    public Vetor(int capacidade) {
        this.tamanho = capacidade;
        this.vetor = (T[]) new Object[capacidade];
    }

    public void inserir(T elemento) {
        this.vetor[hash] = elemento;
    }

    public void consultar() {
        System.out.print(this.vetor[hash] + " | ");
    }

    public void tabela(int i) {
        System.out.print(this.vetor[i] + " | ");
    }

    public void buscar(T chave) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.vetor[i] != null && this.vetor[i].equals(chave)) {
                System.out.println("Elemento encontrado na posição " + i);
                System.out.println(this.vetor[i]);
            }
        }
    }

    public void remove() {
        if (this.vetor[hash] != null) {
            this.vetor[hash] = null;
        } else {
            System.out.println("Elemento não encontrado na posição " + hash);
        }
    }

    public int hash(String string) {
        int a = 31; // qualquer numero primo
        for (int i = 0; i < string.length(); i++) {
            hash = (hash + string.charAt(i) * a);
        }
        hash %= this.tamanho;
        return hash;
    }
}

