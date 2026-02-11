
PN = "nghttp2"
PE = "0"
PV = "1.64.0"
PR = "2.el10"
PACKAGES = "libnghttp2 libnghttp2-devel nghttp2"


URI_libnghttp2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnghttp2-1.64.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnghttp2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.17)(64bit) ( )"
RPROVIDES:libnghttp2 = "libnghttp2.so.14()(64bit) ( ) libnghttp2 ( =  1.64.0-2.el10) libnghttp2(x86-64) ( =  1.64.0-2.el10)"

URI_libnghttp2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnghttp2-devel-1.64.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnghttp2-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libnghttp2.so.14()(64bit) ( ) libnghttp2(x86-64) ( =  1.64.0-2.el10)"
RPROVIDES:libnghttp2-devel = "libnghttp2-devel ( =  1.64.0-2.el10) libnghttp2-devel(x86-64) ( =  1.64.0-2.el10) pkgconfig(libnghttp2) ( =  1.64.0)"

URI_nghttp2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nghttp2-1.64.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nghttp2 = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/python3 ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libssl.so.3()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.11)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.13)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.2)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libev.so.4()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) libcares.so.2()(64bit) ( ) libnghttp2.so.14()(64bit) ( ) libnghttp2(x86-64) ( =  1.64.0-2.el10)"
RPROVIDES:nghttp2 = "nghttp2 ( =  1.64.0-2.el10) nghttp2(x86-64) ( =  1.64.0-2.el10)"
