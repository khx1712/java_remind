package chapter11.string;

public class StringBuilderTest {
    public static void main(String[] args){
        String java = new String("java");
        String android = new String("android");

        StringBuffer stringBuffer = new StringBuffer(java);
        System.out.println(System.identityHashCode(stringBuffer));
        stringBuffer.append(android);
        System.out.println(System.identityHashCode(stringBuffer));
        String res = stringBuffer.toString();
    }
}
