public class RotateArray {

    static void rotate(int [] arr, int l, int r){
        while(l<r){
            int temp =arr[l];
            arr[l] =arr[r];
            arr[r] =temp;
            l++;
            r--;      
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int n =arr.length;
        int unit = 2;
        unit = unit%n;
        rotate(arr,0,n-unit-1);
        rotate(arr,n-unit,n-1);
        rotate(arr,0,n-1);

        for(int i: arr){
            System.out.print(i+"  ");
        }
    }

    
}
