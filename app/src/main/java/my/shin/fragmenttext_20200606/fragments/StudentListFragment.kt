package my.shin.fragmenttext_20200606.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_student_list.*
import my.shin.fragmenttext_20200606.R
import my.shin.fragmenttext_20200606.adapters.StudentAdapter
import my.shin.fragmenttext_20200606.datas.Student

class StudentListFragment : BaseFragment() {

    val studentlist = ArrayList<Student>()

    lateinit var mStudentAdapter: StudentAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_list, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

    }

    override fun setValues() {

        studentlist.add(Student("조경진", 1988, true))
        studentlist.add(Student("김광철", 1966, true))
        studentlist.add(Student("김재환", 1993, true))
        studentlist.add(Student("박수정", 1994, false))
        studentlist.add(Student("신용성", 1988, true))
        studentlist.add(Student("엄곤지", 1984, false))
        studentlist.add(Student("이승원", 1978, true))
        studentlist.add(Student("이현호", 1981, true))

        mStudentAdapter = StudentAdapter(activity as Context, R.layout.student_list_item, studentlist)
        studentListView.adapter = mStudentAdapter
    }


}