class Solution {
    public int numSubmatrixSumTarget(int[][] ma, int t) {
        int m=ma.length;
        int n=ma[0].length;
        for(int r=0;r<m;r++){
            for(int c=1;c<n;c++){
                ma[r][c]+=ma[r][c-1];
            }
        }
        int count=0;
        for(int c1=0;c1<n;c1++){
            for(int c2=c1;c2<n;c2++){
                Map<Integer,Integer> map=new HashMap<>();
                map.put(0,1);
                int sum=0;
                for(int r=0;r<m;r++){
                    if (c1 > 0) {
                     sum += ma[r][c2] - ma[r][c1 - 1];
                    } else {
                     sum += ma[r][c2];
                    }
                
                 count+=map.getOrDefault(sum-t,0);
                 map.put(sum,map.getOrDefault(sum,0)+1);
                }
            }
        }return count;
    }
}
