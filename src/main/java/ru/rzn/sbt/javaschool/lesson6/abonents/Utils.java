package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Utils {

    public static <T, R> Collection<R> transform(Collection<T> src, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T item : src){
            result.add(function.apply(item));
        }
        return result ;
    }

    public static <T> Collection<T> filter(Collection<T> src, Predicate<T> predicate){

        for(T item: src){
            predicate.test(item);
        }
        return src;
    }
}
