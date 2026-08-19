class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> ans= new ArrayList<>();  
        int max=0,min=arr[0],n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]<min) min=arr[i];
        }
        ans.add(min);
        ans.add(max);
        return ans;
        
        
    }
}
