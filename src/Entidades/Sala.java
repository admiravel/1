package Entidades;

public class Sala extends Pessoa {
    private int numero;
    private int capacidade;

    // Construtor original
    public Sala(String nome, String descricao, int numero, int capacidade) {
        super(nome, descricao);
        this.numero = numero;
        this.capacidade = capacidade;
    }

    // Construtor sobrecarregado
    public Sala(String nome, int numero, int capacidade) {
        super(nome, ""); 
        this.numero = numero;
        this.capacidade = capacidade;
    }

    // Construtor sobrecarregado
    public Sala(int numero, int capacidade) {
        super("", ""); 
        this.numero = numero;
        this.capacidade = capacidade;
    }

    // Getter original
    public int getNumero() {
        return numero;
    }

    // Getter sobrecarregado
    public String getNumeroFormatado() {
        return "Sala " + numero;
    }

    // Getter original
    public int getCapacidade() {
        return capacidade;
    }

    // Setter original
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Setter original
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}