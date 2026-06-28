class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int reverse = 0;
        while(n!=0) {
            int per = n%10 ;
            reverse = reverse*10+per;
            n/=10;
        }
        return Math.abs(num-reverse);
    }
}