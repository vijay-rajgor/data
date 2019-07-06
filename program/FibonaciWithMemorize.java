package vijay.program;

public class FibonaciWithMemorize {

    private static int fibonaci(int position,int[] memory){
        int result ;
        if(memory[position] != 0)
            return memory[position];

        if(position == 1 || position == 2)
            return 1;
        else
        {
            result = fibonaci(position - 1, memory) + fibonaci(position - 2, memory);
            //memory[position] = result;
            //return result;
        }
        memory[position] = result;
        return result;
    }

    public static void main(String[] args) {
        int position = 7;
        int[] memory = new int[position+1];
        System.out.println(fibonaci(position, memory));
    }
}
