public class chessPiece {

    private String killed;

    private Boolean white;

    public chessPiece (Boolean color){
        this.white = color;
    }
    public Boolean getWhite() {
        return white;
    }
    public String getKilled() {
        return killed;
    }
    public void setKilled(String killed) {
        this.killed = killed;
    }
    public void setWhite(Boolean white) {
        this.white = white;
    }
}
