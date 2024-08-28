package Entidades;

public class Atividade extends Pessoa {
    private String instrutor;

    // Construtor original
    public Atividade(String nome, String descricao, String instrutor) {
        super(nome, descricao);
        this.instrutor = instrutor;
    }

    // Construtor sobrecarregado
    public Atividade(String nome, String instrutor) {
        super(nome, ""); // Assume descrição vazia
        this.instrutor = instrutor;
    }

    // Construtor sobrecarregado
    public Atividade(String instrutor) {
        super("", ""); 
        this.instrutor = instrutor;
    }

    // Getter sobrecarregado
    public String getInstrutor() {
        return instrutor;
    }

    // Setter sobrecarregado
    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public void setDescricao(String descricao) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setDescricao'");
    }

    public String getDescricao() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getDescricao'");
    }
}