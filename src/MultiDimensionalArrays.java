public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] values={3, 4, 5 };
        System.out.println(values[1]);

        int[][] grid={
                {6, 7, 8 },
                {9, 10, 11 },
                {12, 13}

        };
        System.out.println(grid[0][2]);
        System.out.println(grid[2][1]);

        String[][] texts= new String[2][3];
        texts[0][1]="Hello Angus";
        System.out.println(texts[0][1]);

        for(int row=0; row < grid.length; row++){
            for(int col=0; col < grid[row].length; col++){
                System.out.print(grid[row][col]+ "\t");
            }

            System.out.println();

        }

        String[][] words= new String[2][];
        System.out.println(words[0]);

        words[0]= new String[3];
        words[0][1]= "Hi bro";
        System.out.println(words[0][1]);

    }
}
