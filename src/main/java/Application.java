import interfaces.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.inject.Inject;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Application {
    @Inject
    private @NotNull Logger logger;

    @Inject
    public Application(@NotNull Logger logger) {
        this.logger = logger;
    }

    public void waitForInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            while (true) {
                this.logger.log(scanner.nextLine());
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            this.logger.log("An error occured:" + e.getMessage());
        }
    }
}
