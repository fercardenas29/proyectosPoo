package ec.edu.epn.fis.prograii2021b;
/**
 *
 * @author ferch
 */
public class MyFirstClass {
    static int z;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro mercedez300E;
        mercedez300E = new Carro();
        mercedez300E.setMarca("Mercedez");
        mercedez300E.setModelo("300E");
        mercedez300E.setAño(1985);
        
        System.out.println("Mi Carro, marca: "+ mercedez300E.getMarca());
        System.out.println("          modelo: "+ mercedez300E.getModelo());
        System.out.println("          año: "+ mercedez300E.getAño());
        

        
        /** 
        // TODO code application logic here
        System.out.println("Mi primera clase.");
        int y=10;
        int x=89;
        int reply=x+y;
        System.out.println(reply);
        
        int reply2 = z+y;
        System.out.println("Operando con variable de instancia "+ reply2);
        
        long okIdentifier;
        boolean _alsoOk;
        boolean also_Ok;
        float $Pi;
        
        boolean m0;
        //int *_;   //nombre de variable incorrecto
        //int 0nombre;            //nombre de variable incorrecto
        
        int a=5;
        float b=3.899f;
        System.out.print("Multiplicando int*float");
        System.out.println(a*b);
        
        if(a==3)
            System.out.println("a es igual a 3");
        else
            System.out.println("a no es igual a 3");
        
        if((int)b==3)
            System.out.println("b es igual a 3");
        else
            System.out.println("b no es igual a 3");
        
        double bCeil=Math.ceil(b);
        int bInt=(int)bCeil;
        if (bInt==3){
        }
        
        if((int)Math.ceil(b)==3)
            System.out.println("b es igual a 3 " +bInt);
        else
            System.out.println("b no es igual a 3 " +bInt);
     */   
    }
    
}

