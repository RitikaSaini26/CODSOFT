@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAvailableCourses() {
        return courseRepository.findByCapacityGreaterThan(0);
    }

    public Course getCourseById(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }
}
