package miguel.museos.enums;

import android.content.Context;

import miguel.museos.R;


/**
 * Created by miguel on 8/04/16.
 */
public enum Enum_tabs {
    NEWS,MUSEUMS,PASSPORT;

    @Override @Deprecated
    public String toString() {
        return super.toString();
    }

    public String toString(Context context) {
        switch (this) {

            case NEWS:
                return context.getResources().getString(R.string.news);

            case MUSEUMS:
                return context.getResources().getString(R.string.museums);

            case PASSPORT:
                return context.getResources().getString(R.string.passport);

            default:
                return null;
        }
    }
}
