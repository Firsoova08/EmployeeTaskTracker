fun main() {
    val employee = Employee()
    employee.setFullName("Иванов Иван Иванович")
    employee.setPosition("Разработчик")
    employee.setSalary(75000)
    employee.setYearsOfExperience(3)
    println("Информация о сотруднике:")
    println("ФИО: ${employee.getFullName()}")
    println("Должность: ${employee.getPosition()}")
    println("Зарплата: ${employee.getSalary()}")
    println("Опыт работы: ${employee.getYearsOfExperience()} лет")
    println("\nИли через displayInfo():")
    employee.displayInfo()
}