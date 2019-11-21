public class Parafuso extends Produto {

private double comprimento;
private double diametro;

public Parafuso (String c, String n, String d, double p, double com, double dia ){
    super (c, n, d, p);
    this.setComprimento (com);
    this.setDiametro (dia);
}

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public double calcularPrecoFinal(){
        double desc = this.getPreco() *0.85;
        return desc;
    }
    
    public String imprimirDados(){
       String imprimi = this.getCod() +this.getNome() +getDescricao() +this.getPreco() +this.getComprimento() +this.getDiametro();
       return imprimi;
        
    }
    
}

