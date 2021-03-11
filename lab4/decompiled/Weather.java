// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/11/2021 9:48:54 AM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Weather.java

package com.company;


public final class Weather extends Enum
{

    public static Weather[] values()
    {
        return (Weather[])$VALUES.clone();
    }

    public static Weather valueOf(String name)
    {
        return (Weather)Enum.valueOf(com/company/Weather, name);
    }

    private Weather(String s, int i)
    {
        super(s, i);
    }

    private static Weather[] $values()
    {
        return (new Weather[] {
            RAINY, SUNNY, WINDY, STORM
        });
    }

    public static final Weather RAINY = new Weather("RAINY", 0);
    public static final Weather SUNNY = new Weather("SUNNY", 1);
    public static final Weather WINDY = new Weather("WINDY", 2);
    public static final Weather STORM = new Weather("STORM", 3);
    private static final Weather $VALUES[] = $values();

}
