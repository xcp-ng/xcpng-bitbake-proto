
PN = "librdkafka"
PE = "0"
PV = "2.1.1"
PR = "7.el10"
PACKAGES = "librdkafka librdkafka-devel"


URI_librdkafka = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librdkafka-2.1.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librdkafka = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libssl.so.3()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libzstd.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libsasl2.so.3()(64bit) ( ) liblz4.so.1()(64bit) ( )"
RPROVIDES:librdkafka = "librdkafka.so.1()(64bit) ( ) librdkafka++.so.1()(64bit) ( ) librdkafka ( =  2.1.1-7.el10) librdkafka(x86-64) ( =  2.1.1-7.el10)"

URI_librdkafka-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librdkafka-devel-2.1.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librdkafka-devel = "/usr/bin/pkg-config ( ) pkgconfig(zlib) ( ) pkgconfig(libcrypto) ( ) pkgconfig(libssl) ( ) pkgconfig(libzstd) ( ) pkgconfig(liblz4) ( ) pkgconfig(libsasl2) ( ) pkgconfig(rdkafka) ( ) librdkafka++.so.1()(64bit) ( ) librdkafka.so.1()(64bit) ( ) librdkafka(x86-64) ( =  2.1.1-7.el10)"
RPROVIDES:librdkafka-devel = "librdkafka-devel ( =  2.1.1-7.el10) librdkafka-devel(x86-64) ( =  2.1.1-7.el10) pkgconfig(rdkafka) ( =  2.1.1) pkgconfig(rdkafka++) ( =  2.1.1)"
