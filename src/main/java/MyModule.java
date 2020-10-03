import com.google.inject.AbstractModule;
import implementations.ConsoleLogger;
import implementations.FileLogger;
import implementations.UniversalLogger;
import interfaces.Logger;

public class MyModule extends AbstractModule {

    private String tag;

    public MyModule(String tag){
        this.tag = tag;
    }

    @Override
    protected void configure() {
//        bind(Logger.class).toInstance(new ConsoleLogger(this.tag));
        //bind(Logger.class).toInstance(new FileLogger(this.tag));
        bind(Logger.class).toInstance(new UniversalLogger(this.tag));
    }
}
