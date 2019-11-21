public class TestaProduto {

    public static void main (String []args){
        Motor m1 = new Motor ("E2531", "Ford", "Forte", 4562.33, 160, 5200);
        Parafuso p1 = new Parafuso ("P745", "WEG", "Inox", 2.55, 7.88, 1.22);
        
        System.out.println (m1.imprimirDados());
        System.out.println (p1.imprimirDados());
        
    }
    
}

