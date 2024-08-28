package Entidades;

public class Plano extends Pessoa {
    private String descricao;
    private double valor;

    // Construtores

    public Plano(String nome, String cpf, String descricao, double valor) {
        super(nome, cpf);
        this.descricao = descricao;
        this.valor = valor;
    }

    public Plano(String nome, String cpf, double valor) {
        super(nome, cpf);
        this.descricao = "";
        this.valor = valor;
    }

    public Plano(double valor) {
        super("", ""); // Passando strings vazias para nome e cpf
        this.descricao = "";
        this.valor = valor;
    }

    public Plano() {
        super("", ""); // Passando strings vazias para nome e cpf
        this.descricao = "";
        this.valor = 0.0;
    }

    // Getters e Setters

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor(double desconto) {
        return valor - desconto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(String valorStr) {
        try {
            this.valor = Double.parseDouble(valorStr);
        } catch (NumberFormatException e) {
            System.err.println("Valor inválido: " + valorStr);
        }
    }
}
