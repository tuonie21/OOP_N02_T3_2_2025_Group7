import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<HangHoa> danhSachHangHoa = new ArrayList<>();
        ArrayList<Ban> danhSachBan = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== QUẢN LÝ BÁN HÀNG ===");
            System.out.println("1. Nhập hàng hóa");
            System.out.println("2. Bán hàng hóa");
            System.out.println("3. Xem danh sách hàng hóa");
            System.out.println("4. Tìm kiếm hàng hóa");
            System.out.println("5. Tính doanh thu");
            System.out.println("6. Thoát");
            System.out.print("Chọn tùy chọn (1-6): ");

            int choice = input.nextInt();
            input.nextLine();  // Đọc bỏ newline

            if (choice == 1) {
                // Nhập hàng hóa mới
                System.out.print("Nhập ID hàng hóa: ");
                String id = input.nextLine();
                System.out.print("Nhập tên hàng hóa: ");
                String ten = input.nextLine();
                System.out.print("Nhập số lượng nhập: ");
                int soLuong = input.nextInt();
                System.out.print("Nhập giá nhập: ");
                double giaNhap = input.nextDouble();
                input.nextLine(); // Đọc bỏ newline
                System.out.print("Nhập ngày nhập (dd/MM/yyyy): ");
                String ngayNhap = input.nextLine();
                System.out.print("Nhập loại hàng hóa: ");
                String loai = input.nextLine();

                Nhap nhap = new Nhap(id, ten, soLuong, giaNhap, ngayNhap, loai);
                danhSachHangHoa.add(nhap);

                // Mặc định giá bán = giá nhập, số lượng bán = số lượng nhập ban đầu
                Ban ban = new Ban(id, ten, giaNhap, soLuong);
                danhSachBan.add(ban);

                System.out.println("Đã thêm hàng hóa và cập nhật danh sách bán.");
            } 
            else if (choice == 2) {
                // Bán hàng hóa
                if (danhSachBan.isEmpty()) {
                     System.out.println();
                    System.out.println("Chưa có hàng hóa để bán.");
                    continue;
                }
                System.out.print("Nhập ID hàng hóa cần bán: ");
                String idBan = input.nextLine();

                boolean found = false;
                for (Ban ban : danhSachBan) {
                    if (ban.getHangHoaID().equals(idBan)) {
                        found = true;
                        System.out.print("Nhập số lượng cần bán: ");
                        int soLuongBan = input.nextInt();
                        input.nextLine();

                        if (soLuongBan <= ban.getSoLuongBan()) {
                            ban.setSoLuongBan(ban.getSoLuongBan() - soLuongBan);
                            System.out.println("Bán thành công " + soLuongBan + " đơn vị hàng hóa.");
                        } else {
                            System.out.println("Số lượng bán vượt quá tồn kho!");
                        }
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Không tìm thấy hàng hóa với ID " + idBan);
                }
            } 
            else if (choice == 3) {
                // Hiển thị danh sách hàng hóa
                if (danhSachHangHoa.isEmpty()) {
                    System.out.println("Danh sách hàng hóa hiện tại trống!");
                } else {
                    System.out.println("Danh sách hàng hóa:");
                    for (HangHoa hh : danhSachHangHoa) {
                        System.out.println("- ID: " + hh.getHanghoaID() + ", Tên: " + hh.getTenHangHoa() +
                                           ", Số lượng: " + hh.getSoLuongHangHoa() +
                                           ", Giá nhập: " + hh.getGiaNhap() +
                                           ", Ngày nhập: " + hh.getNgayNhap() +
                                           ", Loại: " + hh.getLoaiHangHoa());
                    }
                }
            } 
            else if (choice == 4) {
                // Tìm kiếm hàng hóa theo ID
                System.out.print("Nhập ID hàng hóa cần tìm: ");
                String idTim = input.nextLine();
                boolean found = false;
                for (HangHoa hh : danhSachHangHoa) {
                    if (hh.getHanghoaID().equals(idTim)) {
                        System.out.println("Tìm thấy hàng hóa:");
                        System.out.println("- ID: " + hh.getHanghoaID() + ", Tên: " + hh.getTenHangHoa() +
                                           ", Số lượng: " + hh.getSoLuongHangHoa() +
                                           ", Giá nhập: " + hh.getGiaNhap() +
                                           ", Ngày nhập: " + hh.getNgayNhap() +
                                           ", Loại: " + hh.getLoaiHangHoa());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Không tìm thấy hàng hóa với ID " + idTim);
                }
            } 
            else if (choice == 5) {
                // Tính doanh thu
                double tongTienBan = 0;
                double tongTienNhap = 0;

                for (Ban ban : danhSachBan) {
                    int soLuongBan = ban.getSoLuongBan();
                    double giaBan = ban.getGiaBan();
                    // Doanh thu = (Số lượng ban đầu - Số lượng còn lại) * giá bán
                    // Giả sử bạn cần lưu số lượng ban đầu trong Ban thì cần thêm biến lưu
                }

                for (HangHoa hh : danhSachHangHoa) {
                    tongTienNhap += hh.getGiaNhap() * hh.getSoLuongHangHoa();
                }

                // Ở đây bạn cần tính đúng doanh thu thực tế, có thể cải tiến thêm
                System.out.println("Tổng tiền nhập hàng: " + tongTienNhap);
                // Hiện tại chưa tính được doanh thu chính xác nếu không lưu số lượng bán đã bán

                System.out.println("Chức năng tính doanh thu đang được cải tiến.");
            } 
            else if (choice == 6) {
                System.out.println("Thoát chương trình. Cảm ơn bạn đã sử dụng!");
                break;
            } 
            else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
        input.close();
    }
}
