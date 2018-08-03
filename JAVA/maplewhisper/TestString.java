import java.io.*;

public class TestString
{
    public static void main(String args[]) throws IOException {
        String c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("dfsafdas");
        do {
          c = (String) br.read();
          System.out.println(c);
        } while (c != "q");
    }
}
