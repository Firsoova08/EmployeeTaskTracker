class Employee {
    private var fullName: String = ""
    private var position: String = ""
    private var salary: Int = 0
    private var yearsOfExperience: Int = 0
    fun getFullName(): String {
        return fullName
    }
    fun setFullName(name: String) {
        fullName = name
    }
    fun getPosition(): String {
        return position
    }
    fun setPosition(pos: String) {
        position = pos
    }
    fun getSalary(): Int {
        return salary
    }
    fun setSalary(sal: Int) {
        salary = sal
    }
    fun getYearsOfExperience(): Int {
        return yearsOfExperience
    }
    fun setYearsOfExperience(years: Int) {
        yearsOfExperience = years
    }
    fun displayInfo() {
        println("Сотрудник: $fullName")
        println("Должность: $position")
        println("Зарплата: $salary руб.")
        println("Опыт работы: $yearsOfExperience лет")
    }
}