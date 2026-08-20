public class Main { public static int checksum(byte[] d) { int s=0; for(byte b:d) s=(s+(b&255))&255; return s; } }
