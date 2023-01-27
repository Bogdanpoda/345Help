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

/* $Id: ImageInputStreamAdapter.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.image.loader.util;

import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.ImageInputStream;

/**
 * Decorates an ImageInputStream with an InputStream interface. The methods <code>mark()</code>
 * and <code>reset()</code> are fully supported. The method <code>available()</code> will
 * always return 0.
 */
public class ImageInputStreamAdapter extends InputStream {public static class __CLR4_4_19qc9qclde0398g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792292202L,8589935092L,12637,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageInputStream iin;

    private long lastMarkPosition;

    /**
     * Creates a new ImageInputStreamAdapter.
     * @param iin the underlying ImageInputStream
     */
    public ImageInputStreamAdapter(ImageInputStream iin) {try{__CLR4_4_19qc9qclde0398g.R.inc(12612);
        assert (((iin != null )&&(__CLR4_4_19qc9qclde0398g.R.iget(12613)!=0|true))||(__CLR4_4_19qc9qclde0398g.R.iget(12614)==0&false)): "InputStream is null";
        __CLR4_4_19qc9qclde0398g.R.inc(12615);this.iin = iin;
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int read(byte[] b, int off, int len) throws IOException {try{__CLR4_4_19qc9qclde0398g.R.inc(12616);
        __CLR4_4_19qc9qclde0398g.R.inc(12617);return iin.read(b, off, len);
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int read(byte[] b) throws IOException {try{__CLR4_4_19qc9qclde0398g.R.inc(12618);
        __CLR4_4_19qc9qclde0398g.R.inc(12619);return iin.read(b);
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int read() throws IOException {try{__CLR4_4_19qc9qclde0398g.R.inc(12620);
        __CLR4_4_19qc9qclde0398g.R.inc(12621);return iin.read();
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

    /** {@inheritDoc} */
    public long skip(long n) throws IOException {try{__CLR4_4_19qc9qclde0398g.R.inc(12622);
        __CLR4_4_19qc9qclde0398g.R.inc(12623);return iin.skipBytes(n);
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void close() throws IOException {try{__CLR4_4_19qc9qclde0398g.R.inc(12624);
        __CLR4_4_19qc9qclde0398g.R.inc(12625);iin.close();
        __CLR4_4_19qc9qclde0398g.R.inc(12626);iin = null;
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

    /** {@inheritDoc} */
    public synchronized void mark(int readlimit) {try{__CLR4_4_19qc9qclde0398g.R.inc(12627);
        //Parameter readlimit is ignored
        __CLR4_4_19qc9qclde0398g.R.inc(12628);try {
            //Cannot use mark()/reset() since they are nestable, and InputStream's are not
            __CLR4_4_19qc9qclde0398g.R.inc(12629);this.lastMarkPosition = iin.getStreamPosition();
        } catch (IOException ioe) {
            __CLR4_4_19qc9qclde0398g.R.inc(12630);throw new RuntimeException(
                    "Unexpected IOException in ImageInputStream.getStreamPosition()", ioe);
        }
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean markSupported() {try{__CLR4_4_19qc9qclde0398g.R.inc(12631);
        __CLR4_4_19qc9qclde0398g.R.inc(12632);return true;
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

    /** {@inheritDoc} */
    public synchronized void reset() throws IOException {try{__CLR4_4_19qc9qclde0398g.R.inc(12633);
        __CLR4_4_19qc9qclde0398g.R.inc(12634);iin.seek(this.lastMarkPosition);
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int available() throws IOException {try{__CLR4_4_19qc9qclde0398g.R.inc(12635);
        __CLR4_4_19qc9qclde0398g.R.inc(12636);return 0;
    }finally{__CLR4_4_19qc9qclde0398g.R.flushNeeded();}}

}
