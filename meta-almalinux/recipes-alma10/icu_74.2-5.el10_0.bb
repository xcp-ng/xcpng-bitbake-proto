
PN = "icu"
PE = "0"
PV = "74.2"
PR = "5.el10_0"
PACKAGES = "libicu icu libicu-devel libicu-doc"


URI_libicu = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libicu-74.2-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libicu = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( )"
RPROVIDES:libicu = "libicui18n.so.74()(64bit) ( ) libicuuc.so.74()(64bit) ( ) libicudata.so.74()(64bit) ( ) libicuio.so.74()(64bit) ( ) libicutest.so.74()(64bit) ( ) libicutu.so.74()(64bit) ( ) libicu ( =  74.2-5.el10_0) libicu(x86-64) ( =  74.2-5.el10_0)"

URI_icu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/icu-74.2-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:icu = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libicuuc.so.74()(64bit) ( ) libicui18n.so.74()(64bit) ( ) libicuio.so.74()(64bit) ( ) libicutu.so.74()(64bit) ( ) libicu(x86-64) ( =  74.2-5.el10_0)"
RPROVIDES:icu = "icu ( =  74.2-5.el10_0) icu(x86-64) ( =  74.2-5.el10_0)"

URI_libicu-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libicu-devel-74.2-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libicu-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libicuuc.so.74()(64bit) ( ) libicui18n.so.74()(64bit) ( ) libicudata.so.74()(64bit) ( ) libicuio.so.74()(64bit) ( ) libicutu.so.74()(64bit) ( ) pkgconfig(icu-uc) ( ) pkgconfig(icu-i18n) ( ) libicutest.so.74()(64bit) ( ) libicu(x86-64) ( =  74.2-5.el10_0)"
RPROVIDES:libicu-devel = "pkgconfig(icu-i18n) ( =  74.2) pkgconfig(icu-io) ( =  74.2) pkgconfig(icu-uc) ( =  74.2) libicu-devel ( =  74.2-5.el10_0) libicu-devel(x86-64) ( =  74.2-5.el10_0)"

URI_libicu-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libicu-doc-74.2-5.el10_0.noarch.rpm;unpack=0"
RDEPENDS:libicu-doc = ""
RPROVIDES:libicu-doc = "libicu-doc ( =  74.2-5.el10_0)"
