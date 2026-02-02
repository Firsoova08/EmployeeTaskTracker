class Employee {
    private var fullName: String = ""
    private var position: String = ""
    private var salary: Int = 0
    private var yearsOfExperience: Int = 0
    fun getFullName(): String {
        return fullName
    }
    fun getPosition(): String {
        return position
    }
    fun getSalary(): Int {
        return salary
    }
    fun getYearsOfExperience(): Int {
        return yearsOfExperience
    }
    fun setFullName(name: String) {
        fullName = name
    }
    fun setPosition(pos: String) {
        position = pos
    }
    fun setSalary(sal: Int) {
        if (sal >= 0) {
            salary = sal
        } else {
            println("Внимание: зарплата не может быть отрицательной! Оставляем старое значение: $salary")
        }
    }
    fun setYearsOfExperience(years: Int) {
        if (years >= 0 && years <= 50) {
            yearsOfExperience = years
        } else if (years < 0) {
            println("Внимание: опыт работы не может быть отрицательным! Устанавливаем 0.")
            yearsOfExperience = 0
        } else {
            println("Внимание: опыт работы ограничен 50 годами! Устанавливаем 50.")
            yearsOfExperience = 50
        }
    }
    fun displayInfo() {
        println("Сотрудник: $fullName")
        println("Должность: $position")
        println("Зарплата: $salary руб.")
        println("Опыт работы: $yearsOfExperience лет")
    }
}