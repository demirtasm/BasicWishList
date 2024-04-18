package md.learn.mywishlistapp.data

data class Wish(val id: Long = 0L, val title: String = "", val description: String = "")

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google watch 2", description = "An android watch "),
        Wish(title = "Oculus Quest 2", description = "A VR hheadset for playing game"),
        Wish(title = "A sici-fi book", description = "A science fiction book from ny best seller"),
    )
}
