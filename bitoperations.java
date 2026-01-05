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
        int bitmask2 = ((~0)|1)<<;
    }
    public static void main(String[] args) {
        System.out.println(get_ith_bit(5, 3));
    }
}
