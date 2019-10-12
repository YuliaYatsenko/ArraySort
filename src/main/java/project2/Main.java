package project2;
import project2.sortingArray.Array;
public class Main {
    public static void main(String args[]) {
        run();
    }
    public static void run() {
        int massiv[] = {45, 28, -10, 100, 0, 22};
        System.out.print("Unsorted array: ");
        for (int i = 0; i <= massiv.length - 1; i++) {
            System.out.print(massiv[i] + "  ");
            }
            System.out.println();
        Array MyArray = new Array(massiv);
        MyArray.sortElement(massiv);
    }
}
