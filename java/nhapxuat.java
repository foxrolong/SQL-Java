public class nhapxuat {
    public static void main(String[] args) {
    try{
        System.out.println("nhập số nguyên:");
        int a;
        a = Integer.parseInt(System.console().readLine());
        System.out.println("số vừa nhập là: " + a);
    } catch (Exception e) {
        System.out.println("lỗi: vui lòng nhập một số nguyên hợp lệ." + e );
    }
    }
}
