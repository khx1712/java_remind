package chapter1_6.practice3;

public class Card {
    private static int serialNumber = 10001;
    private int cardNumber;

    public Card(){
        this.cardNumber = serialNumber;
        serialNumber++;
    }

    public int getCardNumber(){
        return this.cardNumber;
    }
}
