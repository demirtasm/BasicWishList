package md.learn.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = "")

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google watch 2", description = "An android watch "),
        Wish(title = "Oculus Quest 2", description = "A VR hheadset for playing game"),
        Wish(title = "A sici-fi book", description = "A science fiction book from ny best seller"),
    )
}
