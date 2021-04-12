package chapter11.treeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> TreeSet;

    public MemberTreeSet() {
        this.TreeSet = new TreeSet<Member>();
    }

    public void addMember(Member member){
        this.TreeSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> iterator = TreeSet.iterator();
        while (iterator.hasNext()){
            Member member = iterator.next();
            if(member.getMemberId() == memberId){
                TreeSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showMembers(){
        for(Member member : this.TreeSet){
            System.out.println(member.toString());
        }
    }
}
