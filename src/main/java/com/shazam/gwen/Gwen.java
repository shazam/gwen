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

import com.shazam.gwen.collaborators.Actor;
import com.shazam.gwen.collaborators.Arranger;
import com.shazam.gwen.collaborators.Asserter;
import com.shazam.gwen.gwt.Given;
import com.shazam.gwen.gwt.Then;
import com.shazam.gwen.gwt.When;

public class Gwen {

	public static <T> T given(Given<T> object) {
		return object.given();
	}

    public static <T extends Arranger> T given(T actor) {
        return actor;
    }

	public static <T> T when(When<T> object) {
		return object.when();
	}

    public static <T extends Actor> T when(T actor) {
   		return actor;
   	}

	public static <T> T then(Then<T> object) {
		return object.then();
	}

    public static <T extends Asserter> T then(T actor) {
   		return actor;
   	}

}
