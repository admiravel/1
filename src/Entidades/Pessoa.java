package Entidades;

public abstract class Pessoa {
    private String nome;
    private String cpf;

    // Construtor com nome e CPF
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Construtor com apenas nome
    public Pessoa(String nome) {
        this.nome = nome;
        this.cpf = ""; // Ou poderia ser null, dependendo da lógica do seu programa
    }

    // Construtor vazio
    public Pessoa() {
        this.nome = "";
        this.cpf = ""; // Ou null
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método para imprimir informações básicas da pessoa
    public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

    // Método sobrecarregado para imprimir informações detalhadas da pessoa
    public void imprimirInfo(boolean detalhado) {
        if (detalhado) {
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            // Adicione mais detalhes conforme necessário
        } else {
            imprimirInfo(); // Chamada para o método original, se detalhado for falso
        }
    }
}