
package com.example.magicmusic.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {FavoriteTrackDTO.class}, version = 2)
public abstract class FavoriteTrackDatabase extends RoomDatabase {
    public abstract FavoriteTrackDAO favoriteTrackDao();
}
