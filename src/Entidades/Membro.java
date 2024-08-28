package Entidades;

public class Membro extends Pessoa {
    private static int contadorId = 1;  
    private int id;
    private String cpf;
    private Plano plano;

    
    public Membro(String nome, String descricao, String id2, Plano plano) {
        super(nome, descricao);
        this.id = contadorId++;
        this.cpf = id2;
        this.plano = plano;
    }

    
    public Membro(String nome, String cpf, Plano plano) {
        super(nome);
        this.id = contadorId++;
        this.cpf = cpf;
        this.plano = plano;
    }

   
    public Membro() {
        super();
        this.id = contadorId++;
        this.cpf = "";
        this.plano = null;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    
    public void imprimirInfo() {
        super.imprimirInfo(); 
        System.out.println("ID: " + id);
        System.out.println("CPF: " + cpf);
        System.out.println("Plano: " + plano);
    }

    
    public void imprimirInfo(boolean detalhado) {
        if (detalhado) {
            imprimirInfo(); 
        } else {
            super.imprimirInfo(); 
        }
    }
}