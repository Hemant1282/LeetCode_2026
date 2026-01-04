public class stringCompression {

    public static StringBuilder str_compress(String str){
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for(int i = 0;i<str.length();i++){
            sb.append(str.charAt(i));
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(count);
                count = 1;
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        StringBuilder sb = str_compress("AAABBC");
        System.out.println(sb);
    }
}
