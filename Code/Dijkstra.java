package Proj;
public class Dijkstra {

    public static double dijkstra(double[][] graph, int source, int destination) {
        int count = graph.length;
        boolean[] visitedVertex = new boolean[count];
        double[] distance = new double[count];
        for (int i = 0; i < count; i++) {
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }

        // Distance of self loop is zero
        distance[source] = 0;
        for (int i = 0; i < count; i++) {
            if (i == source)
                continue;
            // Update the distance between neighbouring vertex and source vertex
            int u = (int) findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;

            // Update all the neighbouring vertex distances
            for (int v = 0; v < count; v++) {
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < distance.length; i++) {
            if (i == destination) {
                System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
                return distance[i];
            }
        }
        return 0;
    }

    // Finding the minimum distance
    private static double findMinDistance(double[] distance, boolean[] visitedVertex) {
        double minDistance = Integer.MAX_VALUE;
        double minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }
}

