public class Trapping_rainwater_leet6{

    public static int trapping_rainwater(int arr[]){
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        int sum = 0;
        //leftmax array
        leftmax[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
        }
        
        //Rightmax array
        rightmax[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1], arr[i]);
        }

        for(int i = 0;i<arr.length;i++){
            int min = Math.min(leftmax[i],rightmax[i]);
            int bar_height = arr[i];
            int water_height = min - bar_height;
            if(water_height >= 0){
                sum += water_height;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int heights[] = {4,2,0,6,3,2,5};
        int sum = trapping_rainwater(heights);
        System.out.println(sum);
    }
}
