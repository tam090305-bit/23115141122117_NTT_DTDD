# Ứng dụng Quản lý Thông tin Nhân viên - EmployeeInfo

## Thông tin sinh viên
- **MSSV:** 23115141122117
- **Họ tên:** Nguyễn Thanh Tâm
- **Tên Project:** EmployeeInfo_23115141122117

## Chi tiết kỹ thuật
- **Model (`Employee.kt`):** Lưu trữ thông tin nhân viên (Mã NV, Họ tên, Phòng ban, Tuổi, Lương, Giới tính, Thâm niên, Email).
- **Extension Function (`EmployeeExtensions.kt`):**
    - `toVndFormat()`: Định dạng chuẩn tiền tệ Việt Nam (VND).
    - `getDetailsSummary()`: Chuyển đổi tên viết hoa và xếp loại nhân viên dựa trên số năm thâm niên.
- **Yêu cầu mở rộng cá nhân:**
    - Hiển thị mức lương định dạng đặc biệt.
    - Hiển thị tên viết hoa.
    - Xếp loại mức độ nhân viên dựa trên thâm niên.
    - Bổ sung thông tin Email lên giao diện.