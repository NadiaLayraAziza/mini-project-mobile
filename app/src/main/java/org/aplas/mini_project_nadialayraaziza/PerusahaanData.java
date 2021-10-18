package org.aplas.mini_project_nadialayraaziza;

import java.util.ArrayList;

public class PerusahaanData {
    private static String [] name = {
            "International Business Machine (IBM)",
            "Oracle",
            "Tata Consultancy Service (TCS)",
            "Capgemini",
            "Amazon"
    };

    private static String [] link = {
            "https://www.ibm.com/id-en",
            "https://www.oracle.com/index.html",
            "https://www.tcs.com/",
            "https://www.capgemini.com/",
            "https://www.amazon.com/"
    };

    private static int [] logo = {
            R.drawable.ibm,
            R.drawable.oracle,
            R.drawable.tcs,
            R.drawable.capgemini,
            R.drawable.amazon
    };

    private static String [] deskripsi = {
            "International Business Machine (IBM) adalah sebuah perusahaan Amerika Serikat yang memproduksi dan menjual perangkat keras dan perangkat lunak komputer. IBM didirikan oleh Charles Ranlett Flint pada 16 Juni 1911, beroperasi sejak 1888 dan berpusat di Armonk, New York, Amerika Serikat. Tercatat 300 kantor cabang, dengan 400.000 karyawan, kini tersebar di 170 negara. Mesin bisnis IBM dalam bentuk layanan yang diberikan antara lain meliputi sektor cloud and cognitive software, global technology services (GTS), global business service (GBS), serta global financing and system. Saat ini, 92% dari 100 bank terkemuka dunia menggunakan jasa IBM untuk menjamin keamanan semua transaksi keuangan mereka. Membedah sektor keuangan IBM, tahun 2018 capital market bertengger di angka US$ 113 miliar. Revenue ada di jumlah US$ 77.1 miliar dengan laba bersih sebesar US$ 11.4 miliar.",
            "Oracle merupakan perusahaan penyedia teknologi komputer yang khusus mengembangkan dan mendistribusikan sistem perangkat keras (hardware) dan perangkat lunak (software), terutama dalam sistem manajemen database. Perusahaan yang berkantor pusat di Redwood City, California, Amerika Serikat ini merupakan pembuat perangkat lunak terbesar ketiga dari segi pendapatan setelah Microsoft dan IBM. Pada awal berdiri-nya, Oracle tak lepas dari peran Ellison yang terinspirasi dari makalah Edgar F. Codd pada tahun 1970. Makalah tersebut berisi tentang sistem manajemen database relasional (RDBMS). Selanjutnya pada tahun 1977 Ellison mendirikan Oracle Corporation yang dibantu oleh Bob Miner dan Ed Oates di bawah naungan Software Development Laboratories (SDL). Pada tahun 1982, SDL berubah nama menjadi Relational Software, Inc. yang kemudian berganti kembali menjadi Oracle Systems Corporation di tahun 1982. Pada ulang tahun Oracle yang ke 30, Oracle mengumumkan untuk lebih terfokus dengan produk andalannya yang berlabel Oracle Database. Pada tahun 1995, perusahaan kembali mengalami perubahan nama menjadi Oracle Corporation.",
            "Tata Consultancy Service (TCS) adalah perusahaan yang berdiri sejak tahun 1968, TCS yang dirintis oleh JRD Tata dan bermarkas di Mumbai India, TCS merupakan salah satu anak perusahaan dari sebuah konglomerasi raksasa Tata Group yang hari ini beroperasi di 46 negara. TCS sendiri memberikan layanan bisnis di sektor IT yang meliputi service, supplier, konsultan, pengembang aplikasi, infrastruktur serta outsourcing. Sebagai perusahaan IT nomor satu di India, TCS menempati urutan 10 dalam Fortune India 500. Berbagai perusahaan yang bergerak di sektor perbankan, retail, komunikasi, media, energy, asuransi, manufaktur, kesehatan sampai kepada sektor ekspedisi tercatat menjadi client TCS. Bahkan TCS juga mulai merambah masuk di sektor artificial intelligence (AI), machine learning, internet of things, cloud computing dan cyber security. Tahun 2018, TCS berhasil menjadi perusahaan kedua di India yang berhasil memiliki capital market lebih dari US$ 100 miliar. Capaian ini menjadikan TCS sebagai salah satu dari 63 perusahaan raksasa dunia dengan capital market lebih dari US$ miliar. Per Desember 2020, TCS mempekerjakan 469.000 karyawan di seluruh dunia dan memiliki revenue sebesar US$ 22 miliar dengan laba bersih US$ 4.4 miliar.",
            "Capgemini adalah perusahaan dengan Paris Prancis sebagai pusat operasional, firma ini tercatat beroperasi di 40 negara dan mempekerjakan tidak kurang dari 190.000 karyawan. Capgemini mulai berselancar di sektor IT global dengan fokus layanan di sektor data processing dan konsultan managemen perusahaan, saat pertama kali dirintis oleh Serge Kampf , 1 Oktober 1967 silam. Perusahaan Prancis ini menemukan momentum bisnis di tahun 1974 ketika melakukan beberapa akuisisi diantaranya CAP, Gemini Computer New York, DASD Wisconsin, serta Altran –kesemuanya perusahaan yang bergerak di bidang IT-. Bahkan dalam beberapa tahun terakhir, dengan dinahkodai oleh Aiman Ezzat sebagai CEO, Capgemini kembali berhasil mengakuisisi beberapa perusahaan IT seperti iGate, Fahrenheit 212, serta LiquidHub. Konsisten dalam mengarungi ketatnya kompetisi sektor IT, membuat Capgemini memperoleh pengakuan internasional lewat beberapa penghargaan dari Gartner, Forrester serta Backbase. Per data tahun 2019, Capgemini memiliki total revenue sebesar US$15.22 miliar, dengan laba bersih bertengger di angka US$ 870 juta.",
            "Amazon adalah perusahaan teknologi multinasional Amerika yang berbasis di Seattle, Washington, yang berfokus pada e-commerce, komputasi awan, streaming digital, dan kecerdasan buatan. Perusahaan ini dianggap sebagai salah satu perusahaan teknologi Big Four bersama dengan Google Alphabet, Apple Inc., Microsoft, dan Facebook. Amazon didirikan oleh Jeff Bezos pada 5 Juli 1994 di Bellevue, Washington. Perusahaan ini awalnya dimulai sebagai pasar online untuk buku tetapi kemudian diperluas untuk menjual barang elektronik, perangkat lunak, video game, pakaian, furnitur, makanan, mainan, dan perhiasan. Pada 2015, Amazon melampaui Walmart sebagai pengecer paling berharga di Amerika Serikat dengan kapitalisasi pasar. Pada tahun 2017, Amazon mengakuisisi Whole Foods Market senilai $ 13,4 miliar, yang sangat meningkatkan kehadiran Amazon sebagai pengecer batu-dan-mortir. Pada 2018, Bezos mengumumkan bahwa layanan pengiriman dua hari, Amazon Prime, telah melampaui 100 juta pelanggan di seluruh dunia."
    };

    static ArrayList<Perusahaan> getListData(){
        ArrayList<Perusahaan> list = new ArrayList<>();
        for (int position = 0; position < name.length; position++) {
            Perusahaan p = new Perusahaan();
            p.setName(name[position]);
            p.setLink(link[position]);
            p.setLogo(logo[position]);
            p.setDeskripsi(deskripsi[position]);
            list.add(p);
        }
        return list;
    }

}
