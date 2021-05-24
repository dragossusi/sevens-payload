package ro.dragossusi.sevens.payload

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.dragossusi.sevens.payload.base.ImageData
import ro.dragossusi.sevens.payload.enums.ImageType

/**
 * Payload
 *
 * @author dragos
 * @since 14/01/2021
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
class ImageResponse(
    @SerialName("image_type")
    override val type: ImageType,
    @SerialName("name")
    override val name: String
) : ImageData