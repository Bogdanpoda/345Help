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

/* $Id: DSCToolsTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.ps.dsc.tools;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.xmlgraphics.ps.dsc.events.DSCCommentEndComments;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentPages;
import org.apache.xmlgraphics.ps.dsc.events.DSCEvent;
import org.apache.xmlgraphics.ps.dsc.events.PostScriptComment;
import org.apache.xmlgraphics.ps.dsc.events.PostScriptLine;

public class DSCToolsTestCase {static class __CLR4_4_1j63j63lde03bum{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792297313L,8589935092L,24859,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEndComment() throws Exception {__CLR4_4_1j63j63lde03bum.R.globalSliceStart(getClass().getName(),24843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cwywtj63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j63j63lde03bum.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j63j63lde03bum.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.dsc.tools.DSCToolsTestCase.testEndComment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cwywtj63() throws Exception{try{__CLR4_4_1j63j63lde03bum.R.inc(24843);
        __CLR4_4_1j63j63lde03bum.R.inc(24844);DSCEvent event;

        __CLR4_4_1j63j63lde03bum.R.inc(24845);event = new DSCCommentEndComments();
        __CLR4_4_1j63j63lde03bum.R.inc(24846);assertTrue(DSCTools.headerCommentsEndHere(event));

        __CLR4_4_1j63j63lde03bum.R.inc(24847);event = new PostScriptComment("FOPTest");
        __CLR4_4_1j63j63lde03bum.R.inc(24848);assertFalse(DSCTools.headerCommentsEndHere(event));

        __CLR4_4_1j63j63lde03bum.R.inc(24849);event = new DSCCommentPages(7);
        __CLR4_4_1j63j63lde03bum.R.inc(24850);assertFalse(DSCTools.headerCommentsEndHere(event));

        __CLR4_4_1j63j63lde03bum.R.inc(24851);event = new PostScriptComment(null);
        __CLR4_4_1j63j63lde03bum.R.inc(24852);assertTrue(DSCTools.headerCommentsEndHere(event));

        __CLR4_4_1j63j63lde03bum.R.inc(24853);event = new PostScriptComment("\t");
        __CLR4_4_1j63j63lde03bum.R.inc(24854);assertTrue(DSCTools.headerCommentsEndHere(event));

        __CLR4_4_1j63j63lde03bum.R.inc(24855);event = new PostScriptComment(" ***");
        __CLR4_4_1j63j63lde03bum.R.inc(24856);assertTrue(DSCTools.headerCommentsEndHere(event));

        __CLR4_4_1j63j63lde03bum.R.inc(24857);event = new PostScriptLine("/pgsave save def");
        __CLR4_4_1j63j63lde03bum.R.inc(24858);assertTrue(DSCTools.headerCommentsEndHere(event));
    }finally{__CLR4_4_1j63j63lde03bum.R.flushNeeded();}}

}
