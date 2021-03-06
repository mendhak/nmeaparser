package oceanebelle.parser.engine;

public interface ErrorHandler {
    /**
     * Do what you may with this error.
     * @param error parse exception
     */
    public void handle(ParseException error);
}
