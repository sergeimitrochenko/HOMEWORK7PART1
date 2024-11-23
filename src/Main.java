public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача №1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (
                int i : weight) {
            if (i < weight.length)
                System.out.print(i + ",");
            else {
                System.out.print(i);
            }
        }
        System.out.println("Задача № 2");
        double[] arr = {1.57, 7.654, 9.986};
        for (
                int i = 0;
                i < arr.length; i++) {
            if (i < arr.length - 1)
                System.out.print(arr[i] + ", ");
            else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("Задача № 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(weight[i] + ", ");
            else {
                System.out.print(weight[i]);
            }
        }

        System.out.println("Задача № 3");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(arr[i] + ", ");
            else {
                System.out.print(arr[i]);
            }
        }
    }
}

