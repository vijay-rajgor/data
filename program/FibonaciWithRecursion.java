package vijay.program;

public class FibonaciWithRecursion {


    private static int fibonaci(int position){
        if(position == 1 || position == 2)
            return 1;
        else
            return fibonaci(position - 1) + fibonaci(position - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonaci(7));
    }
}
