class Solution {
    static int count;
    public int inversionCount(int arr[]) {
        count=0;
        mersot(arr);
        return count;
         
        
    }
    public static void mersot(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return;// 1 length array is sorted
        int[] a = new int[n / 2];
        int[] b = new int[n - (n / 2)];
        // copy paste arr into a and b
        int idx = 0;// idx travel karega arr pe
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }
        // step 3- magis.
        mersot(a);
        mersot(b);

        // step 4- merge a and b into arr
        merge(a, b, arr);
    }
    
    public static void merge(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
                
            } else {
                count+=(arr1.length-i);
                arr3[k++] = arr2[j++];
                
            }
            
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
    
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
    }
}