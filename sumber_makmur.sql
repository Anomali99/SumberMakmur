-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Feb 2024 pada 08.54
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sumber_makmur`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `KODE_BARANG` char(10) NOT NULL,
  `NAMA_BARANG` varchar(100) DEFAULT NULL,
  `HARGA` mediumtext DEFAULT NULL,
  `STOK` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`KODE_BARANG`, `NAMA_BARANG`, `HARGA`, `STOK`) VALUES
('B230617001', 'SEMEN GRESIK  ', '41000', 2),
('B230617002', 'SEMEN CONCH', '40000', 0),
('B230617003', 'SEMEN TIGA RODA', '42000', 5),
('B230617004', 'SEMEN MERAH PUTIH', '52000', 7),
('B230617005', 'SEMEN PADANG', '60000', 46),
('B230617006', 'SEMEN BOSOWA', '85000', 0),
('B230617007', 'SEMEN TONASA', '55000', 0),
('B230617008', 'SEMEN SCG', '52000', 45),
('B230617009', 'SEMEN HOLCIM', '52000', 8),
('B230617010', 'SEMEN ANDALAS', '50000', 0),
('B230617011', 'SEMEN DYNAMIX', '44000', 0),
('B230617012', 'SEMEN MERAH (SEMEN BATA MERAH)', '500000', 0),
('B230617013', 'Batu Bata Merah Kecil', '650', 0),
('B230617014', 'Batu Bata Merah Besar  ', '950', 0),
('B230617015', 'Batu Bata Merah Expose', '4000', 0),
('B230617016', 'Batu Bata Batako', '3500', 0),
('B230617017', 'Batu Bata Ringan Hebel', '730000', 0),
('B230617018', 'Batu Bata Ringan Voscon', '650000', 4),
('B230617019', 'Batu Bata Ringan 10x20x60cm', '10000', 0),
('B230617020', 'Batu Bata Ringan 7,5x20x60cm', '7800', 0),
('B230617021', 'Batu Bata Ringan 10x20x60cm', '750000', 0),
('B230617022', 'Batu Bata Ringan 7,5x20x60cm', '585000', 0),
('B230617023', 'Besi Beton 6mm', '26000', 0),
('B230617024', 'Besi Beton 8mm', '40000', 0),
('B230617025', 'Besi Beton 10mm', '59000', 0),
('B230617026', 'Besi Beton 12mm', '84000', 0),
('B230617027', 'Besi Beton 16mm', '140000', 0),
('B230617028', 'Besi Cakar Ayam 40x40 8mm', '48000', 0),
('B230617029', 'Besi Cakar Ayam 50x50 8mm', '58000', 0),
('B230617030', 'Besi Rangka 8mmx3m', '36000', 0),
('B230617031', 'Besi Rangka 10mmx3m', '42000', 0),
('B230617032', 'Besi Beton Tarik 4mm', '11000', 0),
('B230617033', 'Besi Beton Tarik 4mm', '12000', 0),
('B230617034', 'Besi Beton Tarik 5mm', '13060', 0),
('B230617035', 'Besi Beton Tarik 6mm', '20800', 0),
('B230617036', 'Besi Beton 8 SRB SNI', '33960', 0),
('B230617037', 'Besi Beton 10 SRB SNI', '53613', 0),
('B230617038', 'Besi Beton 12 SRB SNI', '76624', 0),
('B230617039', 'Besi Beton D 13 SRB SNI', '97125', 118),
('B230617040', 'Besi Beton D 16 SRB SNI', '148350', 0),
('B230617041', 'Besi Beton 8 SPI BJKU', '31810', 0),
('B230617042', 'Kayu Gaharu Medang A Padat 1 Kg', '2510000', 0),
('B230617043', 'Kayu Gaharu Medang B 1 Kg', '1809000', 0),
('B230617044', 'Kayu Gaharu Medang C 1 Kg', '53000', 0),
('B230617045', 'Kayu Gaharu Chip Tri Hitam 1 Kg', '2520000', 0),
('B230617046', 'Kayu Gaharu Chip Super Arab 1 kg', '20060000', 0),
('B230617047', 'Pasir Beton', '1855000', 0),
('B230617048', 'Pasir Pasang', '1799000', 0),
('B230617049', 'Pasir Hitam', '350000', 0),
('B230617050', 'Pasir Merah/Jebrod', '2600000', 0),
('B230617051', 'Pasir Vulkanik', '300000', 0),
('B230617052', 'Pasir Putih Bangka', '260750', 0),
('B230617053', 'Pasir Mundu', '235750', 0),
('B230617054', 'Pasir Putih Lampung', '260750', 0),
('B230617055', 'Pasir Cileungsi', '195750', 0),
('B230617056', 'Pasir Rangkas', '200750', 0),
('B230617057', 'Pasir Cuci Cilegon', '240750', 0),
('B230617058', 'Pasir Cimangkok', '260750', 0),
('B230617059', 'Pasir Coklat Belitung', '220750', 0),
('B230617060', 'Pasir Jawilan', '2550750', 0),
('B230617061', 'Pasir Hitam Bebas Lumpur', '260750', 0),
('B230617062', 'Pasir Urug', '190750', 0),
('B230617063', 'Pasir Cor Serang', '550750', 0),
('B230617064', 'Pasir Laut Hitam', '250750', 0),
('B230617065', 'Pasir Bohlam Sukabumi', '235750', 0),
('B230617066', 'Pasir Abu', '185750', 0),
('B230617067', 'Pasir Split', '200750', 0),
('B230617068', 'Catylac Primer Interior Alkali – 21kg', '604000', 0),
('B230617069', 'Catylac Primer Exterior Alkali – 4kg', '140000', 0),
('B230617070', 'Asian Paint TruCare Primer – 4kg', '90000', 0),
('B230617071', 'Dulux Alkali Resisting Exterior Water Based – 2,5 liter', '141000', 0),
('B230617072', 'Jotun Essence Easy Primer – 18 liter', '640000', 0),
('B230617073', 'Keramik Roman 20 x 20 Golongan A', '87000', 0),
('B230617074', 'Keramik Roman 20 x 20 Golongan B', '90000', 0),
('B230617075', 'Keramik Arwana Warna Tua 20 x 20', '37500', 0),
('B230617076', 'Keramik Arwana Warna Putih 30 x 30', '31500', 0),
('B230617077', 'Keramik Milan Pure Color 50 x 50', '94500', 0),
('B230617078', 'Keramik Milan Classy Color 50 x 50', '103000', 0),
('B230617079', 'Keramik Milan Supermilan 25 x 33 Golongan A', '56500', 0),
('B230617080', 'Keramik Milan Supermilan 40 x 40 Putih', '50500', 0),
('B230617081', 'Hercules Gelap 40 x 40', '48750', 0),
('B230617082', 'Hercules Motif Khusus 40 x 40', '43150', 0),
('B230617083', 'Hercules Motif Dasar Putih 40 x 40', '45500', 0),
('B230617084', 'Keramik Mulia Warna Tua 20×20', '38500', 0),
('B230617085', 'Hercules Jamaica 40 x 40', '62000', 0),
('B230617086', 'Keramik Mulia Warna Muda 20×20', '36000', 0),
('B230617087', 'Keramik Mulia Warna Putih 30×30', '32500', 0),
('B230617088', 'Keramik Mulia Warna Marble 30×30', '37000', 0),
('B230617089', 'Keramik Mulia Warna Impresso 30×30', '40000', 0),
('B230617090', 'Genteng Super Gojer/ Morando', '2750', 0),
('B230617091', 'Genteng Kodok/ Prentul/ Goodyear', '1650', 0),
('B230617092', 'Genteng Mintili Jumbo/ Turbo Buah', '1750', 0),
('B230617093', 'Genteng Garuda', '1250', 0),
('B230617094', 'Genteng Plentong', '1150', 0),
('B230617095', 'Genteng Beton Moenir Flat', '9500', 0),
('B230617096', 'Genteng Beton Cisangkan Flat', '11500', 0),
('B230617097', 'Genteng Beton Mutiara Yogyakarta Flat', '11500', 0),
('B230617098', 'Genteng Keramik Utama', '18650', 0),
('B230617099', 'Kaca Bening 2mm', '59000', 0),
('B230617100', 'Kaca Bening 3mm', '100000', 0),
('B230617101', 'Kaca Bening 5mm', '135000', 0),
('B230617102', 'Kaca Bening 8mm', '220000', 0),
('B230617103', 'Kaca Riben 3mm', '100000', 0),
('B230617104', 'Kaca Riben 5mm', '130000', 0),
('B230617105', 'Kaca Clear Tempered 5mm', '250000', 0),
('B230617106', 'Kaca Clear Tempered 8mm', '400000', 0),
('B230617107', 'Kaca Laminated 4+4 mm', '475000', 0),
('B230617108', 'Kaca Grafir Airbrush (Sandblasting)', '710000', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_pesanan`
--

CREATE TABLE `detail_pesanan` (
  `KODE_BARANG` char(10) NOT NULL,
  `ID_PENJUAL` char(7) NOT NULL,
  `ID_PELANGGAN` char(7) NOT NULL,
  `NO_PESANAN` char(7) NOT NULL,
  `JUMLAH_PESANAN` int(11) DEFAULT NULL,
  `sub_total` mediumtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_supplay`
--

CREATE TABLE `detail_supplay` (
  `KODE_BARANG` char(10) NOT NULL,
  `ID_SUPPLAYER` char(7) NOT NULL,
  `ID_PENJUAL` char(7) NOT NULL,
  `NO_SUPPLAY` char(7) NOT NULL,
  `JUMLAH_SUPPLAY` int(11) DEFAULT NULL,
  `sub_total` mediumtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `ID_PELANGGAN` char(7) NOT NULL,
  `NAMA_PELANGGAN` varchar(30) DEFAULT NULL,
  `ALAMAT_PELANGGAN` varchar(100) DEFAULT NULL,
  `TELPON_PELANGGAN` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`ID_PELANGGAN`, `NAMA_PELANGGAN`, `ALAMAT_PELANGGAN`, `TELPON_PELANGGAN`) VALUES
('PL23001', 'Budi', 'Gresik', '08585xxxxxx'),
('PL23002', 'Imam Hilmi', 'Padang', '08xxxxxxxxx'),
('PL23003', 'Ahmad Muhammad Sabil A.', 'Panceng Gresik', '08xxxxxxxxx');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE `pemesanan` (
  `ID_PENJUAL` char(7) NOT NULL,
  `ID_PELANGGAN` char(7) NOT NULL,
  `NO_PESANAN` char(7) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `total_pesanan` mediumtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjual`
--

CREATE TABLE `penjual` (
  `ID_PENJUAL` char(7) NOT NULL,
  `USERNAME` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(100) DEFAULT NULL,
  `NAMA_PENJUAL` varchar(30) DEFAULT NULL,
  `ALAMAT_PENJUAL` varchar(100) DEFAULT NULL,
  `TELPON_PENJUAL` varchar(13) DEFAULT NULL,
  `FOTO` blob DEFAULT NULL,
  `level` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `penjual`
--

INSERT INTO `penjual` (`ID_PENJUAL`, `USERNAME`, `PASSWORD`, `NAMA_PENJUAL`, `ALAMAT_PENJUAL`, `TELPON_PENJUAL`, `FOTO`, `level`) VALUES
('PJ24001', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Admin', '-', '088686', NULL, 'Boss');

-- --------------------------------------------------------

--
-- Struktur dari tabel `sementara`
--

CREATE TABLE `sementara` (
  `KODE_BARANG` char(10) DEFAULT NULL,
  `nama_barang` varchar(30) DEFAULT NULL,
  `JUMLAH` int(11) DEFAULT NULL,
  `subtotal` mediumtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplay`
--

CREATE TABLE `supplay` (
  `ID_SUPPLAYER` char(7) NOT NULL,
  `ID_PENJUAL` char(7) NOT NULL,
  `NO_SUPPLAY` char(7) NOT NULL,
  `TANGGAL` date DEFAULT NULL,
  `total_supplay` mediumtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplayer`
--

CREATE TABLE `supplayer` (
  `ID_SUPPLAYER` char(7) NOT NULL,
  `NAMA_SUPPLAYER` varchar(30) DEFAULT NULL,
  `ALAMAT_SUPPLAYER` varchar(100) DEFAULT NULL,
  `TELPON_SUPPLAYER` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `supplayer`
--

INSERT INTO `supplayer` (`ID_SUPPLAYER`, `NAMA_SUPPLAYER`, `ALAMAT_SUPPLAYER`, `TELPON_SUPPLAYER`) VALUES
('SP23001', 'Anugrah Bangunan Baliwerti Sur', 'Jl. Baliwerti no.98, Alun-alun Contong, Bubutan, kota Surabaya', '081231313222'),
('SP23002', 'PT. Platinum Ceramics Industry', 'Jl. Panglima Sudirman no.23-25, Embong Kaliasin, Genteng, Surabaya, Jawa Timur', '081231313222'),
('SP23003', 'Alustar Aluminium Composite Pa', 'Jl. Kayon no.38-40, Embong Kaliasin, Genteng, Surabaya', '081231313222'),
('SP23004', 'PT. Union Metal', 'Jl. Panjang Jiwo no. 46-48 Embong Kaliasin Genteng Surabaya Jawa Timur', '081231313222'),
('SP23005', 'Sumber Cahaya Indosteel', 'Jl. Kampung Malang Tengah I no.39, Tegalsari, Surabaya, Jawa Timur', '081231313222'),
('SP23006', 'PT. Adyabuana Persada | distri', 'Ekonomi Building, Jl. Embong Malang no.61-65, Kedungdoro, Tegalsari, Surabaya City, East Java', '081231313222'),
('SP23007', 'Kridajaya Sentosa', 'Jl. Wonorejo II no.59-AA, Wonorejo, Tegalsari, Surabaya', '081231313222'),
('SP23008', 'Haveel Center', 'Jalan Mojopahit no.50, Keputran, Tegalsari, Surabaya', '081231313222'),
('SP23009', 'Kridajaya Sentosa | distributo', 'Jl. Wonorejo II no.59A, Wonorejo, Tegalsari, Surabaya, Jawa Timur', '081231313222'),
('SP23010', 'PT. Biru & Sons Ltd Pemasok ba', 'Jl. Gemblongan no.63D Alon Alun-Alun Contong, Bubutan Surabaya Jawa Timur', '081231313222'),
('SP23011', 'Toko Bangunan Jaya Tunggal', 'Jl. Baliwerti no.23, Alun-alun Contong, Bubutan, Surabaya.', '081231313222'),
('SP23012', 'ACP CV Bangun SaranaA Makmur', 'Jl. Jenderal Basuki Rachmat 105-107 Keputran, Tegalsari, Surabaya', '081231313222'),
('SP23013', 'PT. Sinar Indah Perkasa Suraba', 'Jl. Raya Dupak No.25 A, Gundih, Bubutan, Kota Surabaya', '081231313222'),
('SP23014', 'Distributor semen Dynamix (Hol', 'Gedung Perkantoran Medan Pemuda Lantai 2, Jl Pemuda No. 27 – 31, Embong Kaliasin, Genteng, Kota Sura', '081231313222'),
('SP23015', 'Distributor Semen Padang di Su', 'Jl. Kertopaten, No. 14 A, Simolawang, Simokerto, Kota Surabaya', '081231313222'),
('SP23016', 'PT. Tiga Mitra Surabaya', 'Ruko TCBD-TR1/11, Jl. Raya Klakah Rejo, Benowo, Surabaya, Jawa Timur 60198.', '081231313222'),
('SP23017', 'PT. Abadi Metal Utama', 'Ruko Satelite Town Square Blok A5, Jl. Raya Sukomanunggal Jaya no.5, Tanjungsari, Sukomanunggal Sura', '081231313222'),
('SP23018', 'CV Casa Fiero (Casa Fiero Gran', 'Satelite Town Square Blok A no. 12, Jl. Raya Sukomanunggal Jaya no.11, Surabaya Barat.', '081231313222'),
('SP23019', 'PT. Restu Anugerah Sejahtera', 'Ruko Satellite Town Square A34, Suko Manunggal, Surabaya', '081231313222'),
('SP23020', 'Toko Cahaya Makmur', 'Jl. Raya Lidah Wetan no.750, Lidah Wetan, Lakarsantri, Surabaya', '081231313222'),
('SP23021', 'Agen Jual Scaffolding Surabaya', 'Jl. Raya Bangkingan no.16, Mojo Kopek, Bangkingan, Lakarsantri, Surabaya', '081231313222'),
('SP23022', 'Pilar Kencana Steel', 'Pergudangan Mutiara blok D-11, Jl. Margomulyo Indah, Buntaran, Tandes, Surabaya', '081231313222'),
('SP23023', 'Onda Toko Bangunan', 'Jalan Dharmo Indah Timur, Tandes Kidul, Tandes, Surabaya.', '081231313222'),
('SP23024', 'Sinar Pelita Keramik', 'Raya Benowo no.38, Benowo, Pakal, Surabaya', '081231313222'),
('SP23025', 'PT. Keramik Diamond Industries', 'Jl. Semeru no.99B, Babakan Surabaya, Lakarsantri, Gresik', '081231313222'),
('SP23026', 'Distributor Semen Conch Suraba', 'Pergudangan Margomulyo Jaya C20 22, Jl. Sentong Asri, Balongsari, Tandes, Kota SBY', '081231313222'),
('SP23027', 'Toko Bangunan UD. Bumi Asri', 'Jl. Raya Menur no.3, Mojo, Gubeng, kota Surabaya.', '081231313222'),
('SP23028', 'Roemah Kita | Supermarket Baha', 'Jl. Raya Rungkut no.40, Kali Rungkut, Rungkut, Surabaya Timur, Jawa Timur 60293', '081231313222'),
('SP23029', 'TB. Putra Makmur', 'Jl. Raya Rungkut Menanggal no.37, Gunung Anyar, Surabaya.', '081231313222'),
('SP23030', 'Toko Material Bangunan Santoso', 'Jl. Raya Rungkut Kidul no.35, Rungkut, Surabaya', '081231313222'),
('SP23031', 'Toko Putra Mas Rungkut', 'Alamat: Jl. Rungkut Industri Kidul no.50-50A, Rungkut, Surabaya', '081231313222'),
('SP23032', 'UD Darmo Jaya', 'Jl. Raya Rungkut Menanggal no. 5, Rungkut, Surabaya', '081231313222'),
('SP23033', 'Toko Bahan Bangunan Restu Bumi', 'Jalan Raya Medokan Sawah Timur kav. C no.50, Medokan Ayu, Rungkut, Surabaya.', '081231313222'),
('SP23034', 'Toko Bangunan J. Abidin', 'Jl. Tambak Medokan Ayu no.8, Medokan Ayu, Rungkut, Surabaya, Jawa Timur', '081231313222'),
('SP23035', 'Sari Bumi Bangunan', 'Jl. Kendalsari Selatan no.2, Penjaringan Sari, Rungkut, Surabaya.', '081231313222'),
('SP23036', 'Sari Bumi Bangunan II', 'Jl. Raya Medokan Sawah 46-47, Medokan Ayu, Rungkut, Surabaya.', '081231313222'),
('SP23037', 'Distributor Sika Indonesia Sur', 'Jl. Medayu Pesona V, Medokan Ayu, Rungkut, Surabaya, Jawa Timur.', '081231313222'),
('SP23038', 'Setia Immanuel Steel (Sis)', 'Jl. Raya Kali Rungkut 24, Rungkut, Surabaya', '081231313222'),
('SP23039', 'Agen Genteng Metal Rainbow Gro', 'Jl. Kalisosok no.16, Krembangan Selatan, Surabaya Jawa Timur.', '081231313222'),
('SP23040', 'PT Partiwa Unggul Abadi', 'Jl. Kembang Jepun, Nyamplungan, Pabean Cantian, Surabaya, Jawa Timur', '081231313222'),
('SP23041', 'CV Norton Supplier Bahan Bangu', 'Jl. Dukuh Kupang no.90-92, Dukuh Kupang, Dukuhpakis, Surabaya, Jawa Timur', '081231313222'),
('SP23042', 'Mitra 10 Kedungdoro', 'Jl. Kedung Doro no.62 – 64, Sawahan, Surabaya, Jawa Timur 60251.', '081231313222'),
('SP23043', 'Distributor Bata Hebel', 'Jl. Pulo Wonokromo no.180-A, Wonokromo, Surabaya, Jawa Timur', '081231313222'),
('SP23044', 'Sarana Atap Raya | Distributor', 'Jl Mastrip Bogangin no.12, Kedurus, Karang Pilang, Surabaya, Jawa Timur 60223', '081231313222'),
('SP23045', 'Satya Langgeng Sentosa', 'Jl. Raya Diponegoro no.27, Darmo, Wonokromo, Surabaya, Jawa Timur 60241', '081231313222'),
('SP23046', 'Smartruss | baja ringan Suraba', 'Ruko Villa Bukit Mas blok RF no.12, Jl. KH Abdul Wahab Siamin, Dukuh Pakis, Surabaya.', '081231313222'),
('SP23047', 'PT. Sahabat Ana Grup (Pusat be', 'Jl. Raya Banyu Urip No 53 (Depan Kimia Farma), Banyu Urip, Sawahan, Surabaya.', '081231313222'),
('SP23048', 'M Polywood jual kayu triplek', 'Ruko HR. Muhammad Square, Jl. Raya Darmo Permai II Blok C no.3, Pradahkalikendal, Dukuh Pakis, Surab', '081231313222'),
('SP23049', 'Toko Atlas  bahan bangunan', 'Jl. Raya Jemur Sari no.33, Jemur Wonosari, Wonocolo, Surabaya', '081231313222'),
('SP23050', 'Griya Waterproof Sby', 'Griya Kebraon Utama XIV Blok DN no.14, Kebraon, Karang Pilang, Surabaya', '081231313222'),
('SP23051', 'CV. Shunda Plafon Surabaya', 'Jl. Jemur Andayani no.1 E, Jemur Wonosari, Wonocolo, Surabaya', '081231313222'),
('SP23052', 'Toko Bangunan Jaya Raya', 'Sawahan Baru II no.38, Petemon, Sawahan, Surabaya', '081231313222'),
('SP23053', 'Royal Board', 'Jl. Muria no.17, Petemon, Sawahan, Surabaya, Jawa Timur.', '081231313222');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`KODE_BARANG`);

--
-- Indeks untuk tabel `detail_pesanan`
--
ALTER TABLE `detail_pesanan`
  ADD PRIMARY KEY (`KODE_BARANG`,`ID_PENJUAL`,`ID_PELANGGAN`,`NO_PESANAN`),
  ADD KEY `FK_MEMILIK5` (`ID_PENJUAL`,`ID_PELANGGAN`,`NO_PESANAN`);

--
-- Indeks untuk tabel `detail_supplay`
--
ALTER TABLE `detail_supplay`
  ADD PRIMARY KEY (`KODE_BARANG`,`ID_SUPPLAYER`,`ID_PENJUAL`,`NO_SUPPLAY`),
  ADD KEY `FK_MEMILIKI3` (`ID_SUPPLAYER`,`ID_PENJUAL`,`NO_SUPPLAY`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`ID_PELANGGAN`);

--
-- Indeks untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`ID_PENJUAL`,`ID_PELANGGAN`,`NO_PESANAN`),
  ADD KEY `FK_MELAKUKAN` (`ID_PELANGGAN`);

--
-- Indeks untuk tabel `penjual`
--
ALTER TABLE `penjual`
  ADD PRIMARY KEY (`ID_PENJUAL`);

--
-- Indeks untuk tabel `supplay`
--
ALTER TABLE `supplay`
  ADD PRIMARY KEY (`ID_SUPPLAYER`,`ID_PENJUAL`,`NO_SUPPLAY`),
  ADD KEY `FK_MELAKUKAN1` (`ID_PENJUAL`);

--
-- Indeks untuk tabel `supplayer`
--
ALTER TABLE `supplayer`
  ADD PRIMARY KEY (`ID_SUPPLAYER`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detail_pesanan`
--
ALTER TABLE `detail_pesanan`
  ADD CONSTRAINT `FK_MEMILIK5` FOREIGN KEY (`ID_PENJUAL`,`ID_PELANGGAN`,`NO_PESANAN`) REFERENCES `pemesanan` (`ID_PENJUAL`, `ID_PELANGGAN`, `NO_PESANAN`),
  ADD CONSTRAINT `FK_MEMILIKI6` FOREIGN KEY (`KODE_BARANG`) REFERENCES `barang` (`KODE_BARANG`);

--
-- Ketidakleluasaan untuk tabel `detail_supplay`
--
ALTER TABLE `detail_supplay`
  ADD CONSTRAINT `FK_MEMILIKI2` FOREIGN KEY (`KODE_BARANG`) REFERENCES `barang` (`KODE_BARANG`),
  ADD CONSTRAINT `FK_MEMILIKI3` FOREIGN KEY (`ID_SUPPLAYER`,`ID_PENJUAL`,`NO_SUPPLAY`) REFERENCES `supplay` (`ID_SUPPLAYER`, `ID_PENJUAL`, `NO_SUPPLAY`);

--
-- Ketidakleluasaan untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `FK_MELAKUKAN` FOREIGN KEY (`ID_PELANGGAN`) REFERENCES `pelanggan` (`ID_PELANGGAN`),
  ADD CONSTRAINT `FK_MEMILIKI` FOREIGN KEY (`ID_PENJUAL`) REFERENCES `penjual` (`ID_PENJUAL`);

--
-- Ketidakleluasaan untuk tabel `supplay`
--
ALTER TABLE `supplay`
  ADD CONSTRAINT `FK_MELAKUKAN1` FOREIGN KEY (`ID_PENJUAL`) REFERENCES `penjual` (`ID_PENJUAL`),
  ADD CONSTRAINT `FK_MEMILIKI1` FOREIGN KEY (`ID_SUPPLAYER`) REFERENCES `supplayer` (`ID_SUPPLAYER`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
