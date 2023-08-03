package producerconsumer;

import java.io.File;

public class ShowDir {
    public static void Show(String showFile){
        //System.out.println(showFile);

        File dir = new File(showFile);
        File files[] = dir.listFiles();

        for(File file: files){

            if(file.isDirectory()){
                Show(file.getPath());

            }else{
                System.out.println("파일명: " + file.getName());
                System.out.println("파일 크기: "+file.length());
                System.out.println("해시: "+ md5Example.getMD5Hash(file));
                System.out.println("최종 수정일시: "+FileDate.getFileDate(file));
                System.out.println("----------------------------");
            }

        }

    }
}
