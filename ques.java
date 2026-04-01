

public class ques {
    static void swap(int arr[],int low,int mid){
        
           int temp=low;
            low=mid;
            mid=temp;
        
        
        

    }
    public static void main(String[] args){
        int arr[]={1,0,2,0,1};
        int low=0;
        int mid=0;
        int h=arr.length-1;

        while(mid<=h){
            if(arr[mid]==0){
                swap(arr,low,mid);
            }
            else if(arr[mid]==1){
                mid++;
            }
            else
            {
                swap(arr,mid,h);
                h--;
            }
        }
    }
}
