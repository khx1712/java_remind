package chapter11.generic;

public class genericTest {
    public static void main(String[] args){
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderGenericPrinter.setMaterial(powder);

        System.out.println(powderGenericPrinter);

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        plasticGenericPrinter.setMaterial(plastic);

        plasticGenericPrinter.printing();
        System.out.println(plasticGenericPrinter);

    }
}
