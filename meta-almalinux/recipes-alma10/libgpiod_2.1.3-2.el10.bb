
PN = "libgpiod"
PE = "0"
PV = "2.1.3"
PR = "2.el10"
PACKAGES = "libgpiod libgpiod-c++ libgpiod-devel libgpiod-utils python3-libgpiod"


URI_libgpiod = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpiod-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgpiod = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:libgpiod = "libgpiod.so.3()(64bit) ( ) libgpiod(x86-64) ( =  2.1.3-2.el10) libgpiod ( =  2.1.3-2.el10)"

URI_libgpiod-c++ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpiod-c++-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgpiod-c++ = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libc.so.6(GLIBC_2.32)(64bit) ( ) libgpiod.so.3()(64bit) ( ) libgpiod(x86-64) ( =  2.1.3-2.el10)"
RPROVIDES:libgpiod-c++ = "libgpiodcxx.so.2()(64bit) ( ) libgpiod-c++ ( =  2.1.3-2.el10) libgpiod-c++(x86-64) ( =  2.1.3-2.el10)"

URI_libgpiod-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpiod-devel-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgpiod-devel = "/usr/bin/pkg-config ( ) libgpiod.so.3()(64bit) ( ) libgpiodcxx.so.2()(64bit) ( ) libgpiod(x86-64) ( =  2.1.3-2.el10) libgpiod-c++ ( =  2.1.3-2.el10) python3-libgpiod ( =  2.1.3-2.el10)"
RPROVIDES:libgpiod-devel = "libgpiod-devel ( =  2.1.3-2.el10) libgpiod-devel(x86-64) ( =  2.1.3-2.el10) pkgconfig(libgpiod) ( =  2.1.3) pkgconfig(libgpiodcxx) ( =  2.1.3)"

URI_libgpiod-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpiod-utils-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgpiod-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgpiod.so.3()(64bit) ( ) libgpiod(x86-64) ( =  2.1.3-2.el10)"
RPROVIDES:libgpiod-utils = "libgpiod-utils ( =  2.1.3-2.el10) libgpiod-utils(x86-64) ( =  2.1.3-2.el10)"

URI_python3-libgpiod = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libgpiod-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libgpiod = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgpiod.so.3()(64bit) ( ) python(abi) ( =  3.12) libgpiod(x86-64) ( =  2.1.3-2.el10)"
RPROVIDES:python3-libgpiod = "python3-libgpiod ( =  2.1.3-2.el10) python-libgpiod ( =  2.1.3-2.el10) python3-libgpiod(x86-64) ( =  2.1.3-2.el10) python3.12-libgpiod ( =  2.1.3-2.el10) python3.12dist(gpiod) ( =  2.0.1) python3dist(gpiod) ( =  2.0.1)"
