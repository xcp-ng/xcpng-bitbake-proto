
PN = "libshout"
PE = "0"
PV = "2.4.6"
PR = "9.el10"
PACKAGES = "libshout libshout-devel"


URI_libshout = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libshout-2.4.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshout = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libogg.so.0()(64bit) ( ) libvorbis.so.0()(64bit) ( ) libspeex.so.1()(64bit) ( ) libtheora.so.0()(64bit) ( ) libtheora.so.0(libtheora.so.1.0)(64bit) ( )"
RPROVIDES:libshout = "libshout.so.3()(64bit) ( ) libshout ( =  2.4.6-9.el10) libshout(x86-64) ( =  2.4.6-9.el10)"

URI_libshout-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libshout-devel-2.4.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshout-devel = "/usr/bin/pkg-config ( ) pkgconfig(ogg) ( ) pkgconfig(libssl) ( ) pkgconfig(vorbis) ( ) pkgconfig(speex) ( ) pkgconfig(theora) ( ) libshout.so.3()(64bit) ( ) libshout(x86-64) ( =  2.4.6-9.el10)"
RPROVIDES:libshout-devel = "libshout-devel ( =  2.4.6-9.el10) libshout-devel(x86-64) ( =  2.4.6-9.el10) pkgconfig(shout) ( =  2.4.6)"
