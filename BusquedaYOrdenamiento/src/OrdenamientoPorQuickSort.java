public class OrdenamientoPorQuickSort {
    public void ordenar(int[] arreglo) {
        quickSort(arreglo, 0, arreglo.length - 1);
    }

    private void quickSort(int[] arreglo, int low, int high) {
        if (low < high) {
            int pi = partition(arreglo, low, high);
            quickSort(arreglo, low, pi - 1);
            quickSort(arreglo, pi + 1, high);
        }
    }

    private int partition(int[] arreglo, int low, int high) {
        int pivot = arreglo[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arreglo[j] < pivot) {
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[high];
        arreglo[high] = temp;
        return i + 1;
    }
}
