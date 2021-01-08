package ro.dragossusi.sevens.payload.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.dragossusi.sevens.payload.Card
import ro.dragossusi.sevens.payload.base.GameTypeData

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
open class PlayerTurnResponse(
    @SerialName("cards")
    override val cards: List<Card>,
    @SerialName("players")
    val players: Array<SimplePlayerResponse>,
    @SerialName("starting_player_id")
    val startingPlayerId: Long,
    @SerialName("current_player_id")
    val currentPlayerId: Long,
    @SerialName("round_cards")
    val roundCards: Array<Card>
) : CardsContainer {

    fun canEnd(type: GameTypeData): Boolean {
        return roundCards.size == type.maxPlayers
    }

    override fun toString(): String {
        return "PlayerTurnResponse(cards=$cards, players=$players, startingPlayerId=$startingPlayerId, currentPlayerId=$currentPlayerId, roundCards=$roundCards)"
    }


}