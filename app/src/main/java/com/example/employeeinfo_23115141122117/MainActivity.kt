package com.example.employeeinfo_23115141122117

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Khởi tạo dữ liệu nhân viên riêng của bạn
        val employee = Employee(
            id = "23115141122117",
            name = "Nguyễn Thanh Tâm",
            department = "Khoa Công nghệ Thông tin",
            age = 21,
            salary = 16800000.0,
            gender = "Nữ",
            seniority = 4,
            email = "23115141122117.sv.ute.udn.vn"
        )

        // 2. Ánh xạ các thành phần TextView từ giao diện XML
        val tvEmployeeId = findViewById<TextView>(R.id.tvEmployeeId)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvDepartment = findViewById<TextView>(R.id.tvDepartment)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvGender = findViewById<TextView>(R.id.tvGender)
        val tvSeniority = findViewById<TextView>(R.id.tvSeniority)
        val tvSalary = findViewById<TextView>(R.id.tvSalary)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvExtensionResult = findViewById<TextView>(R.id.tvExtensionResult)

        // 3. Đưa dữ liệu lên giao diện
        tvEmployeeId.text = "Mã nhân viên: ${employee.id}"
        tvName.text = "Họ tên: ${employee.name}"
        tvDepartment.text = "Phòng ban: ${employee.department}"
        tvAge.text = "Tuổi: ${employee.age}"
        tvGender.text = "Giới tính: ${employee.gender}"
        tvSeniority.text = "Thâm niên: ${employee.seniority} năm"

        // Gọi Extension Function định dạng lương VND
        tvSalary.text = "Mức lương: ${employee.salary.toVndFormat()}"

        // Thông tin bổ sung
        tvEmail.text = "Email liên hệ: ${employee.email}"

        // Gọi Extension Function xử lý tên viết hoa và xếp loại thâm niên
        tvExtensionResult.text = "Đánh giá: ${employee.getDetailsSummary()}"
    }
}