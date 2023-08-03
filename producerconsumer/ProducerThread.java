package producerconsumer;

import java.io.File;
import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable{
    private BlockingQueue queue;
    String filePath = "C:\\Users\\Administrator\\Desktop";
    File dir = new File(filePath);
    File[] filenames = dir.listFiles();

    public ProducerThread(BlockingQueue queue) {
        this.queue = queue;
    }
    int i=0;
    @Override
    public void run() {
        //System.out.println("-----Producer Start-----");
        for(File filename: filenames){
            queue.add(filename);
        }
    }
}
