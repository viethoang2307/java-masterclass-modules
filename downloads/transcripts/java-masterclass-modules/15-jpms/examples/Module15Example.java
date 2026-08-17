public class Module15Example {
    public static String moduleName() {
        Module module = Module15Example.class.getModule();
        return module.getName() == null ? "unnamed-module" : module.getName();
    }
    public static void main(String[] args) {
        System.out.println(moduleName());
    }
}