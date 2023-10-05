import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        int[] listOfNumbers = {9,4,8,2,5,7,3,6,1};

        System.out.println("Your original list is: " + Arrays.toString(listOfNumbers));
        System.out.println("Your ordered list of numbers is: " + SortBySelection(listOfNumbers));
    }

    private static int findSmallerElement(int[] array){
        int smaller = array[0];
        int smaller_index = 0;
        for(int i=1; i<array.length; i++){
            if(array[i] < smaller){
                smaller = array[i];
                smaller_index = i;
            }
        }
        return smaller_index; 
    }

    private static int[] removeElementOfArray(int[] array, int index){
        int[] newArray = new int[array.length - 1];
        for(int i=0, k=0; i<array.length; i++){
            if(array[i] != array[index]){
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    public static List<Integer> SortBySelection(int[] array){
        List<Integer> newArray = new ArrayList<Integer>();

        while(array.length > 0){
            int smaller_index = findSmallerElement(array);
            newArray.add(array[smaller_index]);
            array = removeElementOfArray(array, smaller_index);
        }
        return newArray;
    }
}