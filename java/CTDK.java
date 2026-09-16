import java.util.*;

public class CTDK {
    public static void main(String[] args){

        double diemTrungBinh = 3.35;
        int diemRenLuyen = 85;
        int soBuoiNghi = 4;
        boolean biKyLuat = false;
        int luaChon = 3;
        String xepLoai;

        
        //phần 1: if rút gọn sử dụng toán tử 3 ngôi
        String thongBao = (soBuoiNghi > 10) ? "sinh viên nghỉ học quá nhiều" : "Sinh viên nghỉ: " + soBuoiNghi + " buổi";
        System.out.println("Thong bao: " + thongBao);

        //phần 2: if...else
        if (diemTrungBinh >= 2.0){
            System.out.println("Du dieu kien tiep tuc hoc");
        }else{
            System.out.println("Canh Bao Hoc Vu");
        }

        //phần 3: if...else if...else
        if(diemTrungBinh>=3.6){
            xepLoai = "xuat sac";
        }else if(diemTrungBinh>=3.2){
            xepLoai = "gioi";
        }else if(diemTrungBinh>=2.5){
            xepLoai = "kha";
        }else if(diemTrungBinh>=2.0){
            xepLoai = "trung binh";
        }else{
            xepLoai = "yeu";
        }

        System.out.println("Xep loai: " + xepLoai);

        //phan 4 ket hop toan tu logic
        if(diemTrungBinh>=3.2 && diemRenLuyen>=80 && soBuoiNghi<=10 && !biKyLuat){
            System.out.println("Du dieu kien nhan hoc bong");
        }
    }
    
}
