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

/* $Id: DSCCommentBeginResource.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc.events;

import java.io.IOException;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.PSResource;

/**
 * Represents a %BeginResource DSC comment.
 */
public class DSCCommentBeginResource extends AbstractResourceDSCComment {public static class __CLR4_4_1evvevvlde03a5t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792292202L,8589935092L,19312,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Integer min;
    private Integer max;

    /**
     * Creates a new instance
     */
    public DSCCommentBeginResource() {
        super();__CLR4_4_1evvevvlde03a5t.R.inc(19292);try{__CLR4_4_1evvevvlde03a5t.R.inc(19291);
    }finally{__CLR4_4_1evvevvlde03a5t.R.flushNeeded();}}

    /**
     * Creates a new instance for a given PSResource instance
     * @param resource the resource
     */
    public DSCCommentBeginResource(PSResource resource) {
        super(resource);__CLR4_4_1evvevvlde03a5t.R.inc(19294);try{__CLR4_4_1evvevvlde03a5t.R.inc(19293);
    }finally{__CLR4_4_1evvevvlde03a5t.R.flushNeeded();}}

    /**
     * Creates a new instance for a given PSResource instance
     * @param resource the resource
     * @param min Minimum VM used by the resource
     * @param max Maximum VM used by the resource
     */
    public DSCCommentBeginResource(PSResource resource, int min, int max) {
        super(resource);__CLR4_4_1evvevvlde03a5t.R.inc(19296);try{__CLR4_4_1evvevvlde03a5t.R.inc(19295);
        __CLR4_4_1evvevvlde03a5t.R.inc(19297);this.min = min;
        __CLR4_4_1evvevvlde03a5t.R.inc(19298);this.max = max;
    }finally{__CLR4_4_1evvevvlde03a5t.R.flushNeeded();}}

    /**
     * Returns the minimum VM used by the resource.
     * @return the minimum VM used by the resource
     */
    public Integer getMin() {try{__CLR4_4_1evvevvlde03a5t.R.inc(19299);
        __CLR4_4_1evvevvlde03a5t.R.inc(19300);return this.min;
    }finally{__CLR4_4_1evvevvlde03a5t.R.flushNeeded();}}

    /**
     * Returns the maximum VM used by the resource.
     * @return the maximum VM used by the resource
     */
    public Integer getMax() {try{__CLR4_4_1evvevvlde03a5t.R.inc(19301);
        __CLR4_4_1evvevvlde03a5t.R.inc(19302);return this.max;
    }finally{__CLR4_4_1evvevvlde03a5t.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getName() {try{__CLR4_4_1evvevvlde03a5t.R.inc(19303);
        __CLR4_4_1evvevvlde03a5t.R.inc(19304);return DSCConstants.BEGIN_RESOURCE;
    }finally{__CLR4_4_1evvevvlde03a5t.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void generate(PSGenerator gen) throws IOException {try{__CLR4_4_1evvevvlde03a5t.R.inc(19305);
        __CLR4_4_1evvevvlde03a5t.R.inc(19306);if ((((getMin() != null)&&(__CLR4_4_1evvevvlde03a5t.R.iget(19307)!=0|true))||(__CLR4_4_1evvevvlde03a5t.R.iget(19308)==0&false))) {{
            __CLR4_4_1evvevvlde03a5t.R.inc(19309);Object[] params = new Object[] {getResource(), getMin(), getMax()};
            __CLR4_4_1evvevvlde03a5t.R.inc(19310);gen.writeDSCComment(getName(), params);
        } }else {{
            __CLR4_4_1evvevvlde03a5t.R.inc(19311);super.generate(gen);
        }
    }}finally{__CLR4_4_1evvevvlde03a5t.R.flushNeeded();}}

}
