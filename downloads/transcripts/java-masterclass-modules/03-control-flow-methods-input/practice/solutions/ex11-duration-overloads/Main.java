public class Main {
    static String formatDuration(int totalSeconds) {
        if (totalSeconds < 0) return "Invalid value";
        return formatDuration(totalSeconds / 60, totalSeconds % 60);
    }

    static String formatDuration(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid value";
        return minutes + "m " + seconds + "s";
    }

    public static void main(String[] args) {
        System.out.println(formatDuration(61));
    }
}

