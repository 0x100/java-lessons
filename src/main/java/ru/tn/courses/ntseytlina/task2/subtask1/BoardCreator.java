package ru.tn.courses.ntseytlina.task2.subtask1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BoardCreator {
    private static BoardCreator instance;

    private BoardCreator () {
    }

    public static BoardCreator getBoardCreator () {
        if (instance == null) {
            instance = new BoardCreator();
        }
        return instance;
    }

    public Ads setNewAdParameters (int number, int width, int height) throws NoSuchMethodException,
                                                                            IllegalAccessException,
                                                                        InvocationTargetException,
                                                                            InstantiationException {
        Constructor<Ads> constructor = Ads.class.getDeclaredConstructor(int.class, int.class, int.class);
        constructor.setAccessible(true);
        return constructor.newInstance(number, width, height);
    }
}
