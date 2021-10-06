package org.aplas.mini_project_nadialayraaziza;

import android.os.Parcel;
import android.os.Parcelable;

public class Perusahaan implements Parcelable {
    private String name;
    private String link;
    private int logo;
    private String deskripsi;

    public Perusahaan(){

    }

    protected Perusahaan(Parcel in) {
        name = in.readString();
        link = in.readString();
        logo = in.readInt();
        deskripsi = in.readString();
    }

    public static final Creator<Perusahaan> CREATOR = new Creator<Perusahaan>() {
        @Override
        public Perusahaan createFromParcel(Parcel in) {
            return new Perusahaan(in);
        }

        @Override
        public Perusahaan[] newArray(int size) {
            return new Perusahaan[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(link);
        parcel.writeInt(logo);
        parcel.writeString(deskripsi);
    }
}
