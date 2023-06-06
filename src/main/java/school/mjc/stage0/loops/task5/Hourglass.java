package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int counter = height;
         // Upper half of the hourglass
         for (int i = 0; i < height / 2; i++) {
            printLine(i, counter);
            counter -=2;
        }

        // Lower half of the hourglass
        for (int i = height / 2; i >= 0; i--) {
            printLine(i, counter);
            counter +=2;
        }
    }

    private static void printLine(int spaces, int eights) {
        if (eights == 0) {
            return;
        }
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < eights; i++) {
            System.out.print("8");
        }

        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }

        System.out.println("");
    }
}
