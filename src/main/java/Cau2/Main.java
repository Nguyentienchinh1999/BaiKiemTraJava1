package Cau2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        tạo sẵn dữ liệu
        NhanVien nv1 = new KyThuat("12A","NGUEN TIEN CHINH","19/6/1999","BN","CNTT");
        nv1.moTaCongViec();
        System.out.println(nv1.toString());
        NhanVien nv2 = new KyThuat("12B","CHINH NGUYEN TIEN","19/6/1999","TS","IT");
        nv2.moTaCongViec();
        System.out.println(nv2.toString());
//        nhap tu ban phim
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao ma nhan vien");
        String maNhanVien = in.nextLine();
        System.out.println("nhap vao ho ten:");
        String hoTen = in.nextLine();
        System.out.println("nhap vap nam sinh: ");
        String namSinh = in.nextLine();
        System.out.println("nhap vao dia chi: ");
        String diaChi = in.nextLine();
        System.out.println("nhap vao chuyen nganh");
        String chuyenNganh = in.nextLine();
        NhanVien nv3 = new KyThuat(maNhanVien,hoTen,namSinh,diaChi,chuyenNganh);
        nv3.moTaCongViec();
        System.out.println(nv3.toString());

    }
}
