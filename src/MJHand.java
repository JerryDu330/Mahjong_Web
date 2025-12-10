import java.util.Arrays;
import java.util.Collections;

public class MJHand {

    MahjongTile[] mjHand = new MahjongTile[13];

    public MJHand(MahjongTile[] mjHand){
        this.mjHand = mjHand;
    }


    @Override
    public String toString(){
        Arrays.sort(mjHand);
        StringBuilder sb = new StringBuilder();
        for(MahjongTile tile : mjHand){
            sb.append(tile.toString()).append(" ");
        }
        return sb.toString().trim();
    }

}
