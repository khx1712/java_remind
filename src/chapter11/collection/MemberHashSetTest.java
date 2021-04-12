package chapter11.collection;

public class MemberHashSetTest {
    public static void main(String[] args){
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(100, "오승찬");
        Member member2 = new Member(110, "김민지");
        Member member3 = new Member(110, "김민지");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        memberHashSet.showMembers();
    }
}
