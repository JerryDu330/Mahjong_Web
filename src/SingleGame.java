public class SingleGame {
    private final MahjongDeck deck = new MahjongDeck();
    MJHand[] mjHands = new MJHand[4];

    public void startGame(){

        System.out.println(deck);

        for(int i = 0; i < 4 ;i++){
            MahjongTile[] initTiles = new MahjongTile[13];
            for (int j = 0;j < 13;j++){
                initTiles[j] = deck.drawTile();
            }

            mjHands[i] = new MJHand(initTiles);
        }

        for (int i = 0 ; i< 4;i++){
            System.out.println(mjHands[i]);
        }
    }
}
