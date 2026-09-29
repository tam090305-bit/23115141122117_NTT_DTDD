package com.example.employeeinfo_23115141122117

import java.text.NumberFormat
import java.util.Locale

fun Double.toVndFormat(): String {
    val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
    return formatter.format(this)
}

fun Employee.getDetailsSummary(): String {
    val uppercaseName = this.name.uppercase(Locale("vi", "VN"))
    val classification = when {
        this.seniority >= 5 -> "Nhân viên kỳ cựu"
        this.seniority >= 2 -> "Nhân viên chính thức"
        else -> "Nhân viên mới"
    }
    return "$uppercaseName - $classification (Thâm niên: ${this.seniority} năm)"
}