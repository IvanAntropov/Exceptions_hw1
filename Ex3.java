//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
//необходимо как-то оповестить пользователя.Важно: При выполнении метода единственное исключение,
//которое пользователь может увидеть - RuntimeException, т.е. ваше.


import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
//        int[] arr1 = new int[]{1,2,3,4,5};
//        int[] arr2 = new int[]{5,4,3,2,1};
        int[] arr1 = inputArr();
        int[] arr2 = inputArr();
        double[] arrResult = arrMerger(arr1,arr2);
        print(arrResult);
    }

    static double[] arrMerger(int[] a, int[] b){
        if(a == null || b == null){
            throw new RuntimeException("One of array is null!");
        }
        else if(a.length != b.length){
            throw new RuntimeException("Arrays dont have same length!");
        }else{
            try {
                double[] arr = new double[a.length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = a[i] / b[i];
                }
                return arr;
            }catch (Exception e){
                throw new RuntimeException("/ ZERO!!!!!");
            }
        }
    }

    static int[] inputArr() {
        Scanner console = new Scanner(System.in);
        int[] arr2;
        try {
            System.out.println("Введите числа в массив через пробел: ");
            String string = console.nextLine();
            String[] arr1 = string.split(" ");
            arr2 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = Integer.parseInt(arr1[i]);
            }
            return arr2;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    static void print(double[] arr){
        if(arr == null){
            System.out.println("Array is null");
        }else{
            for (double v : arr) {
                System.out.printf(v + ", ");
            }
        }
    }

}