package md.learn.mywishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

/**
 * An abstract class is a class that has methods that don't need an implementation.
 *And doesn't need the body
 */
@Dao
abstract class WishDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addAWish(wishEntity: Wish)

    //Loads all wishes from thee wish-table
    @Query("Select *  from `wish-table`")
    abstract fun getAllWishes(): Flow<List<Wish>>


    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    @Query("Select *  from `wish-table` where id=:id")
    abstract fun getAWishesById(id:Long): Flow<Wish>

}