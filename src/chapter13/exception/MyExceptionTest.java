package chapter13.exception;

public class MyExceptionTest {

    public String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if(userID == null){
            throw new IDFormatException("비어있습니다.");
        }else if(userID.length() < 2 || userID.length() > 8){
            throw new IDFormatException("길이가 안맞습니다.");
        }
        this.userID = userID;
    }

    public static void main(String[] args){
        MyExceptionTest myExceptionTest = new MyExceptionTest();
        try {
            myExceptionTest.setUserID("ㅂ");
        } catch (IDFormatException e) {
            System.out.println(e);
        }
    }
}
