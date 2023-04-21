package com.example.rickandmortyapi.ui.Characters

import android.webkit.WebStorage
import com.example.rickandmortyapi.ui.characters.CharactersViewModel
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.rickandmortyapi.data.model.characters.CharactersModel
import com.example.rickandmortyapi.data.repository.FakeCartoonCharacterRepository
import com.example.rickandmortyapi.data.repository.Repository
import kotlinx.coroutines.Dispatchers
import org.junit.Assert
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

@RunWith(AndroidJUnit4::class)
class CharactersViewModel {

    @get: Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var repository: Repository
    private lateinit var viewModel: com.example.rickandmortyapi.ui.characters.CharactersViewModel


    @Before
    fun setUP()
    {

        viewModel = com.example.rickandmortyapi.ui.characters.
            CharactersViewModel(ApplicationProvider.getApplicationContext())
    }

    @Test
    fun getCharacters(){
        // When adding a new task
        viewModel.getCharacters()

        // Then the new task event is triggered
        val value = viewModel.onChanged.getOrAwaitValue()
        Assert.assertThat(
            value?.getContentIfNotHandled(), (not(nullValue()))
        )

    }







}



