package Proj;

//n0= baner

//n1=bavdhan

//n2=Camp

//n3=Fergusson college

//n4=hadapsar

//n5=karve nagar

//n6=kothrud

//n7=Swargate

//n8=peths

//n9=Shivaji nagar

class Edge{

    int  start;

    int end;

    double distance;

    String source;

    String destination;

    public  Edge(int start,int end,double distance,String source,String destination){

        this.start=start;

        this.end=end;

        this.distance=distance;

        this.source = source;

        this.destination = destination;

    }
}

class MainGraph {

    int vertices;

    static double Matrix[][];

    public MainGraph(int vertices) {

        this.vertices = vertices;

        Matrix = new double[vertices][vertices];

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                Matrix[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    static String[] value = new String[10];
    static {
        value[0] = "Baner";
        value[1] = "Bavdhan";
        value[2] = "Camp";
        value[3] = "FC";
        value[4] = "Hadapsar";
        value[5] = "Karve Nagar";
        value[6] = "Kothrud";
        value[7] = "Swargate";
        value[8] = "Peth";
        value[9] = "Shivaji Nagar";
    }
    static int loc=0;
    static int dest=0;
    void addEdge(double distance, String source, String destination) {
        for(int i=0;i<10;i++){
            if(value[i].equals(source))
                loc = i;
            if(value[i].equals(destination))
                dest=i;
        }
        Matrix[loc][dest] = distance;
        Matrix[dest][loc] = distance;
        System.out.println(source + " is connected to " +
                destination + " with distance " + distance + " kms");
    }


    static void Edges() {
        int vertices = 10;

        MainGraph graph = new MainGraph(vertices);

        graph.addEdge(12.4, "Karve Nagar", "Baner"); //1

        graph.addEdge(9.9, "Baner", "FC");        //2

        graph.addEdge( 2.9 ,  "Kothrud", "Karve Nagar");

        graph.addEdge( 11.7, "Swargate", "Baner");

        graph.addEdge(6.6, "Karve Nagar","FC");

        graph.addEdge( 18.4, "Baner", "Hadapsar");

        graph.addEdge( 6.3, "Camp", "Karve Nagar");

        graph.addEdge( 14.4, "Karve Nagar",  "Hadapsar");

        graph.addEdge( 12.8, "Camp", "Baner");

        graph.addEdge( 12.7, "Kothrud", "Baner");

        graph.addEdge(5.9, "Swargate", "Karve Nagar");

        graph.addEdge( 7.2, "Baner", "Bavdhan");

        graph.addEdge(6.5, "Karve Nagar", "Peth");

        graph.addEdge( 11.8, "Hadapsar","FC");

        graph.addEdge( 6.5, "Shivaji Nagar", "Karve Nagar");

        graph.addEdge( 4.6, "Swargate", "Camp");

        graph.addEdge(9, "Karve Nagar","Bavdhan");

        graph.addEdge( 9.8, "Peth", "Baner");

        graph.addEdge( 2.1, "Shivaji Nagar", "Peth");

    }
}

