package com.example.menuoptions
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment

class DialogFragmentTwo:DialogFragment(R.layout.two_fragment_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val back: Button = view.findViewById(R.id.buttonBack);
        back.setOnClickListener {
            dismiss()
        }
    }
}
