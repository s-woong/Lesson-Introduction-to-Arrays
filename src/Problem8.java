public class Problem8 extends ConsoleProgram {
    @Override
    public void run() {
        int namesSize = readInt("How many names? ");
        String[] arrNames = new String[namesSize];

        for (int i = 0; i < arrNames.length - 1; i++) {
            arrNames[i] = readLine("Enter name #: " + (i + 1) + ": ");
            // (i + 1) just prints out which number it is. making index i, you can put in each name in diff indexes.
            
            int last = arrNames.length - 1;
            int middle = arrNames.length / 2;

            System.out.println(arrNames[2]);
            System.out.println(arrNames[0]);
            System.out.println(arrNames[last]);
            System.out.println(arrNames[1]);
            System.out.println(arrNames[middle]);
        }

    }
}
