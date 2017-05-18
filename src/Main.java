import com.sun.jna.Library;
import com.sun.jna.Native;

import java.io.File;

/**
 * Created by Hocean on 2017/5/18.
 */
public class Main {

    //继承Library，用于加载库文件
    public interface Clibrary extends Library {
        //加载libhello.so链接库
        String sep = File.separator;
        Clibrary INSTANTCE = (Clibrary) Native.loadLibrary("src/Test",Clibrary.class);

        //此方法为链接库中的方法
        int Add(int a, int b);
    }

    public static void main(String[] args) {
        //调用
        //Clibrary.INSTANTCE.test();

        System.out.println(Clibrary.INSTANTCE.Add(1,2));
    }
}
