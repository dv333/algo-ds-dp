package com.dv.design.patterns.creational.prototype;

public class PrototypeFactory {

    public static class Type
    {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "show";
    }

    private static java.util.Map<String , PrototypeCapable> prototypes = new java.util.HashMap<String , PrototypeCapable>();

    static
    {
        prototypes.put(Type.MOVIE, new Movie());
        prototypes.put(Type.ALBUM, new Album());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeCapable) prototypes.get(s)).clone();
    }
}
