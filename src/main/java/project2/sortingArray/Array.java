package project2.sortingArray;

public class Array {
    public int array[];

    public Array(int[] array) {
    this.array = array;
    }
    public void sortElement(int[] array) {
        System.out.print("Sorted array: " + " ");
         for (int i = array.length-1; i >= 0; i--) {
             for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
             }
             System.out.print(array[i]+"  ");
        }
    }
}