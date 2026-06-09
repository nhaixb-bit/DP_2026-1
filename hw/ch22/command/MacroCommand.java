package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 실행된 명령들을 저장
    private Deque<Command> commands = new ArrayDeque<>();

    // undo 된 명령들을 임시 저장
    private Deque<Command> commandsForRedo = new ArrayDeque<>();

    @Override
    public void execute() {
        Iterator<Command> it = commands.descendingIterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
        commandsForRedo.clear();
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command cmd = commands.pop();
            commandsForRedo.push(cmd);
        }
    }

    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            Command cmd = commandsForRedo.pop();
            commands.push(cmd);
        }
    }

    public void clear() {
        commands.clear();
        commandsForRedo.clear();
    }
}
