package id.ac.polinema.ProjectUts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.ProjectUts.adapters.Gunung_Adapter;
import id.ac.polinema.ProjectUts.models.Gunung_Logo;

public class Gunung_Activity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item_info);

		RecyclerView recyclerView = findViewById(R.id.rv_teams);
        List<Gunung_Logo> logos = new ArrayList<>();
        logos.add(new Gunung_Logo("https://upload.wikimedia.org/wikipedia/commons/3/3f/Puncakjaya.jpg", "Cartenz Pyramid", "Puncak Jayawijaya merupakan gunung dengan ketinggian hingga 4.884 m dpl. Terletak pada titik koordinat S 04°04.733 dan E 137°09.572. Gunung ini menjulang memecah langit dan menembus awan dengan indahnya. Puncak Jayawijaya merupakan gunung kapur terbesar di Indonesia. Gunung ini merupakan titik tertinggi yang ada di pulau Papua, atau bahkan di Oseania dan benua Australia. Puncak Jayawijaya adalah titik tertinggi yang meliputi Andes dan Himalaya, serta disebut – sebut sebagai puncak tertinggi dari berbagai pulau di belahan dunia."));
        logos.add(new Gunung_Logo("https://upload.wikimedia.org/wikipedia/commons/f/f4/Uprising-mount_kerinci.jpg", "Gunung Kerinci", "Gunung Kerinci merupakan gunung berapi dengan ketinggian 3.805 mdpl yang sekaligus merupakan gunung berapi tertinggi se Asia Tenggara. Gunung api yang masih aktif ini terletak di area perbatasan provinsi Sumatera Barat dan Provinsi Jambi. Gunung ini memiliki berbagai julukan diantaranya yaitu Gunung Gadang, Korinci, Berapi Kurinci, dan Puncak Indrapura. Gunung yang termasuk dalam jenis Strato Vulcano ini  secara administrasi berada di kawasan Taman Nasional Kerinci Seblat. Gunung ini terakhir kali meletus pada tahun 2009."));
        logos.add(new Gunung_Logo("https://upload.wikimedia.org/wikipedia/commons/e/ea/Rinjani_Summit.jpg", "Gunung Rinjani", " Taman Nasional Gunung Rinjani merupakan perwakilan tipe ekosistem hutan hujan pegunungan rendah hingga pegunungan tinggi dan savana di Nusa Tenggara.\n" +
                "\n" +
                "Potensi tumbuhan yang terdapat di Taman Nasional Gunung Rinjani antara lain jelutung (Laportea stimulans), dedurenan (Aglaia argentea), bayur (Pterospermum javanicum), beringin (Ficus benjamina), jambu-jambuan (Syzygium sp.), keruing (Dipterocarpus hasseltii), rerau (D. imbricatus), eidelweis (Anaphalis javanica), dan 2 jenis anggrek endemik yaitu Perisstylus rintjaniensis dan P. lombokensis.\n" +
                "\n" +
                "Selain terdapat satu jenis mamalia endemik yaitu musang rinjani (Paradoxurus hemaproditus rinjanicus), juga terdapat kijang (Muntiacus muntjak nainggolani), lutung budeng (Trachypithecus auratus kohlbruggei), trenggiling (Manis javanica), burung cikukua tanduk (Philemon buceroides neglectus), dawah hutan (Ducula lacernulata sasakensis), kepudang kuduk hitam (Oriolus chinensis broderipii), dan beberapa jenis reptilia.\n" +
                "\n" +
                "Pada lembah di sebelah barat Gunung Rinjani terdapat Danau Segara Anak (2.008 m. dpl) yang airnya berbau belerang, suhunya berbeda dari satu tempat ke tempat lain."));
        logos.add(new Gunung_Logo("https://upload.wikimedia.org/wikipedia/commons/1/12/Semeru.jpg", "Gunung Semeru", "Gunung Semeru merupakan gunung api tertinggi di Pulau Jawa 3.676 mdpl dan merupakan salah satu gunung api yang masih aktif. Posisi letak gunung semeru berada diantara wilayah administrasi kabupaten Lumajang dan Malang.\n" +
                "Kawah yang terdapat di puncak Gunung Semeru terdiri dari kawah Mahameru yang sudah tidak aktif dan kawah Jonggring Seloko yang masih aktif. Kawah Jonggring Seloko terletak di sebelah tenggara puncak."));
        logos.add(new Gunung_Logo("https://indonesiatrip.id/wp-content/uploads/2016/02/trip-gunung-latimojong-820x690.jpg", "Gunung Latimojoog", "Gunung Latimojong adalah satu nama gunung di Kabupaten Enrekang, Sulawesi Selatan, Indonesia. Gunung Latimojong berada di tengah-tengah Sulawesi Selatan. Sebagian besar pengunungan ini terletak di daerah Kabupaten Enrekang.\n" +
                "\n" +
                "Gunung Latimojong merupakan gunung yang tertinggi di Sulawesi Selatan dengan ketinggian 3.478 meter, puncaknya yang bernama Bulu Rante Mario. Pegunungan Latimojong ini membentang dari selatan ke utara. Di sebelah barat Gunung Latimojong adalah Kabupaten Enrekang, sebelah utara Kabupaten Tana Toraja, sebelah selatan adalah daerah Kabupaten Sidenreng Rappang dan area sebelah timur seluruhnya wilayah Kabupaten Luwu sampai di pinggir pantai Teluk Bone. "));
        logos.add(new Gunung_Logo("https://journesia.com/wp-content/uploads/2014/08/DSCF7138-1280x760.jpeg", "Gunung Binaiya", "Gunung Binaiya terletak di dalam kawasan Taman Nasional Manusela, Pulau Seram, Provinsi Maluku. Gunung ini merupakan satu dari tujuh puncak (Seven Summit) Indonesia. Karena Gunung Binaiya merupakan Gunung tertinggi di kepulauan Maluku dan sekitarnya. Puncak triangulasi Binaiya memiliki ketinggian 3.027m. Meskipun sebenarnya, ada puncak Binaiya-1 yang lebih tinggi yaitu dengan ketinggian 3.055m. Tetapi puncak ini terlarang bagi pendaki sejak 1993 dengan alasan konservasi."));
        logos.add(new Gunung_Logo("https://www.indonesiakaya.com/uploads/_images_gallery/Puncak_Kakam_dengan_ketinggian_2_278_mdpl.jpg", "Gunung Bukit Raya", "Gunung Bukit Raya dengan puncaknya yang dinamakan Puncak Kakam memiliki ketinggian 2.278 meter diatas permukaan laut. Bagi sebagian penggiat kegiatan luar ruang di Indonesia mungkin gunung ini kurang begitu dikenal. Karena sebab tersebut mungkin tidak lebih dari 10 tim dalam setiap tahunnya yang pergi mendaki gunung ini.\n" +
                "\n" +
                "Gunung yang berada didalam Taman Nasional Bukit Baka Bukit Raya ini memiliki puncak yang dinyatakan sebagai titik tertinggi Pulau Kalimantan bagian Indonesia. Gunung ini terletak di dua provinsi yaitu Kalimantan Tengah dan Kalimantan Barat. Meskipun puncak gunungnya berada di wilayan Kalimantan Tengah, akan tetapi jalur pendakian terdekat dan sering digunakan adalah jalur dari Kalimantan Barat."));
		Gunung_Adapter Gunung_Adapter = new Gunung_Adapter(logos);
		recyclerView.setAdapter(Gunung_Adapter);

		recyclerView.setLayoutManager(new LinearLayoutManager(this));
	}
}
