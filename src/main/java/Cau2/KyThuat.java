package Cau2;

public class KyThuat extends NhanVien{
    private String chuyenNganh;
    @Override
    String moTaCongViec() {
        return "lap trinh huong doi tuong";
    }

    public KyThuat() {
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return super.toString() + ", chuyen nganh=" + chuyenNganh + ",mo ta cong viec=" + moTaCongViec() + '}';
    }
}
