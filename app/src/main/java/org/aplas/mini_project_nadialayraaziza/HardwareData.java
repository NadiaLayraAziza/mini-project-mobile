package org.aplas.mini_project_nadialayraaziza;

import java.util.ArrayList;

public class HardwareData {
    private static String [] name = {
            "NetApp",
            "Seagate Technology",
            "Hikvision",
            "Keyence",
            "Apple",
            "Dell Technologies",
            "Nokia",
            "Sunny Optical Technology Group",
            "Fortive",
            "Jabil Circuit",
            "Amphenol",
            "BOE Technology Group",
            "Murata Manufacturing",
            "Hewlett Packard Enterprise (HPE)"
    };

    private static String [] link = {
            "https://www.netapp.com/",
            "https://www.seagate.com/id/id/",
            "https://www.hikvision.com/id/",
            "https://www.keyence.co.id/",
            "https://www.apple.com/id/",
            "https://www.delltechnologies.com/",
            "https://www.nokia.com/phones/id_id",
            "http://www.sunnyoptical.com/default.html",
            "https://www.fortive.com/",
            "https://www.jabil.com/",
            "https://www.amphenol.com/",
            "https://www.boe.com/en/",
            "https://www.murata.com/en-sg",
            "https://www.hpe.com/us/en/home.html"
    };

    private static int [] logo = {
            R.drawable.netapp,
            R.drawable.seagate,
            R.drawable.hikvision,
            R.drawable.keyence,
            R.drawable.apple,
            R.drawable.dell,
            R.drawable.nokiaa,
            R.drawable.sunny,
            R.drawable.fortive,
            R.drawable.jabil,
            R.drawable.amphenol,
            R.drawable.boee,
            R.drawable.murata,
            R.drawable.hpe
    };

    private static String [] deskripsi = {
            "NetApp merupakan sebuah perusahaan penyimpanan komputer dan manajemen data berhak paten yang berpusat di Sunnyvale, California. Perusahaan ini adalah anggota NASDAQ-100. NetApp didirikan tahun 1992 oleh David Hitz, James Lau, dan Michael Malcolm. Pada waktu itu, pesaing utamanya adalah Auspex. Tahun 1994, NetApp menerima pendanaan modal usaha dari Sequoia Capital. Penawaran umum perdananya dilakukan tahun 1995. NetApp terus bertahan selama tahun-tahun gelembung internet pada pertengahan 1990-an hingga 2001. Pada waktu itu, perusahaan ini menghasilkan laba tahunan senilai $1 miliar. Setelah gelembung pecah, laba NetApp turun cepat hingga $800 juta pada tahun fiskal 2002. Sejak itu, laba perusahaan naik perlahan-lahan. Pada tahun 2006, NetApp menjual jalur produksi NetCache kepada Blue Coat Systems, Inc. Pada tanggal 19 Agustus 2009, Dan Warmenhoven mengundurkan diri sebagai CEO dan digantikan oleh Tom Georgens.",
            "Seagate Technology merupakan sebuah perusahaan multinasional yang bermarkas di Scotts Valley, California. Perusahaan ini didirikan pada tahun 1979. Perusahaan ini menghasilkan berbagai macam produk-produk komputer. Mempekerjakan 54.000 pekerjanya pada tahun 2008.",
            "Hikvision adalah sebuah produsen dan penyuplai alat pengawasan video untuk keperluan sipil dan militer milik negara Tiongkok yang bermarkas besar di Hangzhou, Zhejiang. Saham kepemilikan dimiliki oleh pemerintah Tiongkok. Karena terlibat dalam dugaan pelanggaran HAM dan keamanan nasional, perusahaan tersebut diberi sanksi oleh pemerintah AS dan dilarang menerima kontrak pemerintah AS.",
            "Keyence Corporation adalah organisasi penjualan langsung yang mengembangkan dan memproduksi sensor otomasi, sistem penglihatan, pembaca barcode, penanda laser, alat ukur, dan mikroskop digital. Keyence tidak memiliki pabriknya sendiri (fabless) - meskipun merupakan pabrikan; ia mengkhususkan hanya dalam perencanaan dan pengembangan produk dan tidak memproduksi produk akhir. Produk Keyence diproduksi di perusahaan manufaktur kontrak yang memenuhi syarat. Keyence Corporation adalah perusahaan global dengan jaringan 16 organisasi internasional yang bergerak di bidang otomasi pabrik. Keyence Corporation menghasilkan lebih dari 3,416 miliar dolar dari penjualan tahunan dan mempekerjakan lebih dari 6602+ karyawan di seluruh dunia. Sebagai perusahaan penjualan langsung, staf penjualan Keyence mengunjungi pelanggan di lokasi dengan kasus demonstrasi untuk menampilkan produk secara langsung.",
            "Apple Inc. adalah perusahaan teknologi multinasional yang berpusat di Cupertino, California, yang merancang, mengembangkan, dan menjual barang elektronik konsumen, perangkat lunak komputer, dan layanan daring. Perangkat keras yang diproduksi Apple meliputi telepon pintar iPhone, komputer tablet iPad, komputer pribadi Mac, pemutar media portabel iPod, jam pintar Apple Watch, pemutar media digital Apple TV, dan pengeras suara pintar HomePod. Perangkat lunak yang diproduksi Apple meliputi sistem operasi macOS dan iOS, pemutar media iTunes, penjelajah web Safari, dan perangkat kreativitas dan produktivitas iLife dan iWork, serta berbagai aplikasi profesional seperti Final Cut Pro, Logic Pro, dan Xcode. Layanan daringnya meliputi iTunes Store, iOS App Store dan Mac App Store, Apple Music, dan iCloud. Apple didirikan oleh Steve Jobs, Steve Wozniak, dan Ronald Wayne pada April 1976 untuk mengembangkan dan menjual komputer pribadi Apple I buatan Wozniak. Perusahaan ini resmi berdiri dengan nama Apple Computer, Inc. pada Januari 1977.",
            "Dell Technologies adalah sebuah perusahaan berbasis di Round Rock, Texas, Amerika Serikat, memproduksi dan memasarkan perangkat keras komputer (kebanyakan klon IBM). Sebagian pasarnya berada di komputer pribadi, tetapi Dell juga menjual server, alat penyimpanan data, switch jaringan, dan kluster komputer untuk perusahaan. Pada 2005 Dell, Inc. telah menjadi salah satu perusahaan yang paling dipandang. Pada Februari 2005, Dell tampil di tempat pertama di dalam urutan \"Perusahaan Paling Dibanggakan\" majalah Fortune.",
            "Nokia Corporation adalah sebuah perusahaan telekomunikasi, teknologi informasi, dan elektronik konsumen multinasional asal Finlandia yang didirikan pada tahun 1865. Kantor pusat Nokia terletak di Espoo, Finlandia, di kawasan metropolitan Helsinki. Pada tahun 2018, Nokia mempekerjakan sekitar 103.000 orang di lebih dari 100 negara, dan berbisnis di lebih dari 130 negara, serta mencatatkan pendapatan tahunan sekitar ???23 milyar. Nokia adalah sebuah perusahaan publik yang melantai di Bursa Saham Helsinki dan Bursa Saham New York. Berdasarkan Fortune Global 500, Nokia adalah perusahaan dengan pendapatan terbesar ke-415 di dunia pada tahun 2016, dan pernah menempati peringkat ke-85 pada tahun 2009. Perusahaan ini adalah salah satu komponen dari indeks pasar saham Euro Stoxx 50. Sejarah Nokia dimulai pada tahun 1865, saat insinyur pertambangan Swedia-Finlandia, Fredrik Idestam mendirikan sebuah pabrik pulp di dekat kota Tampere, Finlandia (kemudian menjadi bagian dari Kekaisaran Rusia).",
            "Sunny Optical Technology (Group) is a Chinese civilian-run enterprise and listed company that produces optical lenses. Headquartered in Yuyao, Ningbo, Zhejiang Province, Sunny Optical Technology designs, manufactures, and sells optical devices, including lens modules, camera modules, photoelectric vision products, microscopic, analytical and surveying instruments. It is a supplier to major Chinese smartphone brands including Huawei, Oppo and Vivo. According to the company itself, the predecessor of Sunny Optical was founded in October 1984 as Yuyao County Second Optical Instruments Factory in Yuyao County, Zhejiang Province.",
            "Fortive is an American diversified industrial technology conglomerate company headquartered in Everett, Washington. Fortive was spun off from Danaher in July 2016. Mitchell Rales and Steven M. Rales, Danaher's founders, retained board seats with Fortive after the separation. At the point of its independent incorporation, Fortive immediately became a component of the S&P 500. In 2016, Fortive controlled over 20 businesses in the areas of field instrumentation, transportation, sensing, product realization, automation, and franchise distribution. Later the transportation, automation and franchise distribution businesses would be spun off. In 2018 and 2019, Fortune named Fortive as a Future 50 company. In 2020, Fortune named Fortive one of the world's most admired companies along with other major tech companies like Apple, Amazon, and Microsoft. 2020 also marked the third year in a row Fortive has been named to the Fortune 500.",
            "Jabil Circuit adalah sebuah perusahaan publik asal Amerika Serikat yang bergerak di industri kelistrikan. Saat ini, markas pusat Jabil Circuit terletak di 10560 Dr. Martin Luther King Jr. St. N., St. Petersburg, Florida, dan dipimpin oleh CEO Mark T. Mondello. Pada tahun 2013, Jabil Circuit masuk dalam daftar Fortune 500, sebuah daftar peringkat perusahaan berdasarkan pendapatan kotornya yang dibuat oleh majalah Fortune setiap tahun. Jabil Circuit berada dalam peringkat 155 (sebelumnya peringkat 163) dengan pendapatan sekitar $18.337 juta, keuntungan sebesar $372 juta, dan total aset sebesar $9.154 juta. Fortune juga mencatat bahwa pada tahun 2013, Jabil Circuit fokus pada penyediaan solusi kelistrikan seperti desain listrik, produksi, serta jasa manajemen untuk perusahaan-perusahaan di industri aerospace, otomotif, dan banyak lainnya.",
            "Amphenol Corporation is a major producer of electronic and fiber optic connectors, cable and interconnect systems such as coaxial cables. Amphenol is a portmanteau from the corporation's original name, American Phenolic Corp. Amphenol was founded in Chicago in 1932 by entrepreneur Arthur J. Schmitt, whose first product was a tube socket for radio tubes (valveholder bases). Amphenol expanded significantly during World War II, when the company became the primary manufacturer of connectors used in military hardware, including airplanes and radios. From 1967 to 1982 it was part of Bunker Ramo Corporation. The company sells its products into diverse electronics markets, including military-aerospace, industrial, automotive, information technology, mobile phones, wireless infrastructure, broadband, medical, and pro audio. Operations are located in more than 60 locations around the world.",
            "BOE Technology Group is a Chinese electronic components producer founded in April 1993. Its core businesses are interface devices, smart IoT systems and smart medicine and engineering integration. BOE is one of the world's largest manufacturers of LCD, OLEDs and flexible displays. In April 1993, Beijing Oriental Electronics Group Co., Ltd was founded by Wang Dongsheng. In 1997, it listed B shares on the Shenzhen Stock Exchange. In 2001, Beijing Oriental Electronics was renamed BOE Technology Group Co., Ltd. BOE acquired SK Hynix's STN-LCD and OLED businesses for US$22.5 million. Issued additional A shares in Shenzhen Stock Exchange. In 2003, BOE acquired SK Hynix's Hydis flat-panel display businesses for US$380 million.",
            "Murata Manufacturing adalah produsen komponen elektronik Jepang, yang berbasis di Nagaokakyo, Kyoto. Ketua Kehormatan Akira Murata memulai Murata Manufacturing sebagai usaha pribadi pada bulan Oktober 1944. Pada bulan Desember 1950 mereorganisasi perusahaan menjadi Murata Manufacturing Co., Ltd. dengan modal disetor ?? 1 juta. Murata Manufacturing terutama terlibat dalam pembuatan komponen elektronik pasif keramik, terutama kapasitor , dan memiliki pangsa pasar yang luar biasa di seluruh dunia dalam filter keramik , suku cadang frekuensi tinggi , dan sensor. Per 31 Maret 2013 Murata Manufacturing memiliki 24 anak perusahaan di Jepang dan 52 di luar negeri di Amerika Serikat, Kanada, Meksiko, Brasil, Jerman, Prancis, Italia, Inggris, Swiss, Belanda, Spanyol, Hongaria, Finlandia , Cina, Taiwan, Korea Selatan, Singapura, Malaysia, Filipina, Thailand, Hong Kong, Vietnam, dan India. Pada 13 April 2012, Murata mengumumkan kesepakatan untuk mengakuisisi RF Monolithics dengan harga $ 1,78 per saham. Pada tanggal 23 Agustus 2014, Murata mengumumkan akuisisi Peregrine Semiconductor Corporation.",
            "Hewlett Packard Enterprise (HPE) adalah perusahaan yang berdiri sejak 1 November 2015 di San Jose California Amerika Serikat, HPE merupakan pecahan dari HP Company yang didirikan oleh David Packard dan Bill Hewlett di tahun 1939. HP Company kemudian berubah nama menjadi HP Inc. Pasca pemisahan tersebut, HP Inc lebih berfokus pada produksi printer dan PC, sementara HPE merambah masuk ke dalam sektor penyedia layanan IT global. Secara detail, HPE menyediakan layanan di bidang data storage and protection, IT financing, konsultan, cloud service, IT infrastructure serta produksi perangkat lunak. Layanan HP Cloud Service banyak berhubungan dengan machine E-Learning, virtual machine, managed cloud system, storage, data protection, virtual machine, big data, dan lainya. Sementara untuk layanan IT Infrastructure meliputi high performance computing, data storage, networking, information management, serta networking management facilities. Per 2020, HPE memiliki revenue sebesar US$ 29.1 miliar dan laba bersih US$ 1.05 miliar."
    };

    private static String [] pendiri = {
            "James Lau", //Hardware
            "Syed Iftikar",
            "Gong Hongjia",
            "Takemitsu Takizaki",
            "Steve Jobs",
            "Michael Dell",
            "Fredrik Idestam",
            "Wang Wenjian",
            "Steven M. Rales",
            "William Morean",
            "Arthur J. Schmitt",
            "Wang Dongsheng",
            "Akira Murata",
            "David Packard"
    };

    private static String [] kebangsaan = {
            "Tiongkok", //Hardware
            "India",
            "Tiongkok",
            "Jepang",
            "Amerika",
            "Amerika",
            "Finlandia",
            "Tiongkok",
            "Amerika",
            "Amerika",
            "Amerika",
            "China",
            "Jepang",
            "Amerika"
    };

    private static String [] pendidikan = {
            "Universitas Stanford", //Hardware
            "Aitchison College",
            "Huazhong University",
            "Amagasaki Industrial High School",
            "Reed College",
            "University of Texas di Austin",
            "Freiberg University of Mining and Technology",
            "Southwest Jiaotong University, Mechanical design and theory",
            "American University, DePauw University",
            "Universitas Western Michigan",
            "Chicago-DePaul University",
            "Shandong University of Science & Technology",
            "Migration Studies/Economics of University of Sussex",
            "Stanford University"
    };

    private static String [] kelahiran = {
            "24 April 1950", //Hardware
            "6 July 1935",
            "Tahun 1965",
            "10 Juni 1945",
            "24 Februari 1955",
            "23 Februari 1965",
            "28 Oktober 1838",
            "20 September 1968",
            "31 Maret 1951",
            "Nothing",
            "14 Juni 1893",
            "Nothing",
            "25 Maret 1921",
            "7 September 1912"
    };

    private static String [] wafat = {
            "Belum Wafat", //Hardware
            "Belum Wafat",
            "Belum Wafat",
            "Belum Wafat",
            "5 Oktober 2011",
            "Belum Wafat",
            "8 April 1916",
            "Belum Wafat",
            "Belum Wafat",
            "Belum Wafat",
            "29 Maret 1971",
            "Belum Wafat",
            "3 Februari 2006",
            "26 Maret 1996"
    };

    private static int [] profile = {
            R.drawable.p24,
            R.drawable.p25, //Hardware
            R.drawable.p26,
            R.drawable.p27,
            R.drawable.p28,
            R.drawable.p29,
            R.drawable.p30,
            R.drawable.p31,
            R.drawable.p32,
            R.drawable.p33,
            R.drawable.p34,
            R.drawable.p35,
            R.drawable.p36,
            R.drawable.p37
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
