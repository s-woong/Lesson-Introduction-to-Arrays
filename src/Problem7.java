public class Problem7 extends ConsoleProgram {
    @Override
    public void run() {
        double[] data = {1.5, 3.2, 4.8, 7.6, 9.1};
        System.out.println("First element: " + data[0]);
        System.out.println("First element: " + data[data.length - 1]);
        System.out.println("Middle element: " + data[data.length / 2]);
        System.out.println("Additional element: " + data[data.length - 3]);

    }
}
