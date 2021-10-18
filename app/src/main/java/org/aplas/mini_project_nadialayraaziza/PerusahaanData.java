package org.aplas.mini_project_nadialayraaziza;

import java.util.ArrayList;

public class PerusahaanData {
    private static String [] name = {
            "Microsoft",
            "International Business Machine (IBM)",
            "Accenture",
            "Oracle",
            "SAP",
            "Tata Consultancy Service (TCS)",
            "Cognizant",
            "Capgemini",
            "Infosys",
            "Amazon",
            "Adobe Systems",
            "Salesforce"
    };

    private static String [] link = {
            "https://www.microsoft.com/id-id/",
            "https://www.ibm.com/id-en",
            "https://www.accenture.com/us-en",
            "https://www.oracle.com/index.html",
            "https://www.sap.com/sea/index.html?url_id=auto_hp_redirect_sea",
            "https://www.tcs.com/",
            "https://www.cognizant.com/",
            "https://www.capgemini.com/",
            "https://www.infosys.com/",
            "https://www.amazon.com/",
            "https://www.adobe.com/",
            "https://www.salesforce.com/ap/?ir=1"
    };

    private static int [] logo = {
            R.drawable.microsoft,
            R.drawable.ibm,
            R.drawable.accenture,
            R.drawable.oracle,
            R.drawable.sap,
            R.drawable.tcs,
            R.drawable.cognizant,
            R.drawable.capgemini,
            R.drawable.infosys,
            R.drawable.amazon,
            R.drawable.adobe,
            R.drawable.salesforce
    };

    private static String [] deskripsi = {
            "Microsoft Corporation adalah sebuah perusahaan multinasional Amerika Serikat yang berkantor pusat di Redmond, Washington, Amerika Serikat yang mengembangkan, membuat, memberi lisensi, dan mendukung berbagai produk dan jasa terkait dengan komputer. Perusahaan ini didirikan oleh Bill Gates dan Paul Allen pada tanggal 4 April 1975. Microsoft merupakan pembuat perangkat lunak terbesar di dunia menurut pendapatannya. Microsoft juga merupakan salah satu perusahaan paling bernilai di dunia. Microsoft didirikan untuk mengembangkan dan menjual penerjemah BASIC untuk Altair 8800. Perusahaan ini berhasil mendominasi pasar sistem operasi komputer pribadi dengan MS-DOS-nya pada pertengahan 1980-an, diikuti dengan jajaran sistem operasi Microsoft Windows. Penawaran umum perdana Microsoft tahun 1986, dan kenaikan tajam harga sahamnya, menciptakan tiga miliuner dan 12.000 jutawan di kalangan karyawan Microsoft. Sejak 1990-an, perusahaan ini semakin terdiversifikasi dari pasar sistem operasi dan telah melakukan sejumlah akuisisi perusahaan. Pada bulan Mei 2011, Microsoft membeli Skype Technologies senilai $8,5 miliar dan menjadi akuisisi termahal sepanjang sejarah Microsoft.",
            "International Business Machine (IBM) adalah sebuah perusahaan Amerika Serikat yang memproduksi dan menjual perangkat keras dan perangkat lunak komputer. IBM didirikan oleh Charles Ranlett Flint pada 16 Juni 1911, beroperasi sejak 1888 dan berpusat di Armonk, New York, Amerika Serikat. Tercatat 300 kantor cabang, dengan 400.000 karyawan, kini tersebar di 170 negara. Mesin bisnis IBM dalam bentuk layanan yang diberikan antara lain meliputi sektor cloud and cognitive software, global technology services (GTS), global business service (GBS), serta global financing and system. Saat ini, 92% dari 100 bank terkemuka dunia menggunakan jasa IBM untuk menjamin keamanan semua transaksi keuangan mereka. Membedah sektor keuangan IBM, tahun 2018 capital market bertengger di angka US$ 113 miliar. Revenue ada di jumlah US$ 77.1 miliar dengan laba bersih sebesar US$ 11.4 miliar.",
            "Accenture adalah sebuah penyedia jasa profesional multinasional asal Irlandia. Perusahaan ini telah terdaftar dalam peringkat Fortune 500 Global Company dan saat ini merupakan salah satu perusahaan IT terbesar di dunia. Accenture juga merupakan perusahaan konsultan yang menyediakan layanan professional dalam bidang strategy, konsultan serta technology operations service. Didirikan di Dubin Irlandia oleh Clarence DeLany tahun 1989, perusahaan ini memulai kegiatan bisnis sebagai konsultan keuangan bernama Anderson Consulting. Tahun 1989, terjadi pemisahan bisnis dimana Anderson Consulting berubah nama menjadi Accenture yang juga berarti Accent for The Future. Saat ini, Accenture memiliki karyawan sebanyak 506.000 orang yang tersebar di 120 negara. Di antara korporasi raksasa yang menjadi client Accenture antara lain adalah Unilever, the Royal Shakespeare dan Mariott. November 2019, market capital Accenture sudah menyentuh angka US$ 125 miliar. Sementara itu revenue tahun 2020 ada di US$ 43.2 miliar dengan laba bersih US$ 4.85 miliar.",
            "Oracle merupakan perusahaan penyedia teknologi komputer yang khusus mengembangkan dan mendistribusikan sistem perangkat keras (hardware) dan perangkat lunak (software), terutama dalam sistem manajemen database. Perusahaan yang berkantor pusat di Redwood City, California, Amerika Serikat ini merupakan pembuat perangkat lunak terbesar ketiga dari segi pendapatan setelah Microsoft dan IBM. Pada awal berdiri-nya, Oracle tak lepas dari peran Ellison yang terinspirasi dari makalah Edgar F. Codd pada tahun 1970. Makalah tersebut berisi tentang sistem manajemen database relasional (RDBMS). Selanjutnya pada tahun 1977 Ellison mendirikan Oracle Corporation yang dibantu oleh Bob Miner dan Ed Oates di bawah naungan Software Development Laboratories (SDL). Pada tahun 1982, SDL berubah nama menjadi Relational Software, Inc. yang kemudian berganti kembali menjadi Oracle Systems Corporation di tahun 1982. Pada ulang tahun Oracle yang ke 30, Oracle mengumumkan untuk lebih terfokus dengan produk andalannya yang berlabel Oracle Database. Pada tahun 1995, perusahaan kembali mengalami perubahan nama menjadi Oracle Corporation.",
            "SAP adalah perusahaan yang didirikan oleh Dietmar Hopp dan Haso Plattner tahun 1972 dengan basis operasional di Walldorf, Baden-Wurttemberg, Jerman, memiliki revenue sebesar US$ 29.9 miliar dengan laba bersih US$ 3.67 miliar. Angka tersebut sekaligus menyegel SAP sebagai perusahaan IT di luar Amerika Serikat dengan revenue dan laba terbesar. Perusahaan ini berhasil membangun reputasinya sebagai pengembang nomor satu di sektor perangkat lunak dan semua jenis layanan yang berhubungan dengan software. Dengan 102.400 karyawan yang tersebar di 130 negara, SAP kini menjadi perusahaan pengembang software terbesar ke 3 di dunia, dengan jumlah client sebanyak  400.000 di 180 negara. Tak heran, SAP kini memiliki lebih dari 100 pusat pelatihan yang tersebar di seluruh dunia.  Bidang seperti machine learning, internet of things, blockchain dan SAP HANA menjadi tulang punggung layanan SAP untuk para client. Dalam memberikan service terbaik, SAP merangkul semua jenis usaha baik kecil, sedang dan korporasi besar. Tak heran, 77% transaksi bisnis dunia menggunakan system yang ditemukan oleh SAP.",
            "Tata Consultancy Service (TCS) adalah perusahaan yang berdiri sejak tahun 1968, TCS yang dirintis oleh JRD Tata dan bermarkas di Mumbai India, TCS merupakan salah satu anak perusahaan dari sebuah konglomerasi raksasa Tata Group yang hari ini beroperasi di 46 negara. TCS sendiri memberikan layanan bisnis di sektor IT yang meliputi service, supplier, konsultan, pengembang aplikasi, infrastruktur serta outsourcing. Sebagai perusahaan IT nomor satu di India, TCS menempati urutan 10 dalam Fortune India 500. Berbagai perusahaan yang bergerak di sektor perbankan, retail, komunikasi, media, energy, asuransi, manufaktur, kesehatan sampai kepada sektor ekspedisi tercatat menjadi client TCS. Bahkan TCS juga mulai merambah masuk di sektor artificial intelligence (AI), machine learning, internet of things, cloud computing dan cyber security. Tahun 2018, TCS berhasil menjadi perusahaan kedua di India yang berhasil memiliki capital market lebih dari US$ 100 miliar. Capaian ini menjadikan TCS sebagai salah satu dari 63 perusahaan raksasa dunia dengan capital market lebih dari US$ miliar. Per Desember 2020, TCS mempekerjakan 469.000 karyawan di seluruh dunia dan memiliki revenue sebesar US$ 22 miliar dengan laba bersih US$ 4.4 miliar.",
            "Cognizant adalah korporasi yang dibidani oleh Kumar Mahadeva dan Francisco D’Souza sejak tahun 1994, ini memilih Teanec, New Jersey USA sebagai pusat operasional bisnis mereka. Adapun posisi strategis CEO, hari ini dijabat oleh Brian Humphries yang berhasil mengamankan gelar sebagai salah satu perusahaan marketing IT terbesar di dunia. Adapun layanan yang diberikan meliputi bidang jasa digital products, konsultan IT, information security dan IT digital service (digital business, digital operations, digital system technology). Salah satu keunikan layanan yang diberikan perusahaan ini adalah solusi bagi para client untuk membangun usaha yang lebih inovatif dan efisien, kemudian di saat yang sama mentransformasi sebuah bisnis dengan basis digital menjadi lebih kompetitif di tengah cepatnya arus perubahan tekhnologi. Sebagai perusahaan yang terus berkembang secara konsisten, Cognizant juga ikut melantai di lantai bursa dan terdaftar sebagai salah satu emiten di Nasdaq. Selain itu, Cognizant juga sukses memantapkan posisinya di urutan 205 dalam Fortune 500 Ranking. Didukung oleh lebih dari 260.000 karyawan, Cognizant memiliki revenue sebesar US$ 16.8 miliar dan laba bersih US$ 1.8 miliar.",
            "Capgemini adalah perusahaan dengan Paris Prancis sebagai pusat operasional, firma ini tercatat beroperasi di 40 negara dan mempekerjakan tidak kurang dari 190.000 karyawan. Capgemini mulai berselancar di sektor IT global dengan fokus layanan di sektor data processing dan konsultan managemen perusahaan, saat pertama kali dirintis oleh Serge Kampf , 1 Oktober 1967 silam. Perusahaan Prancis ini menemukan momentum bisnis di tahun 1974 ketika melakukan beberapa akuisisi diantaranya CAP, Gemini Computer New York, DASD Wisconsin, serta Altran –kesemuanya perusahaan yang bergerak di bidang IT-. Bahkan dalam beberapa tahun terakhir, dengan dinahkodai oleh Aiman Ezzat sebagai CEO, Capgemini kembali berhasil mengakuisisi beberapa perusahaan IT seperti iGate, Fahrenheit 212, serta LiquidHub. Konsisten dalam mengarungi ketatnya kompetisi sektor IT, membuat Capgemini memperoleh pengakuan internasional lewat beberapa penghargaan dari Gartner, Forrester serta Backbase. Per data tahun 2019, Capgemini memiliki total revenue sebesar US$15.22 miliar, dengan laba bersih bertengger di angka US$ 870 juta.",
            "Infosys adalah perusahaan yang dirintis oleh N.R Narayana Murthy dan Nandan Nilekani, perusahaan yang memiliki basis operasional di kota Bengaluru India ini, mantap duduk di posisi 10 besar. Sejak memulai kiprahnya di dunia IT tahun1981, di tangan Salil Parekh sebagai CEO, Infosys berhasil menjadi firma IT ke 2 terbesar di India. Adapun layanan utama Infosys bervariasi dari sektor software (development dan maintenance), asuransi, fintech (financial technology), konsultan di sektor manufaktur, serta penyedia jasa outsourcing. Dalam pengembangan sayap business, Infosys menjadi pemain terbesar dalam sektor retail perbankan lewat produk unggulannya Finacle –sebuah sistem teknologi perbankan global. Tahun 2019, Infosys memiliki 243,454 karyawan (37,8% di antaranya adalah perempuan). Masih di tahun yang sama, perusahaan ini menerima tak kurang dari 2.333.420 surat lamaran pekerjaan, melakukan interview untuk 180.225 calon karyawan, serta  mempekerjakan 94.324 orang. Angka-angka tersebut menempatkan Infosys sebagai salah satu perusahaan yang memiliki prosentase hiring rate terbesar yaitu 4% setiap tahunnya.",
            "Amazon adalah perusahaan teknologi multinasional Amerika yang berbasis di Seattle, Washington, yang berfokus pada e-commerce, komputasi awan, streaming digital, dan kecerdasan buatan. Perusahaan ini dianggap sebagai salah satu perusahaan teknologi Big Four bersama dengan Google Alphabet, Apple Inc., Microsoft, dan Facebook. Amazon didirikan oleh Jeff Bezos pada 5 Juli 1994 di Bellevue, Washington. Perusahaan ini awalnya dimulai sebagai pasar online untuk buku tetapi kemudian diperluas untuk menjual barang elektronik, perangkat lunak, video game, pakaian, furnitur, makanan, mainan, dan perhiasan. Pada 2015, Amazon melampaui Walmart sebagai pengecer paling berharga di Amerika Serikat dengan kapitalisasi pasar. Pada tahun 2017, Amazon mengakuisisi Whole Foods Market senilai $ 13,4 miliar, yang sangat meningkatkan kehadiran Amazon sebagai pengecer batu-dan-mortir. Pada 2018, Bezos mengumumkan bahwa layanan pengiriman dua hari, Amazon Prime, telah melampaui 100 juta pelanggan di seluruh dunia.",
            "Adobe Systems adalah perusahaan perangkat lunak yang bergerak di bidang grafis, animasi, video, dan pengembangan web. Adobe adalah salah satu perusahaan perangkat lunak yang paling besar di dunia. Perusahaan ini didirikan pada tahun 1982 dan berpusat di San Jose, California, AS. Beberapa dari produk-produknya yang terkenal dan mendunia adalah Photoshop, Flash, dan Acrobat. Hingga 2019, Adobe mempekerjakan lebih dari 21.000 orang di seluruh dunia, dengan sekitar 40% di antaranya bekerja di San Jose. Adobe pun memiliki sejumlah unit pengembangan besar di Amerika Serikat, yakni di Newton, New York City, Minneapolis, Lehi, Seattle, Austin, dan San Francisco. Adobe juga memiliki unit pengembangan besar di Noida dan Bangalore di India.",
            "Salesforce adalah perusahaan perangkat lunak berbasis awan Amerika Serikat yang bermarkas di San Francisco, California. Meski sebagian besar pendapatannya berasal dari produk manajemen hubungan pelanggan (CRM), Salesforce juga menjual berbagai aplikasi pelengkap bisnis yang berfokus pada layanan pelanggan, otomasi pemasaran, analitika, dan pengembangan aplikasi. Salesforce menempati peringkat pertama dalam daftar 100 Best Companies to Work For yang disusun majalah Fortune tahun 2018. Hingga saat ini Salesforce telah memiliki partner yang tersebar di seluruh dunia, salah satunya yakni Saasten Technologies yang berbasis di Indonesia."
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
