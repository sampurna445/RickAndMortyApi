package com.example.rickandmortyapi.data.repository

import android.webkit.WebStorage
import com.example.rickandmortyapi.data.model.characters.CharactersModel

class FakeCartoonCharacterRepository {
    private val cartoonCharacterList = mutableListOf<CharactersModel>()

    init {
        cartoonCharacterList.add(
            CharactersModel(
                "created1",
                "gender1",
                1,
                "image1",
                "name1",
                WebStorage.Origin("origin1"),
                "species1",
                "status1"
            )
        )

        cartoonCharacterList.add(
            CharactersModel(
                "created2",
                "gender2",
                2,
                "image2",
                "name2",
                WebStorage.Origin("origin2"),
                "species2",
                "status2"
            )
        )
    }

    override suspend fun getCartoonCharacters(page: Int): List<CharactersModel>? {
        return cartoonCharacterList
    }

}