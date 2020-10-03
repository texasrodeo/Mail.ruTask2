import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(@NotNull String[] args) {
        final Injector injector = Guice.createInjector(new MyModule(args[0]));
        injector.getInstance(Application.class).waitForInput();
    }
}


