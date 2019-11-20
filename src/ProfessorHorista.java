
public class ProfessorHorista extends Professor {
    
    private int horas;
    
    public ProfessorHorista (String n, int h){
        super (n);
        this.setHoras (h);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double calcularsalarioliquido(){
        double paghorista = this.getHoras()*88.99 *0.95;
        return paghorista;
    }
    
    
}
