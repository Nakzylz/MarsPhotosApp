package com.example.marsphotosapp

import com.example.marsphotosapp.fake.FakeDataSource
import com.example.marsphotosapp.fake.FakeNetworkMarsPhotosRepository
import com.example.marsphotosapp.rules.TestDispatcherRule
import com.example.marsphotosapp.ui.theme.screens.MarsUiState
import com.example.marsphotosapp.ui.theme.screens.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = FakeNetworkMarsPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success(FakeDataSource.photosList),
                marsViewModel.marsUiState
            )
        }
}