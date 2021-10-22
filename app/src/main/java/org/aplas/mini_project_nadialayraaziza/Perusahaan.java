package org.aplas.mini_project_nadialayraaziza;

import android.os.Parcel;
import android.os.Parcelable;

public class Perusahaan implements Parcelable {
    private String name;
    private String link;
    private int logo;
    private String deskripsi;
    private String pendiri;
    private String kebangsaan;
    private String pendidikan;
    private String kelahiran;
    private String wafat;
    private int profile;

    public Perusahaan(){

    }

    protected Perusahaan(Parcel in) {
        name = in.readString();
        link = in.readString();
        logo = in.readInt();
        deskripsi = in.readString();
        pendiri = in.readString();
        kebangsaan = in.readString();
        pendidikan = in.readString();
        kelahiran = in.readString();
        wafat = in.readString();
        profile = in.readInt();
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

    public String getPendiri() {
        return pendiri;
    }

    public void setPendiri(String pendiri) {
        this.pendiri = pendiri;
    }

    public String getKebangsaan() {
        return kebangsaan;
    }

    public void setKebangsaan(String kebangsaan) {
        this.kebangsaan = kebangsaan;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getKelahiran() {
        return kelahiran;
    }

    public void setKelahiran(String kelahiran) {
        this.kelahiran = kelahiran;
    }

    public String getWafat() {
        return wafat;
    }

    public void setWafat(String wafat) {
        this.wafat = wafat;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
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
        parcel.writeString(pendiri);
        parcel.writeString(kebangsaan);
        parcel.writeString(pendidikan);
        parcel.writeString(kelahiran);
        parcel.writeString(wafat);
        parcel.writeInt(profile);

    }
}
