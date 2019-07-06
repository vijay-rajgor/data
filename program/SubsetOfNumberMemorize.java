package vijay.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SubsetOfNumberMemorize {

   static Map<ForDataEquality,Integer> storedData = new HashMap<>();


    private static int subsetMemorize(int[] array, int total, int index){
        int result ;

        if(storedData.get(new ForDataEquality(total,index)) != null)
            return storedData.get(new ForDataEquality(total,index));
        if(total == 0)
            return 1;
        else if (total < 0 )
            return 0;
        else if (index < 0)
            return 0;
        else if (array[index] > total)
            return subsetMemorize(array,total,index-1);
        else
            result = subsetMemorize(array,total-array[index], index-1) + subsetMemorize(array, total, index-1);

        storedData.put(new ForDataEquality(total,index),result);
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int findSubsetOfNumber = 10;
        System.out.println(subsetMemorize(array, findSubsetOfNumber, array.length-1));

        System.out.println(storedData.size());
    }
}

class ForDataEquality{

    int total;
    int index;

    ForDataEquality(){

    }
    ForDataEquality(int total, int index){
        this.total = total;
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForDataEquality)) return false;
        ForDataEquality that = (ForDataEquality) o;
        return total == that.total &&
                index == that.index;
    }

    @Override
    public int hashCode() {

        return Objects.hash(total, index);
    }
}