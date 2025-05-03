import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        
        Arrays.sort(book_time, new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2){
                String[] t1 = o1[0].split(":");
                String[] t2 = o2[0].split(":");
                int m1 = Integer.parseInt(t1[0])*60 + Integer.parseInt(t1[1]);
                int m2 = Integer.parseInt(t2[0])*60 + Integer.parseInt(t2[1]);
                return Integer.compare(m1, m2);
            }
        });
        
        List<Integer> room = new ArrayList<>();
        room.add(0);
        
        for(String[] book : book_time){
            String[] sa = book[0].split(":");
            String[] ea = book[1].split(":");
            int st = Integer.parseInt(sa[0])*60 + Integer.parseInt(sa[1]);
            int et = Integer.parseInt(ea[0])*60 + Integer.parseInt(ea[1]);
            boolean state = false;
            for(int i = 0; i < room.size(); i++){
                if(st >= room.get(i)){
                    room.set(i, et+10);
                    state = true;
                    break;
                }
            }
            if(!state) {
                room.add(et+10);
            }
        }
        return room.size();
    }
}