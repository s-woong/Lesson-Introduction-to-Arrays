public class Problem2 extends ConsoleProgram {
    @Override
    public void run() {
        String[] favouriteSongs = {"Bills", "Yura Yura", "If I say I love you", "seasons", "suprise party"};
        int middle = favouriteSongs.length/2;
        System.out.println(favouriteSongs[middle]); 
    }
}
