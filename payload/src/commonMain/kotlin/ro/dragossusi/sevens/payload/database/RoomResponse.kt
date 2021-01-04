package ro.dragossusi.sevens.payload.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.dragossusi.sevens.payload.base.GameTypeData
import ro.dragossusi.sevens.payload.base.RoomData
import ro.dragossusi.sevens.payload.base.RoomStatusData

/**
 * server
 *
 * Copyright (C) 2020  Rachieru Dragos-Mihai
 *
 * server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with server.  If not, see [License](http://www.gnu.org/licenses/) .
 *
 */
@Serializable
class RoomResponse(
    @SerialName("id")
    override val id: Long,
    @SerialName("type")
    override val type: GameTypeData,
    @SerialName("status")
    override val status: RoomStatusData,
    @SerialName("isPrivate")
    override val isPrivate: Boolean,
    @SerialName("code")
    override val code: Int?
) : RoomData