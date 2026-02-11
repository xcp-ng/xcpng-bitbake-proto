
PN = "oneapi-level-zero"
PE = "0"
PV = "1.15.13"
PR = "3.el10"
PACKAGES = "oneapi-level-zero oneapi-level-zero-devel"


URI_oneapi-level-zero = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/oneapi-level-zero-1.15.13-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oneapi-level-zero = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( )"
RPROVIDES:oneapi-level-zero = "libze_loader.so.1()(64bit) ( ) libze_tracing_layer.so.1()(64bit) ( ) libze_validation_layer.so.1()(64bit) ( ) oneapi-level-zero(x86-64) ( =  1.15.13-3.el10) oneapi-level-zero ( =  1.15.13-3.el10)"

URI_oneapi-level-zero-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/oneapi-level-zero-devel-1.15.13-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oneapi-level-zero-devel = "/usr/bin/pkg-config ( ) libze_loader.so.1()(64bit) ( ) libze_tracing_layer.so.1()(64bit) ( ) libze_validation_layer.so.1()(64bit) ( ) pkgconfig(libze_loader) ( ) oneapi-level-zero(x86-64) ( =  1.15.13-3.el10)"
RPROVIDES:oneapi-level-zero-devel = "oneapi-level-zero-devel ( =  1.15.13-3.el10) oneapi-level-zero-devel(x86-64) ( =  1.15.13-3.el10) pkgconfig(level-zero) ( =  1.15.0) pkgconfig(libze_loader) ( =  1.15.0)"
