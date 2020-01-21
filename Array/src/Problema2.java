import java.util.List;

public class Problema2 {

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int minimumDays(int rows, int columns, List<List<Integer>> grid)
    {
        // WRITE YOUR CODE HERE
        int actualRow = 0;
        int actualColumn = 0;
        int days = 0;
        boolean hasUp = false;
        boolean hasLeft = false;
        boolean hasRight = false;
        boolean hasDown = false;
        while (true){
            days++;
            hasUp = true;
            hasLeft = true;
            hasRight = true;
            hasDown = true;

            if (grid.get(actualRow).get(actualColumn) == 0){
                if (actualRow > 0){
                    hasUp = grid.get(actualRow-1).get(actualColumn) == 1;
                }
                if (actualRow > rows - 1){
                    hasDown = grid.get(actualRow+1).get(actualColumn) == 1;
                }

                if (actualColumn > 0){
                    hasLeft = grid.get(actualRow).get(actualColumn-1) == 1;
                }
                if (actualColumn < columns - 1){
                    hasLeft = grid.get(actualRow).get(actualColumn+1) == 1;
                }

                if (!hasDown && !hasLeft && !hasRight && !hasUp) return -1;
            }
            break;
        }

        return 0;

    }

    public static void main(String[] args) {

    }
}
