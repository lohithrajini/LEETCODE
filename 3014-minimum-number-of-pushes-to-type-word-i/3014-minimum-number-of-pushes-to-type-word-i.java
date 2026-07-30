class Solution {
    public int minimumPushes(String word) {
        int n = word.length();      
int p = 0;                 
for (int i = 0; i < n; i++) {
    p += (i / 8) + 1;      
}
return p;
    }
}