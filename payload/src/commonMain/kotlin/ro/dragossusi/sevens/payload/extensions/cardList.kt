package ro.dragossusi.sevens.payload.extensions

import ro.dragossusi.sevens.payload.Card
import ro.dragossusi.sevens.payload.isCut
import ro.dragossusi.sevens.payload.isSevensPoint


/**
 * Sevens
 *
 * Copyright (C) 2020  Rachieru Dragos-Mihai
 *
 * Sevens is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * sSevens is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Sevens.  If not, see [License](http://www.gnu.org/licenses/) .
 *
 */
@Suppress("unused")
val Collection<Card>.pointsCount: Int
    get() = count { it.isSevensPoint }

@Suppress("unused")
val Array<Card>.pointsCount: Int
    get() = count { it.isSevensPoint }

@Suppress("unused")
fun List<Card>.firstCut(playerCount: Int): Card? {
    return firstOrNull {
        it.isCut(playerCount)
    }
}