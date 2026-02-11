
PN = "sane-airscan"
PE = "0"
PV = "0.99.27"
PR = "14.el10"
PACKAGES = "libsane-airscan sane-airscan"


URI_libsane-airscan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsane-airscan-0.99.27-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsane-airscan = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libjpeg.so.62(LIBJPEGTURBO_6.2)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.1)(64bit) ( )"
RPROVIDES:libsane-airscan = "libsane-airscan.so.1()(64bit) ( ) libsane-airscan(x86-64) ( =  0.99.27-14.el10) config(libsane-airscan) ( =  0.99.27-14.el10) libsane-airscan ( =  0.99.27-14.el10)"

URI_sane-airscan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-airscan-0.99.27-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-airscan = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.1)(64bit) ( ) libsane-airscan(x86-64) ( =  0.99.27-14.el10)"
RPROVIDES:sane-airscan = "sane-airscan ( =  0.99.27-14.el10) sane-airscan(x86-64) ( =  0.99.27-14.el10)"
