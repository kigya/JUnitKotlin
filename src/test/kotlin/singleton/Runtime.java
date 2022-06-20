package singleton;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Runtime {
    private static int myProperty = 3;
    public static final Runtime INSTANCE;

    private Runtime() {
    }

    public final int getMyProperty() {
        return myProperty;
    }

    @NotNull
    @Contract(pure = true)
    public final String myFunction() {
        return "Hello";
    }


    static {
        Runtime var0 = new Runtime();
        INSTANCE = var0;
        myProperty = 3;
    }
}
