public class Problem10 extends ConsoleProgram {
    @Override
    public void run() {
        String[] players = {"Ana", "Ben", "Ming", "Hermione"};
        int[] scores = {14, 22, 18, 31};

        // we don't asssume how many spaces: find longest name
        int maxLen = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].length() > maxLen) {
                maxLen = players[i].length();
            }
        }

        for (int i = 0; i < players.length; i++){
            //print name first
            System.out.print(players[i]);

            //add padding
            int padding = (maxLen - players[i].length());
            for (int p = 0; p < padding; p++) {
                System.out.print(" ");
            }

            //then print score separately
            System.out.print(": " + scores[i]);

        }
    }
}
