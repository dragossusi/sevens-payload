package ro.dragossusi.sevens.payload.serialization

import kotlinx.serialization.modules.SerializersModule
import ro.dragossusi.sevens.payload.ImageResponse
import ro.dragossusi.sevens.payload.base.*
import ro.dragossusi.sevens.payload.database.*

/**
 * Payload
 *
 * Copyright (C) 2020  Rachieru Dragos-Mihai
 *
 * Payload is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Payload is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Payload.  If not, see [License](http://www.gnu.org/licenses/) .
 *
 */
fun payloadSerializationModule(): SerializersModule {
    return SerializersModule {
        polymorphic(GameTypeData::class, GameTypeResponse::class, GameTypeResponse.serializer())
        polymorphic(UserData::class, UserResponse::class, UserResponse.serializer())
        polymorphic(RoomData::class, RoomResponse::class, RoomResponse.serializer())
        polymorphic(RoomStatusData::class, RoomStatusResponse::class, RoomStatusResponse.serializer())
        polymorphic(FriendRequestData::class, FriendRequestResponse::class, FriendRequestResponse.serializer())
        polymorphic(ImageData::class, ImageResponse::class, ImageResponse.serializer())
        polymorphic(LobbyData::class, LobbyResponse::class, LobbyResponse.serializer())
    }
}