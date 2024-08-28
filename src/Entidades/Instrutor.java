package Entidades;

public class Instrutor extends Pessoa {
    private String especialidade;

    
    public Instrutor(String nome, String cpf, String especialidade) {
        super(nome, cpf);
        this.especialidade = especialidade;
    }

    
    public Instrutor(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
    }

    
    public Instrutor() {
        super();
        this.especialidade = "";
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
    public void imprimirInfo() {
        super.imprimirInfo(); 
        System.out.println("Especialidade: " + especialidade);
    }

    
    public void imprimirInfo(boolean detalhado) {
        if (detalhado) {
            imprimirInfo(); 
        } else {
            super.imprimirInfo(); 
        }
    }
}
