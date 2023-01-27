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

/* $Id: PNGFileTestCase.java 1843559 2018-10-11 14:59:17Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.IndexColorModel;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.xmlgraphics.image.loader.ImageContext;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.MockImageContext;
import org.apache.xmlgraphics.image.loader.MockImageSessionContext;
import org.apache.xmlgraphics.util.MimeConstants;

public class PNGFileTestCase implements PNGConstants {static class __CLR4_4_1if7if7lde03bjs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792297313L,8589935092L,23930,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testColorTypeTwoPNG() throws ImageException, IOException {__CLR4_4_1if7if7lde03bjs.R.globalSliceStart(getClass().getName(),23875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adgrvzif7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if7if7lde03bjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if7if7lde03bjs.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.PNGFileTestCase.testColorTypeTwoPNG",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adgrvzif7() throws ImageException, IOException{try{__CLR4_4_1if7if7lde03bjs.R.inc(23875);
        __CLR4_4_1if7if7lde03bjs.R.inc(23876);testColorTypePNG("basn2c08.png", PNG_COLOR_RGB);
    }finally{__CLR4_4_1if7if7lde03bjs.R.flushNeeded();}}

    @Test
    public void testColorTypeZeroPNG() throws ImageException, IOException {__CLR4_4_1if7if7lde03bjs.R.globalSliceStart(getClass().getName(),23877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ws5g2lif9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if7if7lde03bjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if7if7lde03bjs.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.PNGFileTestCase.testColorTypeZeroPNG",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ws5g2lif9() throws ImageException, IOException{try{__CLR4_4_1if7if7lde03bjs.R.inc(23877);
        __CLR4_4_1if7if7lde03bjs.R.inc(23878);testColorTypePNG("basn0g08.png", PNG_COLOR_GRAY);
    }finally{__CLR4_4_1if7if7lde03bjs.R.flushNeeded();}}

    @Test
    public void testColorTypeSixPNG() throws ImageException, IOException {__CLR4_4_1if7if7lde03bjs.R.globalSliceStart(getClass().getName(),23879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wycfq1ifb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if7if7lde03bjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if7if7lde03bjs.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.PNGFileTestCase.testColorTypeSixPNG",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wycfq1ifb() throws ImageException, IOException{try{__CLR4_4_1if7if7lde03bjs.R.inc(23879);
        __CLR4_4_1if7if7lde03bjs.R.inc(23880);testColorTypePNG("basn6a08.png", PNG_COLOR_RGB_ALPHA);
    }finally{__CLR4_4_1if7if7lde03bjs.R.flushNeeded();}}

    @Test
    public void testColorTypeThreePNG() throws ImageException, IOException {__CLR4_4_1if7if7lde03bjs.R.globalSliceStart(getClass().getName(),23881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hap8v1ifd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if7if7lde03bjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if7if7lde03bjs.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.PNGFileTestCase.testColorTypeThreePNG",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hap8v1ifd() throws ImageException, IOException{try{__CLR4_4_1if7if7lde03bjs.R.inc(23881);
        __CLR4_4_1if7if7lde03bjs.R.inc(23882);testColorTypePNG("basn3p08.png", PNG_COLOR_PALETTE);
    }finally{__CLR4_4_1if7if7lde03bjs.R.flushNeeded();}}

    @Test
    public void testColorTypeFourPNG() throws ImageException, IOException {__CLR4_4_1if7if7lde03bjs.R.globalSliceStart(getClass().getName(),23883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19e084fiff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if7if7lde03bjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if7if7lde03bjs.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.PNGFileTestCase.testColorTypeFourPNG",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19e084fiff() throws ImageException, IOException{try{__CLR4_4_1if7if7lde03bjs.R.inc(23883);
        __CLR4_4_1if7if7lde03bjs.R.inc(23884);testColorTypePNG("basn4a08.png", PNG_COLOR_GRAY_ALPHA);
    }finally{__CLR4_4_1if7if7lde03bjs.R.flushNeeded();}}

    @Test
    public void testTransparentPNG() throws ImageException, IOException {__CLR4_4_1if7if7lde03bjs.R.globalSliceStart(getClass().getName(),23885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ralo0ifh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if7if7lde03bjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if7if7lde03bjs.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.PNGFileTestCase.testTransparentPNG",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ralo0ifh() throws ImageException, IOException{try{__CLR4_4_1if7if7lde03bjs.R.inc(23885);
        __CLR4_4_1if7if7lde03bjs.R.inc(23886);testColorTypePNG("tbbn3p08.png", PNG_COLOR_PALETTE, true);
        __CLR4_4_1if7if7lde03bjs.R.inc(23887);testColorTypePNG("tbrn2c08.png", PNG_COLOR_RGB, true);
    }finally{__CLR4_4_1if7if7lde03bjs.R.flushNeeded();}}

    @Test
    public void testCorruptPNG() {__CLR4_4_1if7if7lde03bjs.R.globalSliceStart(getClass().getName(),23888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122hwtnifk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if7if7lde03bjs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if7if7lde03bjs.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.PNGFileTestCase.testCorruptPNG",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122hwtnifk(){try{__CLR4_4_1if7if7lde03bjs.R.inc(23888);
        __CLR4_4_1if7if7lde03bjs.R.inc(23889);ImageContext context = MockImageContext.newSafeInstance();
        __CLR4_4_1if7if7lde03bjs.R.inc(23890);ImageSessionContext session = new MockImageSessionContext(context);
        __CLR4_4_1if7if7lde03bjs.R.inc(23891);ImageInfo info = new ImageInfo("corrupt-image.png", MimeConstants.MIME_PNG);
        __CLR4_4_1if7if7lde03bjs.R.inc(23892);ImageLoaderRawPNG ilrpng = new ImageLoaderRawPNG();
        __CLR4_4_1if7if7lde03bjs.R.inc(23893);String exception = "";
        __CLR4_4_1if7if7lde03bjs.R.inc(23894);try {
            __CLR4_4_1if7if7lde03bjs.R.inc(23895);ilrpng.loadImage(info, null, session);
        } catch (Exception e) {
            __CLR4_4_1if7if7lde03bjs.R.inc(23896);exception = e.getCause().getMessage();
        }
        __CLR4_4_1if7if7lde03bjs.R.inc(23897);assertEquals("PNG unknown critical chunk: IBLA", exception);
    }finally{__CLR4_4_1if7if7lde03bjs.R.flushNeeded();}}

    private void testColorTypePNG(String imageName, int colorType) throws ImageException, IOException {try{__CLR4_4_1if7if7lde03bjs.R.inc(23898);
        __CLR4_4_1if7if7lde03bjs.R.inc(23899);testColorTypePNG(imageName, colorType, false);
    }finally{__CLR4_4_1if7if7lde03bjs.R.flushNeeded();}}

    private void testColorTypePNG(String imageName, int colorType, boolean isTransparent)
            throws ImageException, IOException {try{__CLR4_4_1if7if7lde03bjs.R.inc(23900);
        __CLR4_4_1if7if7lde03bjs.R.inc(23901);ImageContext context = MockImageContext.newSafeInstance();
        __CLR4_4_1if7if7lde03bjs.R.inc(23902);ImageSessionContext session = new MockImageSessionContext(context);
        __CLR4_4_1if7if7lde03bjs.R.inc(23903);ImageInfo info = new ImageInfo(imageName, MimeConstants.MIME_PNG);
        __CLR4_4_1if7if7lde03bjs.R.inc(23904);ImageLoaderRawPNG ilrpng = new ImageLoaderRawPNG();
        __CLR4_4_1if7if7lde03bjs.R.inc(23905);ImageRawPNG irpng = (ImageRawPNG) ilrpng.loadImage(info, null, session);
        __CLR4_4_1if7if7lde03bjs.R.inc(23906);ColorModel cm = irpng.getColorModel();
        __CLR4_4_1if7if7lde03bjs.R.inc(23907);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_4_1if7if7lde03bjs.R.iget(23908)!=0|true))||(__CLR4_4_1if7if7lde03bjs.R.iget(23909)==0&false))) {{
            __CLR4_4_1if7if7lde03bjs.R.inc(23910);assertTrue(cm instanceof IndexColorModel);
        } }else {{
            __CLR4_4_1if7if7lde03bjs.R.inc(23911);assertTrue(cm instanceof ComponentColorModel);
            __CLR4_4_1if7if7lde03bjs.R.inc(23912);int numComponents = 3;
            __CLR4_4_1if7if7lde03bjs.R.inc(23913);if ((((colorType == PNG_COLOR_GRAY)&&(__CLR4_4_1if7if7lde03bjs.R.iget(23914)!=0|true))||(__CLR4_4_1if7if7lde03bjs.R.iget(23915)==0&false))) {{
                __CLR4_4_1if7if7lde03bjs.R.inc(23916);numComponents = 1;
            } }else {__CLR4_4_1if7if7lde03bjs.R.inc(23917);if ((((colorType == PNG_COLOR_GRAY_ALPHA)&&(__CLR4_4_1if7if7lde03bjs.R.iget(23918)!=0|true))||(__CLR4_4_1if7if7lde03bjs.R.iget(23919)==0&false))) {{
                __CLR4_4_1if7if7lde03bjs.R.inc(23920);numComponents = 2;
            } }else {__CLR4_4_1if7if7lde03bjs.R.inc(23921);if ((((colorType == PNG_COLOR_RGB_ALPHA)&&(__CLR4_4_1if7if7lde03bjs.R.iget(23922)!=0|true))||(__CLR4_4_1if7if7lde03bjs.R.iget(23923)==0&false))) {{
                __CLR4_4_1if7if7lde03bjs.R.inc(23924);numComponents = 4;
            }
            }}}__CLR4_4_1if7if7lde03bjs.R.inc(23925);assertEquals(numComponents, cm.getNumComponents());
        }
        }__CLR4_4_1if7if7lde03bjs.R.inc(23926);if ((((isTransparent)&&(__CLR4_4_1if7if7lde03bjs.R.iget(23927)!=0|true))||(__CLR4_4_1if7if7lde03bjs.R.iget(23928)==0&false))) {{
            __CLR4_4_1if7if7lde03bjs.R.inc(23929);assertTrue(irpng.isTransparent());
        }
    }}finally{__CLR4_4_1if7if7lde03bjs.R.flushNeeded();}}
}
