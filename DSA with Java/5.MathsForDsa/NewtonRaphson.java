package MathsForDsa;

public class NewtonRaphson {
    public static void main(String[] args) {
        System.out.println(newtonRaphson(40));
    }
    static double newtonRaphson(double n){
        double x = n;
        double root = 0.5 * (x + (n/x));
        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root-x) < 1){
                break;
            }
            x=root;
        }
        return root;
    }
}
