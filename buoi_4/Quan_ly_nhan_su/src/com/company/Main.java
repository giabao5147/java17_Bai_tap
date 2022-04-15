package com.company;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int choice = 0;
        DanhSachNhanVien danhSachNhanVien = new DanhSachNhanVien();
        CongTy congTy = new CongTy();
        Scanner sc = new Scanner(System.in);

        do {
            try {
                choice = showMenu();
                makeDecision(congTy, danhSachNhanVien, choice);
            } catch (Exception exception) {
                System.out.println("Xay ra loi: " + exception.toString());
            }
        } while (choice > 0);

    }

    public static int showMenu() {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Menu-----");
        System.out.println("0. Thoat");
        System.out.println("1. Nhap thong tin cong ty");
        System.out.println("2. Them nhan su");
        System.out.println("3. Xoa nhan su");
        System.out.println("4. Xuat thong tin toan bo nguoi trong cong ty");
        System.out.println("5. Xuat tong luong toan cong ty");
        System.out.println("6. Tim nhan vien thuong co luong cao nhat");
        System.out.println("7. Tim truong phong co so luong nhan vien duoi quyen nhieu nhat");
        System.out.println("8. Sap xep nhan vien toan cong ty theo thu tu abc");
        System.out.println("9. Sap xep nhan vien theo thu tu luong giam dan");
        System.out.println("10. Giam doc co so luong co phan nhieu nhat");
        System.out.println("11. Tong thu nhap cua tung giam doc");
        System.out.print("Lua chon: ");
        choice = sc.nextInt();
        if (choice == 2) {
            System.out.println("-----Them nhan su-----");
            System.out.println("1. Them nhan vien thuong");
            System.out.println("2. Them truong phong");
            System.out.println("3. Them giam doc");
            System.out.print("Lua chon: ");
            choice = sc.nextInt();
            if (choice == 1) {
                choice = 21;
            } else if (choice == 2) {
                choice = 22;
            } else if (choice == 3) {
                 choice = 23;
            }
        }
        if (choice == 3) {
            System.out.println("-----Xoa nhan su-----");
            System.out.println("1. Xoa nhan vien thuong theo ma so");
            System.out.println("2. Xoa truong phong theo ma so");
            System.out.println("3. Xoa giam doc theo ma so");
            System.out.print("Lua chon: ");
            choice = sc.nextInt();
            if (choice == 1) {
                choice = 31;
            } else if (choice == 2) {
                choice = 32;
            } else if (choice == 3) {
                choice = 33;
            }
        }
        return choice;
    }

    public static void makeDecision(CongTy congTy, DanhSachNhanVien danhSachNhanVien, int choice) {
        Scanner sc = new Scanner(System.in);
        NhanVienThuong nhanVienThuong;
        TruongPhong truongPhong;
        String maSoNhanVien;
        GiamDoc giamDoc;

        switch (choice) {
            case 0: //Thoat
                return;
            case 1: //Nhap thong tin cong ty
                congTy.nhap();
                break;
            case 21:    //Them nhan vien thuong
                nhanVienThuong = new NhanVienThuong();
                nhanVienThuong.nhap();
                danhSachNhanVien.themNhanVienThuong(nhanVienThuong);
                break;
            case 22:    //Them truong phong
                truongPhong = new TruongPhong();
                truongPhong.nhap();
                danhSachNhanVien.themTruongPhong(truongPhong);
                break;
            case 23:    //Them Giam doc
                giamDoc = new GiamDoc();
                giamDoc.nhap();
                danhSachNhanVien.themGiamDoc(giamDoc);
                break;
            case 31:    //Xoa nhan vien thuong theo ma so
                System.out.print("Nhap ma so nhan vien thuong can xoa: ");
                maSoNhanVien = sc.nextLine();
                danhSachNhanVien.xoaNhanVienThuong(maSoNhanVien);
                break;
            case 32:    //Xoa truong phong theo ma so
                System.out.print("Nhap ma so truong phong can xoa: ");
                maSoNhanVien = sc.nextLine();
                danhSachNhanVien.xoaTruongPhong(maSoNhanVien);
                break;
            case 33:    //Xoa giam doc theo ma so
                System.out.print("Nhap ma so giam doc can xoa: ");
                maSoNhanVien = sc.nextLine();
                danhSachNhanVien.xoaGiamDoc(maSoNhanVien);
                break;
            case 4: //Xuat toan bo nguoi trong cong ty
                danhSachNhanVien.xuatToanBoNguoi();
                break;
            case 5: //Tinh tong luong
                System.out.println("+ Tong luong toan cong ty: " +
                        danhSachNhanVien.tinhTongLuong());
                break;
            case 6: //Nhan vien thuong co luong cao nhat
                System.out.println("+ Nhan vien thuong co luong cao nhat: " +
                        danhSachNhanVien.timNVTLuongCaoNhat());
                break;
            case 7: //Truong phong co so luong nhan vien nhieu nhat
                System.out.println("+ Truong phong co so luong nhan vien duoi quyen nhieu nhat: " +
                        danhSachNhanVien.timTPCoNhieuNVnhat());
                break;
            case 8: //Sap xep nhan vien theo thu tu abc
                System.out.println("+ Danh sach nhan vien sap xep theo thu tu abc: ");
                danhSachNhanVien.sapXepNVtheoAbc().xuatToanBoNguoi();
                break;
            case 9: //Sap xep nhan vien theo thu tu luong giam dan
                System.out.println("+ Danh sach nhan vien sap xep theo thu tu luong giam dan: ");
                danhSachNhanVien.sapXepNVTheoLuong().xuatToanBoNguoi();
                break;
            case 10: //Giam doc co co phan nhieu nhat
                System.out.println("+ Giam doc co so luong co phan nhieu nhat:");
                danhSachNhanVien.timGDCoPhanNhieuNhat().xuat();
                break;
            case 11: //Tong thu nhap cua tung giam doc
                for (Map.Entry<String, NhanVien> nhanVien :
                danhSachNhanVien.getDanhSach().entrySet()) { //Tim cac giam doc trong danh sach nhan vien
                    if (nhanVien.getValue().getClass() == GiamDoc.class) {
                        giamDoc = (GiamDoc) nhanVien.getValue();
                        System.out.println("+ Ma so: " + giamDoc.getMaSo());
                        System.out.println(("- Ho ten: " + giamDoc.getHoTen()));
                        System.out.println("- Thu nhap: " + giamDoc.tinhThuNhap(congTy, danhSachNhanVien));
                    }
                }
                break;
            default:
                System.out.println("+ Khong ho tro");
        }
    }
}

