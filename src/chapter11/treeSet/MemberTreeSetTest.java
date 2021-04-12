package chapter11.treeSet;

public class MemberTreeSetTest {
    public static void main(String[] args){
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(200, "오승찬");
        Member member2 = new Member(110, "김민지");
        Member member3 = new Member(310, "김민지");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);

        memberTreeSet.showMembers();
    }
}
