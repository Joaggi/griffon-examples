/*
 * Copyright 2016-2018 Andres Almiray
 *
 * This file is part of Griffon Examples
 *
 * Griffon Examples is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Griffon Examples is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Griffon Examples. If not, see <http://www.gnu.org/licenses/>.
 */
package sample.javafx.groovy

import griffon.core.artifact.GriffonService
import griffon.core.i18n.MessageSource
import griffon.metadata.ArtifactProviderFor
import groovy.transform.CompileStatic
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonService

import static griffon.util.GriffonNameUtils.isBlank

@CompileStatic
@javax.inject.Singleton
@ArtifactProviderFor(GriffonService)
class SampleService extends AbstractGriffonService {
    String sayHello(String input) {
        MessageSource ms = application.messageSource
        isBlank(input) ? ms.getMessage('greeting.default') : ms.getMessage('greeting.parameterized', [input])
    }
}