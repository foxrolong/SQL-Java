import java.util.*;

public class baixetkqsv {
    public static void main(String[] args) {
        // TODO: Implement the main method
        double gpa = 3.6; 
        int conductScore = 82; 
        int absence = 5; 
        boolean disciplinary = false; 
        int choice = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình (GPA):");
        gpa = scanner.nextDouble();
        System.out.println("Nhập điểm rèn luyện:");
        conductScore = scanner.nextInt();
        System.out.println("Nhập số buổi vắng mặt:");
        absence = scanner.nextInt();
        System.out.println("Nhập tình trạng kỷ luật (true/false):");
        disciplinary = scanner.nextBoolean();
        System.out.println("Nhập lựa chọn (1 hoặc 2):");
        choice = scanner.nextInt();


        System.out.println("---xét kết quả học tập xinh viên---");
        if(absence > 10){
            System.out.println("Canh bao: nghi hoc qua nhieu!");
        }else if(gpa >= 2.0){
            System.out.println("Du dieu kien tiep tuc hoc");
        }else{
            System.out.println("Canh bao hoc vu");
        }
        if(gpa >= 3.6 ){
            System.out.println("Xep loai: gioi");
        }else if(gpa >= 3.2){
            System.out.println("Xep loai: kha");
        }else if(gpa >= 2.5){
            System.out.println("Xep loai: trung binh");
        }else{
            System.out.println("Xep loai: yeu");
        }

        if(gpa >= 3.0 && conductScore >= 90 && absence <= 5){
            System.out.println("Du dieu kien ");
            
        }


        if(disciplinary == false){
            if(gpa >= 3.6 && conductScore >= 90 && absence <= 5){
                System.out.println("Du dieu kien hoc bong loại A");
            }else if(gpa >= 3.2 && conductScore >= 80 && absence <= 5){
                System.out.println("Du dieu kien hoc bong loại B");
            }else if(gpa >= 3.0 && conductScore >= 70 && absence <= 5){
                System.out.println("Du dieu kien hoc bong loại C");
            }else{
                System.out.println("Khong có học bổng");
            }
        }else{
            System.out.println("không đủ điều kiện nhận học bổng");
        }
    }
}
