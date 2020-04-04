import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        int [][] array = new int[3][3];
        inputArray(array);
        int sum = 0;
        for ( int row = 0; row < array.length; row++){
            sum += array[row][row];
        }
        System.out.println("Tổng đường chéo là:" + sum);
    }

    private static void inputArray(int[][] array) {
        Scanner sc = new Scanner(System.in);
        for ( int row = 0; row < array.length; row++){
            for ( int column = 0; column < array[row].length; column++){
                System.out.println("Nhập phần tử ở hàng " + (row + 1) + " cột " + (column + 1));
                array[row][column]= sc.nextInt();
            }
        }
    }


}
