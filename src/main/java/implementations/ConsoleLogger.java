package implementations;

import interfaces.Logger;
import org.jetbrains.annotations.NotNull;

public class ConsoleLogger implements Logger {
    private Long currentNumber;

    private @NotNull
    final String openTag;

    private @NotNull
    final String closeTag;

    public ConsoleLogger(String tag){
        this.currentNumber = 0L;
        this.openTag = "<"+tag+">";
        this.closeTag = "</"+tag+">";
    }

    @Override
    public void log(String message) {
        this.currentNumber++;
        System.out.println("Id: " + currentNumber + " - " + openTag + message + closeTag);
    }
}
