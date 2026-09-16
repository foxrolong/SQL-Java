public class biensv {
    static final int SO_TIN_CHI_YEU_CAU = 130; 
    public static void main(String[] args){
        //khai báo biên
        int maSinhVien= 2026001;
        int SoTinChiDaTichLuy=82;
        double diemMon1 = 7.5;
        double diemMon2 = 8.0;
        double diemMon3 = 6.5;
        char xepLoaiRenLuyen = 'A';
        boolean coKyLuat = false;

        
        double tongDiem = diemMon1 + diemMon2 + diemMon3;
        double diemTrungBinh = tongDiem / 3;
        int soTinChiConThieu = SO_TIN_CHI_YEU_CAU - SoTinChiDaTichLuy;
        double tyLeHoanThanh = SoTinChiDaTichLuy * 100 / SO_TIN_CHI_YEU_CAU;


        // in kết quả
        System.out.println("---THONG TIN SINH VIEN---");
        System.out.println("Mã Sinh Viên: " + maSinhVien);
        System.out.println("Số tín chỉ đã tích lũy: " + SoTinChiDaTichLuy);
        System.out.println("Số tín chỉ còn thiếu: " + soTinChiConThieu);
        System.out.println("Tổng điểm 3 môn học: " + tongDiem);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Tỷ lệ hoàn thành: " + tyLeHoanThanh + "%");
        System.out.println("Xếp loại rèn luyện: " + xepLoaiRenLuyen);
        System.out.println("Có kỷ luật: " + coKyLuat);
    }
}
