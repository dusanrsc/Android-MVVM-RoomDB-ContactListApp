package com.infinitysoftware.roomdb_contactlistapp.model.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.infinitysoftware.roomdb_contactlistapp.model.Contact
import kotlinx.coroutines.flow.Flow

// Creating Contact DAO(Data Access Object) Interface For RoomDB.
@Dao
interface ContactDao {

    // Updating Or Inserting(Saving) Contact.
    @Upsert
    suspend fun upsertContact(contact: Contact)

    // Deleting Contact.
    @Delete
    suspend fun deleteContact(contact: Contact)

    // Querying Contacts By First Name.
    @Query("SELECT * FROM Contact ORDER BY firstName ASC")
    fun getContactsOrderedByFirstName(): Flow<List<Contact>>

    // Querying Contacts By Last Name.
    @Query("SELECT * FROM Contact ORDER BY lastName ASC")
    fun getContactsOrderedByLastName(): Flow<List<Contact>>

    // Querying Contacts By Phone Number.
    @Query("SELECT * FROM Contact ORDER BY phoneNumber ASC")
    fun getContactsOrderedByPhoneNumber(): Flow<List<Contact>>
}