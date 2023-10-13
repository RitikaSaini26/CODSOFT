public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByStudentId(String studentId);
}
