public class Binary_search_leet3 {

    public static int Binary_search(int arr[],int key){
        int first = 0;
        int last = arr.length - 1;
        while(first <= last){
            int mid = (first + last )/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                first = mid + 1;
            }
            else{
                last = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        int index = Binary_search(arr,4);
        String result = index >= 0 ? "Found at "+ index : "Not found";
        System.out.println(result);
    }
}
