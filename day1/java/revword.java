class Revword{
    public static void main(String[] args){
        String str = "Hello World";
        String[] words = str.split(" ");
        String rev = "";
        for(int i = words.length-1; i >=0; i--){
            rev = rev + words[i]+" ";
        }
        System.out.println(rev);
    }
}