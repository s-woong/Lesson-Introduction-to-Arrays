public class Problem9 extends ConsoleProgram {
    @Override
    public void run() {
        int[] values = {12, 5, 9, 20, 7};
        int[] differenceValues = new int[values.length - 1];
        for (int i = 0; i < differenceValues.length - 1; i++) {
            differenceValues[i] = Math.abs(values[i] - values [i + 1]);
            // get absolute value -- no negatives bc we just need to know diffs
        }

        System.out.print("Original: ");
        for (int i = 0; i < values.length - 1; i++) {
            System.out.print(values[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Diffs: ");
        for (int i = 0; i < differenceValues.length - 1; i++) {
            System.out.print(differenceValues[i] + " ");
        }

    }
}
