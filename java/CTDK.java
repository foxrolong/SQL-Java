import java.util.*;
public class CTDK {
    public static void main(String[] args){

        double diemTrungBinh = 3.32;
        int diemRenLuyen = 85;
        int soBuoiNghi = 4;
        boolean biKyLuat = true;
        int luaChon = 3;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem trung binh: ");
        diemTrungBinh = scanner.nextDouble();
        System.out.println("Nhap diem ren luyen: ");
        diemRenLuyen = scanner.nextInt();
        System.out.println("Nhap so buoi nghi: ");
        soBuoiNghi = scanner.nextInt();
        
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
        String xepLoai;
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

        //phan 4 ket hop toan tu loic
        boolean duDieuKienHocBong;
        if(diemTrungBinh>=3.2 && diemRenLuyen>=80 && soBuoiNghi<=10 && !biKyLuat){
            duDieuKienHocBong = true;
        }else{
            duDieuKienHocBong = false;
        }
        System.out.println("Dieu kien nhan hoc bong: " + duDieuKienHocBong);

        //phan 5: if long nhau
        String hocBong = "Khong co hoc bong";
        if(!biKyLuat){
            if(diemTrungBinh>=3.6){
                if(diemRenLuyen>=90){
                    hocBong = "Hoc bong loai A";
                }
            }else if(diemTrungBinh>=3.2){
                if(diemRenLuyen>=80){
                    hocBong = "Hoc bong loai B";
                }

            }else if(diemTrungBinh>=2.5){
                if(diemRenLuyen>=70){
                    hocBong = "Hoc bong loai C";
                }
            }
        }
        System.out.println("Hoc bong: " + hocBong);

        //phan 6: toan tu dieu kien
        String trangThaiHocVu;
        trangThaiHocVu = (diemTrungBinh >= 2.0) ? "Binh thuong" : "Canh bao";
        System.out.println("Trang thai hoc vu: " + trangThaiHocVu);

        //phan 7: swich...case
        int choice;
        System.out.println("Nhap lua chon 1-2-3-4:");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Diem trung binh: " + diemTrungBinh);
                break;
            case 2:
                System.out.println("Diem ren luyen: " + diemRenLuyen);
                break;
            case 3:
                System.out.println("Hoc bong: " + hocBong);
                break;
            case 4:
                System.out.println("Trang thai hoc vu: " + trangThaiHocVu);
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
    }
}