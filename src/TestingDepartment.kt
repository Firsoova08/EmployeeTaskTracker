class TestingDepartment :Department() {
    override val departmentName = "Отдел тестирования"
    override fun printDepartmentGoal() {
        println("Цель: Находить все баги")
    }
}