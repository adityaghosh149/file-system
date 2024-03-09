public class CommandResult {
    public boolean exists;
    public String command;
    public String task;
    
    public CommandResult(boolean exists, String command, String task) {
        this.exists = exists;
        this.command = command;
        this.task = task;
    }
}
