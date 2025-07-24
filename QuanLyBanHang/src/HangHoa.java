public class HangHoa {
    // Thuộc tính của hàng hóa
    private String hanghoaID;
    private String tenHangHoa;
    private int soLuongHangHoa;
    private String ngayNhap;
    private Double giaNhap;
    private String loaiHangHoa;

    // Default constructor
    public HangHoa() {}

    // Parameterized constructor
    public HangHoa(String hanghoaID, String tenHangHoa, int soLuongHangHoa, String ngayNhap, Double giaNhap, String loaiHangHoa) {
        // Khởi tạo các thuộc tính của hàng hóa
        this.hanghoaID = hanghoaID;
        this.tenHangHoa = tenHangHoa;
        this.soLuongHangHoa = soLuongHangHoa;
        this.ngayNhap = ngayNhap;
        this.giaNhap = giaNhap;
        this.loaiHangHoa = loaiHangHoa;
    }

    // Getter methods
    public String getHanghoaID() { 
        return hanghoaID; 
    }
    
    public String getTenHangHoa() { 
        return tenHangHoa; 
    }
    
    public int getSoLuongHangHoa() { 
        return soLuongHangHoa; 
    }

    public String getNgayNhap() { 
        return ngayNhap; 
    }

    public Double getGiaNhap() { 
        return giaNhap; 
    }
    
    public String getLoaiHangHoa() { 
        return loaiHangHoa; 
    }

    // Setter methods
    public void setHanghoaID(String hanghoaID) { 
        this.hanghoaID = hanghoaID; 
    }
    
    public void setTenHangHoa(String tenHangHoa) { 
        this.tenHangHoa = tenHangHoa; 
    }
    
    public void setSoLuongHangHoa(int soLuongHangHoa) { 
        this.soLuongHangHoa = soLuongHangHoa; 
    }

    public void setNgayNhap(String ngayNhap) { 
        this.ngayNhap = ngayNhap; 
    }

    public void setGiaNhap(Double giaNhap) { 
        this.giaNhap = giaNhap; 
    }
    
    public void setLoaiHangHoa(String loaiHangHoa) { 
        this.loaiHangHoa = loaiHangHoa; 
    }
}