package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Nhập giá trị của n: ");	
//	  	int n = scanner.nextInt();
//
//		 double tong = tinhTong(n);
//
//		 System.out.println("Tổng S là: " + tong);
//		    }
//
//		    static double tinhTong(int n) {
//		        double tong = 0.0;
//		        for (int i = 1; i <= n; i++) {
//		            tong += 1.0 / (i * i);
//		        }
//		        return tong;
//			}
//
//   }
//	  bt2
//		  Scanner scanner = new Scanner(System.in);
//
//		  // Nhập vào 4 số nguyên
//		  System.out.print("Nhập số thứ nhất: ");
//		        int so1 = scanner.nextInt();
//
//		        System.out.print("Nhập số thứ hai: ");
//		        int so2 = scanner.nextInt();
//
//		        System.out.print("Nhập số thứ ba: ");
//		        int so3 = scanner.nextInt();
//
//		        System.out.print("Nhập số thứ tư: ");
//		        int so4 = scanner.nextInt();
//
//		        // Kiểm tra và in ra số lượng số chẵn và số lẻ
//		        int soChan = 0;
//		        int soLe = 0;
//
//		        if (so1 % 2 == 0) {
//		            soChan++;
//		        } else {
//		            soLe++;
//		        }
//
//		        if (so2 % 2 == 0) {
//		            soChan++;
//		        } else {
//		            soLe++;
//		        }
//
//		        if (so3 % 2 == 0) {
//		            soChan++;
//		        } else {
//		            soLe++;
//		        }
//
//		        if (so4 % 2 == 0) {
//		            soChan++;
//		        } else {
//		            soLe++;
//		        }
//
//		        System.out.println("Số lượng số chẵn: " + soChan);
//		        System.out.println("Số lượng số lẻ: " + soLe);
//			}
//  }
//				bt3
//				 Scanner scanner = new Scanner(System.in);
//
//			        System.out.print("Nhập điểm trung bình của sinh viên: ");
//			        double dtb = scanner.nextDouble();
//
//			        xepLoaiHocLuc(dtb);
//			    }
//
//			    static void xepLoaiHocLuc(double dtb) {
//			        if (dtb >= 8) {
//			            System.out.println("Học lực: Giỏi");
//			        } else if (dtb >= 6.5 && dtb < 8) {
//			            System.out.println("Học lực: Khá");
//			        } else if (dtb < 6.5) {
//			            System.out.println("Học lực: Trung bình");
//			        } else {
//			            System.out.println("Điểm không hợp lệ");
//			        }
//			    }
//			}
//				bt4
//				Scanner scanner = new Scanner(System.in);
//
//		        // Nhập số chữ điện tiêu thụ
//		        System.out.print("Nhập số chữ điện tiêu thụ trong tháng: ");
//		        int soChuDien = scanner.nextInt();
//
//		        // Tính số tiền phải trả
//		        double soTien = tinhTienDien(soChuDien);
//
//		        System.out.println("Số tiền phải trả là: " + soTien + " VND");
//		    }
//
//		    static double tinhTienDien(int soChu) {
//		        double gia1 = 1800;
//		        double gia2 = 2500;
//		        double gia3 = 3000;
//
//		        double soTien = 0.0;
//
//		        if (soChu >= 1 && soChu <= 100) {
//		            soTien = soChu * gia1;
//		        } else if (soChu <= 200) {
//		            soTien = 100 * gia1 + (soChu - 100) * gia2;
//		        } else {
//		            soTien = 100 * gia1 + 100 * gia2 + (soChu - 200) * gia3;
//		        }
//
//		        return soTien;
//		    }
//}
//				btap5
//				Scanner scanner = new Scanner(System.in);
//
//				System.out.print("Nhập điểm trung bình của sinh viên: ");
//				double diemTrungBinh = scanner.nextDouble();
//
//				if (diemTrungBinh >= 8.0) {
//					System.out.println("Học lực: Giỏi");
//				} else if (diemTrungBinh >= 6.5) {
//					System.out.println("Học lực: Khá");
//				} else {
//					System.out.println("Học lực: Trung bình");
//				}
//
//				scanner.close();
//			}
//  }
//				Mức 2
//				btap1
//				Scanner scanner = new Scanner(System.in);
//
//    
//		        System.out.print("Nhập giá trị n: ");
//		        int n = scanner.nextInt();
//
//		       
//		        double tong = tinhTong(n);
//
//		     
//		        System.out.println("Tổng của dãy số là: " + tong);
//
//		       
//		        scanner.close();
//		    }
//
//			public static double tinhTong(int n) {
//				double tong = 0.0;
//
//				for (int i = 1; i <= n; i++) {
//					tong += 1.0 / (i * i);
//				}
//
//				return tong;
//			}
//}
//				btap2
//				Scanner scanner = new Scanner(System.in);
//
//				System.out.print("Nhập giá trị n: ");
//				int n = scanner.nextInt();
//
//				double tong = tinhTong(n);
//
//				System.out.println("Tổng của dãy số là: " + tong);
//
//				scanner.close();
//			}
//
//			public static double tinhTong(int n) {
//				double tong = 0.0;
//
//				for (int i = 1; i <= n; i++) {
//					tong += Math.sqrt(i);
//				}
//
//				return tong;
//			}
// }
//				btap3
//				  Scanner scanner = new Scanner(System.in);
//
//		       
//		        System.out.print("Nhập giá trị n: ");
//		        int n = scanner.nextInt();
//
//		        double tong = tinhTong(n);
//
//		       
//		        System.out.println("Tổng của dãy số là: " + tong);
//
//		        
//		        scanner.close();
//		    }
//
//			public static double tinhTong(int n) {
//				double tong = 0.0;
//
//				for (int i = 1; i <= n; i++) {
//					tong += 1.0 / Math.sqrt(i);
//				}
//
//				return tong;
//			}
//  }
//				btap4
//		        Scanner scanner = new Scanner(System.in);
//
//		      
//		        System.out.print("Nhập giá trị n: ");
//		        int n = scanner.nextInt();
//
//		       
//		        double tong = tinhTong(n);
//
//		       
//		        System.out.println("Tổng của dãy số là: " + tong);
//
//		       
//		        scanner.close();
//		    }
//
//			public static double tinhTong(int n) {
//				double tong = 0.0;
//
//				for (int i = 1; i <= n; i++) {
//					tong += i / Math.sqrt(i * (i + 1));
//				}
//
//				return tong;
//			}
//   }
//				MỨc 3
//				btap1
//				 Scanner scanner = new Scanner(System.in);
//
//			     System.out.println("Nhập các phần tử của mảng:");
//			     for (int i = 0; i < mang.length; i++) {
//			      System.out.print("Phần tử thứ " + (i + 1) + ": ");
//			      mang[i] = scanner.nextInt();
//			        }
//			    }
//
//			    // Hàm sắp xếp mảng tăng dần
//			    public static void sapXepTangDan(int[] mang) {
//			        Arrays.sort(mang);
//			    }
//
//			    // Hàm sắp xếp mảng giảm dần
//			    public static void sapXepGiamDan(int[] mang) {
//			        Arrays.sort(mang);
//			        int n = mang.length;
//			        for (int i = 0; i < n / 2; i++) {
//			            int temp = mang[i];
//			            mang[i] = mang[n - i - 1];
//			            mang[n - i - 1] = temp;
//			        }
//			    }
//
//			    // Hàm in mảng
//			    public static void inMang(int[] mang) {
//			        System.out.println("Mảng sau khi sắp xếp:");
//			        for (int i = 0; i < mang.length; i++) {
//			            System.out.print(mang[i] + " ");
//			        }
//			        System.out.println();
//			    }
//
//			    public static void main(String[] args) {
//			        Scanner scanner = new Scanner(System.in);
//
//			        System.out.print("Nhập số phần tử của mảng: ");
//			        int n = scanner.nextInt();
//
//			        // Khởi tạo mảng
//			        int[] mang = new int[n];
//
//			        // Nhập mảng
//			        nhapMang(mang);
//
//			        // Sắp xếp mảng tăng dần
//			        sapXepTangDan(mang);
//			        System.out.println("Mảng sau khi sắp xếp tăng dần:");
//			        inMang(mang);
//
//			        // Sắp xếp mảng giảm dần
//			        sapXepGiamDan(mang);
//			        System.out.println("Mảng sau khi sắp xếp giảm dần:");
//			        inMang(mang);
//			    
//			}
// }
//   btap2
//	btap3
//				 Scanner scanner = new Scanner(System.in);
//
//			        // Nhập giá trị n từ người dùng
//			        System.out.print("Nhập giá trị n: ");
//			        int n = scanner.nextInt();
//
//			        // Tính tổng
//			        double tong = tinhTong(n);
//
//			        // Hiển thị kết quả
//			        System.out.println("Tổng của dãy số là: " + tong);
//
//			        // Đóng đối tượng Scanner sau khi sử dụng
//			        scanner.close();
//			    }
//
//			    // Phương thức tính tổng theo công thức đã cho
//			    public static double tinhTong(int n) {
//			        double tong = 1.0;
//
//			        for (int i = 2; i <= n; i++) {
//			            tong += Math.pow(i, 2) / tinhGiaiThua(i);
//			        }
//
//			        return tong;
//			    }
//
//			    // Phương thức tính giai thừa
//			    public static long tinhGiaiThua(int m) {
//			        long giaiThua = 1;
//
//			        for (int i = 1; i <= m; i++) {
//			            giaiThua *= i;
//			        }
//
//			        return giaiThua;
//			    }
//			}
//				btap4
//				Scanner scanner = new Scanner(System.in);
//
//		        System.out.println("Nhập các phần tử của mảng:");
//		        for (int i = 0; i < mang.length; i++) {
//		            System.out.print("Phần tử thứ " + (i + 1) + ": ");
//		            mang[i] = scanner.nextInt();
//		        }
//		    }
//
//		    // Hàm kiểm tra số nguyên tố
//		    public static boolean laSoNguyenTo(int n) {
//		        if (n < 2) {
//		            return false;
//		        }
//		        for (int i = 2; i <= Math.sqrt(n); i++) {
//		            if (n % i == 0) {
//		                return false;
//		            }
//		        }
//		        return true;
//		    }
//
//		    // Hàm đếm số nguyên tố trong mảng
//		    public static int demSoNguyenTo(int[] mang) {
//		        int dem = 0;
//		        for (int i = 0; i < mang.length; i++) {
//		            if (laSoNguyenTo(mang[i])) {
//		                dem++;
//		            }
//		        }
//		        return dem;
//		    }
//
//		    public static void main(String[] args) {
//		        Scanner scanner = new Scanner(System.in);
//
//		        System.out.print("Nhập số phần tử của mảng: ");
//		        int n = scanner.nextInt();
//
//		        // Khởi tạo mảng
//		        int[] mang = new int[n];
//
//		        // Nhập mảng
//		        nhapMang(mang);
//
//		        // Đếm số nguyên tố trong mảng
//		        int soLuongSoNguyenTo = demSoNguyenTo(mang);
//		        System.out.println("Số lượng số nguyên tố trong mảng: " + soLuongSoNguyenTo);
	}

}
