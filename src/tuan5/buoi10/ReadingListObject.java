package tuan5.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import tuan3.buoi6.bai6.HangThucPham;

public class ReadingListObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream inFile = new FileInputStream("htp.dat");

        ObjectInputStream objIn = new ObjectInputStream(inFile);
        
        @SuppressWarnings("unchecked")
        List<HangThucPham> list = (List<HangThucPham>) objIn.readObject();
        for (HangThucPham hangThucPham : list) {
            System.out.println();
            System.out.println(hangThucPham);
        }
        objIn.close();
    }
}
