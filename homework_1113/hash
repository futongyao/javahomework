import java.util.ArrayList;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

public class hash {

    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        // 用于计算hash值的文件缓冲区
        byte[] buffer = new byte[1024];
        // 使用SHA1哈希/摘要算法
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead = 0;
        do {
            // 读出numRead字节到buffer中
            numRead = is.read(buffer);
            if (numRead > 0) {
                // 根据buffer[0:numRead]的内容更新hash值
                complete.update(buffer, 0, numRead);
            }
            // 文件已读完，退出循环
        } while (numRead != -1);
        // 关闭输入流
        is.close();
        // 返回SHA1哈希值
        return complete.digest();
    }





    public static void main (String[]args){
            try {
                File file = new File("/Users/doudou/Desktop/离散数学");
                File[] fs = file.listFiles();


                for (int i = 0; i < fs.length; i++) {
                    FileInputStream is = new FileInputStream(fs[i]);
                    byte[] sha1 = SHA1Checksum(is);
                    String result = "";
                    for (int j= 0; j < sha1.length; j++) {
                        result += Integer.toString(sha1[j]&0xFF, 16);
                    }
                    System.out.println(result);

                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

