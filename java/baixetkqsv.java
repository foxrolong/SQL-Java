import java.util.*;

public class baixetkqsv {
    public static void main(String[] args) {
        // TODO: Implement the main method

        double gpa = 3.6; 
        int conductScore = 82; 
        int absence = 5; 
        boolean disciplinary = false; 
        int choice = 2;
        
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
    }
}
