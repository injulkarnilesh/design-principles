package CODE_SMELLS.MESSAGE_OBSESSION.example.violation;

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

    /*
    List of methods to move in specific direction and check if it can move in specific direction
    Method names are move[Direction] and canMove[Direction]
    Only difference in methods is direction
    Can direction be parameter?
    Direction can be represented as change in row or/and column
     */
    public ChessPosition moveForward() {
        return ChessPosition.at(row-1, column);
    }

    public boolean canMoveForward() {
        return row > 0;
    }

    public ChessPosition moveBackward() {
        return ChessPosition.at(row + 1, column);
    }

    public boolean canMoveBackward() {
        return row < 7;
    }

    public ChessPosition moveLeft() {
        return ChessPosition.at(row, column-1);
    }

    public boolean canMoveLeft() {
        return column > 0;
    }

    public ChessPosition moveRight() {
        return ChessPosition.at(row, column + 1);
    }

    public boolean canMoveRight() {
        return column < 7;
    }

    /*
    And So on to move diagonally
     */

}
