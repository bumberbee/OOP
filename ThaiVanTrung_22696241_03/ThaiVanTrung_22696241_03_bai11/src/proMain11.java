import java.time.LocalDate;

public class proMain11 {
    public static void main(String[] args) {
        // Tạo một đối tượng KhachHang mới với mã KH01, tên là Nguyen Van A và có 5 sổ tiết kiệm
        Custormer khachHang = new Custormer("22696241", 5);
        khachHang.setHoTenKH("Thai Van Trung");

        // Tạo một sổ tiết kiệm mới và thiết lập các thuộc tính cho nó
        Savenote savenote = new Savenote();
        savenote.setMaSo("STK01");
        savenote.setNgayMoSo(LocalDate.of(2023, 5, 1));
        savenote.setSoTienGoi(1000000);
        savenote.setKyHan(3);
        savenote.setLaiSuat(0.005f);

        // Thêm sổ tiết kiệm vào danh sách sổ tiết kiệm của khách hàng
        khachHang.themSoTietKiem(savenote.getMaSo(), savenote.getNgayMoSo(), savenote.getSoTienGoi(), savenote.getKyHan(),savenote.getLaiSuat());

        // In ra số tháng gởi thực của sổ tiết kiệm
        System.out.println("So thang goi thuc: " + savenote.tinhSoThangGoiThuc());

        // In ra thông tin của khách hàng
        System.out.println(khachHang.toString());

        // In ra thông tin STK
        System.out.println(savenote.toString());

    }
}
