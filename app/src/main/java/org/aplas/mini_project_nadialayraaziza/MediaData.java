package org.aplas.mini_project_nadialayraaziza;

import java.util.ArrayList;

public class MediaData {
    private static String [] name = {
            "Netflix",
            "Charter Communications",
            "Focus Media Information Technology",
            "Discovery Communications",
            "Comcast",
            "Walt Disney",
            "Sky UK",
            "Naspers",
            "DISH Network"
    };

    private static String [] link = {
            "https://about.netflix.com/id",
            "https://corporate.charter.com/",
            "https://www.focusmedia.cn/en",
            "https://corporate.discovery.com/",
            "https://corporate.comcast.com/",
            "https://privacy.thewaltdisneycompany.com/id/definisi/",
            "https://www.sky.com/",
            "https://www.naspers.com/",
            "https://www.dish.com/"
    };

    private static int [] logo = {
            R.drawable.netflix,
            R.drawable.charter,
            R.drawable.focus,
            R.drawable.discovery,
            R.drawable.comcast,
            R.drawable.disney,
            R.drawable.sky,
            R.drawable.naspers,
            R.drawable.dish
    };

    private static String [] deskripsi = {
            "Netflix adalah salah satu penyedia layanan media streaming digital, berkantor pusat di Los Gatos, California. Didirikan pada tahun 2008 oleh Reed Hasting dan Marc Randolph di Scotts Valley, California. Bisnis utama dari perusahaan ini adalah layanan berlangganan streaming yang menawarkan film dan program televisi, termasuk beberapa program yang dibuat oleh Netflix sendiri. Sejak Juli 2015, Netflix memiliki lebih dari 130 juta total pelanggangan secara internasional, termasuk 57.38 juta di Amerika Serikat sendiri. Upaya mereka adalah untuk memproduksi konten baru, mengamankan hak untuk konten tambahan, dan perbedaan melalui 190 negara telah mengakibatkan perusahaan untuk mengajukan miliaran utang jangka panjang: $21.9 miliar per September 2016, naik dari $16.8 miliar dari tahun sebelumnya, meskipun hanya $ 6,5 miliar dari ini adalah hutang jangka panjang; sisanya adalah kewajiban jangka panjang.",
            "Charter Communications adalah perusahaan telekomunikasi kabel Amerika Serikat. Menyediakan layanan untuk 5.9 juta pengguna di 29 negara bagian, Dengan pendapatan terbesar ketiga di Amerika Serikat, di bawah posisi Comcast danTime Warner Cable, dan nomor sepuluh berdasarkan pengguna kabel telepon. Akhir 2012, perusahaan merelokasi kantornya dari St. Louis, Missouri, ke Stamford, Connecticut. Charter Communications didirikan tahun 1993 oleh Barry Babcock, Jerald Kent dan Howard Wood, yang telah menjadi kepala eksekutif di Cencom Cable Television, St. Louis, Missouri. Tahun 1995, Charter membayar sekitar $300 million untuk controlling interest di Crown Media dan mengakuisisi perusahhan kabel di bagian utara. Tahun 1997, Charter dan EarthLink bekerjasama untuk menyediakan Internet Kecepatan Tinggi melalui kabel modem ke pengguna Charter di wilayah California. Tahun 1998, Paul Allenmembeli akses kontrol terhadap perusahaan.perusahaan membayar $2.8 billion untuk mengakuisisi perusahaan kabel yang berbasis di Dallas yang bernama Marcus Cable. Charter Communications memiliki 1 Juta pelanggan pada tahun 1998.",
            "Focus Media Information Technology sebelumnya Focus Media Holding adalah perusahaan Tiongkok yang mengoperasikan jaringan periklanan luar ruang terbesar di negara itu, yang sebagian besar terdiri dari layar papan reklame digital , dan mengklaim memiliki biro iklan Internet terbesar di negara itu. Perusahaan ini didirikan pada tahun 2003, dan sahamnya telah diperdagangkan di pasar AS sejak IPO pada Juli 2005. Pada Mei 2013, perusahaan ini menjadi swasta. Pada Mei 2013, Focus Media diambil alih dalam transaksi senilai $3,7 miliar oleh konsorsium yang terdiri dari The Carlyle Group , FountainVest Partners, CITIC Capital, China Everbright serta pemegang saham yang ada Jason Jiang (pendiri dan ketua) dan Fosun International . Perusahaan tersebut kemudian terdaftar di Bursa Efek Shenzhen dengan cara backdoor listing.",
            "Discovery Communications adalah sebuah perusahaan media massa dan hiburan global Amerika yang berbasis di Silver Spring, Maryland dan didirikan pada tahun 1985. Perusahaan ini terutama mengoperasikan jaringan televisi faktual, seperti saluran senama Discovery Channel, Animal Planet, Investigation Discovery, Science Channel, TLC, dan merek-merek spin-off lainnya. Pada bulan Maret 2018, perusahaan ini menyelesaikan akuisisi Scripps Networks Interactive, yang menambahkan jaringan seperti Food Network, HGTV, dan Travel Channel ke dalam portofolionya. Gabungan perusahaan ini mengoperasikan lima dari sepuluh saluran kabel Amerika Serikat yang paling banyak ditonton oleh kalangan wanita. Pada bulan Desember 2017, Discovery mengumumkan bahwa mereka akan mengakuisisi tambahan 24,5% saham di OWN yang belum dimiliki, sebesar $70 juta. Oprah Winfrey akan tetap menjabat sebagai CEO OWN, dan memperluas perjanjian eksklusivitasnya dengan jaringan tersebut dan Discovery hingga 2025. Harpo Productions mempertahankan saham minoritas yang signifikan dalam usaha itu.",
            "Comcast adalah sebuah perusahaan asal Amerika Serikat yang bergerak di industri komunikasi. Perusahaan ini didirikan oleh Ralph J. Roberts, Daniel Aaron, Julian A. Brodsky pada tanggal 28 Juni 1963. Saat ini, markas pusat Comcast terletak di 1 Comcast Center, Philadelphia, PA, dan dipimpin oleh CEO Brian L. Roberts. Pada tahun 2013, Comcast masuk dalam daftar Fortune 500, sebuah daftar peringkat perusahaan berdasarkan pendapatan kotornya yang dibuat oleh majalah Fortune setiap tahun. Comcast berada dalam peringkat 44 (sebelumnya peringkat 46) dengan pendapatan sekitar $64.657 juta, keuntungan sebesar $6.816 juta, dan total aset sebesar $158.813 juta. Fortune juga mencatat bahwa pada tahun 2013, Comcast mendapatkan pendapatan akibat pembelian NBCUniversal. Comcast juga menyetujui rencana pembelian Time Warner Cable senilai $45,2 miliar pada tahun 2014, sebuah rencana yang memancing kritisi dari pelanggan yang frustasi.",
            "The Walt Disney Company adalah perusahaan konglomerat di bidang hiburan dan media terbesar di dunia. Didirikan pada 16 Oktober 1923, perusahaan ini didirikan oleh Walt Disney dan Roy Oliver Disney dengan nama Disney Brothers Cartoon Studio. Pusatnya terletak di Burbank, California. Sejak 1980-an, Disney telah menciptakan dan mengakuisisi divisi perusahaan untuk memasarkan konten yang lebih dewasa daripada yang biasanya dikaitkan dengan merek-merek andalannya yang berorientasi keluarga. Perusahaan ini dikenal dengan divisi studio film, The Walt Disney Studios, yang meliputi Walt Disney Pictures, Walt Disney Animation Studios,Pixar, Marvel Studios, Lucasfilm, 20th Century Studios, 20th Century Animation, dan Searchlight Pictures. Laba Disney pada 2004 adalah sebesar $30,8 miliar USD dan merupakan komponen Dow Jones Industrial Average. Perusahaan ini dikenal sebagai Walt Disney Productions, Ltd. sampai 6 Februari 1986 dan kemudian diubah menjadi namanya sekarang.",
            "Sky UK adalah perusahaan telekomunikasi yang beroperasi di Britania Raya. Sky menyediakan layanan televisi, Internet pita lebar, dan telepon kabel dan seluler untuk konsumen dan perusahaan di seluruh Britania Raya. Sky merupakan penyiar televisi berbayar terbesar di negara ini dengan 11 juta pelanggan per 2015. Sky juga merupakan layanan televisi digital terpopuler di negara ini sebelum digeser oleh Freeview pada April 2007. Kantor pusatnya terletak di Isleworth. Sky dibentuk pada Maret 1994, empat tahun setelah merger Sky Television dan British Satellite Broadcasting, dan menjadi perusahaan televisi berlangganan digital terbesar di Britania Raya. Usai akuisisi Sky Italia tahun 2014 dan 90,04% saham Sky Deutschland bulan November 2014, perusahaan holding British Sky Broadcasting Group plc berganti nama menjadi Sky plc. Nama anak perusahaannya di Britania berubah dari British Sky Broadcasting Limited menjadi Sky UK Limited dan masih beroperasi dengan nama Sky pada November 2018. Sky UK Limited merupakan anak perusahaan Sky yang dimiliki oleh Comcast. Andrew Griffith dan Christopher Taylor saat ini menjabat sebagai direktur perusahaan. Griffith juga menjabat sebagai Kepala Pejabat Keuangan (CFO) dan Direktur Pelaksana divisi bisnis komersial.",
            "Naspers Limited adalah Afrika Selatann multinasional perusahaan induk berpusat di Cape Town, dengan minat dalam penerbitan, ritel online dan modal ventura berinvestasi di sektor internet konsumen. Pada Mei 2021 diumumkan bahwa anak perusahaan yang terdaftar di Belanda Prosus Naspers akan menjadi pemegang saham utama perusahaan, yang memiliki hingga 49,5% dari induknya sebagai bagian dari struktur kepemilikan silang.",
            "Dish Network merupakan layanan penyedia jasa televisi dan radio berlangganan yang berpusat di Amerika Serikat. Dish Network diluncurkan pada tanggal 4 Maret 1996 dan diikuti oleh DirecTV, bersaing dengan televisi kabel. Dish Network diluncurkan pada tanggal 4 Maret 1996 sebagai layanan dari EchoStar. EchoStar dibentuk pada tahun 1980 oleh ketua dan CEOnya, Charlie Ergen sebagai distributor satelit gelombang C band. Pada tahun 1995, EchoStar resmi meluncurkan satelit pertama, EchoStar I. Pada tahun itu juga, Dish Network resmi didirikan. Pada tahun 1998, EchoStar membeli aset dari siaran satelit penyiaran kerjasama dari ASkyB milik News Corporation dan MCI Worldcom. Dengan begitu, kapasitas mencapai $682.5 juta. Akuisisi perusahaan terinspirasi untuk memperkenalkan sistem multisatelit yang disebut DISH 500, secara teoretis mampu menerima lebih dari 500 saluran. Pada tahun itu pula, Echostar, bersama dengan Bell TV, meluncurkan Dish Network Canada. EchoStar membeli aset perusahaan HDTV bermasalah, termasuk satelit Rainbow 1 dengan tipe EchoStar 3. Sejak tahun 2008, Dish Network dimiliki oleh Dish Network Corporation."
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
