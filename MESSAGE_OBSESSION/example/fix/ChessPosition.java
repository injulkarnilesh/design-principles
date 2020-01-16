package MESSAGE_OBSESSION.example.fix;

public class ChessPosition {

    private final int row;
    private final int column;

    private ChessPosition(final int row, final int column) {
        this.row = row;
        this.column = column;
    }

    public static ChessPosition at(final int row, final int column) {
        return new ChessPosition(row, column);
    }

    public ChessPosition move(Direction direction) {
        return ChessPosition.at(row + direction.getDeltaRow(), column + direction.getDeltaColumn());
    }

    public boolean canMove(Direction direction) {
        return isValid(row + direction.getDeltaRow(), column + direction.getDeltaColumn());
    }

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }

    private boolean isValid(final int row, final int column) {
        return 0 <= row && row <= 7 && 0 <= column && column <= 7;
    }
}
