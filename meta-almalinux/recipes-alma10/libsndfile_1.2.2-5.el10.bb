
PN = "libsndfile"
PE = "0"
PV = "1.2.2"
PR = "5.el10"
PACKAGES = "libsndfile libsndfile-utils libsndfile-devel"


URI_libsndfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsndfile-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsndfile = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libopus.so.0()(64bit) ( ) libogg.so.0()(64bit) ( ) libgsm.so.1()(64bit) ( ) libmp3lame.so.0()(64bit) ( ) libvorbis.so.0()(64bit) ( ) libmpg123.so.0()(64bit) ( ) libvorbisenc.so.2()(64bit) ( ) libFLAC.so.12()(64bit) ( )"
RPROVIDES:libsndfile = "libsndfile.so.1()(64bit) ( ) libsndfile.so.1(libsndfile.so.1.0)(64bit) ( ) libsndfile ( =  1.2.2-5.el10) libsndfile(x86-64) ( =  1.2.2-5.el10)"

URI_libsndfile-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsndfile-utils-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsndfile-utils = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libsndfile.so.1()(64bit) ( ) libsndfile.so.1(libsndfile.so.1.0)(64bit) ( ) libsndfile ( =  1.2.2-5.el10)"
RPROVIDES:libsndfile-utils = "libsndfile-utils ( =  1.2.2-5.el10) libsndfile-utils(x86-64) ( =  1.2.2-5.el10)"

URI_libsndfile-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsndfile-devel-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsndfile-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(ogg) ( ) pkgconfig(vorbis) ( ) pkgconfig(flac) ( ) pkgconfig(libmpg123) ( ) pkgconfig(vorbisenc) ( ) libsndfile.so.1()(64bit) ( ) pkgconfig(opus) ( ) libsndfile(x86-64) ( =  1.2.2-5.el10)"
RPROVIDES:libsndfile-devel = "libsndfile-devel ( =  1.2.2-5.el10) libsndfile-devel(x86-64) ( =  1.2.2-5.el10) pkgconfig(sndfile) ( =  1.2.2)"
