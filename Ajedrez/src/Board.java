public class Board {

    public Board (){

    }

    //initialize tiles
    public static void initializeTiles (){
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                new tiles(i, j);

            }

        }
    }
}
