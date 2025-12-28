public class sorting{

    public static void Bubblesort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int minpos = i;
            for(int j = i + 1;j<arr.length;j++){
                if(arr[j] < arr[minpos]){
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionsort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr_element = arr[i];
            int prev = i - 1;
            while(prev >= 0 && curr_element < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr_element;
        }
    }

    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        return largest;
    }
    public static void countsort(int arr[]){
        int largest = largest(arr);
        
        int count[] = new int[largest+1];

        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0;i<count.length;i++){
            while(count[i]!=0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {8,7,6,5,4,3,2};
        countsort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}