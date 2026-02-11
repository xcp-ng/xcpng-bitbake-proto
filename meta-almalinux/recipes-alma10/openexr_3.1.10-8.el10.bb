
PN = "openexr"
PE = "0"
PV = "3.1.10"
PR = "8.el10"
PACKAGES = "openexr openexr-libs openexr-devel"


URI_openexr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openexr-3.1.10-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openexr = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libImath-3_1.so.29()(64bit) ( ) libIex-3_1.so.30()(64bit) ( ) libOpenEXR-3_1.so.30()(64bit) ( ) libOpenEXRCore-3_1.so.30()(64bit) ( )"
RPROVIDES:openexr = "OpenEXR ( =  3.1.10-8.el10) openexr ( =  3.1.10-8.el10) openexr(x86-64) ( =  3.1.10-8.el10)"

URI_openexr-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openexr-libs-3.1.10-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openexr-libs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) ( ) libImath-3_1.so.29()(64bit) ( )"
RPROVIDES:openexr-libs = "libIex-3_1.so.30()(64bit) ( ) libOpenEXR-3_1.so.30()(64bit) ( ) libOpenEXRCore-3_1.so.30()(64bit) ( ) libIlmThread-3_1.so.30()(64bit) ( ) libOpenEXRUtil-3_1.so.30()(64bit) ( ) OpenEXR-libs ( =  3.1.10-8.el10) openexr-libs ( =  3.1.10-8.el10) openexr-libs(x86-64) ( =  3.1.10-8.el10)"

URI_openexr-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openexr-devel-3.1.10-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openexr-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) pkgconfig(Imath) ( ) libIex-3_1.so.30()(64bit) ( ) libIlmThread-3_1.so.30()(64bit) ( ) libOpenEXR-3_1.so.30()(64bit) ( ) libOpenEXRCore-3_1.so.30()(64bit) ( ) libOpenEXRUtil-3_1.so.30()(64bit) ( ) openexr-libs(x86-64) ( =  3.1.10-8.el10)"
RPROVIDES:openexr-devel = "OpenEXR-devel ( =  3.1.10-8.el10) OpenEXR-devel(x86-64) ( =  3.1.10-8.el10) cmake(OpenEXR) ( =  3.1.10) cmake(openexr) ( =  3.1.10) ilmbase-devel ( =  3.1.10-8.el10) ilmbase-devel(x86-64) ( =  3.1.10-8.el10) openexr-devel ( =  3.1.10-8.el10) openexr-devel(x86-64) ( =  3.1.10-8.el10) pkgconfig(OpenEXR) ( =  3.1.10)"
