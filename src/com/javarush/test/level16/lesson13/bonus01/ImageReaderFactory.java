package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Mistes on 29.05.2016.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes type){
        if(! (type == null)) {
            if (type.equals(ImageTypes.JPG)) {
                return new JpgReader();
            } else if (type.equals(ImageTypes.PNG)) {
                return new PngReader();
            } else if (type.equals(ImageTypes.BMP)) {
                return new BmpReader();
            }
            else {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
        }
        throw new IllegalArgumentException("N U L L");
    }
}
