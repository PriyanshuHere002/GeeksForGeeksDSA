class Solution {
    public int missingNumber(int[] arr) {
        int i=0,n=arr.length;
        while(i<arr.length){
            if(arr[i]==i+1 || arr[i]>n || arr[i]<=0 ) i++;
            
            else{
                int idx=arr[i]-1;

                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                if(arr[i]==arr[idx]) i++;
                
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1)return i+1;
        }
        return n+1;
    }
        
    
}
