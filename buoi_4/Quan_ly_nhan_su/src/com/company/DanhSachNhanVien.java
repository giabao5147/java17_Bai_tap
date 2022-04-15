package com.company;

import java.util.*;

public class DanhSachNhanVien {
    private Map<String,NhanVien> danhSach;

    public DanhSachNhanVien() {
        danhSach = new HashMap<>();
    }

    public boolean themNhanVienThuong(NhanVienThuong nhanVienThuong) {
        TruongPhong truongPhong;
        if (nhanVienThuong.getTruongPhongQuanLy().equals("")) { //Khong chi dinh truong phong quan ly, gan truong phong bang null
            nhanVienThuong.setTruongPhongQuanLy(null);
            danhSach.put(nhanVienThuong.getMaSo(), nhanVienThuong);
            System.out.println("[Da them nhan vien thuong]");
            return true;
        }
        if (danhSach.containsKey(nhanVienThuong.getTruongPhongQuanLy())) {    //Ton tai nhan vien truong phong
            truongPhong = (TruongPhong)danhSach.get(nhanVienThuong.getTruongPhongQuanLy());
            int count = truongPhong.getSoLuongNhanVien();
            truongPhong.setSoLuongNhanVien(++count);    //Tang so luong nhan vien truong phong quan ly
            danhSach.put(truongPhong.getMaSo(), truongPhong);
            danhSach.put(nhanVienThuong.getMaSo(), nhanVienThuong); //Them nhan vien thuong vao danh sach
            System.out.println("[Da them nhan vien thuong]");
            return true;
        }
        System.out.println("[Khong tim thay truong phong]");    //Thieu truong phong
        return false;
    }

    public boolean themTruongPhong(TruongPhong truongPhong) {
        if (danhSach.containsKey(truongPhong.getMaSo())) {  //Kiem tra ma so truong phong
            System.out.println("[Da ton tai ma so]");
            return false;
        }
        danhSach.put(truongPhong.getMaSo(), truongPhong);   //Them truong phong vao danh sach
        System.out.println("[Da them truong phong]");
        return true;
    }

    public boolean themGiamDoc(GiamDoc giamDoc) {
        if (danhSach.containsKey(giamDoc.getMaSo())) {
            System.out.println("[Da ton tai ma so]");
            return false;
        }
        danhSach.put(giamDoc.getMaSo(), giamDoc);   //Them giam doc vao danh sach
        System.out.println("[Da them giam doc]");
        return true;
    }

    public boolean xoaNhanVienThuong(String maSoNhanVienThuong) {
        TruongPhong truongPhong;
        NhanVienThuong nhanVienThuong;

        if (danhSach.containsKey(maSoNhanVienThuong)
                && danhSach.get(maSoNhanVienThuong).getClass() == NhanVienThuong.class) {   //Kiem tra ton tai cua ma so va ma do thuoc ve nhan vien thuong
            nhanVienThuong = (NhanVienThuong)danhSach.get(maSoNhanVienThuong);
            if (!nhanVienThuong.getTruongPhongQuanLy().equals("")) {
                truongPhong = (TruongPhong)danhSach.get(nhanVienThuong.getTruongPhongQuanLy()); //Lay truong phong quan ly cua nhan vien
                int count = truongPhong.getSoLuongNhanVien();
                truongPhong.setSoLuongNhanVien(--count);
                danhSach.put(truongPhong.getMaSo(), truongPhong);   //Cap nhat so nhan vien quan ly cua truong phong
            }
            danhSach.remove(maSoNhanVienThuong);
            System.out.println("[Da xoa nhan vien thuong]");
            return true;
        }
        System.out.println("[Khong tim thay ma so nhan vien thuong]");
        return false;
    }

    public boolean xoaTruongPhong(String maSoTruongPhong) {
        NhanVienThuong nhanVienThuong;

        if (danhSach.containsKey(maSoTruongPhong) &&
                danhSach.get(maSoTruongPhong).getClass() == TruongPhong.class) {    //Kiem tra ton tai ma so va ma do thuoc ve truong phong
            TruongPhong truongPhong = (TruongPhong)danhSach.get(maSoTruongPhong);
            for (Map.Entry<String,NhanVien> entry : danhSach.entrySet()) {  //Tim cac nhan vien thuong thuoc truong phong quan ly
                if (entry.getValue().getClass() == NhanVienThuong.class) {  //Xac dinh nhan vien thuong
                    nhanVienThuong = (NhanVienThuong) entry.getValue();
                    if (nhanVienThuong.getTruongPhongQuanLy().equals(truongPhong.getMaSo())) {
                        nhanVienThuong.setTruongPhongQuanLy(null);  //Xoa truong phong quan ly cua nhan vien tuong ung
                        danhSach.put(nhanVienThuong.getMaSo(), nhanVienThuong);
                    }
                }
            }
            danhSach.remove(maSoTruongPhong); //Xoa truong phong khoi danh sach
            System.out.println("[Da xoa truong phong]");
            return true;
        }
        System.out.println("[Khong tim thay ma so truong phong]");
        return false;
    }

    public boolean xoaGiamDoc(String maSoGiamDoc) {
        if (danhSach.containsKey(maSoGiamDoc) &&
                danhSach.get(maSoGiamDoc).getClass() == GiamDoc.class) {    //Kiem tra ton tai ma so va ma do thuoc ve giam doc
            danhSach.remove(maSoGiamDoc);   //Xoa giam doc khoi danh sach
            System.out.println("[Da xoa giam doc]");
            return true;
        }
        System.out.println("[Khong tim thay ma so giam doc]");
        return false;
    }

    public void xuatToanBoNguoi() {
        for (Map.Entry<String, NhanVien> nhanVien : danhSach.entrySet()){
            nhanVien.getValue().xuat();
        }
    }

    public double tinhTongLuong() { //Tinh tong luong cua tat ca nhan vien
        double result = 0;

        for (Map.Entry<String, NhanVien> nhanVien : danhSach.entrySet()){
            result += nhanVien.getValue().tinhLuong();
        }
        return result;
    }

    public NhanVienThuong timNVTLuongCaoNhat() {
        double max = 0;
        NhanVienThuong result = null;
        NhanVienThuong nhanVienThuong;

        for (Map.Entry<String, NhanVien> nhanVien : danhSach.entrySet()){   //Tim nhan vien thuong trong danh sach
            if (nhanVien.getValue().getClass() == NhanVienThuong.class) {
                nhanVienThuong = (NhanVienThuong)nhanVien.getValue();
                if (nhanVienThuong.tinhLuong() >= max) {    //Tim luong cao nhat
                    max = nhanVienThuong.tinhLuong();
                    result = nhanVienThuong;
                }
            }
        }
        return result;
    }

    public TruongPhong timTPCoNhieuNVnhat() {
        int max = 0;
        TruongPhong truongPhong;
        TruongPhong result = null;

        for (Map.Entry<String, NhanVien> nhanVien : danhSach.entrySet()){   //Tim nhan vien thuong trong danh sach
            if (nhanVien.getValue().getClass() == TruongPhong.class) {
                truongPhong = (TruongPhong)nhanVien.getValue();
                if (truongPhong.getSoLuongNhanVien() >= max) {    //Tim luong cao nhat
                    max = truongPhong.getSoLuongNhanVien();
                    result = truongPhong;
                }
            }
        }
        return result;
    }

    public DanhSachNhanVien sapXepNVtheoAbc() {
        DanhSachNhanVien result = new DanhSachNhanVien();
        ArrayList<Map.Entry<String,NhanVien>> arrayList = new ArrayList<>();

        arrayList.addAll(danhSach.entrySet());  //Chuyen DanhSachNhanVien ve dang mang
        Comparator<Map.Entry<String,NhanVien>> compareByHoTen = new Comparator<Map.Entry<String,NhanVien>>() {  //Sap xep collection bang comparator
            @Override
            public int compare(Map.Entry<String,NhanVien> nhanVien1, Map.Entry<String,NhanVien> nhanVien2) {
                return nhanVien1.getValue().getHoTen().compareToIgnoreCase(nhanVien2.getValue().getHoTen());    //Sap xep tang dan theo ho ten
            }
        };
        arrayList.sort(compareByHoTen);    //Sap xep mang nhan vien
        result.danhSach = new LinkedHashMap<>();
        for (Map.Entry<String, NhanVien> nhanVien: arrayList){  //Chuyen mang ve DanhSachNhanVien
            result.danhSach.put(nhanVien.getKey(),nhanVien.getValue());
        }
        return result;
    }

    public DanhSachNhanVien sapXepNVTheoLuong() {
        DanhSachNhanVien result = new DanhSachNhanVien();
        ArrayList<Map.Entry<String,NhanVien>> arrayList = new ArrayList<>();

        arrayList.addAll(danhSach.entrySet());  //Chuyen DanhSachNhanVien ve dang mang
        Comparator<Map.Entry<String,NhanVien>> compareByLuong = new Comparator<Map.Entry<String,NhanVien>>() {  //Sap xep collection bang comparator
            @Override
            public int compare(Map.Entry<String,NhanVien> nhanVien1, Map.Entry<String,NhanVien> nhanVien2) {
                if (nhanVien2.getValue().tinhLuong() > nhanVien1.getValue().tinhLuong()) {  //Sap xep giam dan theo luong
                    return 1;
                } else if (nhanVien2.getValue().tinhLuong() < nhanVien1.getValue().tinhLuong()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        arrayList.sort(compareByLuong);    //Sap xep mang nhan vien
        result.danhSach = new LinkedHashMap<>();
        for (Map.Entry<String, NhanVien> nhanVien: arrayList){  //Chuyen mang ve DanhSachNhanVien
            result.danhSach.put(nhanVien.getKey(),nhanVien.getValue());
        }
        return result;
    }

    public GiamDoc timGDCoPhanNhieuNhat() {
        double max = 0;
        GiamDoc giamDoc;
        GiamDoc result = null;

        for (Map.Entry<String, NhanVien> nhanVien : danhSach.entrySet() ){  //Tim cac nhan vien la giam doc
            if (nhanVien.getValue().getClass() == GiamDoc.class) {
                giamDoc = (GiamDoc)nhanVien.getValue();
                if (giamDoc.getCoPhan() >= max) {   //Tim giam doc co so luong co phan nhieu nhat
                    max = giamDoc.getCoPhan();
                    result = giamDoc;
                }
            }
        }
        return result;
    }

    public Map<String, NhanVien> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(Map<String, NhanVien> danhSach) {
        this.danhSach = danhSach;
    }
}
