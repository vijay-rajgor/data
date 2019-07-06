package vijay.program;

public class SubsetOfNumberRecursion {

    private static int subsetRec(int[] array, int total, int index){

        if(total == 0)
            return 1;
        else if (total < 0 )
            return 0;
        else if (index < 0)
            return 0;
        else if (array[index] > total)
            return subsetRec(array,total,index-1);
        else
            return subsetRec(array,total-array[index], index-1) + subsetRec(array, total, index-1);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int findSubsetOfNumber = 10;
        System.out.println(subsetRec(array, findSubsetOfNumber, array.length-1));
    }
}
