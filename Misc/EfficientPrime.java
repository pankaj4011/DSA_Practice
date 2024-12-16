import java.util.*;
public class EfficientPrime{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();

        int [] arr = new int[n+1];
        for(int i =2;i<n;i++){
            if(arr[i]==0){
                for(int p=i;p*i<n;p++){
                    arr[p*i]=1;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(arr[i]==0)
                System.out.print(i+" ");
        }


        s.close();
    }
}