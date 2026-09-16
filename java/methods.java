public class methods {
    public static double tinhDiemTrungBinh(double diemMon1, double diemMon2, double diemMon3){
        double tongDiem = diemMon1 + diemMon2 + diemMon3;
        double diemTrungBinh = tongDiem / 3;
        return diemTrungBinh;
    }
    public static int tinhTinChiConThieu(int soTinChiDaCo, int soTinChiYeuCau){
        int soTinChiConThieu = soTinChiYeuCau - soTinChiDaCo;
        return soTinChiConThieu;
    }
    public static double tinhHocPhi(int soTinChi, double hocPhiMotTinChi){
        double hocPhi = soTinChi * hocPhiMotTinChi;
        return hocPhi;
    }
    public static double tinhTongDiem(double diem1, double diem2, double diem3){
        double tongDiem = diem1 + diem2 + diem3;
        return tongDiem;
    }
    public static void main(String[] args){
        double diemMon1 = 7.5;
        double diemMon2 = 8.0;
        double diemMon3 = 6.5;
        int soTinChiDaTichLuy = 82;
        int soTinChiYeuCau = 130;
        int soTinChiDangKy = 18;
        double hocPhiMotTinChi = 450000;

        tinhTongDiem(diemMon1, diemMon2, diemMon3);
        tinhDiemTrungBinh(diemMon1, diemMon2, diemMon3);
        tinhTinChiConThieu(soTinChiDaTichLuy, soTinChiYeuCau);
        tinhHocPhi(soTinChiDangKy, hocPhiMotTinChi);

        System.out.println("Tong Diem: " + tinhTongDiem(diemMon1, diemMon2, diemMon3));
        System.out.println("Diem Trung Binh: " + tinhDiemTrungBinh(diemMon1, diemMon2, diemMon3));
        System.out.println("Tin Chi Con Thieu: " + tinhTinChiConThieu(soTinChiDaTichLuy, soTinChiYeuCau));
        System.out.println("Hoc Phi: " + tinhHocPhi(soTinChiDangKy, hocPhiMotTinChi));
    }
}
