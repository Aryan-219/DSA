package Strings;

public class SkipAppNotApple{
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bddccappledappf"));    
    }
    
    static String skipAppNotApple(String s){
        if(s.isEmpty()){
            return "" ;
        }
        
        if(s.startsWith("app")){
            if(s.startsWith("apple")){

                // return s.charAt(0) + skipAppNotApple(s.substring(1)); //less optimized // skipping only a character even if "apple" exists in string
                return s.substring(0,5) + skipAppNotApple(s.substring(5)); //more optimized // skipping entire "apple if it exists"
            }else{
                
                return skipAppNotApple(s.substring(3));
            }
        }else{
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
