 import java.util.*;
 public  class app2 {
    
    
    public static void cat(int target){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        
        int high = array.length-1;
        int low = array[0];
        int mid = array[(low+high)/2];

        for(int i = 0;i<high;i++){
            
        }
    }

    public static int[] reverse(int [] arr){
        int[] array_reversed = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j = arr.length-1;j >= arr.length-i-1;j--)
            array_reversed[i] = arr[j];
        }
        for(int i=0; i < array_reversed.length; i++){
            System.out.println(array_reversed[i]);
        }
        return array_reversed;
    }



    public static int maxRec(int[]arr,int index){
        int temp = 0;
        if(index>1){
            if(arr[index]>arr[index-1]){
                temp = arr[index];
            }
            else{
                temp = arr[index-1];
            }
            maxRec(arr, index-1);


        }
        ;
        return temp;

    }
    
    

        
    public static void main(String[] args) {
      

        int[] array = {19,20,13,44,56,36,97,88,7};
        //cat();
        System.out.println(maxRec(array, array.length-1));
        reverse(array);
        

        
        
       
    }
    
}

