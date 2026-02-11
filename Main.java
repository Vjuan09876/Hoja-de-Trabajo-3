public class Main {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler();
            SortingAlgorithms sa = new SortingAlgorithms();
            String file = "numeros";

            // Aqui genera 3000 numeros 
            fh.generateRandomNumbers(file, 3000);

            // recolección de datos para la grafica
            int[] intervalos = {10, 100, 500, 1000, 2000, 3000};
            
            for (int n : intervalos) {
                Integer[] datos = fh.readNumbers(file, n);
                
                // Aqui inicia la medicion del profiler
                sa.mergeSort(datos); 
                // Aqui termina
                
            }

        } catch (Exception e) { // Aqui tenemos el manejo de excepciones por si acaso uno nunca sabe
            e.printStackTrace();
        }
    }
}