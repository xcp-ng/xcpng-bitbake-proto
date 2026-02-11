
PN = "pappl"
PE = "0"
PV = "1.4.6"
PR = "5.el10"
PACKAGES = "pappl pappl-devel"


URI_pappl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pappl-1.4.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pappl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libpng16.so.16()(64bit) ( ) libcups.so.2()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libpam.so.0()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libavahi-client.so.3()(64bit) ( )"
RPROVIDES:pappl = "libpappl.so.1()(64bit) ( ) pappl ( =  1.4.6-5.el10) pappl(x86-64) ( =  1.4.6-5.el10)"

URI_pappl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pappl-devel-1.4.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pappl-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) pkgconfig(avahi-client) ( ) libpappl.so.1()(64bit) ( ) pkgconfig(libjpeg) ( ) pkgconfig(libusb-1.0) ( >=  1.0) pappl(x86-64) ( =  1.4.6-5.el10) pkgconfig(gnutls) ( >=  3.0) pkgconfig(libpng) ( >=  1.6) pkgconfig(zlib) ( >=  1.0)"
RPROVIDES:pappl-devel = "pappl-devel ( =  1.4.6-5.el10) pappl-devel(x86-64) ( =  1.4.6-5.el10) pkgconfig(pappl) ( =  1.4.6)"
