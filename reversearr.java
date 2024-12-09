public class reversearr {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        for( int ele:arr){
            System.out.print(ele+" ");
        }
        int n =arr.length;
        System.out.println();
        for ( int i = 0 ;i<n/2;i++){
            int j=n-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
        for (int ele : arr) {
            System.out.print(ele+" ");
        }

    }    
}
