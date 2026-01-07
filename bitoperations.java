public class bitoperations {

    public static int get_ith_bit(int num,int i){
        int bitmask = 1<<i;
        if((num & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    };

    public static int set_ith_bit(int num,int i){
        int bitmask = 1 << i;
        return num | bitmask;
    };

    public static int clear_ith_bit(int num,int i){
        int bitmask = (~1)<<i;
        return num & bitmask;
    }

    public static int update_ith_bit(int num,int i,int newbit){
        if(newbit == 0){
            clear_ith_bit(num, i);
        }
        else{
            set_ith_bit(num, i);
        }
    }

    public static int clear_last_ibits(int num,int i){
        int bitmask = (~0)<<i;
        return num & bitmask;
    }

    public static int clear_range_of_bits(int num,int i,int j){
        int bitmask1 = (~0)<<(j+1);
        int bitmask2 = (1<<i)-1;

        int result = bitmask1|bitmask2;

        return result;
    }

    public static boolean isPowerofTwo(int n){
        return (n & (n-1)) == 0;
    }
    
    public static int count(int n){
        int count = 0;
        while( n > 0 ){
            if((n & 1) != 0){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int calc_Exp(int num,int pow){
        int result = 1;
        while(num > 0){
            if((num & 1) != 0){
                result = result * num;
            }
            num = num * num;
        }

        return result;
    }

    

    public static void main(String[] args) {
        System.out.println(get_ith_bit(5, 3));
    }
}
