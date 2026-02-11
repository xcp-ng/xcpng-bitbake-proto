
PN = "zstd"
PE = "0"
PV = "1.5.5"
PR = "9.el10"
PACKAGES = "libzstd zstd libzstd-devel libzstd-static"


URI_libzstd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libzstd-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzstd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libzstd = "libzstd.so.1()(64bit) ( ) libzstd ( =  1.5.5-9.el10) libzstd(x86-64) ( =  1.5.5-9.el10)"

URI_zstd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/zstd-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zstd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libz.so.1()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) liblz4.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) ( )"
RPROVIDES:zstd = "zstd ( =  1.5.5-9.el10) zstd(x86-64) ( =  1.5.5-9.el10)"

URI_libzstd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libzstd-devel-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzstd-devel = "/usr/bin/pkg-config ( ) libzstd.so.1()(64bit) ( ) libzstd(x86-64) ( =  1.5.5-9.el10)"
RPROVIDES:libzstd-devel = "libzstd-devel ( =  1.5.5-9.el10) libzstd-devel(x86-64) ( =  1.5.5-9.el10) pkgconfig(libzstd) ( =  1.5.5)"

URI_libzstd-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libzstd-static-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzstd-static = "libzstd-devel ( =  1.5.5-9.el10)"
RPROVIDES:libzstd-static = "libzstd-static ( =  1.5.5-9.el10) libzstd-static(x86-64) ( =  1.5.5-9.el10)"
