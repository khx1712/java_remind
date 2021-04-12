package chapter13.errorTest;

public class AutoClose implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("닫힘");
    }
}
