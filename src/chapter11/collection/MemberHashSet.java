package chapter11.collection;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<Member>();
    }

    public void addMember(Member member){
        this.hashSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Member member = iterator.next();
            if(member.getMemberId() == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showMembers(){
        for(Member member : this.hashSet){
            System.out.println(member.toString());
        }
    }
}
