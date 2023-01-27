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

/* $Id: BufferedImageCachableRed.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.rendered;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

import org.apache.xmlgraphics.image.GraphicsUtil;

// CSOFF: NeedBraces
// CSOFF: WhitespaceAfter
// CSOFF: WhitespaceAround

/**
 * This implements CachableRed based on a BufferedImage.
 * You can use this to wrap a BufferedImage that you want to
 * appear as a CachableRed.
 * It essentially ignores the dependency and dirty region methods.
 *
 * Originally authored by Thomas DeWeese.
 * @version $Id: BufferedImageCachableRed.java 1732018 2016-02-24 04:51:06Z gadams $
 */
public class BufferedImageCachableRed extends AbstractRed {public static class __CLR4_4_1afhafhlde039cd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0062\u006f\u0067\u0064\u0061\u005c\u005c\u0052\u0065\u0070\u006f\u0073\u005c\u005c\u0033\u0034\u0035\u0048\u0065\u006c\u0070\u005c\u005c\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674792292202L,8589935092L,13550,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // The bufferedImage that we wrap...
    BufferedImage bi;

    /**
     * Construct an instance of CachableRed around a BufferedImage.
     */
    public BufferedImageCachableRed(BufferedImage bi) {
        super((CachableRed)null,
              new Rectangle(bi.getMinX(),  bi.getMinY(),
                            bi.getWidth(), bi.getHeight()),
              bi.getColorModel(), bi.getSampleModel(),
              bi.getMinX(), bi.getMinY(), null);__CLR4_4_1afhafhlde039cd.R.inc(13518);try{__CLR4_4_1afhafhlde039cd.R.inc(13517);

        __CLR4_4_1afhafhlde039cd.R.inc(13519);this.bi = bi;
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}

    public BufferedImageCachableRed(BufferedImage bi,
                                            int xloc, int yloc) {
        super((CachableRed)null, new Rectangle(xloc,  yloc,
                                               bi.getWidth(),
                                               bi.getHeight()),
              bi.getColorModel(), bi.getSampleModel(), xloc, yloc, null);__CLR4_4_1afhafhlde039cd.R.inc(13521);try{__CLR4_4_1afhafhlde039cd.R.inc(13520);

        __CLR4_4_1afhafhlde039cd.R.inc(13522);this.bi = bi;
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}

    public Rectangle getBounds() {try{__CLR4_4_1afhafhlde039cd.R.inc(13523);
        __CLR4_4_1afhafhlde039cd.R.inc(13524);return new Rectangle(getMinX(),
                             getMinY(),
                             getWidth(),
                             getHeight());
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}

    /**
     * fetch the bufferedImage from this node.
     */
    public BufferedImage getBufferedImage() {try{__CLR4_4_1afhafhlde039cd.R.inc(13525);
        __CLR4_4_1afhafhlde039cd.R.inc(13526);return bi;
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}

    public Object getProperty(String name) {try{__CLR4_4_1afhafhlde039cd.R.inc(13527);
        __CLR4_4_1afhafhlde039cd.R.inc(13528);return bi.getProperty(name);
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}

    public String [] getPropertyNames() {try{__CLR4_4_1afhafhlde039cd.R.inc(13529);
        __CLR4_4_1afhafhlde039cd.R.inc(13530);return bi.getPropertyNames();
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}

    public Raster getTile(int tileX, int tileY) {try{__CLR4_4_1afhafhlde039cd.R.inc(13531);
        __CLR4_4_1afhafhlde039cd.R.inc(13532);return bi.getTile(tileX, tileY);
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}

    public Raster getData() {try{__CLR4_4_1afhafhlde039cd.R.inc(13533);
        __CLR4_4_1afhafhlde039cd.R.inc(13534);Raster r = bi.getData();
        __CLR4_4_1afhafhlde039cd.R.inc(13535);return r.createTranslatedChild(getMinX(), getMinY());
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}

    public Raster getData(Rectangle rect) {try{__CLR4_4_1afhafhlde039cd.R.inc(13536);
        __CLR4_4_1afhafhlde039cd.R.inc(13537);Rectangle r = (Rectangle)rect.clone();

        __CLR4_4_1afhafhlde039cd.R.inc(13538);if ((((!r.intersects(getBounds()))&&(__CLR4_4_1afhafhlde039cd.R.iget(13539)!=0|true))||(__CLR4_4_1afhafhlde039cd.R.iget(13540)==0&false))) {{
            __CLR4_4_1afhafhlde039cd.R.inc(13541);return null;
        }
        }__CLR4_4_1afhafhlde039cd.R.inc(13542);r = r.intersection(getBounds());
        __CLR4_4_1afhafhlde039cd.R.inc(13543);r.translate(-getMinX(), -getMinY());

        __CLR4_4_1afhafhlde039cd.R.inc(13544);Raster ret = bi.getData(r);
        __CLR4_4_1afhafhlde039cd.R.inc(13545);return ret.createTranslatedChild(ret.getMinX() + getMinX(),
                                         ret.getMinY() + getMinY());
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}

    public WritableRaster copyData(WritableRaster wr) {try{__CLR4_4_1afhafhlde039cd.R.inc(13546);
        __CLR4_4_1afhafhlde039cd.R.inc(13547);WritableRaster wr2 = wr.createWritableTranslatedChild(
            wr.getMinX() - getMinX(),
             wr.getMinY() - getMinY());

        __CLR4_4_1afhafhlde039cd.R.inc(13548);GraphicsUtil.copyData(bi.getRaster(), wr2);

        /* This was the original code. This is _bad_ since it causes a
         * multiply and divide of the alpha channel to do the draw
         * operation.  I believe that at some point I switched to
         * drawImage in order to avoid some issues with
         * BufferedImage's copyData implementation but I can't
         * reproduce them now. Anyway I'm now using GraphicsUtil which
         * should generally be as fast if not faster...
         */
        /*
          BufferedImage dest;
         dest = new BufferedImage(bi.getColorModel(),
                                  wr.createWritableTranslatedChild(0,0),
                                  bi.getColorModel().isAlphaPremultiplied(),
                                  null);
         java.awt.Graphics2D g2d = dest.createGraphics();
         g2d.drawImage(bi, null, getMinX()-wr.getMinX(),
                       getMinY()-wr.getMinY());
         g2d.dispose();
         */
        __CLR4_4_1afhafhlde039cd.R.inc(13549);return wr;
    }finally{__CLR4_4_1afhafhlde039cd.R.flushNeeded();}}
}
