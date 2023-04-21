package com.example.rickandmortyapi.data.model

import com.example.rickandmortyapi.data.model.characters.CharactersModel
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mocki

class CartoonCharacterTest {
    private lateinit var cartoonCharacter: CharactersModel

    @Before
    fun setUp() {
        cartoonCharacter = Mockito.mock(CharactersModel::class.java)
    }

    @Test
    fun getLifeStatus_aliveGiven_returns1() {
        Mockito.`when`(cartoonCharacter.getLifeStatus()).thenReturn(1)
        val actualResult = cartoonCharacter.getLifeStatus()

        Truth.assertThat(actualResult).isEqualTo(1)
    }

    @Test
    fun `getLifeStatus_deadGiven_returns_-1`() {
        Mockito.`when`(cartoonCharacter.getLifeStatus()).thenReturn(-1)
        val actualResult = cartoonCharacter.getLifeStatus()

        Truth.assertThat(actualResult).isEqualTo(-1)
    }

    @Test
    fun getLifeStatus_unknownGiven_returns0() {
        Mockito.`when`(cartoonCharacter.getLifeStatus()).thenReturn(0)
        val actualResult = cartoonCharacter.getLifeStatus()

        Truth.assertThat(actualResult).isEqualTo(0)
    }

}