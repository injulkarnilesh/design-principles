package MESSAGE_OBSESSION.example.fix;

public class Direction {
    private final int deltaRow;
    private final int deltaColumn;

    private Direction(final int deltaRow, final int deltaColumn) {
        this.deltaRow = deltaRow;
        this.deltaColumn = deltaColumn;
    }

    public static Direction withDelta(final int deltaX, final int deltaY) {
        return new Direction(deltaX, deltaY);
    }

    public int getDeltaRow() {
        return deltaRow;
    }

    public int getDeltaColumn() {
        return deltaColumn;
    }
}
