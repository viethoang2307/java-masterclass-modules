import java.util.HashMap;
import java.util.Map;

public class Main {
    private record Customer(long id, String email) {}
    private interface Repository { void save(Customer c); Customer find(long id); }
    private static final class FakeRepository implements Repository {
        private final Map<Long, Customer> data = new HashMap<>();
        public void save(Customer c) { data.put(c.id(), c); }
        public Customer find(long id) { return data.get(id); }
    }
    public static String roundTrip() {
        Repository repository = new FakeRepository();
        repository.save(new Customer(7, "a@example.com"));
        return repository.find(7).id() + ":" + repository.find(7).email();
    }
}
