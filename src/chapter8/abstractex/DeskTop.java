package chapter8.abstractex;

public class DeskTop extends Computer{

    @Override
    public void display() {
        System.out.println("DestTop Display");
    }

    @Override
    public void typing() {
        System.out.println("타자침");
    }
}
