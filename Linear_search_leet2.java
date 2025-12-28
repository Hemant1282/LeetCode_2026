public class Linear_search_leet2 {

    //Linear search 
    public static int Linear_search(int arr[],int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,9,3,4,5,7,8};
        int index = Linear_search(arr, 5);
        System.out.println("The index of key is at "+index);
    }
}
