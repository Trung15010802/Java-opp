package tuan5.buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import tuan3.buoi6.bai6.HangThucPham;

public class WritingListObject {
    public static void main(String[] args) throws IOException, ParseException {
        HangThucPham hangThucPham = new HangThucPham("tp01", "Bánh MÌ", 20000, "16/03/2002", "20/03/2002");
        HangThucPham hangThucPham2 = new HangThucPham("tp02", "Sữa milo", 10000, "15/03/2022", "25/04/2002");
        List<HangThucPham> list = new ArrayList<>();
        list.add(hangThucPham);
        list.add(hangThucPham2);
        //Ghi vào 1 file cụ thể
        FileOutputStream outFile = new FileOutputStream("htp.dat");
        //Chuyển đối tượng sang dạng trung gian
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);
        objOut.writeObject(list);
        objOut.close();
    }
}
