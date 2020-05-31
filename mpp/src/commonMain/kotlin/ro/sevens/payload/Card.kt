package ro.sevens.payload

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

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
class Card(
    @SerialName("number")
    val number: Int,
    @SerialName("type")
    val type: Type
) {

    override fun toString(): String {
        return "$number$type"
    }

    fun isCut(playerCount: Int): Boolean {
        return number == 7 || (playerCount == 3 && number == 8)
    }

    /**
     * if this can cut card
     */
    fun canCut(card: Card, playerCount: Int): Boolean {
        return card.number == number || number == 7 || (playerCount == 3 && number == 8)
    }

    fun theSame(card: Card): Boolean {
        return number == card.number && type == card.type
    }

    val isPoint: Boolean
        get() = number == 10 || number == 11

    @Serializable
    enum class Type {
        @SerialName("neagra")
        NEAGRA,

        @SerialName("rosie")
        ROSIE,

        @SerialName("romb")
        ROMB,

        @SerialName("trefla")
        TREFLA
    }

}