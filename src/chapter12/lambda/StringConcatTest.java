package chapter12.lambda;

public class StringConcatTest {
    public static void main(String[] args){
        StringConcatImpl stringConcat = new StringConcatImpl();
        stringConcat.makeString("Hello", "World!");

        StringConCat conCat = (s, v) -> System.out.println(s+","+v);
        conCat.makeString("Hello", "World!!");

        StringConCat conCat1 = new StringConCat(){
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1+","+s2);
            }
        };

        conCat1.makeString("Hello", "World!!!");
    }
}
