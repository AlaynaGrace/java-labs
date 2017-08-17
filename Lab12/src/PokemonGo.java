/**
 * Created by alayn on 11/29/2016.
 */
public class PokemonGo {
    private String[][] board;
    private int[] position;
    private int pokemon; //Number of pokemon on board

    public PokemonGo(int n, int m){
        board = new String[n][m];
        position = new int[2];
        position[0] = (int) Math.floor(Math.random() * n);
        position[1] = (int) Math.floor(Math.random() * m);

        int p = (int) Math.ceil(Math.random() * Math.min(n,m));
        for(int i = 0; i < p; i++){
            int x = (int) Math.floor(Math.random() * n);
            int y = (int) Math.floor(Math.random() * m);
            board[x][y] = "p";
        }
        pokemon = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j].equals("p")){
                    pokemon++;
                }
            }
        }
    }
    public void move(String direction){
        if(direction.equals("north")){
            if(position[0] != 0){
                position[0] = position[0] - 1;
            }
            else{
                System.out.println("Can't go north");
            }
        }
        if(direction.equals("south")){
            if(position[0] != board.length){
                position[0] = position[0] + 1;
            }
            else{
                System.out.println("Can't go south");
            }
        }
        if(direction.equals("east")){
            if(position[1] != board[0].length){
                position[1] = position[1] + 1;
            }
            else{
                System.out.println("Can't go east");
            }
        }
        if(direction.equals("west")){
            if(position[1] != 0){
                position[1] = position[1] - 1;
            }
            else{
                System.out.println("Can't go west");
            }
        }
    }
}
