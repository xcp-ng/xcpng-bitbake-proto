
PN = "libsass"
PE = "0"
PV = "3.4.5"
PR = "6.el10"
PACKAGES = "libsass libsass-devel"


URI_libsass = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsass-3.4.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsass = "/sbin/ldconfig ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.1)(64bit) ( )"
RPROVIDES:libsass = "libsass.so.0()(64bit) ( ) libsass(x86-64) ( =  3.4.5-6.el10) libsass ( =  3.4.5-6.el10)"

URI_libsass-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsass-devel-3.4.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsass-devel = "/usr/bin/pkg-config ( ) libsass.so.0()(64bit) ( ) libsass(x86-64) ( =  3.4.5-6.el10)"
RPROVIDES:libsass-devel = "libsass-devel ( =  3.4.5-6.el10) libsass-devel(x86-64) ( =  3.4.5-6.el10) pkgconfig(libsass) ( =  3.4.5)"
