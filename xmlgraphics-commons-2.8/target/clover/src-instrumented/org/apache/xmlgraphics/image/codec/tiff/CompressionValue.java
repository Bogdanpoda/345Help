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

package org.apache.xmlgraphics.image.codec.tiff;


/** Enumerates the possible compression values for TIFF images. */
public enum CompressionValue {
    /** No compression. */
    NONE(1),
    /**
     * Modified Huffman Compression (CCITT Group 3 1D facsimile compression).
     * <p><b>Not currently supported.</b>
     */
    GROUP3_1D(2),
    /**
     * CCITT T.4 bilevel compression (CCITT Group 3 2D facsimile compression).
     * <p><b>Not currently supported.</b>
     */
    GROUP3_2D(3),
    /**
     * CCITT T.6 bilevel compression (CCITT Group 4 facsimile compression).
     * <p><b>Not currently supported.</b>
     */
    GROUP4(4),
    /** LZW compression. <p><b>Not supported.</b> */
    LZW(5),
    /**
     * Code for original JPEG-in-TIFF compression which has been depricated (for many good reasons)
     * in favor of Tech Note 2 JPEG compression (compression scheme 7).
     * <p><b>Not supported.</b>
     */
    JPEG_BROKEN(6),
    /** <a href="ftp://ftp.sgi.com/graphics/tiff/TTN2.draft.txt"> JPEG-in-TIFF</a> compression. */
    JPEG_TTN2(7),
    /** Byte-oriented run-length encoding "PackBits" compression. */
    PACKBITS(32773),
    /**
     * <a href="http://info.internet.isi.edu:80/in-notes/rfc/files/rfc1951.txt">
     * DEFLATE</a> lossless compression (also known as "Zip-in-TIFF").
     */
    DEFLATE(32946);

    private final int compressionValue;

    private CompressionValue(int compressionValue) {try{__CLR4_4_13td3tdlde03838.R.inc(4945);
        __CLR4_4_13td3tdlde03838.R.inc(4946);this.compressionValue = compressionValue;
    }finally{__CLR4_4_13td3tdlde03838.R.flushNeeded();}}

    int getValue() {try{__CLR4_4_13td3tdlde03838.R.inc(4947);
        __CLR4_4_13td3tdlde03838.R.inc(4948);return compressionValue;
    }finally{__CLR4_4_13td3tdlde03838.R.flushNeeded();}}

    /**
     * Gets the compression value given the name of the compression type.
     * @param name the compression name
     * @return the compression value
     */
    public static CompressionValue getValue(String name) {try{__CLR4_4_13td3tdlde03838.R.inc(4949);
        __CLR4_4_13td3tdlde03838.R.inc(4950);if ((((name == null)&&(__CLR4_4_13td3tdlde03838.R.iget(4951)!=0|true))||(__CLR4_4_13td3tdlde03838.R.iget(4952)==0&false))) {{
            __CLR4_4_13td3tdlde03838.R.inc(4953);return PACKBITS;
        }
        }__CLR4_4_13td3tdlde03838.R.inc(4954);for (CompressionValue cv : CompressionValue.values()) {{
            __CLR4_4_13td3tdlde03838.R.inc(4955);if ((((cv.toString().equalsIgnoreCase(name))&&(__CLR4_4_13td3tdlde03838.R.iget(4956)!=0|true))||(__CLR4_4_13td3tdlde03838.R.iget(4957)==0&false))) {{
                __CLR4_4_13td3tdlde03838.R.inc(4958);return cv;
            }
        }}
        }__CLR4_4_13td3tdlde03838.R.inc(4959);throw new IllegalArgumentException("Unknown compression value: " + name);
    }finally{__CLR4_4_13td3tdlde03838.R.flushNeeded();}}
;public static class __CLR4_4_13td3tdlde03838{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792292202L,8589935092L,4960,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
