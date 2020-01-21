import java.util.ArrayList;
import java.util.List;

public class TreasureTruck {
    int numberAmazonTreasureTrucks(int rows, int column,
                                   List<List<Integer>> grid)
    {
        int treasureTrucks = 0;
        int actualRow = 0;
        int actualColumn = 0;
        int startRowBlockContiguous = 0;
        int startColumnBlockContiguous = 0;
        boolean foundBlock = false;
        while (true) {


            if (grid.get(actualRow).get(actualColumn) == 1) {
                startRowBlockContiguous = actualRow;
                startColumnBlockContiguous = actualColumn;
                boolean isBlock = true;
                while (isBlock){
                    if (actualColumn < column-1) actualColumn++;
                    if (grid.get(actualRow).get(actualColumn) == 0){
                        if (actualRow < rows) {
                            if (grid.get(actualRow+1).get(startColumnBlockContiguous) == 1) {
                                actualRow++;
                                actualColumn = startColumnBlockContiguous;
                            } else {
                                isBlock = false;
                            }
                        }
                    } else if (actualRow == rows-1 && actualColumn == column-1){
                        isBlock = false;
                    }
                }
                treasureTrucks++;
            }
            if (actualColumn < column-1) {
                actualColumn++;
            } else if (actualRow < rows-1) {
                actualRow++;
                actualColumn = 0;
            }

            if (actualRow == rows && actualColumn == column) break;
        }
        return treasureTrucks;
    }

    public static void main(String[] args) {
        List<List<Integer>> listas = new ArrayList<>();
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(0);
        lista.add(0);
        listas.add(lista);
        lista = new ArrayList<>();
        lista.add(0);
        lista.add(0);
        lista.add(1);
        lista.add(0);
        listas.add(lista);
        lista = new ArrayList<>();
        lista.add(0);
        lista.add(0);
        lista.add(0);
        lista.add(0);
        listas.add(lista);
        lista = new ArrayList<>();
        lista.add(1);
        lista.add(0);
        lista.add(1);
        lista.add(1);
        listas.add(lista);
        lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        listas.add(lista);
        TreasureTruck treasureTruck = new TreasureTruck();
        System.out.println(treasureTruck.numberAmazonTreasureTrucks(5,4,listas));
    }
}
