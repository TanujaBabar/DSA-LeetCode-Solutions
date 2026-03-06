class Solution {
    public boolean checkOnesSegment(String s) {
        /*if(s.contains("01")) return false;
        return true;*/
        int n = s.length();
        int count=0;
        if(n==1 || n==2) return true;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == '0' && s.charAt(i+1)== '1'){
                return false;
            }
        }
        return true;
    }
}
