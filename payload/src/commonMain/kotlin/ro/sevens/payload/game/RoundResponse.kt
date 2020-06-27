package ro.sevens.payload.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.sevens.payload.Card

/**
 * sevens-game
 *
 * Copyright (C) 2020  Rachieru Dragos-Mihai
 *
 * sevens-game is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * sevens-game is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with sevens-game.  If not, see [License](http://www.gnu.org/licenses/) .
 *
 */
@Serializable
class RoundResponse(
    @SerialName("startingPlayer")
    override val startingPlayer: Long,
    @SerialName("winner")
    override val winner: Long,
    @SerialName("cards")
    override val cards: List<Card>
) : RoundData {
}