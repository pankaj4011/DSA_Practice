import java.util.*;

public class BubbleSort{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i< n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j] = temp;
                }
            }

        }
        for(int i: arr){
            System.out.print(i+" ");
        }
        s.close();
    }
}
