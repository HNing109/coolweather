package com.coolweather.android.gson;

/**
 * Created by hning on 2018/10/9.
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}

