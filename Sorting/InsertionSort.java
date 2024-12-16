import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        for(int i =1;i<n;i++){
            int  j =i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }   



        for(int i:arr){
            System.out.print(i+" ");
        }

        s.close();
    }
    
}
