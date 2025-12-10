import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MahjongDeck {
    ArrayList<MahjongTile> tiles = new ArrayList<>();

    public MahjongDeck(){
        insertAll();
        shuffle();
    }

    public void insertAll() {
        for (MahjongTile.TileKind tileKind : List.of(MahjongTile.TileKind.MAN,
                MahjongTile.TileKind.PIN,
                MahjongTile.TileKind.SOU)) {
            for (int num = 1; num <= 9; num++) {
                for (int i = 1; i <= 4; i++) {
                    tiles.add(new MahjongTile(tileKind, num));
                }
            }
        }
        for (int num = 1; num <= 4; num++) {
            for (int i = 1; i <= 4; i++) {
                tiles.add(new MahjongTile(MahjongTile.TileKind.WIND, num));
            }
        }
        for (int num = 1; num <= 3; num++) {
            for (int i = 1; i <= 4; i++) {
                tiles.add(new MahjongTile(MahjongTile.TileKind.DRAGON, num));
            }
        }
    }

    private void shuffle(){
        Collections.shuffle(tiles);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        int acc = 0;
        for(MahjongTile tile : tiles){
            sb.append(tile.toString()).append(" ");
            acc++;
            if(acc % 10 ==0){
                sb.append("\n");
            }
        }

        return sb.toString().trim();
    }
}
