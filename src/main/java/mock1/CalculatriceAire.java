package mock1;

import java.util.List;

public class CalculatriceAire {
    public static double aire(List<IForme> formes) {
        double aire = 0;
        for (IForme f : formes) {
            aire += f.aire();
        }
        return aire;
    }
}
