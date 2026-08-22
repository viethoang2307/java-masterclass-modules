public class Main {
    static String automaticModuleName(String jarFile) {
        if (jarFile == null || !jarFile.endsWith(".jar")) return "";
        String base = jarFile.substring(0, jarFile.length() - 4);
        base = base.replaceFirst("-(?:\\d+)(?:\\.\\d+)*(?:[-+][A-Za-z0-9.-]+)?$", "");
        base = base.replaceAll("[^A-Za-z0-9]+", ".").replaceAll("^\\.+|\\.+$", "");
        return base.toLowerCase();
    }
}
