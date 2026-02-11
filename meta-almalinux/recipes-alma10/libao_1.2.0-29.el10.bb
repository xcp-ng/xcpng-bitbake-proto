
PN = "libao"
PE = "0"
PV = "1.2.0"
PR = "29.el10"
PACKAGES = "libao libao-devel"


URI_libao = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libao-1.2.0-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libao = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libpulse.so.0()(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( ) libpulse-simple.so.0()(64bit) ( ) libpulse-simple.so.0(PULSE_0)(64bit) ( )"
RPROVIDES:libao = "libao.so.4()(64bit) ( ) libao.so.4(LIBAO4_1.1.0)(64bit) ( ) libalsa.so()(64bit) ( ) liboss.so()(64bit) ( ) libpulse.so()(64bit) ( ) libao ( =  1.2.0-29.el10) libao(x86-64) ( =  1.2.0-29.el10)"

URI_libao-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libao-devel-1.2.0-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libao-devel = "/usr/bin/pkg-config ( ) libao.so.4()(64bit) ( ) libao(x86-64) ( =  1.2.0-29.el10)"
RPROVIDES:libao-devel = "libao-devel ( =  1.2.0-29.el10) libao-devel(x86-64) ( =  1.2.0-29.el10) pkgconfig(ao) ( =  1.2.0)"
