package LLD.ChessGame;

public class Pawn implements Piece {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color;

    @Override
    public boolean move() {
            return false;
    }
}
