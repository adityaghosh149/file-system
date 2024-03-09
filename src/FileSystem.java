import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class FileSystem {
    private static Directory root = null; 

    private static final String[] commands = {
        "goto", "del", "move", "copy", "paste", "rename", "newfile", "newdir",
        "clear", "exit", "list", "dirlist", "filelist"
    };

    private static CommandResult commandExists(String input) {
        int index = 0;
        while (index < input.length()) {
            if(input.charAt(index) == ' ')
                break;
            index++;
        }
        
        String command = input.substring(0, index);
        boolean exists = Arrays.asList(commands).contains(command);
        String task = input.substring(index);

        return new CommandResult(exists, command, task);
    }

    private static void newdir(String dirName, String path) {
        // multiple path
        // nonexistent path with folder name
        // multiple nonexistent path with folder name
    }


    public static void main(String[] args) {
        root = new Directory("root", null);

        Scanner scanner = new Scanner(System.in);

        while (true) {    
            System.out.print("> ");
            String input = scanner.nextLine();

            CommandResult commandResult = commandExists(input);

            if(!commandResult.exists)
                System.out.println("Command not found : " + commandResult.command);

            if(Objects.equals(commandResult.command, "exit"))
                break;
        }
        scanner.close();
    }
}

