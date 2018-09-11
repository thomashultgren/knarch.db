/*
 * Copyright (c) 2018 Touchlab Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.touchlab.knarch

import kotlin.test.*
import kotlin.native.internal.test.*

class TestHarness{
    fun testTest():Int
    {
//        TestRunner.run(arrayOf("--ktest_filter=*testStatementConstraint*"))
//        TestRunner.run(arrayOf("--ktest_filter=*basicMultithreadingTest*"))
//        TestRunner.run(arrayOf("--ktest_filter=*testQuery*"))
//        TestRunner.run(arrayOf("--ktest_filter=*testEnableAndDisableForeignKeys*"))

        return testLauncherEntryPoint(Array<String>(0 ){""})

        /*TestRunner.run()

        return TestRunner.exitCode*/
    }
}