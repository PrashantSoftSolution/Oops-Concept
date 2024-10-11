public class Constrator_default {
    private Constrator_default(int x, int y){
        super();
        System.out.println("Hello ");
    }
    protected Constrator_default(int x , double y){
        super();
        System.out.println("Hello nature  ");
    }
    Constrator_default(String x, int y){
        super();
        System.out.println("Hello world ");
    }
     Constrator_default(double x, int y){
        super();
        System.out.println("Hy ");
    }
     Constrator_default(int x, char y){
        super();
        System.out.println("Hello sir ");
    }

    public static void main(String[] args) {
        Constrator_default e= new Constrator_default(45, 67);
        Constrator_default e1= new Constrator_default(45, 67.89);
        Constrator_default e2= new Constrator_default(45, 67);
        Constrator_default e3= new Constrator_default("hello", 67);
        Constrator_default e4= new Constrator_default(45.77, 67);
        Constrator_default e5= new Constrator_default(45, 'r');




    }

    
}
