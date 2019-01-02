/**
 *  Copyright 2019 The ModiTect authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.moditect.deptective.internal;

import java.util.ListResourceBundle;

public class DeptectiveMessages extends ListResourceBundle {

    public static final String ILLEGAL_PACKAGE_DEPENDENCY = "deptective.illegalpackagedependency";
    private static final String ERROR_PREFIX = "compiler.err.";
    private static final String WARNING_PREFIX = "compiler.warn.";

    @Override
    protected final Object[][] getContents() {
        return new Object[][] {
            { ERROR_PREFIX + ILLEGAL_PACKAGE_DEPENDENCY, "package {0} does not read {1}" },
            { WARNING_PREFIX + ILLEGAL_PACKAGE_DEPENDENCY, "package {0} does not read {1}" }
        };
    }
}