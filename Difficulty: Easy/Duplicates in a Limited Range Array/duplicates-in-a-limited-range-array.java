class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
         ArrayList<Integer> ans = new ArrayList<>();
        int i=0,n=arr.length;
        while(i<arr.length){
            int rightidx=arr[i]-1;
            if(arr[i]==i+1 || arr[rightidx]==arr[i]) i++;
            
            else{
                
                swap(arr,i,rightidx);
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) ans.add(arr[i]);
        }
        return ans;
        
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}