import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        int temp;
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++){ //-i because we already know that the last is sorted
                if (array[j] > array[j+1]){ // Compare adjacent elements and swap if necessary
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {
        String temp;
        for(int i = 0; i < array.length; i++){ // Outer loop for passes
            for (int j = 0; j < array.length - i - 1; j++){ // Compare adjacent strings and swap if necessary
                if(array[j].compareToIgnoreCase(array[j+1]) > 0){ // Compare strings ignoring case - Ensure lexicographical order
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }

    public static int[] selectionSort(int[] array) {
        for(int j = 0; j < array.length; j++) {
            int min = Integer.MAX_VALUE; // or you can use int min = array[0]
            int location = -1;
            int temp;
            for (int i = j; i < array.length; i++) { //automatically excluding sorted values
                if (array[i] < min) {
                    min = array[i];
                    location = i;
                }
            }
            temp = array[j];
            array[j] = array[location];
            array[location] = temp;
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {
        for(int j = 0; j < array.length; j++) {
            String min = array[j];
            int location = j;
            String temp;
            for (int i = j; i < array.length; i++) { //automatically excluding sorted values
                if (array[i].compareToIgnoreCase(min) < 0){
                    min = array[i];
                    location = i;
                }
            }
            temp = array[j];
            array[j] = array[location];
            array[location] = temp;
        }
        return array;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) { // Outer loop for passes
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareToIgnoreCase(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) { // Swap if index of minimum string is not the current index
                String temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
        return list;
    }

}
