
PN = "alsa-lib"
PE = "0"
PV = "1.2.13"
PR = "2.el10"
PACKAGES = "alsa-lib alsa-lib-devel alsa-ucm alsa-topology"


URI_alsa-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-lib-1.2.13-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-lib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( )"
RPROVIDES:alsa-lib = "libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libasound.so.2(ALSA_0.9.0rc8)(64bit) ( ) libasound.so.2(ALSA_1.2.10)(64bit) ( ) libasound.so.2(ALSA_1.2.13)(64bit) ( ) libatopology.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9.0)(64bit) ( ) libasound.so.2(ALSA_0.9.3)(64bit) ( ) libasound.so.2(ALSA_0.9.5)(64bit) ( ) libasound.so.2(ALSA_0.9.7)(64bit) ( ) libasound.so.2(ALSA_1.1.6)(64bit) ( ) libasound.so.2(ALSA_1.2.6)(64bit) ( ) libasound.so.2(ALSA_1.2.9)(64bit) ( ) libatopology.so.2(ALSA_0.9)(64bit) ( ) alsa-lib ( =  1.2.13-2.el10) alsa-lib(x86-64) ( =  1.2.13-2.el10) config(alsa-lib) ( =  1.2.13-2.el10)"

URI_alsa-lib-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-lib-devel-1.2.13-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-lib-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libasound.so.2()(64bit) ( ) libatopology.so.2()(64bit) ( ) alsa-lib ( =  1.2.13-2.el10) pkgconfig(alsa) ( >=  1.2.13)"
RPROVIDES:alsa-lib-devel = "alsa-lib-devel ( =  1.2.13-2.el10) alsa-lib-devel(x86-64) ( =  1.2.13-2.el10) pkgconfig(alsa) ( =  1.2.13) pkgconfig(alsa-topology) ( =  1.2.13)"

URI_alsa-ucm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-ucm-1.2.13-2.el10.noarch.rpm;unpack=0"
RDEPENDS:alsa-ucm = "alsa-lib ( >=  1.2.13)"
RPROVIDES:alsa-ucm = "alsa-ucm ( =  1.2.13-2.el10)"

URI_alsa-topology = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/alsa-topology-1.2.13-2.el10.noarch.rpm;unpack=0"
RDEPENDS:alsa-topology = "alsa-lib ( >=  1.2.13)"
RPROVIDES:alsa-topology = "alsa-topology ( =  1.2.13-2.el10)"
