public class Problem6 extends ConsoleProgram {
    @Override
    public void run() {
        String[] names = {"Stephanie","Bernice", "Valerie", "Marcia"};
        String[] names2 = new String[4];

        for(int i = 0; i < names.length - 1; i++) {
            names2[i] = names[i];
        }

        System.out.println("Copied array: ");
        for (int i = 0; i < names2.length - 1; i++) {
            System.out.println(names2[i]);
        }
    }
}
