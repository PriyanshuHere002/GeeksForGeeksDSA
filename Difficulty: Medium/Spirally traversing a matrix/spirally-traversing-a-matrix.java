class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
       
        ArrayList<Integer> ans = new ArrayList<>();
        int m=arr.length, n=arr[0].length;
        int fr = 0, lr=m-1,fc=0,lc=n-1;
        while(fr<=lr && fc<=lc){
            //right
            for(int j=fc;j<=lc;j++){
                ans.add(arr[fr][j]);
                
            }
            fr++;
            if(fr>lr || fc>lc) break;
            //down
            for(int i =fr;i<=lr;i++){
                ans.add(arr[i][lc]);
                
            }
            lc--;
            if(fr>lr || fc>lc) break;
            //left
            for(int k=lc;k>=fc;k--){
                ans.add(arr[lr][k]);
                
            }
            lr--;
            if(fr>lr || fc>lc) break;
            //up
            for(int l=lr;l>=fr;l--){
                ans.add(arr[l][fc]);
                
            }
            fc++;
        }
        return ans;


    }
        
}

