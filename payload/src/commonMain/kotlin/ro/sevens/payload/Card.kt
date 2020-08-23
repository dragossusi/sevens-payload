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

    override fun equals(other: Any?): Boolean {
        if (other is Card) {
            if (theSame(other)) return true
        }
        return super.equals(other)
    }

    fun theSame(card: Card): Boolean {
        return number == card.number && type == card.type
    }

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