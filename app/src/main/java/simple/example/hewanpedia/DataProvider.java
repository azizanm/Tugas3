package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Rinjani", "Jalur 1",
                "View Rinjani 1", R.drawable.l));
        kucings.add(new Kucing("Rinjani", "Jalur 2",
                "View Rinjani 2", R.drawable.k));
        kucings.add(new Kucing("Rinjani", "Jalur 3",
                "View Rinjani 3", R.drawable.j));
        kucings.add(new Kucing("Rinjani", "Jalur 4",
                "View Rinjani 4", R.drawable.i));
        kucings.add(new Kucing("Rinjani", "Jalur 5",
                "View Rinjani 5", R.drawable.h));
        kucings.add(new Kucing("Rinjani", "Jalur 6",
                "View Rinjani 6", R.drawable.g));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Rinjani", "Jalur 1",
                "View Rinjani 1", R.drawable.f));
        anjings.add(new Anjing("Rinjani", "Jalur 2",
                "View Rinjani 2", R.drawable.e));
        anjings.add(new Anjing("Rinjani", "Jalur 3",
                "View Rinjani 3", R.drawable.d));
        anjings.add(new Anjing("Rinjani", "Jalur 4",
                "View Rinjani 4", R.drawable.c));
        anjings.add(new Anjing("Rinjani", "Jalur 5",
                "View Rinjani 5", R.drawable.b));
        anjings.add(new Anjing("Rinjani", "Jalur 6",
                "View Rinjani 6", R.drawable.a));
        return anjings;
    }

    private static List<Buaya>initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya("Rinjani", "Jalur 1",
                "View Rinjani 1", R.drawable.a));
        buayas.add(new Buaya("Rinjani", "Jalur 2",
                "View Rinjani 2", R.drawable.b));
        buayas.add(new Buaya("Rinjani", "Jalur 3",
                "View Rinjani 3", R.drawable.c));
        buayas.add(new Buaya("Rinjani", "Jalur 4",
                "View Rinjani 4", R.drawable.d));
        buayas.add(new Buaya("Rinjani", "Jalur 5",
                "View Rinjani 5", R.drawable.e));
        buayas.add(new Buaya("Rinjani", "Jalur 6",
                "View Rinjani 6", R.drawable.f));
        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
