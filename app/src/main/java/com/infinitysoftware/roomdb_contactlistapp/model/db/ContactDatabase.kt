package com.infinitysoftware.roomdb_contactlistapp.model.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.infinitysoftware.roomdb_contactlistapp.model.Contact
import com.infinitysoftware.roomdb_contactlistapp.model.dao.ContactDao

// Creating Database(RoomDB).
@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase: RoomDatabase() {
    abstract val dao: ContactDao
}