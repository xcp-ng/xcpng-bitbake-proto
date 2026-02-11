
PN = "snappy"
PE = "0"
PV = "1.1.10"
PR = "7.el10"
PACKAGES = "snappy snappy-devel"


URI_snappy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/snappy-1.1.10-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:snappy = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( )"
RPROVIDES:snappy = "libsnappy.so.1()(64bit) ( ) snappy ( =  1.1.10-7.el10) snappy(x86-64) ( =  1.1.10-7.el10)"

URI_snappy-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/snappy-devel-1.1.10-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:snappy-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) cmake-filesystem(x86-64) ( ) cmake-filesystem ( ) libsnappy.so.1()(64bit) ( ) snappy(x86-64) ( =  1.1.10-7.el10)"
RPROVIDES:snappy-devel = "cmake(Snappy) ( =  1.1.10) cmake(snappy) ( =  1.1.10) pkgconfig(snappy) ( =  1.1.10) snappy-devel ( =  1.1.10-7.el10) snappy-devel(x86-64) ( =  1.1.10-7.el10)"
