class Solution {
    public int trap(int[] h) {
        int[] l=new int[h.length];
        int[] r=new int[h.length];
        int max=-1;
        for(int i=0;i<h.length;i++){
            if(h[i]>=max){
                max=h[i];
            }l[i]=max;
        }
        max=-1;
        for(int i=h.length-1;i>=0;i--){
            if(h[i]>=max){
                max=h[i];
            }r[i]=max;
        }
        int tot=0;
        for(int i=0;i<h.length;i++){
            tot+= Math.min(l[i],r[i])-h[i];
        }return tot;
    }
}
