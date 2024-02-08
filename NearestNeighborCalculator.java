public class NearestNeighborCalculator {
    private int[] array;

    public NearestNeighborCalculator(int[] array) {
        this.array = array;
    }

    public int findNearestNeighbor() {
        int minDistance = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }

        return index;
    }
}
