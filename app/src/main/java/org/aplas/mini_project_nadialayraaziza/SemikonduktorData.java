package org.aplas.mini_project_nadialayraaziza;

import java.util.ArrayList;

public class SemikonduktorData {
    private static String [] name = {
            "NVIDIA",
            "Broadcom Corporation",
            "Micron Technology",
            "SK Hynix",
            "ASML Holding",
            "Lam Research",
            "Intel",
            "Taiwan Semiconductor",
            "NXP Semiconductors",
            "Advanced Micro Devices"
    };

    private static String [] link = {
            "https://www.nvidia.com/en-us/",
            "https://www.broadcom.com/",
            "https://www.micron.com/",
            "https://www.skhynix.com/",
            "https://www.asml.com/en",
            "https://www.lamresearch.com/",
            "https://www.intel.co.id/content/www/id/id/homepage.html",
            "https://www.tsmc.com/english",
            "https://www.nxp.com/",
            "https://www.amd.com/en"
    };

    private static int [] logo = {
            R.drawable.nvidia,
            R.drawable.broadcom,
            R.drawable.micron,
            R.drawable.skk,
            R.drawable.asml,
            R.drawable.lam,
            R.drawable.intel,
            R.drawable.taiwann,
            R.drawable.nxpp,
            R.drawable.amd
    };

    private static String [] deskripsi = {
            "NVIDIA Corporation adalah perusahaan teknologi multinasional Amerika yang didirikan di Delaware dan berbasis di Santa Clara, California. Ini merancang unit pemroses grafis (GPU) untuk pasar permainan dan profesional, serta unit system on a chip (SoC) untuk komputasi seluler dan pasar otomotif. Lini produk GPU utamanya, berlabel \"GeForce\", bersaing langsung dengan produk \"Radeon\" Advanced Micro Devices (AMD). Nvidia memperluas kehadirannya di industri permainan dengan perangkat genggam Shield Portable, Shield Tablet, dan Shield Android TV serta layanan cloud gaming GeForce Now. Selain manufaktur GPU, Nvidia memberikan kemampuan pemrosesan paralel kepada peneliti dan ilmuwan yang memungkinkan mereka menjalankan aplikasi berperforma tinggi secara efisien. Mereka digunakan di situs superkomputer di seluruh dunia. Nvidia didirikan pada 5 April, 1993, oleh Jensen Huang (CEO hingga 2020), seorang Amerika Taiwan, sebelumnya direktur CoreWare di LSI Logic dan desainer mikroprosesor di Advanced Micro Devices (AMD), Chris Malachowsky, seorang insinyur listrik yang bekerja di Sun Microsystems, dan Curtis Priem, sebelumnya adalah staf insinyur senior dan desainer chip grafis di Sun Microsystems.",
            "Broadcom Corporation adalah sebuah produsen sirkuit terpadu (IC) untuk komunikasi jalur lebar. Didirikan pada 1991 oleh Henry Samueli (chairman dan CTO) dan Henry Nicholas, dan menjadi perusahaan publik pada 1998 dan pada 2007 mempekerjakan lebih dari 5.000 orang di seluruh dunia. Broadcom termasuk dalam Pemimpin Penjualan Semikonduktor Top 20 Dunia. Produk Broadcom terdiri dari jaringan komputer dan telekomunikasi. Produknya termasuk transceiver dan IC prosesor untuk LAN ethernet dan nirkabel, modem kabel, DSL, server, alat jaringan rumah (router, switch), dan GSM/GPRS/WCDMA untuk telepon genggam. Broadcom merupakan perusahaan tanpa pabrik. Dia menggunakan perusahaan Asia untuk memproduksi semikonduktor, kepada Chartered, SMIC, Silterra, TSMC, dan UMC. Perusahaan ini berbasis di Irvine, California di kampus Universitas California, Irvine, dengan fasilitas riset dan pengembangan lain di Silicon Valley dan Bangalore, India.",
            "Micron adalah satu dari sekian banyak perusahaan yang bergerak di bidang semikonduktor. Micron DRAM dan Flash komponen digunakan untuk komputerisasi yang rumit, jaringan dan produk komunikasi, termasuk digunakan oleh banyak komputer kerja, server, telepon genggam, kamera digital, dan sistem permainan.",
            "SK hynix adalah sebuah perusahaan asal Korea Selatan yang memasok semikonduktor memori, seperti chip memori akses acak dinamis dan chip memori kilat. Hynix adalah produsen chip memori terbesar kedua di dunia (setelah Samsung Electronics) dan merupakan produsen semikomduktor terbesar ketiga di dunia. Didirikan dengan nama Hyundai Electronic Industrial Co., Ltd. pada tahun 1983 dan kemudian dikenal sebagai Hyundai Electronics, perusahaan ini memiliki fasilitas produksi di Korea, Amerika Serikat, Tiongkok, dan Taiwan. Pada tahun 2012, setelah SK Telecom menjadi pemegang saham terbesar, Hynix digabung ke SK Group (konglomerat terbesar ketiga di Korea Selatan). Klien besar Hynix antara lain Apple, Asus, Dell, HP Inc., dan Hewlett Packard Enterprise (sebelumnya Hewlett-Packard). Produk lain yang menggunakan memori buatan Hynix antara lain pemutar DVD, telepon seluler, set-top box, asisten digital pribadi, peralatan jaringan, dan cakram keras.",
            "ASML adalah perusahaan Belanda dan penyuplai sistem litografi untuk industri semikonduktor terbesar di dunia. Perusahaan ini memproduksi mesin untuk keperluan produksi sirkuit terintegrasi, seperti RAM dan flash memory chip dan CPU.",
            "Lam Research Corporation adalah perusahaan Amerika terkemuka di industri peralatan semikonduktor, spesialis dalam merancang dan memproduksi produk-produk yang berhubungan dengan semikonduktor, dan peralatan pengolah tingkat kemasan wafer tingkat akhir. Didirikan pada tahun 1980 dan berkantor pusat di Fremont, California. Perusahaan ini merupakan bagian dari Standard & Poor's 500 dan NASDAQ-100; sahamnya ditradingkan di Nasdaq.",
            "Intel Corporation adalah perusahaan multinasional dan perusahaan teknologi Amerika yang berkantor pusat di Santa Clara, California, di Silicon Valley. Ini adalah produsen semiconductor chip terbesar di dunia berdasarkan pendapatan, dan merupakan pengembang seri x86 dari mikroprosesors, prosesor yang ditemukan di sebagian besar komputer pribadi (PC). Incorporated in Delaware, Intel berada di peringkat No. 45 di 2020 Fortune 500 daftar perusahaan Amerika Serikat terbesar berdasarkan total pendapatan selama hampir satu dekade, dari tahun fiskal 2007 hingga 2016. Intel didirikan pada 18 Juli 1968, oleh perintis semikonduktor Gordon Moore (dari hukum Moore) dan Robert Noyce, dan dikaitkan dengan kepemimpinan eksekutif dan visi Andrew Grove. Nama perusahaan disusun sebagai portmanteau dari kata integrated dan electronics, dengan salah satu pendiri Noyce telah menjadi penemu kunci dari integrated circuit (mikrochip).",
            "Taiwan Semiconductor Manufacturing Company (TSMC) adalah foundry semikonduktor terbesar di dunia, dengan kantor pusat dan operasi di Taiwan. Didirikan pada 1987, kapitalisasi pasarnya pada 2003 adalah AS$40.366 billion. Perusahaan ini terdaftar di Bursa Saham Taiwan dan di Bursa Saham New York dengan simbol TSM. Ketua Umum dan CEO sekarang adalah Morris Chang. Philips memegang 19,1% saham di TSMC.",
            "NXP Semiconductors adalah satu dari 20 Pemimpin Pasar Semikonduktor Teratas Dunia, dan awalnya didirikan oleh Philips 50 tahun yang lalu. Sebelumnya bernama Philips Semiconductors, perusahaan ini dijual oleh Philips kepada konsorsium investor modal pribadi pada tahun 2006. Nama yang baru, NXP, memiliki kepanjangan \"next experience\", menurut CEO Frans van Houten. Pada 6 Agustus 2010, NXP menyelesaikan IPO-nya dengan perdagangan saham-sahamnya di NASDAQ di bawah simbol saham NXPI. NXP Semiconductors menyediakan solusi High Performance Mixed Signal dan Standard Product berdasarkan keahlian RF, analog, pengelolaan daya, antarmuka, keamanan dan pemrosesan digital. Selain itu, NXP telah merancang strateginya yang berfokus pada \"produk tanpa cip besar di tengahnya.\" Semikonduktornya digunakan di berbagai macam aplikasi otomotif, identifikasi, infrastruktur nirkabel, penerangan, industri, peralatan bergerak, konsumen, dan komputasi \"cerdas\". Berkantor pusat di Belanda, perusahaan ini memiliki sekitar 28.000 karyawan yang bertempat di lebih dari 25 negara dan mencetak penjualan senilai USD 4,4 miliar pada tahun 2010.",
            "Advanced Micro Devices, Inc. (AMD) adalah perusahaan semikonduktor multinasional Amerika yang berbasis di Santa Clara, California, yang mengembangkan prosesor komputer dan teknologi terkait untuk bisnis dan pasar konsumen. Meskipun awalnya memproduksi prosesornya sendiri, perusahaan tersebut kemudian mengalihdayakan manufakturnya, sebuah praktik yang dikenal sebagai going fabless, setelah GlobalFoundries dipisahkan pada tahun 2009. Produk utama AMD meliputi mikroprosesor, chipset papan induk, prosesor tertanam dan prosesor grafis untuk peladen, workstation, komputer pribadi, dan aplikasi sistem tertanam. AMD mengeluarkan berbagai lini prosesor untuk berbagai segmen, mulai dari server (Opteron dan Epyc) hingga dekstop (FX dan Ryzen)."
    };

    private static String [] pendiri = {
            "Jen-Hsun Huang", //Semikonduktor
            "Henry Samueli",
            "Ward Parkinson",
            "Chung Ju-yung",
            "Arthur H. Del Prado",
            "David K. Lam",
            "Gordon Moore",
            "Morris Chang",
            "Gerard Philips",
            "Jerry Sanders"
    };

    private static String [] kebangsaan = {
            "Taiwan", //Semikonduktor
            "Amerika",
            "Amerika",
            "Korea Selatan",
            "Belanda",
            "Taiwan",
            "Amerika",
            "Taiwan",
            "Belanda",
            "Amerika"
    };

    private static String [] pendidikan = {
            "Universitas Negeri Oregon", //Semikonduktor
            "Universitas California",
            "IIT Chicago-Kent College of Law",
            "Universitas Waseda & George Washington",
            "University of California",
            "MIT (M.S. & Sc.D. in Chemical Engineering)",
            "Institut Teknologi California",
            "Pui Ying Secondary School",
            "Universitas Teknologi Delft",
            "Universitas Illinois Urbana-Champaign"
    };

    private static String [] kelahiran = {
            "17 Februari 1963", //Semikonduktor
            "20 September 1954",
            "11 June 1971",
            "25 November 1915",
            "17 November 1931",
            "10 Februari 1943",
            "3 Januari 1929",
            "10 Juli 1931",
            "9 Oktober 1858",
            "12 September 1936"
    };

    private static String [] wafat = {
            "Belum Wafat", //Semikonduktor
            "Belum Wafat",
            "Belum Wafat",
            "21 Maret 2001",
            "9 September 2016",
            "Belum Wafat",
            "Belum Wafat",
            "Belum Wafat",
            "26 Januari 1942",
            "Belum Wafat"
    };

    private static int [] profile = {
            R.drawable.p14,
            R.drawable.p15, //Semikonduktor
            R.drawable.p16,
            R.drawable.p17,
            R.drawable.p18,
            R.drawable.p19,
            R.drawable.p20,
            R.drawable.p21,
            R.drawable.p22,
            R.drawable.p23
    };

    static ArrayList<Perusahaan> getListData(){
        ArrayList<Perusahaan> list = new ArrayList<>();
        for (int position = 0; position < name.length; position++) {
            Perusahaan p = new Perusahaan();
            p.setName(name[position]);
            p.setLink(link[position]);
            p.setLogo(logo[position]);
            p.setDeskripsi(deskripsi[position]);
            p.setPendiri(pendiri[position]);
            p.setKebangsaan(kebangsaan[position]);
            p.setPendidikan(pendidikan[position]);
            p.setKelahiran(kelahiran[position]);
            p.setWafat(wafat[position]);
            p.setProfile(profile[position]);
            list.add(p);
        }
        return list;
    }

}
