package Strings;
class Occurrence1{
    public static void main(String[] args) {
        occurrence1("abbcad", 0);
        System.out.println(x);

    }
    static StringBuilder x = new StringBuilder();
    static void occurrence1(String s, int i){
        if(s.length()==i){
            return ;
        }
        
        if(s.charAt(i)!='a'){
            x.append(s.charAt(i));
        }
        occurrence1(s, i+1);
        // return x;
    }
}