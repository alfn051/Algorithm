class Solution {
    public int solution(int n, int w, int num) {
        int numl = (num-1)/w%2==0?(num-1)%w:w-1-(num-1)%w;
        int nl = (n-1)/w%2==0?(n-1)%w:w-1-(n-1)%w;
        return (n-1)/w%2==0?(numl>nl?(n-1)/w-(num-1)/w:(n-1)/w-(num-1)/w+1):(numl<nl?(n-1)/w-(num-1)/w:(n-1)/w-(num-1)/w+1);
    }
}