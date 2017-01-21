package pbd.lesson8;

/**
 *
 * @author Paul Peterson
 */
public class GivingAnArrayABunchOfValuesAtOnce {

    public static void main(String[] args) {
        String[] arr1 = {"alpha", "bravo", "charlie", "delta", "echo"};
        int[] arr2 = {3, 53, 73, 12, 43};

        System.out.print("The first array is filled with the following values:\n\t");
        for (String arr11 : arr1) {
            System.out.print(arr11 + " ");
        }
        System.out.println();

        System.out.print("The first array is filled with the following values:\n\t");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }
}
