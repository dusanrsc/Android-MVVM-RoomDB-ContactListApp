package com.infinitysoftware.roomdb_contactlistapp.viewmodel

import com.infinitysoftware.roomdb_contactlistapp.model.Contact

data class ContactState (
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
)