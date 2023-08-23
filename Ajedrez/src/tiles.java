public class tiles {
    private int row;
    private int column;
    private chessPiece piece;

    tiles (int row, int column){
        this.row = row;
        this.column = column;
    }
    private void setPiece (chessPiece piece) {
        this.piece = piece;
    }
    private chessPiece getPiece(){
        return this.piece;
    }




}
