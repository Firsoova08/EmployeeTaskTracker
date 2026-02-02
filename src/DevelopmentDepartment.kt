class DevelopmentDepartment : Department(),  ReportGenerator {
    override val departmentName = "Отдел разработки"
    override fun printDepartmentGoal() {
        println("Цель: Писать чистый код")
    }
    override fun generateReport(): String {
        return """
            Название: $departmentName
            Цель: Писать чистый код
            Тип: Разработка
        """.trimIndent()
    }
}