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
    }
}

