import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of nodes
        int n = sc.nextInt();

        // Number of edges
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph =
                new ArrayList<>();

        // Create list for every node
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Automatically read edges
        for (int i = 0; i < m; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Print graph
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }
}