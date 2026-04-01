import java.util.Scanner;
public class array {
    public static int value(int[] arr,int n,int b) {
        for(int i=0;i<n;i++){
            if(arr[i]==b){
                 System.out.print(i);
            }
        }
        return 0;
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5 };
        int index=value(arr,5,3);
//          Scanner sc=new Scanner(System.in);
//          int n=sc.nextInt();
//          int[] arr= new int[n];
//          for(int i=0;i<n;i++){
//             arr[i]= sc.nextInt();
//          }
//          for(int i=0;i<n;i++){
//             System.out.print(arr[i] + " ");
//          }
//          int min=arr[0];
//             int max=arr[0];
//          for(int i=0;i<n;i++){
            
//             if(arr[i]>max){
//                 max=arr[i];
//             }
            
//             else if(arr[i]<min){
//                 min=arr[i];
//             }
//          }
         
         
    
//     int spin=max-min;
//     System.out.println( " spin of array is");
//     System.out.println(spin + " ");
    
// }
}
}

