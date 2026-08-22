public class Main {
    static String runCommand(String modulePath, String moduleName, String mainClass) {
        if (modulePath == null || modulePath.isBlank() || moduleName == null || moduleName.isBlank() || mainClass == null || mainClass.isBlank()) throw new IllegalArgumentException();
        return "java --module-path \"" + modulePath + "\" -m " + moduleName + "/" + mainClass;
    }
}
