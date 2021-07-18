package gr.sbozikas.utopiaengine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view.findViewById<Button>(R.id.new_game_button).setOnClickListener { view: View ->
//            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_wildernessFragment)
//        }
        view.findViewById<Button>(R.id.new_game_button).setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_menuFragment_to_wildernessFragment)
        )

    }
}