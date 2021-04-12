package chapter11.string;

public class StringTest2 {
    public static  void main(String[] args){
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        System.out.println(System.identityHashCode(android));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java));

    }
}
