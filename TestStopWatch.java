public class TestStopWatch {
    //sort selection
    public static void sortASC(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    //display list
    public static void showListNumber(int[] listNumber) {
        for (int i = 0; i < listNumber.length; i++) {
            System.out.print(listNumber[i] + " ");
        }
    }

    public static void main(String[] args) {
        //creat arr list
        int listNumber[] = new int[100000];

        //Random 0 - 100000
        for (int i = 0; i < 100000; i++) {
            listNumber[i] = (int) Math.round(Math.random() * 100000);
        }

        //sort and display
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        System.out.println("Started");

        sortASC(listNumber);
        showListNumber(listNumber);

        System.out.println("Stopped");

        stopwatch.stop();

        double totalTime = (double) stopwatch.getElapsedTime() / 1000;
        System.out.println("Total time is: " + totalTime + " seconds ");


    }
}
