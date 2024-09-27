public class fibonacci {
    public static long[] cache;
    private static long returnFib(int number){
        
       
        
        
        if (number<=1){
            return number;
        }

        if (cache[number] !=0 ){
            return cache[number];

        }
        long nthFibNumber = (returnFib(number-1) + returnFib(number-2));
        cache[number] = nthFibNumber;
        return nthFibNumber;
        
    }
public static void main(String[] args) { 
    int number=100;

    cache = new long [number+1];
    for (int i = 0; i <= number ;i++){
        System.out.println(returnFib(i));
    }  
}
}
    

