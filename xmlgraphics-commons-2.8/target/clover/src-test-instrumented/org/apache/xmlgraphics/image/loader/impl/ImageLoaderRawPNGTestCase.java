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

/* $Id: ImageLoaderRawPNGTestCase.java 1904425 2022-10-06 12:37:37Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageContext;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.ImageSource;
import org.apache.xmlgraphics.image.loader.MockImageContext;
import org.apache.xmlgraphics.image.loader.MockImageSessionContext;
import org.apache.xmlgraphics.util.MimeConstants;

public class ImageLoaderRawPNGTestCase {static class __CLR4_4_1iekieklde03bjc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792297313L,8589935092L,23875,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageLoaderRawPNG ilrpng = new ImageLoaderRawPNG();

    @Test
    public void testGetUsagePenalty() {__CLR4_4_1iekieklde03bjc.R.globalSliceStart(getClass().getName(),23852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yauq5iek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iekieklde03bjc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iekieklde03bjc.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.ImageLoaderRawPNGTestCase.testGetUsagePenalty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yauq5iek(){try{__CLR4_4_1iekieklde03bjc.R.inc(23852);
        __CLR4_4_1iekieklde03bjc.R.inc(23853);assertEquals(0, ilrpng.getUsagePenalty());
    }finally{__CLR4_4_1iekieklde03bjc.R.flushNeeded();}}

    @Test
    public void testLoadImageBadMime() throws ImageException, IOException {__CLR4_4_1iekieklde03bjc.R.globalSliceStart(getClass().getName(),23854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wflm0ziem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iekieklde03bjc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iekieklde03bjc.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.ImageLoaderRawPNGTestCase.testLoadImageBadMime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wflm0ziem() throws ImageException, IOException{try{__CLR4_4_1iekieklde03bjc.R.inc(23854);
        __CLR4_4_1iekieklde03bjc.R.inc(23855);ImageContext context = MockImageContext.newSafeInstance();
        __CLR4_4_1iekieklde03bjc.R.inc(23856);ImageSessionContext session = new MockImageSessionContext(context);
        __CLR4_4_1iekieklde03bjc.R.inc(23857);ImageInfo info = new ImageInfo("basn2c08.png", MimeConstants.MIME_JPEG);
        __CLR4_4_1iekieklde03bjc.R.inc(23858);try {
            __CLR4_4_1iekieklde03bjc.R.inc(23859);ImageRawPNG irpng = (ImageRawPNG) ilrpng.loadImage(info, null, session);
            __CLR4_4_1iekieklde03bjc.R.inc(23860);fail("An exception should have been thrown above");
        } catch (IllegalArgumentException e) {
            // do nothing; this was expected
        }
    }finally{__CLR4_4_1iekieklde03bjc.R.flushNeeded();}}

    @Test
    public void testGetTargetFlavor() {__CLR4_4_1iekieklde03bjc.R.globalSliceStart(getClass().getName(),23861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18q3tvqiet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iekieklde03bjc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iekieklde03bjc.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.ImageLoaderRawPNGTestCase.testGetTargetFlavor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18q3tvqiet(){try{__CLR4_4_1iekieklde03bjc.R.inc(23861);
        __CLR4_4_1iekieklde03bjc.R.inc(23862);assertEquals(ImageFlavor.RAW_PNG, ilrpng.getTargetFlavor());
    }finally{__CLR4_4_1iekieklde03bjc.R.flushNeeded();}}

    @Test
    public void testLoadImageGoodMime() throws ImageException, IOException {__CLR4_4_1iekieklde03bjc.R.globalSliceStart(getClass().getName(),23863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7q5ujiev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iekieklde03bjc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iekieklde03bjc.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.ImageLoaderRawPNGTestCase.testLoadImageGoodMime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7q5ujiev() throws ImageException, IOException{try{__CLR4_4_1iekieklde03bjc.R.inc(23863);
        __CLR4_4_1iekieklde03bjc.R.inc(23864);ImageContext context = MockImageContext.newSafeInstance();
        __CLR4_4_1iekieklde03bjc.R.inc(23865);ImageSessionContext session = new MockImageSessionContext(context);
        __CLR4_4_1iekieklde03bjc.R.inc(23866);ImageInfo info = new ImageInfo("basn2c08.png", MimeConstants.MIME_PNG);
        __CLR4_4_1iekieklde03bjc.R.inc(23867);Image im = ilrpng.loadImage(info, null, session);
        __CLR4_4_1iekieklde03bjc.R.inc(23868);assertTrue(im instanceof ImageRawPNG);
    }finally{__CLR4_4_1iekieklde03bjc.R.flushNeeded();}}

    @Test
    public void testPreloaderRawPNG() throws IOException, ImageException {__CLR4_4_1iekieklde03bjc.R.globalSliceStart(getClass().getName(),23869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcj2csif1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iekieklde03bjc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iekieklde03bjc.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.ImageLoaderRawPNGTestCase.testPreloaderRawPNG",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcj2csif1() throws IOException, ImageException{try{__CLR4_4_1iekieklde03bjc.R.inc(23869);
        __CLR4_4_1iekieklde03bjc.R.inc(23870);ImageInputStream iis = ImageIO.createImageInputStream(new FileInputStream("test/images/tbbn3p08.png"));
        __CLR4_4_1iekieklde03bjc.R.inc(23871);ImageContext context = MockImageContext.newSafeInstance();
        __CLR4_4_1iekieklde03bjc.R.inc(23872);ImageInfo imageInfo = new PreloaderRawPNG().preloadImage(null, new ImageSource(iis, null, true), context);
        __CLR4_4_1iekieklde03bjc.R.inc(23873);assertEquals(imageInfo.getMimeType(), "image/png");
        __CLR4_4_1iekieklde03bjc.R.inc(23874);assertEquals(imageInfo.getSize().getWidthPx(), 32);
    }finally{__CLR4_4_1iekieklde03bjc.R.flushNeeded();}}
}
