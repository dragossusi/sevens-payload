package ro.sevens.pojo.database

import com.google.gson.annotations.SerializedName
import ro.sevens.pojo.base.GameTypeData
import ro.sevens.pojo.base.RoomData
import ro.sevens.pojo.base.RoomStatusData

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
class RoomResponse(
    @SerializedName("id")
    override val id: Long,
    @SerializedName("type")
    override val type: GameTypeData,
    @SerializedName("status")
    override val status: RoomStatusData,
    @SerializedName("isPrivate")
    override val isPrivate: Boolean,
    @SerializedName("code")
    override val code: Int?
) : RoomData