package ru.tn.courses.mryabykh.task2.v1.subtask1.utils;

import ru.tn.courses.mryabykh.task2.v1.subtask1.models.Ad;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class AdUtils {

    public static List<Ad> createAdList(int n, int width, int height) {
        List<Ad> ads = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ads.add(new Ad(width, height));
        }
        return ads;
    }
}
