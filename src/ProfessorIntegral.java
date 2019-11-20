
public class ProfessorIntegral extends Professor {
    
    private double salario;
    
    public ProfessorIntegral (String n, double s){
        super (n);
        this.setSalario (s);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
     public double calcularsalarioliquido(){
        double pagintegral = this.getSalario()* 0.89;
        return pagintegral;
    }
                
}
