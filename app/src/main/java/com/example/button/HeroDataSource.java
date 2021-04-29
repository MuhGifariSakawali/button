package com.example.button;

import java.util.ArrayList;

public class HeroDataSource {
    private static String[] heroNames = {
            "1. Gaara (Shukaku)",
            "2. Yugito (Matatabi)",
            "3. Yagura (Isobu)",
            "4. Roshi (Son Goku)",
            "5. Han (kokuo)",
            "6. Utakata (Saiken)",
            "7. Fu (Chomei)",
            "8. Killer Bee (Gyuki)",
            "9. Naruto (Kurama)",
            "10. Obito (Juubi)"
    };

    private static String[] heroDetails = {
            "Penampakan Bijuu ini pertama kalinya muncul saat pertarungan Naruto melawan Gaara dan kemudian Garaa akhirnya mengeluarkan Sukhaku Si Ekor 1 sebagai Jinchuuriki. Shukaku berbentuk seekor rakun atau Tanuki dalam Bahasa Jepang. Dulunya Shukaku adalah seorang pendeta dari Nara yang berubah menjadi monster karena kekuatan Yamata no Orochi. Dia lalu berubah menjadi rakun raksasa. Kepribadiannya sangatlah konyol dan senang bermain-main, sama seperti rakun pada umumnya  Dia hidup dari jiwa orang-orang yang mati karena pasir dan angin. Tato ungu (biru di Naruto) miliknya menandakan julukannya sebagai dewa angin. Berikut penjelasan lebih rincinya:\n " +
                    "\n" +
                    "– Nama: Shukaku si Ekor Satu (Ichibi no Shukaku) Shukaku dari padang pasir (Suna no Shukaku)\n " +
                    "– Jenis Bijuu: Tanuki (Raccoon-Dog)\n " +
                    "– Jinchuuriki: Sabaku no Gaara\n " +
                    "– Asal Desa: Sunagakure\n " +
                    "– Penampakan Pertama Komik: Chapter 35\n " +
                    "– Penampakan Pertama Episode: Naruto Shippuuden Episode 20 \n" +
                    "– Peringkat: Kazekage\n " +
                    "– Elemen: Angin dan Tanah menjadi (pasir)\n " +
                    "– Kemampuan: Memanipulasi Pasir\n " +
                    "– Kemampuan Khusus: Menembakkan meriam angin yg terkonsentrasi menggunakan chakra\n " +
                    "– Status: Ditangkap oleh Deidara.",
            "Sebuah makhluk dari cerita mitologi Jepang, dipercaya sebagai sebuah metamorfosis dari kucing peliharaan. Ia berasal dari Hutan Kematian di utara Hokkaido dan konon pertama kali ditemukan di Hutan Iblis Hokkaido, ia berasal dari Hutan Kematian (berbeda dengan hutan iblis) di utara Hokkaido. Bentuknya berupa monster kucing hitam raksasa, yang terkadang ditampilkan dengan dua sayap malaikat berwarna hitam yang besar. Dia adalah peliharaan Dewa Kematian. Nekomata hidup dari memakan mayat dan jiwa-jiwa orang mati. Legenda mengatakan, awalnya Nekomanta hanyalah seekor kucing peliharaan yang sering disiksa pemiliknya. Setelah si kucing mencapai umur sepuluh tahun, secara perlahan buntutnya akan terbelah menjadi dua bagian, bersamaan dengan meningkatnya kekuatan nujum (shamanism) dan sihir (necromancy) si kucing. Beberapa orang yang mempercayai ini biasanya memotong ekor kucing mereka karena takut berubah menjadi monster. Berikut penjelasan lebih rincinya:\n" +
                    "\n" +
                    "– Nama: Kucing Setan Berbuntut Dua (Nibi no Nekomata)\n" +
                    "– Jenis Bijuu: Bakeneko (Kucing peliharaan Dewa Kematian)\n" +
                    "– Jinchuuriki: Yugito Nii\n" +
                    "– Asal Desa: Kumogakure\n" +
                    "– Penampakan Pertama Komik: Chapter 312\n" +
                    "– Penampakan Pertama Episode: Naruto Shippuuden Episode 71\n" +
                    "– Peringkat: Jounin\n" +
                    "– Elemen: Api Biru\n" +
                    "– Kemampuan: Melontarkan Api dari mulutnya\n" +
                    "– Kemampuan Khusus: Kemampuan Elemen Petir\n" +
                    "– Status : Ditangkap oleh Kakuzu dan Hidan",
            "Bijuu berekor tiga berbentuk seperti kura-kura bercampur dengan ikan hiu memiliki kekuatan yang sangat mengerikan ia maumpu mengendalikan air sesuai keinginannya. Ia pertama kali ditemukan di perairan Yamagawa dan hidup di kedalaman perairan Jepang bagian barat. Setiap beberapa bulan dia akan keluar ke permukaan untuk menghirup udara. Ketika dia melakukan hal ini dia akan menimbulkan badai dan ombak di perairan sekitarnya, semua kapal didekatnya akan tenggelam dan kemudian dijadikan makanan oleh Isonade.\n" +
                    "\n" +
                    "Dia juga sering menyerang kapal-kapal yang berlayar di lautan bebas. memiliki bawahan bernama samehada yang hidup di dalam perut Isonade dan membantu menambah chakranya hingga lima kali besar. Makanan samehada berasal dari sisa makanan yang dimakan Isonade. Berikut penjelasan lebih rincinya:\n" +
                    "\n" +
                    "\n" +
                    "– Nama: Sanbi Si Ekor Tiga (Isonade)\n" +
                    "– Jenis Bijuu: Makhluk Kura-Kura Bercampur Ikan Hiu\n" +
                    "– Jinchuuriki: Yagura – Yondaime Misukage 4 (Kirigakure)\n" +
                    "– Asal Desa: Kirigakure\n" +
                    "– Penampakan Pertama Komik: Chapter 317\n" +
                    "– Penampakan Pertama Episode: Episode NA\n" +
                    "– Peringkat: Jounin\n" +
                    "– Elemen: Air\n" +
                    "– Kemampuan: Memanipulasi air, batu koral\n" +
                    "– Kemampuan Khusus: Elemen Angin\n" +
                    "– Status: Ditangkap oleh Deidara dan Tobi",
            "Sokou adalah sebuah makhluk dari cerita mitologi Jepang, berbentuk siput-setengah-ular yang konon tinggal di gunung Fuji, Jepang. Sokou memiliki empat buah ekor dan menyebarkan gas beracun disekitar tubuhnya. Awalnya, Sokou adalah ayam jantan dan ular yang menjalin kasih. Namun akibat pengaruh udara dan racun di pegunungan, kedua hewan itu menyatu dan menjadi besar. Karena berbahaya, seorang ahli ilmu iblis bernama Yamazaki Ishiro menyegel Sokou ke dalam alat dewa Kandang Bulan Berjaring di dasar gunung Fuji, Jepang. Hingga saat ini, beberapa orang masih beranggapan bahwa letusan di gunung Fuji disebabkan oleh dengkuran Sokou ketika sedang tidur. Berikut penjelasan lebih rincinya:\n" +
                    "\n" +
                    "\n" +
                    "– Nama: Yonbi Si Ekor Empat (Son Goku)\n" +
                    "– Jenis Bijuu: Seekor Kera Berwarna merah (Sokou)\n" +
                    "– Jinchuuriki: Seorang kakek bernama Roushi\n" +
                    "– Asal Desa: Iwagakure\n" +
                    "– Penampakan Pertama Komik: Chapter 353\n" +
                    "– Penampakan Pertama Episode: Episode NA\n" +
                    "– Peringkat: Jounin\n" +
                    "– Elemen: Api dan Tanah menjadi (lava)\n" +
                    "– Kemampuan: Mengendalikan larva gunung, menyemburkan gas beracun\n" +
                    "– Kemampuan Khusus: Youton Ninjutsu\n" +
                    "– Status: Ditangkap oleh Kisame Hoshigaki dan Itachi Uchiha",
            "Houkou adalah Bijuu yang berupa seperti anjing berekor lima. Setiap ekor makhluk ini merepresentasikan setiap-tiap kekuatan elemental: Api, Angin, Air, Tanah, dan Petir. Itu bisa mengakibatkan kerusakan dahsyat bila digunakan. Kemampuannya ialah menggunakan semua elemen maupun mengkombinasikannya. Setiap elemennya juga bisa menyebabkan bencana tergantung jenisnya. Hokou bermaksud menghancurkan alam untuk mendapatkan kembali lima elemen ini. Dia mengalami cedera berat ketika menantang Kyuubi berdua dengan Nekomata. Cukup aneh, dia adalah dewa ilusi. Hokou hidup di pohon besar yang sudah berumur panjang. Berikut penjelasan lebih rincinya:\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "– Nama: Gobi si Ekor Lima (Houkou)\n" +
                    "– Jenis Bijuu: Anjing ber Ekor Lima (disetiap ekornya memiliki elemen berbeda)\n" +
                    "– Jinchuuriki: Han – Iwagakure Ninja berelemen lima dari desa Kirigakure\n" +
                    "– Asal Desa: Iwagakure\n" +
                    "– Penampakan Pertama Komik: Chapter 420\n" +
                    "– Penampakan Pertama Episode: Episode NA\n" +
                    "– Peringkat: Jounin\n" +
                    "– Elemen: air, api, angin, petir, tanah, api dan air menjadi (lava)\n" +
                    "– Kemampuan Khusus: Kemungkinan mengendalikan 5 elemen (air,api,angin,petir,tanah) dan mengendalikan uap\n" +
                    "– Status: Ditangkap oleh Uchiha Itachi",
            "Di sejarah rokubi ini diceritakan seperti musang yang memiliki kuku tajam. Bijuu yang yang berbentuk seperti berang-berang, mempunyai 4 kaki dan kuku yang amat tajam. Bila meraung seperti guntur. Aslinya, dia adalah dewa petir, tetapi karena pengaruh kekuatan Yamata no Orochi dia berubah menjadi monster. Raijuu bisa mengeluarkan listrik dalam jumlah besar untuk keperluan pertarungan. Bulunya berwarna emas dan ujungnya berdiri. Memiliki enam ekor yang bentuknya seperti petir, seperti dewa petir kuno.Raijuu juga digambarkan sebagai rekan Raiden, dewa guntur dari agama Shinto.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Biasanya, Raijuu tenang dan tidak berbahaya, tetapi bisa menjadi buas dan agresif ketika terjadi badai petir dan mengenai apa saja di sekitarnya, batu, pohon bahkan bangunan (orang dulu bilang bahwa pohon yang tersambar petir terkena cakaran Raijuu).\n" +
                    "Berikut penjelasan lebih rincinya:\n" +
                    "\n" +
                    "– Nama: Rokubi si Ekor Enam (Raijuu)\n" +
                    "– Jenis Bijuu: Seperti Ulat terbuat dari cairan (Siput ber Lendir)\n" +
                    "– Jinchuuriki: Utakata – Seorang Ninja Muda\n" +
                    "– Asal Desa: Kirigakure\n" +
                    "– Penampakan Pertama Komik: Chapter 420\n" +
                    "– Penampakan Pertama Episode: Shippuden episode 151\n" +
                    "– Peringkat: Jounin\n" +
                    "– Elemen: air dan gelembung\n" +
                    "– Kemampuan: memanipulasi gelembung\n" +
                    "– Kemampuan Khusus: Menurut legenda dia dapat mengeluarkan listrik dalam jumlah besar untuk keperluan di dalam pertarungan\n" +
                    "– Status : Ditangkap oleh Pain",
            "Kaku mempunyai tujuh ekor dan yang terkecil diantara para Bijuu, walaupun begitu dia adalah Bijuu terlicik dan paling â€œpenyusupâ€ dari sembilan Bijuu lainnya. Kaku memburu mangsanya dari dalam tanah sepanjang waktu. Dia membunuh dengan melongsorkan/menghancurkan bagian tanah dibawah mangsanya, membuatnya jatuh tepat di mulutnya yang sudah terbuka lebar. Di atas tanah, dia bisa berubah menjadi apa saja, asalkan dia mempunyai tanah liat. Tubuhnya berwarna biru.Tempat penyimpanan tanah liat miliknya ternyata telah diketahui oleh para pejuang dan dibakar. Kaku lalu tidak bisa berubah bentuk dan dikalahkan oleh pejuang pemberani Ikkyo Soujin, yang menyegel Kaku dengan alat kekuatan Sisa Altar Bumi ke segel dalam kuil bumi. Berikut penjelasan lebih rincinya:\n" +
                    "\n" +
                    "– Nama: Shichibi Nanabi si Ekor Tujuh (Kaku)\n" +
                    "– Jenis Bijuu: Kumbang Biru yang memiliki tanduk,mempunyai 6 sayap dan 1 sengat di bagian belakang tubuhnya sebagai ekornya.\n" +
                    "– Jinchuuriki: Fuu – Kunoichi dari desa Takigakure\n" +
                    "– Asal Desa: Takigakure\n" +
                    "– Penampakan Pertama Komik: Chapter 420\n" +
                    "– Penampakan Pertama Episode: Episode Animanga\n" +
                    "– Peringkat: Chunin\n" +
                    "– Elemen: Angin dan Cahaya\n" +
                    "– Kemampuan: memanipulasi cahaya\n" +
                    "– Kemampuan Khusus: Belum diketahui, kemungkinan dengan berpindah tempat melewati dalam tanah dan menyerangnya dengan kakinya utk menghancurkan musuh\n" +
                    "– Status: Ditangkap oleh Sasori",
            "Bijuu dengan tubuh Ular gurita, kepala banteng dan berekor delapan ini memiliki kekuatan dari dunia iblis, simbol kejahatan. Setiap kepala Orochi melambangkan simbol: jiwa, hantu, kejahatan, iblis, dunia setelah kematian, dan kematian. Kekuatan sebenarnya dari Orochi seharusnya tidak terlalu besar, bahkan cenderung lemah. Seorang anggota klan Kusanagi, ketika menyerangnya melakukan kecerobohan, menggunakan pedang legendaris Kusanagi no Tsurugi. Karena itu, sebagai konsekuensinya, Yamata no Orochi mengambil alih pedang itu dan menyerap kekuatan yang ada didalamnya dan menjadi mahluk yang amat kuat, dan akhirnya menyimpan semuanya didalam tubuhnya.\n" +
                    "\n" +
                    "Dalam prosesnya pedang itu terserap oleh Orochi, lalu memperbesar kekuatannya secara masif. Setelah itu dia bebas menggunakan kekuatan pedang itu dari perutnya. Dia berasal dari medan perang kuno di Osaka. Kabar terakhir yamata no orochi disegel dalam tubuh orochimaru.\n" +
                    "\n" +
                    "– Nama: Ushi-oni si Ekor Delapan (Yamata no Orochi – Hachibi)\n" +
                    "– Jenis Bijuu: Banteng berekor Delapan (gabungan dari banteng dan gurita)\n" +
                    "– Jinchuuriki: Killer Bee\n" +
                    "– Asal Desa: Kumogakure\n" +
                    "– Penampakan Pertama Komik: Chapter 408\n" +
                    "– Penampakan Pertama Episode: Episode NA\n" +
                    "– Peringkat: Jounin\n" +
                    "– Elemen: Air dan Tinta\n" +
                    "– Kemampuan: Memanipulasi tinta\n" +
                    "– Kemampuan Khusus: Dapat menyemburkan bola api raksasa\n" +
                    "– Status: Ditangkap oleh Sasuke dan Hydro",
            "Diketahui bahwa Kyuubi merupakan Bijuu dengan bentuk rubah berekor sembilan dan merupakan yang terkuat diantara para Bijuu. Alasan kenapa dia sangat kuat amat sederhana: dia mempunyai chakra yang tidak terbatas, membuatnya pantas menyandang nama â€œRaja para Bijuuâ€ . Kekuatannya berasal dari segel api miliknya. Setelah bertarung selama 100 tahun dengan Yamata no Orochi, segel itu menjadi kelelahan; tetapi Kyuubi masih bisa bertahan dan berdiri. Dia juga licik dan cerdas. Cara berbicaranya sangat sadistis dan sarkastik. Begitu pula kelakuannya.Kyuubi no Yokou adalah Bijuu terkuat dalam Mitologi Jepang. Tubuhnya ditutupi bulu berwarna merah; Kyuubi melambangkan elemen api. Kemampuannya amat luar biasa. Karena belum pernah dikalahkan sekalipun oleh Youkai, kekuatan sebenarnya tidak bisa diukur. Ekornya mengeluarkan pusaran angin dengan cara diputar dengan cepat,satu hentakan ekor saja dapat menimbulkan gempa bumi dan tsunami, dan Kyuubi mampu merobek musuhnya dengan cakar raksasa miliknya. Bulu-bulunya bisa mengeluarkan bola api seperti meteor yang tak pernah habis, cukup untuk menghancurkan sebuah desa dengan cepat.\n" +
                    "\n" +
                    "Berikut penjelasan lebih rincinya:\n" +
                    "– Nama: Kyuubi no Yoku (Kurama) si Ekor Sembilan\n" +
                    "– Jenis Bijuu: Musang atau Rubah berekor sembilan\n" +
                    "– Jinchuuriki: Naruto Uzumaki\n" +
                    "– Asal Desa: Konohagakure\n" +
                    "– Penampakan Pertama Komik: Chapter 01\n" +
                    "– Penampakan Pertama Episode: Episode 01\n" +
                    "– Peringkat: Genin\n" +
                    "– Elemen: Api dan Angin\n" +
                    "– Kemampuan Khusus: Chakra sangat dasyat dan tak terbatas\n" +
                    "– Status: Masih Aktif\n" +
                    "Sembilan nama “Bijuu dan Jinchuuriki Dalam Anime Naruto Shippuden” ini sangat sering kita dengar, tapi ada juga jenis bijuu lain yang tercantum di Capster Naruto komix dan di Anime Naruto Shippuden seperti dibawah ini.",
            "Bijuu ini adalah satu-satunya yang mempunyai sharingan dan rinnegan, bijuu ini terpecah menjadi ichibi no shukaku, nibi no nekomata, sanbi no kyodaigame, yonbi no saru, gobi no irukaume, rokubi no namekuji, shicibi no kabutomushi, hachibi no ushi oni dan kyubi no yoko. Berikut penjelasan lebih rincinya:\n" +
                    "\n" +
                    "– Nama: Sage Of The six pats (Jubii) si Ekor 10\n" +
                    "– Jenis Bijuu: Belum diketahui\n" +
                    "– Jinchuuriki: Rikudo Sennin\n" +
                    "– Asal Desa: Masih belum ada desa tapi sudah mempunyai klan\n" +
                    "– Penampakan Pertama Komik: Chapter 467\n" +
                    "– Penampakan Pertama Episode: Shippuden episode 205\n" +
                    "– Peringkat: N/A\n" +
                    "– Elemen: Semua Elemen\n" +
                    "– Kemampuan: Mugen Tsukuyomi\n" +
                    "– Status: Terpecah Belah menjadi ekor 1 sampai ekor 9\n" +
                    "– Ditangkap: Oleh Obito tapi tidak sempurna"
    };

    private static int[] heroesImages = {
            R.drawable.gaara,
            R.drawable.yugito,
            R.drawable.yagura,
            R.drawable.roshi,
            R.drawable.han,
            R.drawable.utakata,
            R.drawable.fu,
            R.drawable.bee,
            R.drawable.naruto,
            R.drawable.obito
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
