import java.util.*;
public class arrayerverse 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={7 , 9 , 10 , 11 , 13};
        int l=arr.length;
        int n=Math.floorDiv(l, 02);
        int temp;
        for(int i=0;i<n;i++)
        {
             temp=arr[i];
             arr[i]=arr[l-i-1];
             arr[l-i-1]=temp;
               
        }
        for (int element:arr)
        {
            System.out.print(element);
        }
        
    }
}
