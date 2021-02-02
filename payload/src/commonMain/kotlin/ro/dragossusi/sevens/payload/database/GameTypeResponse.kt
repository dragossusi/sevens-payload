package ro.dragossusi.sevens.payload.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.dragossusi.sevens.payload.base.GameTypeData

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
@Serializable
class GameTypeResponse(

    @SerialName("name")
    override val name: String,

    @SerialName("description")
    override val description: String,

    @SerialName("maxPlayers")
    override val maxPlayers: Int,

    @SerialName("teamAllowed")
    override val teamAllowed: Boolean,

    @SerialName("maxTeamPlayers")
    override val maxTeamPlayers: Int

) : GameTypeData {
}