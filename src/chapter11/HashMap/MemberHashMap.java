package chapter11.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        this.hashMap.put(member.getMemberId(), member);
    }

    public  boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        return false;
    }

    public void showMembers(){
        Iterator<Integer> iterator =  hashMap.keySet().iterator();
        while (iterator.hasNext()){
            int key = iterator.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }
}
