
PN = "graphite2"
PE = "0"
PV = "1.3.14"
PR = "17.el10"
PACKAGES = "graphite2 graphite2-devel"


URI_graphite2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/graphite2-1.3.14-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphite2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( )"
RPROVIDES:graphite2 = "libgraphite2.so.3()(64bit) ( ) graphite2 ( =  1.3.14-17.el10) graphite2(x86-64) ( =  1.3.14-17.el10)"

URI_graphite2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphite2-devel-1.3.14-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphite2-devel = "/usr/bin/pkg-config ( ) libgraphite2.so.3()(64bit) ( ) graphite2(x86-64) ( =  1.3.14-17.el10)"
RPROVIDES:graphite2-devel = "graphite2-devel ( =  1.3.14-17.el10) graphite2-devel(x86-64) ( =  1.3.14-17.el10) pkgconfig(graphite2) ( =  3.0.1)"
