/*
 * Copyright 2015 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.navercorp.redis.cluster.gateway;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author jaehong.kim
 */
public class RunLengthHelperTest {

    @Test
    public void test() {
        assertEquals("AAAAAAAAAAARRNNN", RunLengthHelper.decode("A11R2N3"));
        assertEquals("AR", RunLengthHelper.decode("A1R1N0"));
        assertEquals("NNNAAARRRWWW", RunLengthHelper.decode("N3A3R3W3"));


    }

    @Test(expected = IllegalArgumentException.class)
    public void invalid() {
        assertEquals("NNN", RunLengthHelper.decode("U3"));
    }
}