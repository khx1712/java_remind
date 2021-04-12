package chapter11.treeSet;

public class Member implements Comparable<Member>{
    private int memberId;
    private String memberName;

    public Member(){};
    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return this.memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member) obj;
            return this.memberId == member.memberId;
        }else{
            return false;
        }
    }

    @Override
    public int compareTo(Member member) {
        return this.memberId - member.memberId;
    }
}
