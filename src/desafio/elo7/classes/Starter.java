package desafio.elo7.classes;

import java.io.*;

public class Starter {
    private InputStream console;
    private Reader reader;
    private BufferedReader buffer;
    public void start() throws IOException {
        Terminal terminal = new Terminal();
        Probe probe = new Probe();
        setCommands(terminal, probe);
    }

    public void setCommands(Terminal terminal, Probe probe) throws IOException {
        boolean exit = false;
        while(!exit){
            System.out.println("Insert commands: ");
            char[] commands = openConsole().toUpperCase().toCharArray();

            while(!verifyCommands(commands)){
                System.out.println("The allowed commands are 'L' = Turn Left or 'R' = Turn Right or 'M' = Move " +
                        "\n(Only 100 commands)");
                commands = openConsole().toUpperCase().toCharArray();
            }
            terminal.moveProbe(probe, commands);
            System.out.println(probe);
            exit = exit();
        }
        turnOff();
    }

    public boolean verifyCommands(char[] commands){
        boolean b = true;
        for(char c : commands){
            if (c != 'M' && c != 'L' && c != 'R') {
                b = false;
                break;
            }
        }
        if(commands.length > 100 || commands.length == 0) b = false;
        return b;
    }

    public boolean exit() throws IOException {
        boolean exit = false;
        System.out.println("Exit? (Y/N)");
        String answer = openConsole();
        if(answer.equals("Y")) exit = true;
        return exit;
    }
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
