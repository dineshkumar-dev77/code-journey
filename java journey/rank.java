public class rank {
    public static void main(String[] args) {
        int[] ranked = {100, 100, 50, 40, 40, 20, 10};
        int[] player = {5, 25, 50, 120};
        int[] result = new int[ranked.length];
        int index =0;
        result[index++] = ranked[0];
        for (int j = 0; j < ranked.length; j++) {
            if(ranked[j] != result[index-1]){
                result[index++] = ranked[j];
            }
        }
        int[] unqiue =new int[player.length];    
        int j = index-1;
            

        for (int i = 0; i < player.length; i++) {
            while (j >= 0 && player[i] >= result[j]) {
                j--;
            }

            unqiue[i] =j+2; 
            System.out.println( unqiue[i]);
        }
    }
}





