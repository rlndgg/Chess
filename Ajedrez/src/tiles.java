public class tiles {
    private int row;
    private int column;
    private chessPiece piece;

    public tiles (int row, int column, chessPiece piece){
        this.row = row;
        this.column = column;
        this.piece = piece;
    }
    public tiles (int row, int column){
        this.row = row;
        this.column = column;
    }

    public void setPiece (chessPiece piece) {
        this.piece = piece;
    }
    public chessPiece getPiece(){
        return this.piece;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
