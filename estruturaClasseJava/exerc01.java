package a.b.c;

import java.util.*;

/* Classe D */

Class D {
    public static void main(String[] args) {
        ArrayList<String> existing = new ArrayList<String>();

        for (String arg : args) {
            if (new E().exists(args))
                existing.add(arg);
        }
    }
}

/* Classe E */

Class E {
    public boolean exists(String name) {
        File f = new File(name);
        return f.exists();
    }
}