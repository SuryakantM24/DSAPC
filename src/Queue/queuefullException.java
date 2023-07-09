package Queue;

public class queuefullException extends Exception{

    @Override
    public String toString() {

        String str="Queue is full";
        return str;
    }
}
