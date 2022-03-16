package tuan5.buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;

import tuan3.buoi6.bai6.HangThucPham;

public class WritingObject {
    public static void main(String[] args) throws ParseException, IOException {
        HangThucPham hangThucPham = new HangThucPham("tp01", "Bánh MÌ", 20000, "16/03/2002", "20/03/2002");
        //Ghi vào 1 file cụ thể
        FileOutputStream outFile = new FileOutputStream("htp.dat");
        //Chuyển đối tượng sang dạng trung gian
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);
        objOut.writeObject(hangThucPham);
        objOut.close();

    }
}
