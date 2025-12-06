public class Problem4 extends ConsoleProgram {
    @Override
    public void run() {
        int[] nums = {4, 8, 15, 16, 23, 42};
        nums[2] = 10;
        for(int i = 1; i < nums.length - 1; i++) {
            System.out.println(nums[i]);
        }
    }
}
