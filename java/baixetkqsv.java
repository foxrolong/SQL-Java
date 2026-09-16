import java.util.*;

public class baixetkqsv {
    public static void main(String[] args) {
        // TODO: Implement the main method
        // Khai báo các biến
        double gpa = 3.6; 
        int conductScore = 82; 
        int absence = 4; 
        boolean disciplinary = false; 
        int choice = 2;

        // Nhập dữ liệu từ người dùng
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhập điểm trung bình (GPA):");
        // gpa = scanner.nextDouble();
        // System.out.println("Nhập điểm rèn luyện:");
        // conductScore = scanner.nextInt();
        // System.out.println("Nhập số buổi vắng mặt:");
        // absence = scanner.nextInt();
        // System.out.println("Nhập tình trạng kỷ luật (true/false):");
        // disciplinary = scanner.nextBoolean();
        // System.out.println("Nhập lựa chọn (1 hoặc 2):");
        // choice = scanner.nextInt();

        //in ra kết quả nhập

        //nhập lựa chọn từ người dùng
        System.out.println("Nhập lựa chọn 1-2-3-4:");
        System.out.println("1. xem GPA");
        System.out.println("2. xem điểm rèn luyện");
        System.out.println("3. xem số buổi vắng mặt");
        System.out.println("4. xem tình trạng kỷ luật");

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Điểm trung bình (GPA): " + gpa);
                //kiểm tra xếp loại học tập dựa trên GPA
                if(gpa >= 3.6 ){
                    System.out.println("Xep loai: gioi");
                }else if(gpa >= 3.2){
                    System.out.println("Xep loai: kha");
                }else if(gpa >= 2.5){
                    System.out.println("Xep loai: trung binh");
                }else{
                    System.out.println("Xep loai: yeu");
                }
                break;
            case 2:
                System.out.println("Điểm rèn luyện: " + conductScore);
                break;
            case 3:
                System.out.println("Số buổi vắng mặt: " + absence);
                // kiểm tra buổi vắng mặt và điều kiện học tập
                if(absence > 10){
                    System.out.println("Canh bao: nghi hoc qua nhieu!");
                }else if(gpa >= 2.0){
                    System.out.println("Du dieu kien tiep tuc hoc");
                }else{
                    System.out.println("Canh bao hoc vu");
                }
                break;
            case 4:
                System.out.println("Tình trạng kỷ luật: " + disciplinary);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
        if(disciplinary == false){
            if(gpa >= 3.6 && conductScore >= 90 && absence <= 5){
                System.out.println("Học bổng loại A");
            }else if(gpa >= 3.2 && conductScore >= 80 && absence <= 5){
                System.out.println("Học bổng loại B");
            }else if(gpa >= 3.0 && conductScore >= 70 && absence <= 5){
                System.out.println("Học bổng loại C");
            }else{
                System.out.println("Khong có học bổng");
            }
        }else{
            System.out.println("không đủ điều kiện nhận học bổng");
        }
    }
}
