
PN = "sblim-sfcc"
PE = "0"
PV = "2.2.8"
PR = "28.el10"
PACKAGES = "sblim-sfcc sblim-sfcc-devel"


URI_sblim-sfcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sblim-sfcc-2.2.8-28.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-sfcc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcurl.so.4()(64bit) ( )"
RPROVIDES:sblim-sfcc = "libcmpisfcc.so.1()(64bit) ( ) libcmpisfcc.so.1(CMPISFCC_2.0)(64bit) ( ) libcimcClientXML.so.0()(64bit) ( ) libcimcClientXML.so.0(CIMCCLIENTXML_1.0)(64bit) ( ) libcimcclient.so.0()(64bit) ( ) libcimcclient.so.0(CIMCCLIENT_1.0)(64bit) ( ) sblim-sfcc ( =  2.2.8-28.el10) sblim-sfcc(x86-64) ( =  2.2.8-28.el10)"

URI_sblim-sfcc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sblim-sfcc-devel-2.2.8-28.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-sfcc-devel = "libcimcclient.so.0()(64bit) ( ) libcmpisfcc.so.1()(64bit) ( ) sblim-sfcc ( =  2.2.8-28.el10)"
RPROVIDES:sblim-sfcc-devel = "sblim-sfcc-devel ( =  2.2.8-28.el10) sblim-sfcc-devel(x86-64) ( =  2.2.8-28.el10)"
