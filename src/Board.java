public interface Board {
    Result makeMove(Move move);

    Position getPosition();

    boolean moveIsValid(Move move);
}
