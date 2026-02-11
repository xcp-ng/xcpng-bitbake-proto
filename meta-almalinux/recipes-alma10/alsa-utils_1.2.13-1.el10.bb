
PN = "alsa-utils"
PE = "0"
PV = "1.2.13"
PR = "1.el10"
PACKAGES = "alsa-ucm-utils alsa-utils alsa-topology-utils alsa-utils-alsabat"


URI_alsa-ucm-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-ucm-utils-1.2.13-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-ucm-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( )"
RPROVIDES:alsa-ucm-utils = "alsa-ucm-utils ( =  1.2.13-1.el10) alsa-ucm-utils(x86-64) ( =  1.2.13-1.el10)"

URI_alsa-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-utils-1.2.13-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-utils = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) /usr/bin/bash ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libncursesw.so.6()(64bit) ( ) libasound.so.2(ALSA_0.9.0rc8)(64bit) ( ) libformw.so.6()(64bit) ( ) libmenuw.so.6()(64bit) ( ) libpanelw.so.6()(64bit) ( ) libsamplerate.so.0()(64bit) ( ) libsamplerate.so.0(libsamplerate.so.0.0)(64bit) ( ) libsamplerate.so.0(libsamplerate.so.0.1)(64bit) ( ) libasound.so.2(ALSA_1.2.10)(64bit) ( ) libasound.so.2(ALSA_1.2.13)(64bit) ( ) alsa-lib(x86-64) ( >=  1.2.13) alsa-ucm ( >=  1.2.13)"
RPROVIDES:alsa-utils = "alsa-utils ( =  1.2.13-1.el10) alsa-utils(x86-64) ( =  1.2.13-1.el10) config(alsa-utils) ( =  1.2.13-1.el10)"

URI_alsa-topology-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/alsa-topology-utils-1.2.13-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-topology-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libatopology.so.2()(64bit) ( ) libatopology.so.2(ALSA_0.9)(64bit) ( ) alsa-topology ( >=  1.2.13)"
RPROVIDES:alsa-topology-utils = "libalsatplg_module_nhlt.so()(64bit) ( ) alsa-topology-utils ( =  1.2.13-1.el10) alsa-topology-utils(x86-64) ( =  1.2.13-1.el10)"

URI_alsa-utils-alsabat = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/alsa-utils-alsabat-1.2.13-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-utils-alsabat = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libfftw3f.so.3()(64bit) ( )"
RPROVIDES:alsa-utils-alsabat = "alsa-utils-alsabat ( =  1.2.13-1.el10) alsa-utils-alsabat(x86-64) ( =  1.2.13-1.el10)"
