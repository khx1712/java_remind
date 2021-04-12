package chapter1_6.practice3;

public class CardCompany {
    private static CardCompany instance = new CardCompany();

    private CardCompany(){

    }

    static public CardCompany getInstance(){
        if(instance == null){
            instance = new CardCompany();
        }
        return instance;
    }

    public Card createCard(){
        return new Card();
    }
}
