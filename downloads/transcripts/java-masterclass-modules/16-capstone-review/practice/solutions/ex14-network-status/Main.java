public class Main {
    static String classify(int status) {
        if (status >= 200 && status < 300) return "success";
        if (status == 408 || status == 429 || status >= 500 && status <= 599) return "retryable";
        if (status >= 400 && status <= 499) return "client-error";
        return "unknown";
    }
}
