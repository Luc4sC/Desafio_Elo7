package desafio.elo7.handler;

import desafio.elo7.classes.Probe;
import desafio.elo7.classes.Terminal;

import java.io.*;

public class Starter {
    private final Console console = new Console();
    private final Terminal terminal = new Terminal();
    private final Probe probe = new Probe();
    private boolean exit = false;

    public void start() throws IOException {
        while(!exit){
            System.out.print("Insert command(s): ");
            String input = console.openConsole().toLowerCase();
            if(!input.equals("exit")){
                char[] commands = input.toUpperCase().toCharArray();
                setCommands(terminal, probe, commands);
            }
            else exit = true;
        }
        console.turnOff();
    }

    public void setCommands(Terminal terminal, Probe probe, char[] commands) throws IOException {
            while(!verifyCommands(commands)){
                System.out.println("The allowed commands are 'L' = Turn Left or 'R' = Turn Right or 'M' = Move " +
                        " (Only 100 commands) \nIf you want to exit, digit: 'exit'");
                commands = console.openConsole().toUpperCase().toCharArray();
            }
            System.out.println(terminal.moveProbe(probe, commands));
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
}
