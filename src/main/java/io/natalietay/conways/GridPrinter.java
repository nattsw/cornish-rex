package io.natalietay.conways;

import org.springframework.stereotype.Component;

@Component
public class GridPrinter {

    public String getGrid(int size) {
        String grid = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid += "o ";
            }
            grid += "\n";
        }
        return grid;
    }
}
