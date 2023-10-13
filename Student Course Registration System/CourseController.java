@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/courses")
    public String showCourses(Model model) {
        List<Course> courses = courseService.getAvailableCourses();
        model.addAttribute("courses", courses);
        return "courses";
    }

    @PostMapping("/register")
    public String registerCourse(@RequestParam String studentId, @RequestParam Long courseId) {
        studentService.registerCourse(studentId, courseId);
        return "redirect:/courses";
    }

    @PostMapping("/drop")
    public String dropCourse(@RequestParam String studentId, @RequestParam Long courseId) {
        studentService.dropCourse(studentId, courseId);
        return "redirect:/courses";
    }
}
