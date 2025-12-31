//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.


public class sorted_object_leet15{

    public static void sortColors(int nums[]){
        int zero_count = 0;
        int one_count = 0;
        int two_count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                zero_count += 1;
            }
            else if(nums[i] == 1){
                one_count += 1;
            }
            else{
                two_count += 1;
            }
        }
        int j = 0;
        while(zero_count>0){
            nums[j] = 0;
            j++;
            zero_count--;
        };
        while(one_count>0){
            nums[j] = 1;
            j++;
            one_count--;
        };
        while(two_count>0){
            nums[j] = 2;
            j++;
            two_count--;
        };
    };

    //Dutch national flag algorithm 
    public static void sortColors2(int nums[]){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                //swap with low
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }

            //if nums[mid] == 2 swap it with high
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            };
        };
    };


    public static void main(String args[]){
        int nums[] = {2,0,2,1,1,0};
        sortColors2(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}