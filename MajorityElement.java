public class MajorityElement{


    public static int Majorityel(int arr[]){
        int candidate = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                candidate = arr[i];
                count += 1;
            }
            else if(candidate == arr[i]){
                count +=1;
            }
            else{
                count -= 1;
            }
        }
        return candidate;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int ans = Majorityel(arr);
        System.out.println(ans);
    }
}