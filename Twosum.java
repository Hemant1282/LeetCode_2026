class TwoSum {
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};

        
    }

    public static void main(String[] args) {
        Student s
    }
}

class Student{
    String name;
    int age;

    String get_name(){
        return this.name;
    }

    int get_age(){
        return this.age;
    }

    void set_name(String newname){
        name = newname;
    }

    void set_age(int newage){
        age = newage;
    }

}
