package hard.solver;

public class Utility {

    public static double[][] toDoubleArray(String input) {
        String[] data = input.split("\n");
        int size = Integer.parseInt(data[0]);
        double[][] output = new double[size][size + 1];
        for (int i = 1; i < data.length; i++) {
            String[] row = data[i].split(" ");
            for (int j = 0; j < row.length; j++) {
                output[i - 1][j] = Double.parseDouble(row[j]);
            }
        }
        return output;
    }

    public static String toString(double[] input) {
        StringBuilder output = new StringBuilder();
        for (double i : input) {
            output.append(i).append("\n");
        }
        return output.toString();
    }

    public static boolean equals(double a, double b) {
        return Double.compare(a, b) == 0;
    }
}
