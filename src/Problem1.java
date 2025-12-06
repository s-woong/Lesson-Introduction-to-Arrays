public class Problem1 extends ConsoleProgram {
    @Override
    public void run() {
       int[] cans = {0, 1, 2 ,3, 4};
       System.out.println("First " + cans[0]);
       System.out.println("Last" + cans[cans.length - 1]);
    }
}
