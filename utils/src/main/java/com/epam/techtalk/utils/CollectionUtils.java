package com.epam.techtalk.utils;

import java.util.function.Consumer;

public class CollectionUtils {
    public static <T> void each(Iterable<T> iterable, Consumer<T> callback) {
        for (T item : iterable) {
            callback.accept(item);
        }
    }
}
