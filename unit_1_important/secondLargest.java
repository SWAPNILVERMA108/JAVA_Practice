public class secondLargest {
    public static void main(String[] args) {
        int arr[]={10,5,9,12,30,4};
        int temp ,i,j;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second largest No is : "+arr[arr.length-2]);
        
    }
    
}
