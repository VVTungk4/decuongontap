package baitapdecuong3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/*a.(1 điểm) Hãy định nghĩa class Person với các thuộc tính: Họ tên, ngày sinh, địa chỉ, giới tính và các phương thức khởi tạo, hiển thị thông tin.
b.(1 điểm) Định nghĩa class NhanVien kế thừa từ Person, có thêm các thuộc tính: phòng ban, hệ số lương, thâm niên, lương cơ bản và các phương thức khởi tạo, tính lương thực lĩnh, hiển thị thông tin cá nhân
Trong đó: lương thực lĩnh = Lương cơ bản * hệ số (1 + thâm niên/100)
c.(3 điểm) Hãy đọc file nhanvien.dat gồm danh sách các nhân viên với định dạng lưu trữ như sau: mỗi nhân viên được lưu trên 1 dòng, mỗi thuộc tính phân cách bởi ký tự “$”. Dữ liệu đọc được lưu dưới dạng một mảng các đối tượng nhân viên (arraylist)
d.(3 điểm) Hiển thị danhs sách trên console, sinh viên tự tạo file nhanvien.dat và bổ sung menu chức năng nếu cần thiết.
*/
public class Main {
	public static void main(String[] args) {
		ArrayList<NhanVien> ds = new ArrayList<>();

		// đọc từ file
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("D:\\LAPTRINHJAVA\\nv1.txt")));
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] a = line.split("\\$");
				NhanVien nv = new NhanVien();
				nv.setHoTen(a[0]);
				nv.setNgaySinh(a[1]);
				nv.setDiaChi(a[2]);
				nv.setGioiTinh(a[3]);
				nv.setPhongBan(a[4]);
				nv.setHeSoLuong(Double.parseDouble(a[5]));
				nv.setThamNien(Double.parseDouble(a[6]));
				nv.setLuongCoBan(Double.parseDouble(a[7]));
				ds.add(nv);
			}

			br.close();
			System.out.println("Đọc thành công");
		} catch (Exception e) {
			System.out.println("Thất bại");
			e.printStackTrace();
		}
		// In danh sách đã đọc được lên cônsolo
		for (NhanVien d : ds) {
			d.hienThi();
		}
	}
}
