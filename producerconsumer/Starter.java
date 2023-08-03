package producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Starter {
    public static void main(String[] args) {

        BlockingQueue queue = new ArrayBlockingQueue(50);

        //BlockingQueue queue = new LinkedBlockingQueue();
        new Thread(new ProducerThread(queue)).start();
        new Thread(new ConsumerThread(queue)).start();

    }
}
