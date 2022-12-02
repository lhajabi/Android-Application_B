import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.menuoptions.MainActivity
import com.example.menuoptions.R

class DialogFragmentOne:DialogFragment(R.layout.one_fragment_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val back: Button = view.findViewById(R.id.button);
        val submit: Button = view.findViewById(R.id.submit);
        val server: EditText = view.findViewById(R.id.name);
        back.setOnClickListener {
            dismiss()
        }
        submit.setOnClickListener {
            Toast.makeText(context,server.text,Toast.LENGTH_SHORT).show()
            val m1:MainActivity = getActivity() as MainActivity;
            m1.receiveFeedback(server.text.toString())
            dismiss()
        }

    }
}
