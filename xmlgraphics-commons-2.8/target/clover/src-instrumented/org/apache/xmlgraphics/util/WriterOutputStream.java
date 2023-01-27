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

/* $Id: WriterOutputStream.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/**
 * An OutputStream wrapper for a Writer.
 */
public class WriterOutputStream extends OutputStream {public static class __CLR4_4_1fnffnflde03ae2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792292202L,8589935092L,20302,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Writer writer;
    private String encoding;

    /**
     * Creates a new WriterOutputStream.
     * @param writer the Writer to write to
     */
    public WriterOutputStream(Writer writer) {
        this(writer, null);__CLR4_4_1fnffnflde03ae2.R.inc(20284);try{__CLR4_4_1fnffnflde03ae2.R.inc(20283);
    }finally{__CLR4_4_1fnffnflde03ae2.R.flushNeeded();}}

    /**
     * Creates a new WriterOutputStream.
     * @param writer the Writer to write to
     * @param encoding the encoding to use, or null if the default encoding should be used
     */
    public WriterOutputStream(Writer writer, String encoding) {try{__CLR4_4_1fnffnflde03ae2.R.inc(20285);
        __CLR4_4_1fnffnflde03ae2.R.inc(20286);this.writer = writer;
        __CLR4_4_1fnffnflde03ae2.R.inc(20287);this.encoding = encoding;
    }finally{__CLR4_4_1fnffnflde03ae2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public void close() throws IOException {try{__CLR4_4_1fnffnflde03ae2.R.inc(20288);
        __CLR4_4_1fnffnflde03ae2.R.inc(20289);writer.close();
    }finally{__CLR4_4_1fnffnflde03ae2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public void flush() throws IOException {try{__CLR4_4_1fnffnflde03ae2.R.inc(20290);
        __CLR4_4_1fnffnflde03ae2.R.inc(20291);writer.flush();
    }finally{__CLR4_4_1fnffnflde03ae2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public void write(byte[] buf, int offset, int length) throws IOException {try{__CLR4_4_1fnffnflde03ae2.R.inc(20292);
        __CLR4_4_1fnffnflde03ae2.R.inc(20293);if ((((encoding != null)&&(__CLR4_4_1fnffnflde03ae2.R.iget(20294)!=0|true))||(__CLR4_4_1fnffnflde03ae2.R.iget(20295)==0&false))) {{
            __CLR4_4_1fnffnflde03ae2.R.inc(20296);writer.write(new String(buf, offset, length, encoding));
        } }else {{
            __CLR4_4_1fnffnflde03ae2.R.inc(20297);writer.write(new String(buf, offset, length, "UTF-8"));
        }
    }}finally{__CLR4_4_1fnffnflde03ae2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public void write(byte[] buf) throws IOException {try{__CLR4_4_1fnffnflde03ae2.R.inc(20298);
        __CLR4_4_1fnffnflde03ae2.R.inc(20299);write(buf, 0, buf.length);
    }finally{__CLR4_4_1fnffnflde03ae2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public void write(int b) throws IOException {try{__CLR4_4_1fnffnflde03ae2.R.inc(20300);
        __CLR4_4_1fnffnflde03ae2.R.inc(20301);write(new byte[] {(byte)b});
    }finally{__CLR4_4_1fnffnflde03ae2.R.flushNeeded();}}

}
