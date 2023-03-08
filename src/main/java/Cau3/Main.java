package Cau3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VanBan vb = new VanBan();
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi");
        String st = in.nextLine();
        System.out.println("so tu la: " + vb.demSoTu(st));
        System.out.println("xâu được chuẩn hóa là: " + vb.chuanHoaXau(st));
        System.out.println("từ viết hoa là: " + vb.vietHoa(st));
        System.out.println("từ viết thường là: " + vb.vietThuong(st));
        System.out.println("viết hoa chữ đầu là: " +   vb.vietHoaChuCaiDau(st));
    }
}
