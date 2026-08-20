import java.nio.ByteBuffer; import java.nio.charset.StandardCharsets;
public class Main { public static byte[] encode(String payload) { byte[] b=payload.getBytes(StandardCharsets.UTF_8); if(b.length>1024) throw new IllegalArgumentException(); return ByteBuffer.allocate(4+b.length).putInt(b.length).put(b).array(); } }
