public class Assignment1 {

    public static void main(String args[]) {

        // Taking values from cmd arg
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);
        int v = Integer.parseInt(args[3]);

        Simulator processSimulator = new Simulator(n, k, d, v);

    }

}