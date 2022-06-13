/*
 * Copyright 2022 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.qkl.wrapper.qsl

/**
 * If an event is marked by this annotation, subscribers should
 * run their code in as little time as possible due to hot code paths.
 */
@RequiresOptIn(
    message = "This event is marked as hot, and should be run in a tight loop.",
    level = RequiresOptIn.Level.WARNING
)
public annotation class MustRunQuick