
PN = "libsigc++30"
PE = "0"
PV = "3.6.0"
PR = "5.el10"
PACKAGES = "libsigc++30 libsigc++30-devel libsigc++30-doc"


URI_libsigc++30 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsigc++30-3.6.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsigc++30 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libc.so.6(GLIBC_2.32)(64bit) ( )"
RPROVIDES:libsigc++30 = "libsigc-3.0.so.0()(64bit) ( ) libsigc++30 ( =  3.6.0-5.el10) libsigc++30(x86-64) ( =  3.6.0-5.el10)"

URI_libsigc++30-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsigc++30-devel-3.6.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsigc++30-devel = "/usr/bin/pkg-config ( ) libsigc-3.0.so.0()(64bit) ( ) libsigc++30(x86-64) ( =  3.6.0-5.el10)"
RPROVIDES:libsigc++30-devel = "libsigc++30-devel ( =  3.6.0-5.el10) libsigc++30-devel(x86-64) ( =  3.6.0-5.el10) pkgconfig(sigc++-3.0) ( =  3.6.0)"

URI_libsigc++30-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsigc++30-doc-3.6.0-5.el10.noarch.rpm;unpack=0"
RDEPENDS:libsigc++30-doc = "libsigc++30 ( =  3.6.0-5.el10)"
RPROVIDES:libsigc++30-doc = "libsigc++30-doc ( =  3.6.0-5.el10)"
