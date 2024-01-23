

import java.time.LocalDate;

public class Custormer {
    private String maKH;
    private String hoTenKH;
    private Savenote[] dsSavenote;
    private int soLuongSoHienCo;

    public Custormer(String maKH, int soLuongSoHemCo) {
        this.maKH = maKH;
        this.soLuongSoHienCo = soLuongSoHemCo;
        this.dsSavenote = new Savenote[soLuongSoHemCo];
    }

    public boolean themSoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
        if (soLuongSoHienCo < dsSavenote.length) {
            dsSavenote[soLuongSoHienCo] = new Savenote(maSo, ngayMoSo, soTienGoi, kyHan, laiSuat);
            soLuongSoHienCo++;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String result = "Khach Hang: " 
                + maKH + ' ' +'-' +  ' ' +
                hoTenKH ;
        for (int i = 0; i < soLuongSoHienCo; i++) {
            if (dsSavenote[i] != null) {
                result += "\n" + dsSavenote[i].toString();
            }
        }
        return result;
    }
    

    public String getMaKH() {
        return this.maKH;
    }

    public String getHoTenKH() {
        return this.hoTenKH;
    }

    public Savenote[] getDsSoTietKiem() {
        return this.dsSavenote;
    }

    public int getSoLuongSoHienCo() {
        return this.soLuongSoHienCo;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }
}
