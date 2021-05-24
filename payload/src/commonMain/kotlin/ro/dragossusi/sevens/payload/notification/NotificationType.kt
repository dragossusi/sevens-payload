package ro.dragossusi.sevens.payload.notification

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Payload
 *
 * @author dragos
 * @since 25/01/2021
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
enum class NotificationType {
    @SerialName("INVITE_LOBBY")
    INVITE_LOBBY,

    @SerialName("ADD_FRIEND")
    ADD_FRIEND;
}