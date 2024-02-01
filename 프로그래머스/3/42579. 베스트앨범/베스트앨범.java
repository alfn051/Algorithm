import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<Integer>> map = new HashMap<>();
        Map<String, Integer> totalmap = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            if(!map.containsKey(genres[i])){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(genres[i], list);
                totalmap.put(genres[i], plays[i]);
            }else {
                map.get(genres[i]).add(i);
                totalmap.replace(genres[i], totalmap.get(genres[i])+plays[i]);
            }

        }
        List<String> keys = new ArrayList<>(totalmap.keySet());
        keys.sort(((o1, o2) -> totalmap.get(o2).compareTo(totalmap.get(o1))));
        for (String key : keys) {
            List<Integer> vl = map.get(key);
            if (vl.size()>1){
                vl.sort(Comparator.comparing(o -> ((Integer) plays[(int) o])).reversed());
                answerList.add(vl.get(0));
                answerList.add(vl.get(1));
            }else {
                answerList.add(vl.get(0));
            }
        }
        return answerList.stream().mapToInt(i->i).toArray();
    }
}