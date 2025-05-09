import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CourseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_course, container, false)

        val courseName = arguments?.getString("name")
        val courseDescription = arguments?.getString("description")
        val courseDuration = arguments?.getString("duration")

        view.findViewById<TextView>(R.id.textCourseName).text = courseName
        view.findViewById<TextView>(R.id.textCourseDescription).text = courseDescription
        view.findViewById<TextView>(R.id.textCourseDuration).text = courseDuration

        return view
    }

    companion object {
        fun newInstance(course: Course): CourseFragment {
            val fragment = CourseFragment()
            val bundle = Bundle().apply {
                putString("name", course.name)
                putString("description", course.description)
                putString("duration", course.duration)
            }
            fragment.arguments = bundle
            return fragment
        }
    }
}
