import java.util.Scanner;

public class MergeSort {
    public static void merge(int [] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int [] left = new int[n1];
        int [] right = new int [n2];

        for(int i=0;i<n1;i++){
            left[i] = arr[i+l];
        }

        for(int j=0;j<n2;j++){
            right[j] = arr[m+1+j];
        }
      
        int k = l;
        int i =0, j=0;
        while(i<n1 && j< n2){
            if(left[i]<=right[j]){
                arr[k++] =left[i++];
            }
            else{
                arr[k++]= right[j++];
            }
        }

        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }


    }

    public static void partition(int [] arr, int i, int j){
        if(i<j){
            int m = i+(j-i)/2;
            partition(arr,i,m);
            partition(arr,m+1,j);   
            merge(arr,i,m,j);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        partition(arr, 0, n-1);

        for(int i:arr){
            System.out.print(i+" ");
        }

        s.close();

    }

       

}
