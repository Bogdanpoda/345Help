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

/* $Id: DSCCommentEndOfFile.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.ps.dsc.events;

import java.io.IOException;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.PSGenerator;

/**
 * Represents a %%EOF DSC comment.
 */
public class DSCCommentEndOfFile extends AbstractDSCComment {public static class __CLR4_4_1exoexolde03a74{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792292202L,8589935092L,19365,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#getName()
     */
    public String getName() {try{__CLR4_4_1exoexolde03a74.R.inc(19356);
        __CLR4_4_1exoexolde03a74.R.inc(19357);return DSCConstants.EOF;
    }finally{__CLR4_4_1exoexolde03a74.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#hasValues()
     */
    public boolean hasValues() {try{__CLR4_4_1exoexolde03a74.R.inc(19358);
        __CLR4_4_1exoexolde03a74.R.inc(19359);return false;
    }finally{__CLR4_4_1exoexolde03a74.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#parseValue(java.lang.String)
     */
    public void parseValue(String value) {try{__CLR4_4_1exoexolde03a74.R.inc(19360);
        //nop
    }finally{__CLR4_4_1exoexolde03a74.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCEvent#generate(org.apache.xmlgraphics.ps.PSGenerator)
     */
    public void generate(PSGenerator gen) throws IOException {try{__CLR4_4_1exoexolde03a74.R.inc(19361);
        __CLR4_4_1exoexolde03a74.R.inc(19362);gen.writeDSCComment(getName());
    }finally{__CLR4_4_1exoexolde03a74.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.AbstractDSCComment#getEventType()
     */
    public int getEventType() {try{__CLR4_4_1exoexolde03a74.R.inc(19363);
        __CLR4_4_1exoexolde03a74.R.inc(19364);return EOF;
    }finally{__CLR4_4_1exoexolde03a74.R.flushNeeded();}}

}
