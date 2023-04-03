package ss4_class_object_to_java.exercise;

public class StopWatch {
    private long startTime ;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start(){
        long timeStart = (System.currentTimeMillis()/1000);
        this.startTime = timeStart;
    }
    public void stop(){
        long timeEnd  = (System.currentTimeMillis())/1000;
        this.endTime = timeEnd;
    }
    public long getElapsedTime(){

        return endTime-startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getElapsedTime());
    }
}
