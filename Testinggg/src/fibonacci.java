
public class fibonacci {
    public static long[] c;
    private static long returnFib(int number){
        if (number<=1){
            return number;
        }

        if (c[number] !=0 ){
            return c[number];

        }
        long nthFibNumber = (returnFib(number-1) + returnFib(number-2));
        c[number] = nthFibNumber;
        return nthFibNumber;
        
    }
public static void main(String[] args) { 
    int number=100;

    c = new long [number+1];
    for (int i = 0; i <= number ;i++){
        System.out.println(returnFib(i));
    }  
}
}
    

