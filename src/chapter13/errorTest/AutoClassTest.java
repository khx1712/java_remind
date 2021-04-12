package chapter13.errorTest;

public class AutoClassTest {
    public static void main(String[] args){
        try(AutoClose autoClose = new AutoClose()){
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
