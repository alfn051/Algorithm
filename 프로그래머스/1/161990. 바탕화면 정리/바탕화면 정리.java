class Solution {
    public int[] solution(String[] wallpaper) {
        int xs = 50;
        int xe = 0;
        int ys = 50;
        int ye = 0;
        for(int i = 0; i<wallpaper.length; i++){
            String[] arr = wallpaper[i].split("");
            for(int j = 0; j<arr.length; j++){
                if(arr[j].equals("#")){
                    if(i<xs) xs = i;
                    if(i+1>xe) xe = i+1;
                    if(j<ys) ys = j;
                    if(j+1>ye) ye = j+1;
                }
            }
        }
        int[] answer = {xs, ys, xe, ye};
        return answer;
    }
}