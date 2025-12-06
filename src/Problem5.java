public class Problem5 extends ConsoleProgram {
    @Override
    public void run() {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("Before Swap: "); 
        for (int i = 0; i < values.length - 1; i++) {
            System.out.print(values[i] + " ");
        }

        int swap = values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = swap;

        System.out.println("After Swap: "); 
        for (int i = 0; i < values.length - 1; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
