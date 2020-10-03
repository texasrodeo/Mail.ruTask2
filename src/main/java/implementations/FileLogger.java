package implementations;

import interfaces.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private static final String defaultPath = "mylog.txt";

    private Long currentNumber;

    private @NotNull
    final String openTag;

    private @NotNull
    final String closeTag;

    private FileWriter writer;

    public FileLogger(String tag){
        this.currentNumber = 0L;
        this.openTag = "<"+tag+">";
        this.closeTag = "</"+tag+">";
    }

    @Override
    public void log(String message) {
        this.currentNumber++;
        try(FileWriter writer = new FileWriter(defaultPath, true))
        {
            writer.write("Id: " + currentNumber + " - " + openTag + message + closeTag + "\n");
            writer.flush();
        }
        catch(IOException ex){

        }
    }
}
