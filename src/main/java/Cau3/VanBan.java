package Cau3;

import java.util.Locale;

public class VanBan {
    private String st;

    public VanBan() {
    }

    public VanBan(String st) {
        if(st == ""){
            throw  new RuntimeException("phải nhập vào 1 chuỗi");
        }
        this.st = st;
    }

    public int demSoTu(String st) {
        int count = 0;
        boolean check = true;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ' && st.charAt(i) != '\t' && st.charAt(i) != '\n') {
                if (check) {
                    count++;
                    check = false;
                }
            } else check = true;
        }
        return count;
    }

    public String chuanHoaXau(String st) {
        return st.trim().replaceAll("\\s+", " ");
    }

    public String vietHoa(String st) {
       return chuanHoaXau(st).toUpperCase();
    }

    public String vietThuong(String st){
      return chuanHoaXau(st).toLowerCase();
    }

    public String vietHoaChuCaiDau(String st){
        String temp = chuanHoaXau(st);

        String first = temp.substring(0, 1);
        String last = temp.substring(1, temp.length());

        first = first.toUpperCase();
        temp = first + last;
       return temp;
    }
}
