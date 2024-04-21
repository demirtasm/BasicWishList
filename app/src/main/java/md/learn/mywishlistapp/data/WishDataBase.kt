package md.learn.mywishlistapp.data

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
@Database(entities = [Wish::class], version = 1, exportSchema = false)
abstract class WishDataBase : RoomDatabase() {
    abstract fun wishDao(): WishDao
}