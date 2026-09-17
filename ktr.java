package ktra;
import java.util.*;

public class ktra {

    // Phương thức 1: Tính trung bình cộng
    public static double calculateAverage(double[] a) {
        double tong = 0;
        for (int i = 0; i < a.length; i++) {
            tong = tong + a[i]; // Cộng dồn từng ngày
        }
        return tong / a.length; // Chia cho 5 ngày
    }

    // Phương thức 2: Tìm giá trị nhỏ nhất
    public static double findMin(double[] a) {
        double min = a[0]; // Giả sử ngày đầu tiên là nhỏ nhất
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i]; // Cập nhật nếu thấy ngày khác nhỏ hơn
            }
        }
        return min;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] dien = new double[5];

        System.out.println("Nhập lượng điện 5 ngày (kWh):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ngày " + (i + 1) + ": ");
            dien[i] = sc.nextDouble();
        }

        double trungBinh = calculateAverage(dien);
        double nhoNhat = findMin(dien);

        int dem = 0;
        for (int i = 0; i < 5; i++) {
            if (dien[i] >= 20) {
                dem++;
            }
        }

        String danhGia = "";
        if (trungBinh >= 30) {
            danhGia = "Cao";
        } else if (trungBinh >= 20) {
            danhGia = "Trung bình";
        } else if (trungBinh >= 10) {
            danhGia = "Thấp";
        } else {
            danhGia = "Rất thấp";
        }

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Lượng điện trung bình: " + trungBinh + " kWh");
        System.out.println("Lượng điện thấp nhất: " + nhoNhat + " kWh");
        System.out.println("Số ngày dùng từ 20 kWh trở lên: " + dem);
        System.out.println("Mức đánh giá: " + danhGia);
	}

}
