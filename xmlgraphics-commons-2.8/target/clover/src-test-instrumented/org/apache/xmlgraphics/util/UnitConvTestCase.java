/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id: UnitConvTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for UnitConv.
 */
public class UnitConvTestCase {static class __CLR4_4_1jm4jm4lde03bxs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792297313L,8589935092L,25430,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test all kinds of unit conversions.
     * @throws Exception if the test fails
     */
    @Test
    public void testConversions() throws Exception {__CLR4_4_1jm4jm4lde03bxs.R.globalSliceStart(getClass().getName(),25420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ei559qjm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jm4jm4lde03bxs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jm4jm4lde03bxs.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.UnitConvTestCase.testConversions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ei559qjm4() throws Exception{try{__CLR4_4_1jm4jm4lde03bxs.R.inc(25420);
        __CLR4_4_1jm4jm4lde03bxs.R.inc(25421);assertEquals("in2mm", 25.4, UnitConv.in2mm(1), 0.00001);
        __CLR4_4_1jm4jm4lde03bxs.R.inc(25422);assertEquals("mm2in", 1.0, UnitConv.mm2in(25.4), 0.00001);
        __CLR4_4_1jm4jm4lde03bxs.R.inc(25423);assertEquals("mm2pt", 841.890, UnitConv.mm2pt(297), 0.001 / 2); //height of an A4 page
        __CLR4_4_1jm4jm4lde03bxs.R.inc(25424);assertEquals("mm2mpt", 841890, UnitConv.mm2mpt(297), 1.0 / 2);
        __CLR4_4_1jm4jm4lde03bxs.R.inc(25425);assertEquals("pt2mm", 297, UnitConv.pt2mm(841.890), 0.0001);
        __CLR4_4_1jm4jm4lde03bxs.R.inc(25426);assertEquals("in2mpt", 792000, UnitConv.in2mpt(11.0), 1.0 / 2); //height of a letter page
        __CLR4_4_1jm4jm4lde03bxs.R.inc(25427);assertEquals("mpt2in", 11.0, UnitConv.mpt2in(792000), 0.01 / 2); //height of a letter page

        __CLR4_4_1jm4jm4lde03bxs.R.inc(25428);assertEquals("mm2px/72dpi", 841.8897764234434, UnitConv.mm2px(297.0, 72), 0);
        __CLR4_4_1jm4jm4lde03bxs.R.inc(25429);assertEquals("mm2px/300dpi", 3507.8740684310146, UnitConv.mm2px(297.0, 300), 0);
    }finally{__CLR4_4_1jm4jm4lde03bxs.R.flushNeeded();}}
}
