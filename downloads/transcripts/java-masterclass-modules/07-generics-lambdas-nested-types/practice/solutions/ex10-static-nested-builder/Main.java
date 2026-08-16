import java.util.*;

public class Main {
    public static final class Config {
        private final String host;
        private final int port;
        private final int timeoutMs;

        private Config(Builder b) {
            host = b.host;
            port = b.port;
            timeoutMs = b.timeoutMs;
        }

        public String host() { return host; }
        public int port() { return port; }
        public int timeoutMs() { return timeoutMs; }

        public static final class Builder {
            private String host;
            private int port = 443;
            private int timeoutMs = 1000;

            public Builder host(String value) { host = Objects.requireNonNull(value); return this; }
            public Builder port(int value) { port = value; return this; }
            public Builder timeoutMs(int value) { timeoutMs = value; return this; }

            public Config build() {
                if (host.isBlank()) throw new IllegalArgumentException("blank host");
                if (port < 1 || port > 65535) throw new IllegalArgumentException("port");
                if (timeoutMs <= 0) throw new IllegalArgumentException("timeout");
                return new Config(this);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Config.Builder().host("api.example").build().port());
    }
}

