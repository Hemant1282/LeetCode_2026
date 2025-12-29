public class powxton_leet13 {

    //drawback:-- Time limit exceeded for large value of n
    public static double pow_x_to_n(double x, int n ){
        if(n >= 0){
            double result = 1;
            for(int i = 1; i<= n;i++){
                result = result * x;
            }

            return result;
        }
        else{
            double result = 1;
            for(int i = -1;i>=n;i--){
                result = result * x;
            }
            if(result == 1/x){
                return 1/x;
            }
            else{
                return 1/result;
            }
            
        }
    }

    public static double myPow(double x,long n){
        // base case
        if (n == 0) return 1;

        // handle negative power
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double half = myPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static double myPow2(double x,int n){
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1;
            
        }
        
        return pow;
    };
    public static void main(String args[]){
        System.out.println("done");
    }
}
