class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pas=new ArrayList();
        for(int i=0;i<numRows;i++){
            List<Integer> ans=new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){

                
                ans.add(1);
            }else{
                List<Integer> prev=pas.get(i-1);
                ans.add(prev.get(j)+prev.get(j-1));

            }
            }pas.add(ans);
        }return pas;
    }
}
