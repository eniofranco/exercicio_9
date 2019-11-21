public abstract class Produto {
    
    private String cod;
    private String nome;
    private String descricao;
    private double preco;
    
    
    public Produto (String c, String n, String d, double p){
        this.setCod (c);
        this.setNome (n);
        this.setDescricao (d);
        this.setPreco (p);
        
             
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public abstract double calcularPrecoFinal();
    
    
    public abstract String imprimirDados();
    
}

