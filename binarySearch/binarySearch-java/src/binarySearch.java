public class binarySearch {
    public static void main(String[] args) throws Exception {
        int[] listOfNumbers = {10,20,30,40,50,60,70,80,90,100};
        int item = 30;

        Object binarySearchResults = functionBinarySearch(listOfNumbers, item);
        
        System.out.println("Binary Search");
        System.out.println("index: " + binarySearchResults);

        Object linearSearchResults = functionLinearSearch(listOfNumbers, item);

        System.out.println("Linear Search");
        System.out.println("index: " + linearSearchResults);

    }

    public static Object functionBinarySearch(int[] array, int item){
        int low  = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = (int) (low+ high)/2;
            int kick = array[middle];

            if(kick == item){
                return middle;
            }else if(kick > item){
                high = middle - 1;
            }else{
                low = middle + 1;
            }
        }
        return null;
    }

    public static Object functionLinearSearch(int[] array, int item){
        for(int i=0; i<array.length; i++){
            int elementOfArray = array[i];
            if(elementOfArray == item){
                return i;
            }
        }
        return null;
    }
}

/*
 * o algoritmo ira procurar o elemento na list e se o elemento for encontrado ira retornar
 * seu index, se o valor não for encontrado, a função ira retornar null.
 * se você não entende o funcionamento do algoritmo de busca binária, recomento que você lei 
 * meu post lá no TabNews, link: 
*/
