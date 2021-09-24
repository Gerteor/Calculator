package exception;

public class PatternArgumentException extends IllegalArgumentException {
    public PatternArgumentException(String parseInt ) {
        super(String.format("field: %s value: %s", parseInt, " non correct"));
    }
    }
