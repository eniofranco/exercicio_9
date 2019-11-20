
public class TestaProfessores {
   
    public static void main (String [] args){
        ProfessorIntegral pi1 = new ProfessorIntegral ("Luciano", 8752.87);
        ProfessorHorista ph1 = new ProfessorHorista ("Paulo", 40);
        
      
        
        System.out.println("Salario do Professor Integral: " + pi1.calcularsalarioliquido());
        System.out.println("Salario do Professor Horista: " +ph1.calcularsalarioliquido());
        
        
    }
}
