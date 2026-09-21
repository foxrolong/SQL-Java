import java.util.*;

public class cautruclap {
    public static void main(String[] args){
        //phan 1: in day so bang for
        //hiển thị các số từ 0 đến 20
        
        // for(int i=0;i<20;i++){
        //     System.out.println("i ="+i);
        // }

        //hiển thị các số từ 20 đến 0

        // for(int i=20;i>=0;i--){
            // System.out.println("i ="+i);
        // }
        
        //hiển thị các số chẵn từ 0 đến 50
        // for(int i=0;i<=50;i++){
        //     if(i%2==0){
        //         System.out.println("i ="+i);
        //     }
        // }

        //hiển thị các số lẻ từ 0 đến 50
        // for(int i=0;i<50;i++){
        //     if(i%2!=0){
        //         System.out.println("i ="+i);
        //     }
        // }

        //hiển thị các số chia hết cho 5 từ 0 đến 100
        // for(int i=0;i<100;i++){
        //     if(i%5==0){
        //         System.out.println("i ="+i);
        //     }
        // }


        //phân 2: tinh tong bằng for
        //hiển thị tổng các số chẵn từ 0 đến 100
        // int tong=0;
        // for(int i=0;i<=100;i++){
        //     if(i%2==0){
        //         tong+=i;
        //     }
        // }
        // System.out.println("tong =" + tong);
        
        //hiển thị tổng các số lẻ từ 0 đến 100
        // int tong=0;
        // for(int i=0;i<=100;i++){
        //     if(i%2!=0){
        //         tong+=i;
        //     }
        // }
        // System.out.println("tong =" + tong);
        
        //hiển thị tổng các số chia hết cho 3 từ 0 đến 100
        // int tong=0;
        // for(int i=0; i<=100; i++){
        //     if(i%3==0){
        //         tong+=i;
        //     }
        // }
        // System.out.println("tong =" + tong);

        //phân 3: tính tich
        // long tich=1;
        // for(int i=1;i<=10;i++){
        //     tich*=i;
        // }
        // System.out.println("tich =" + tich);

        //phan 4 bang cu truong
        // int so=6;
        // int s;
        // for(int i=1;i<10;i++){
        //     s=so*i;
        //     System.out.println( so + "*" + i + " = " + s);
        // }
        
        //phan 5: dem so thoa mã dieu kien
        // int dem=0;
        // for(int i=0;i<=100;i++){
        //     if(i%5==0 && i%3==0){
        //         dem++;
        //         System.out.println("i ="+i);
        //     }
        // }
        // System.out.println("dem so chia hey cho 3 và 5: " + dem);

        // phan 6 vong lăp while
        // int soTinChi = 76;
        // int soTinChiYeuCau = 130;
        // int tinChiMoiHocKy = 18;
        // int hocKy = 0;
        // int soTinChiCanThem = 0;

        // if(soTinChi >= soTinChiYeuCau){
        //     System.out.println("Đã đạt yêu cầu số tín chỉ: " + soTinChi);
        // }else if(soTinChi < soTinChiYeuCau){
        //     soTinChiCanThem = soTinChiYeuCau - soTinChi;
        //     System.out.println("Cần thêm " + soTinChiCanThem + " tín chỉ nữa để đạt yêu cầu.");
            
        // }

        // while(soTinChi < soTinChiYeuCau){
        //     soTinChi += tinChiMoiHocKy;
        //     hocKy++;
        //     System.out.println("học kỳ: " + hocKy + "\r\nsố tín chỉ: " + soTinChi);
        // }
        // System.out.println("hoc ky can them:" + hocKy);
        
        //phan 7 vòng lặp do while
        // int dem = 5; 
        // do{
        //     System.out.println("dem = "+ dem);
        //     dem--;
        // } while (dem > 0);
        // vì trươc khi kiểm tra điều kiện thì nó đã chạy khối lệnh trước nếu điều kiên sai thì nó vẫn đượ thực thi 1 lần
        
        //so sanh while và do while 

        // int giaTri = 10;
        // while(giaTri < 5){
        //     System.out.println("giá trị: " + giaTri);
        //     giaTri++;
        // } while(giaTri < 5);
        
        // do{
        //     System.out.println("giá trị: " + giaTri);
        //     giaTri++;
        // } while(giaTri < 5);
        

        // phan 9: Sử dụng continue
        for(int i=0 ; i<=10 ; i++ ){
            if(i==4){
                continue;
            }
            i++;
            System.out.println("i = " + i);
        }


    }
}
