package services

case class Student(id: Int, name: String, age: Int)

object StudentService {
  def listStudents(): List[Student] = {
    list(
      Student(1, "Alice", 20),
      Student(2, "Bob", 23),
      Student(3, "Charlie", 19)
    )
  }
}
