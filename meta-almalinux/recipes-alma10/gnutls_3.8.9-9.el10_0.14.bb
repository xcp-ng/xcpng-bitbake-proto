
PN = "gnutls"
PE = "0"
PV = "3.8.9"
PR = "9.el10_0.14"
PACKAGES = "gnutls gnutls-c++ gnutls-dane gnutls-devel gnutls-fips gnutls-utils"


URI_gnutls = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gnutls-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libunistring.so.5()(64bit) ( ) crypto-policies ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( ) libtasn1.so.6()(64bit) ( ) libtasn1.so.6(LIBTASN1_0_3)(64bit) ( ) libp11-kit.so.0()(64bit) ( ) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) ( ) p11-kit-trust ( ) libtasn1 ( >=  4.3)"
RPROVIDES:gnutls = "libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_13)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_3)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_10)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_0)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_12)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_9)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_3)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_5)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_14)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_2)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_5)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_6)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_8)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_0)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_2)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_7)(64bit) ( ) libgnutls.so.30(GNUTLS_3_8_1)(64bit) ( ) libgnutls.so.30(GNUTLS_3_8_2)(64bit) ( ) libgnutls.so.30(GNUTLS_3_8_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_8_6)(64bit) ( ) libgnutls.so.30(GNUTLS_FIPS140_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_PRIVATE_3_4)(64bit) ( ) bundled(gnulib) ( =  20130424) gnutls ( =  3.8.9-9.el10_0.14) gnutls(x86-64) ( =  3.8.9-9.el10_0.14)"

URI_gnutls-c++ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-c++-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-c++ = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libidn2.so.0()(64bit) ( ) libp11-kit.so.0()(64bit) ( ) libtasn1.so.6()(64bit) ( ) libunistring.so.5()(64bit) ( ) gnutls(x86-64) ( =  3.8.9-9.el10_0.14)"
RPROVIDES:gnutls-c++ = "libgnutlsxx.so.30()(64bit) ( ) gnutls-c++(x86-64) ( =  3.8.9-9.el10_0.14) gnutls-c++ ( =  3.8.9-9.el10_0.14)"

URI_gnutls-dane = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-dane-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-dane = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libidn2.so.0()(64bit) ( ) libunbound.so.8()(64bit) ( ) libp11-kit.so.0()(64bit) ( ) libtasn1.so.6()(64bit) ( ) libunistring.so.5()(64bit) ( ) libgnutls.so.30(GNUTLS_PRIVATE_3_4)(64bit) ( ) gnutls(x86-64) ( =  3.8.9-9.el10_0.14)"
RPROVIDES:gnutls-dane = "libgnutls-dane.so.0()(64bit) ( ) libgnutls-dane.so.0(DANE_0_0)(64bit) ( ) gnutls-dane(x86-64) ( =  3.8.9-9.el10_0.14) gnutls-dane ( =  3.8.9-9.el10_0.14)"

URI_gnutls-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-devel-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libgnutls.so.30()(64bit) ( ) libgnutls-dane.so.0()(64bit) ( ) pkgconfig(gnutls) ( ) libgnutlsxx.so.30()(64bit) ( ) pkgconfig(libidn2) ( ) pkgconfig(p11-kit-1) ( ) pkgconfig(libtasn1) ( ) gnutls(x86-64) ( =  3.8.9-9.el10_0.14) gnutls-dane(x86-64) ( =  3.8.9-9.el10_0.14) gnutls-c++(x86-64) ( =  3.8.9-9.el10_0.14)"
RPROVIDES:gnutls-devel = "pkgconfig(gnutls) ( =  3.8.9) pkgconfig(gnutls-dane) ( =  3.8.9) gnutls-devel ( =  3.8.9-9.el10_0.14) gnutls-devel(x86-64) ( =  3.8.9-9.el10_0.14)"

URI_gnutls-fips = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-fips-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-fips = "gnutls(x86-64) ( =  3.8.9-9.el10_0.14)"
RPROVIDES:gnutls-fips = "gnutls-fips ( =  3.8.9-9.el10_0.14) gnutls-fips(x86-64) ( =  3.8.9-9.el10_0.14)"

URI_gnutls-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnutls-utils-3.8.9-9.el10_0.14.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnutls-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_13)(64bit) ( ) libtasn1.so.6()(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_3)(64bit) ( ) libgnutls-dane.so.0()(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_0)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_3)(64bit) ( ) libgnutls-dane.so.0(DANE_0_0)(64bit) ( ) libgnutls.so.30(GNUTLS_PRIVATE_3_4)(64bit) ( ) libtasn1.so.6(LIBTASN1_0_3)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_12)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_14)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_5)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_6)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_8)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_9)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_0)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_8_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_8_6)(64bit) ( ) gnutls(x86-64) ( =  3.8.9-9.el10_0.14) gnutls-dane(x86-64) ( =  3.8.9-9.el10_0.14)"
RPROVIDES:gnutls-utils = "gnutls-utils ( =  3.8.9-9.el10_0.14) gnutls-utils(x86-64) ( =  3.8.9-9.el10_0.14)"
