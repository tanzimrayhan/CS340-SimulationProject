
public class Process {
    private int arrivalTime, totalCputime, remainingTime, TT_time;
    private boolean status;
    private String processId;

    /// Contructor
    public Process(String processId, boolean status, int arrivalTime, int totalCputime) {
        this.processId = processId;
        this.arrivalTime = arrivalTime;
        this.totalCputime = totalCputime;
        this.remainingTime = totalCputime;
        this.TT_time = TT_time;
    }

    // Getter and Setters
    public int getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getProcessId() {
        return this.processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }
}