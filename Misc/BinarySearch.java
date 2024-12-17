public class BinarySearch {
    static int binarySearch(int [] arr , int l, int r, int key){
        if(r>=l){
        int m  = l+(r-l)/2;
        if(arr[m] == key)
            return m;
        else if(arr[m]> key){
            return binarySearch(arr, l, m-1, key);
        }
        else{
           return binarySearch(arr, m+1, r, key);
        }
    }
    return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int n =arr.length;
        int key = 0;
        int ans = binarySearch(arr,0, n-1,key);
        System.out.println(ans);
    }
    
}
