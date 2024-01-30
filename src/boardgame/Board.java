package boardgame;

public class Board {
    private int rows;
    private int column;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.column = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return column;
    }

    public void setColumns(int columns) {
        this.column = columns;
    }
    public Piece piece(int rows, int column){
return  pieces[rows][column];
    }
    public Piece piece(Position position){
        return  pieces[position.getRow()][position.getColumn()];
    }
}
