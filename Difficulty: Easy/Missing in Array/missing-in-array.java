class Solution {
    int missingNum(int arr[]) {
        int i=0,n=arr.length+1;
        while(i<arr.length){
            if(arr[i]==i+1 || arr[i]==n) i++;
            
            else{
                int idx=arr[i]-1;
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1)return i+1;
        }
        return n;
    }
}