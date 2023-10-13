@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseService courseService;

    public Student getStudentByStudentId(String studentId) {
        return studentRepository.findByStudentId(studentId);
    }

    public void registerCourse(String studentId, Long courseId) {
        Student student = getStudentByStudentId(studentId);
        Course course = courseService.getCourseById(courseId);

        if (student != null && course != null && course.getCapacity() > 0) {
            student.getCourses().add(course);
            course.setCapacity(course.getCapacity() - 1);
            studentRepository.save(student);
        }
    }

    public void dropCourse(String studentId, Long courseId) {
        Student student = getStudentByStudentId(studentId);
        Course course = courseService.getCourseById(courseId);

        if (student != null && course != null && student.getCourses().contains(course)) {
            student.getCourses().remove(course);
            course.setCapacity(course.getCapacity() + 1);
            studentRepository.save(student);
        }
    }
}
