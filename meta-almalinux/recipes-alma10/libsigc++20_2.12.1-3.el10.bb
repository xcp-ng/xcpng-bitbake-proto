
PN = "libsigc++20"
PE = "0"
PV = "2.12.1"
PR = "3.el10"
PACKAGES = "libsigc++20 libsigc++20-devel libsigc++20-doc"


URI_libsigc++20 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsigc++20-2.12.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsigc++20 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:libsigc++20 = "libsigc-2.0.so.0()(64bit) ( ) libsigc++20 ( =  2.12.1-3.el10) libsigc++20(x86-64) ( =  2.12.1-3.el10)"

URI_libsigc++20-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsigc++20-devel-2.12.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsigc++20-devel = "/usr/bin/pkg-config ( ) libsigc-2.0.so.0()(64bit) ( ) libsigc++20(x86-64) ( =  2.12.1-3.el10)"
RPROVIDES:libsigc++20-devel = "libsigc++20-devel ( =  2.12.1-3.el10) libsigc++20-devel(x86-64) ( =  2.12.1-3.el10) pkgconfig(sigc++-2.0) ( =  2.12.1)"

URI_libsigc++20-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsigc++20-doc-2.12.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:libsigc++20-doc = "libsigc++20 ( =  2.12.1-3.el10)"
RPROVIDES:libsigc++20-doc = "libsigc++20-doc ( =  2.12.1-3.el10)"
