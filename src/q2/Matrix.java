package q2;

import java.util.ArrayList;

public class Matrix {
    public class Cell {
        private final int row;
        private final int column;
        private final String description;

        public Cell(int row, int column, String description) {
            this.row = row;
            this.column = column;
            this.description = description;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Cell(" + "row=" + row + ", column=" + column + ", description='" + description + "')";
        }
    }

    private int numRows;
    private int numColumns;
    private String[][] grid;

    public Matrix(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        grid = new String[numRows][numColumns]; // Initialize grid with null values
    }

    public void set(int row, int column, String description) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            grid[row][column] = description;
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index.");
        }
    }

    public String get(int row, int column) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            return grid[row][column];
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index.");
        }
    }

    public ArrayList<Cell>describedCells() {
        ArrayList<Cell> describedCells = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                if (grid[row][col] != null) {
                    describedCells.add(new Cell(row, col, grid[row][col]));
                }
            }
        }
        return describedCells;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        matrix.set(0, 0, "Top-left corner");
        matrix.set(1, 1, "Center");
        matrix.set(2, 2, "Bottom-right corner");
        System.out.println("Cell (0, 0): " + matrix.get(0, 0));
ArrayList<Cell>getCells=matrix.describedCells();
        ArrayList<Cell> describeCells = matrix.describedCells();
        System.out.println("Describedcells: ");
        for (Cell cell : describeCells)
            System.out.println(cell);
        }
    }








