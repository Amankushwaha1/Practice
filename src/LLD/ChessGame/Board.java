package LLD.ChessGame;

public class Board {

    int DEFAULT = 8;
    Piece[][] state ;
    public void Board(){
        state = new Piece[DEFAULT][DEFAULT];
    }
    private boolean inrange(int x,int y){
        if(x<0 || y<0 || x>DEFAULT || y>DEFAULT) return false;
        return true;
    }
    public boolean moves(Piece piece,int x,int y){
        if(piece == null){
            String tempColor = state[x][y].getColor();
            if(inrange(x,y) && !piece.getColor().equals(tempColor) && piece.move()){
                return true;
            };
        }
        return false;
    };
}
