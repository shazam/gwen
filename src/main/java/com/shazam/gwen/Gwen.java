/*
 * Copyright 2013 Shazam Entertainment Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
*/
package com.shazam.gwen;

public class Gwen {

	public static <T> T given(Given<T> object) {
		return object.given();
	}

    public static <T extends Arranger> T given(T actor) {
        return actor;
    }

    /**
     * @deprecated will be removed in the next version. Use {@link Gwen#given(Arranger)} instead.
     */
    @Deprecated
	public static <T> T given(T object) {
		return object;
	}

	public static <T> T when(When<T> object) {
		return object.when();
	}

    public static <T extends Actor> T when(T actor) {
   		return actor;
   	}

    /**
     * @deprecated will be removed in the next version. Use {@link Gwen#when(Actor)} instead.
     */
    @Deprecated
    public static <T> T when(T object) {
   		return object;
   	}

	public static <T> T then(Then<T> object) {
		return object.then();
	}

    public static <T extends Asserter> T then(T actor) {
   		return actor;
   	}

    /**
     * @deprecated will be removed in the next version. Use {@link Gwen#then(Asserter)} instead.
     */
    @Deprecated
    public static <T> T then(T object) {
   		return object;
   	}

    /**
     * @deprecated will be removed in the next version. Use respective given, when, then instead
     */
    @Deprecated
    public static <T> T and(T object) {
   		return object;
   	}
}
