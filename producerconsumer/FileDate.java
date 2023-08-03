package producerconsumer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDate {
    public static String getFileDate(File file){
        long ltime = file.lastModified();
        String pattern = "yyyy-MM-dd hh:mm:ss aa";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date lastModifiedDate = new Date(ltime);

        String frmDate = simpleDateFormat.format(lastModifiedDate);

        return frmDate;

    }
}
