/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woon;

import java.awt.Container;
import java.lang.reflect.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author eusea
 */
public class ReflectionUtil {

    public static <T> T getComponentByType(Class<T> type, String name, Container container) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        T retObj = (T) container.getClass().getField(name).get(container);
        return retObj;
    }

    public static <T> T[] getComponentsByType(Class<T> type, Container container) throws IllegalArgumentException, IllegalAccessException {
        ArrayList<Object> componentList = new ArrayList<>();
        for (Field declaredField : container.getClass().getDeclaredFields()) {
            if (declaredField.get(container).getClass().isAssignableFrom(type)) {
                componentList.add(declaredField.get(container));
            }
        }
        Object[] cList = componentList.toArray();
        T[] result = (T[]) Array.newInstance(type, cList.length);
        for (int i = 0; i < cList.length; i++) {
            result[i] = (T) cList[i];
        }
        return result;
    }

}
