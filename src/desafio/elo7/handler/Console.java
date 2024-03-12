package desafio.elo7.handler;

import java.io.*;

public class Console {

    private InputStream console;
    private Reader reader;
    private BufferedReader buffer;

    public String openConsole() throws IOException {
        console = System.in;
        reader = new InputStreamReader(console);
        buffer = new BufferedReader(reader);
        return buffer.readLine();
    }

    public void turnOff() throws IOException {
        buffer.close();
        reader.close();
        console.close();
    }
}
