import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Simulator {
    private int n, k, d, v;
    private Random rand = new Random();
    private ArrayList<Process> processList = new ArrayList<Process>();
    HashMap<Integer, Process> list = new HashMap<Integer, Process>();

    // Constructor
    public Simulator(int n, int k, int d, int v) {
        this.n = n;
        this.k = k;
        this.d = d;
        this.v = v;

        for (int i = 1; i <= n; i++) {
            int arrivalTime = (int) calculateArrivalTime(k);
            int totalCpuTime = (int) calculateTotalCpuTime(d, v);
            boolean status = false; // default value is false

            Process p = new Process("P" + i, status, arrivalTime, totalCpuTime);
            processList.add(p);
            list.put(p.getArrivalTime(), p);

        }
        System.out.println(n);
        int count = 1;

        for (int i = 0; i <= 1000; i++) {

            if (list.containsKey(i)) {
                System.out.println("Arrival Time" + count + " \t:" + list.get(i).getArrivalTime());
                count++;
            }

        }
    }

    private double calculateArrivalTime(int k) {

        DecimalFormat formatter = new DecimalFormat("0.00");
        double arrivalTime = (rand.nextDouble() * k);
        arrivalTime = Double.parseDouble(formatter.format(arrivalTime));
        return arrivalTime;
    }

    private double calculateTotalCpuTime(int d, int v) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        double totalCpuTime = (rand.nextGaussian() * v) + d;
        totalCpuTime = Double.parseDouble(formatter.format(totalCpuTime));
        return totalCpuTime;
    }

}