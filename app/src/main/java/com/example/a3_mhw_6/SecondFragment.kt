package com.example.a3_mhw_6

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SecondFragment : Fragment(),OnItemClick {

    private val songs = arrayListOf<Songs>()
    private var recyclerView : RecyclerView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        songs.add(Songs("1", "Blank Space", "Taylor Swift", "3:22"))
        songs.add(Songs("2", "Sebelep", "JAX 02.14", "4:27"))
        songs.add(Songs("3", "Watch Me", "Silento", "5:36"))
        songs.add(Songs("4", "Earned It", "The Weekend", "4:51"))
        songs.add(Songs("5", "The Hills", "The Weekend", "3:41"))
        songs.add(Songs("6", "Marlboro", "Miyagi", "3:36"))
        songs.add(Songs("7", "Fallin", "Edmofo", "3:24"))
        songs.add(Songs("8", "In The End", "Linkin Park", "3:35"))
        songs.add(Songs("9", "BALENCIAGA", "Halsey", "2:46"))
        songs.add(Songs("10", "Hi", "Halsey", "2:46"))


        recyclerView = view.findViewById(R.id.recycler_view)
        val adapter = SongAdapter(songs, this)
        recyclerView?.adapter = adapter
    }

    override fun onItemClick(name : String, artist : String) {
        val intent = Intent(requireContext(), SecondActivity::class.java)
        intent.putExtra(SecondActivity.KEY_FOR_NAME, name)
        intent.putExtra(SecondActivity.KEY_FOR_ARTIST, artist)
        startActivity(intent)
    }
}
