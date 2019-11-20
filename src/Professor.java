
public abstract class Professor {

    private String nome;
    
    public Professor (String n){
        this.setNome (n);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract double calcularsalarioliquido();
        
    
    
}
