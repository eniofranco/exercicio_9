public class Motor extends Produto {
    
    private double potencia;
    private double rpm;
    
    public Motor (String c, String n, String d, double p, double po, double r){
        super (c, n, d, p);
        this.setPotencia (po);
        this.setRpm (r);
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }
    
    public double calcularPrecoFinal(){
        double desc = this.getPreco() *0.95;
        return desc;
    }
    
    public String imprimirDados(){
       String imprimi = this.getCod() +this.getNome() +getDescricao() +this.getPreco() +this.getPotencia() +this.getRpm();
       return imprimi;
        
    }
    
}
