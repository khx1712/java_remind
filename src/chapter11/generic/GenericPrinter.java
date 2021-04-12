package chapter11.generic;

public class GenericPrinter<T extends Material> {

    private T material;


    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "GenericPrinter{" +
                "material=" + material.toString() +
                '}';
    }

    public void printing(){
        this.material.doPrinting();
    }
}
