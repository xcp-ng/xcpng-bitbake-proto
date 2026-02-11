
PN = "soundtouch"
PE = "0"
PV = "2.3.1"
PR = "8.el10"
PACKAGES = "soundtouch soundtouch-devel"


URI_soundtouch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/soundtouch-2.3.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:soundtouch = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libmvec.so.1()(64bit) ( ) libmvec.so.1(GLIBC_2.22)(64bit) ( )"
RPROVIDES:soundtouch = "libSoundTouch.so.2()(64bit) ( ) soundtouch ( =  2.3.1-8.el10) soundtouch(x86-64) ( =  2.3.1-8.el10)"

URI_soundtouch-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/soundtouch-devel-2.3.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:soundtouch-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) cmake-filesystem(x86-64) ( ) libSoundTouch.so.2()(64bit) ( ) soundtouch ( =  2.3.1-8.el10)"
RPROVIDES:soundtouch-devel = "cmake(SoundTouch) ( =  2.3.1) cmake(soundtouch) ( =  2.3.1) pkgconfig(libSoundTouch) ( =  2.3.1) pkgconfig(soundtouch) ( =  2.3.1) pkgconfig(soundtouch-1.0) ( =  2.3.1) soundtouch-devel ( =  2.3.1-8.el10) soundtouch-devel(x86-64) ( =  2.3.1-8.el10)"
