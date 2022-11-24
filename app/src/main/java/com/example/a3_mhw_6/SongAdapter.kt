package com.example.a3_mhw_6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(private val songs:ArrayList<Songs>, private val onItemClick: SecondFragment): RecyclerView.Adapter<SongAdapter.SongViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
                return SongViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_song,parent,false))
        }

        override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
                holder.bind()
                holder.itemView.setOnClickListener{
                    onItemClick.onItemClick(songs.get(position).name.toString(), songs.get(position).artist.toString())
            }
        }

        override fun getItemCount(): Int {
           return songs.size       }

      inner  class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

          private var tvSongNum : TextView
          private var tvName : TextView
          private var tvArtist : TextView
          private var tvSongDuration : TextView

          init {
              tvSongNum = itemView.findViewById(R.id.tv_song_num)
              tvName = itemView.findViewById(R.id.tv_name)
              tvArtist = itemView.findViewById(R.id.tv_artist)
              tvSongDuration = itemView.findViewById(R.id.tv_song_duration)
          }
              fun bind(){
                  val song = songs.get(adapterPosition)
                  tvSongNum.text = song.songNum
                  tvName.text = song.name
                  tvArtist.text = song.artist
                  tvSongDuration.text = song.songDuration

              }
      }

}








