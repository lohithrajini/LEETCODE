class Solution {
    public boolean canAliceWin(int n) {
        int val = 10;
        while(n>= val) {
            n -= val;
            val--;
        }
        return val % 2!=0;
    }
}