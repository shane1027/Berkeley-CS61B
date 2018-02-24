public class Race {
    public static double aPos = 0;
    public static double tPos = 100;
    public static double aSpeed = 20;
    public static double tSpeed = 10;
    public static double totalTime = 0;
    public static String a = "Achilles";
    public static String t = "Tortoise";

    public static void start_race() {
        while (aPos < tPos) {
            System.out.println("At time: " + totalTime);
            System.out.println("    " + a + " is at position " + aPos);
            System.out.println("    " + a + " is at position " + tPos);

            double timeToReach = (tPos - aPos) / aSpeed;
            totalTime = totalTime + timeToReach;
            aPos += timeToReach * aSpeed;
            tPos += timeToReach * tSpeed;
        }
    }
}
