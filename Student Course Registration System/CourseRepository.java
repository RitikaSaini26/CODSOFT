public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByCapacityGreaterThan(int capacity);
}
