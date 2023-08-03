package producerconsumer;

import java.io.File;
import java.util.concurrent.BlockingQueue;

public class ConsumerThread implements Runnable{

    private BlockingQueue queue;

    public ConsumerThread(BlockingQueue queue) {
        this.queue = queue;
    }

    public void runTarget(File file){
        if(file.isDirectory()) {
            System.out.println("폴더명: "+file.getName());
            System.out.println("폴더 하위 파일들");
            ShowDir.Show(file.getPath());


        }else{
            System.out.println("파일명: " + file.getName());
            System.out.println("파일 크기: "+file.length());
            System.out.println("해시: "+ md5Example.getMD5Hash(file));
            System.out.println("최종 수정일시: "+FileDate.getFileDate(file));

        }


        file=null;
    }

    @Override
    public void run() {
        //System.out.println("-----Consumer Start-----");
        File file = null;
        while(true){

            try {
                file = (File) queue.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            runTarget(file);

            System.out.println("----------------------------");

        }
    }
}