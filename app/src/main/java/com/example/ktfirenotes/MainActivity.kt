package com.example.ktfirenotes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ktfirenotes.note.AddNote
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

//    var drawerLayout: DrawerLayout? = null
//    var toggle: ActionBarDrawerToggle? = null
//    var nav_view: NavigationView? = null
//    var noteLists: RecyclerView? = null
//    var fStore: FirebaseFirestore? = null
//    var fAuth: FirebaseAuth? = null
//    var user: FirebaseUser? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setSupportActionBar(toolbar)

        //fStore = FirebaseFirestore.getInstance()
        //fAuth = FirebaseAuth.getInstance()
        //user = fAuth.getCurrentUser()

//        val query: Query = fStore!!.collection("notes").document(user!!.uid).collection("myNotes")
//            .orderBy("title", Query.Direction.DESCENDING)
        // query notes > uuid > mynotes

        // Adapter

        addNoteFloat.setOnClickListener {
            startActivity(Intent(it.context, AddNote::class.java))
            overridePendingTransition(R.anim.slide_up, R.anim.slide_down)
        }
    }
}
