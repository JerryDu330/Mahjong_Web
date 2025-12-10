public class MahjongTile implements Comparable<MahjongTile>{

    public enum TileKind {
        MAN, PIN, SOU, WIND, DRAGON
    }

    final TileKind tileKind;
    final int num;
    public MahjongTile(TileKind tileKind, int num){
        this.tileKind = tileKind;
        this.num = num;
    }

    public TileKind getTileKind(){
        return tileKind;
    }

    public int getNum(){
        return num;
    }

    @Override
    public int compareTo(MahjongTile other){
        int cmp = this.tileKind.ordinal() - other.tileKind.ordinal();
        if (cmp != 0)   return cmp;
        else return this.num - other.num;
    }


    @Override
    public String toString(){
        return switch(tileKind){
            case MAN -> num + "m";
            case PIN -> num + "p";
            case SOU -> num + "s";
            case WIND ->
                switch (num){
                    case 1 -> "ew";
                    case 2 -> "sw";
                    case 3 -> "ww";
                    case 4 -> "nw";
                    default -> "UNKNOWN";
                };
            case DRAGON ->
                    switch (num){
                        case 1 -> "wd";
                        case 2 -> "gd";
                        case 3 -> "rd";
                        default -> "UNKNOWN";
                    };

        };
    }
}
