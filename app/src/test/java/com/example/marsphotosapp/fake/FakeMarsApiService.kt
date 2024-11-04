package com.example.marsphotosapp.fake

import com.example.marsphotosapp.model.MarsPhoto
import com.example.marsphotosapp.network.MarsApiService

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}