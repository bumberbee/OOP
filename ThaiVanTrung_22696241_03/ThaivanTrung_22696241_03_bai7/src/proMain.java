
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.text.DecimalFormat;

public class proMain {
    public static void main(String[] args) throws Exception {
        
            HangThucPham hangHoa1 = new HangThucPham("001");
            hangHoa1 = new HangThucPham("001", "Gạo", 100000, LocalDate.of(2018, 07, 10), LocalDate.of(2024, 7, 10));
            HangThucPham hangHoa2 = new HangThucPham("002");
            hangHoa2 = new HangThucPham("002", "Mì", 5000, LocalDate.of(2018, 03, 1), LocalDate.of(2024, 9, 1));
            HangThucPham hangHoa3 = new HangThucPham("003");
            hangHoa3 = new HangThucPham("003", "Nước", 10000, LocalDate.of(2017, 03, 1), LocalDate.of(2018, 3, 1)); 
            
            System.out.println("______________________________________________________________________________________________________________________________");
            System.out.printf("%-20s %-20s %10s %20s %20s %20s \n","Mã_Hàng", "Tên_Hàng", "Đơn_Giá", "Ngày_sản_xuất", "Ngày_Hết_Hạn", "Ghi_Chú");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(hangHoa1.toString());
            System.out.println(hangHoa2.toString());
            System.out.println(hangHoa3.toString());
    }
}
