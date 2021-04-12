package chapter11.HashMap;


public class MemberHashMapTest {
    public static void main(String[] args){
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(200, "오승찬");
        Member member2 = new Member(110, "김민지");
        Member member3 = new Member(310, "김민지");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);

        memberHashMap.showMembers();
    }
}
