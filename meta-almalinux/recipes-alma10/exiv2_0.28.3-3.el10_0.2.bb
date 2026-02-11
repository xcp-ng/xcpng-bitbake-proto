
PN = "exiv2"
PE = "0"
PV = "0.28.3"
PR = "3.el10_0.2"
PACKAGES = "exiv2 exiv2-libs exiv2-devel exiv2-doc"


URI_exiv2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/exiv2-0.28.3-3.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:exiv2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libexiv2.so.28()(64bit) ( ) exiv2-libs(x86-64) ( =  0.28.3-3.el10_0.2)"
RPROVIDES:exiv2 = "exiv2(x86-64) ( =  0.28.3-3.el10_0.2) exiv2 ( =  0.28.3-3.el10_0.2)"

URI_exiv2-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/exiv2-libs-0.28.3-3.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:exiv2-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libexpat.so.1()(64bit) ( ) libbrotlidec.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.2)(64bit) ( ) libINIReader.so.0()(64bit) ( )"
RPROVIDES:exiv2-libs = "libexiv2.so.28()(64bit) ( ) exiv2-libs(x86-64) ( =  0.28.3-3.el10_0.2) exiv2-libs ( =  0.28.3-3.el10_0.2)"

URI_exiv2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exiv2-devel-0.28.3-3.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:exiv2-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) pkgconfig(zlib) ( ) pkgconfig(INIReader) ( ) pkgconfig(expat) ( ) pkgconfig(libbrotlidec) ( ) libexiv2.so.28()(64bit) ( ) exiv2-libs(x86-64) ( =  0.28.3-3.el10_0.2)"
RPROVIDES:exiv2-devel = "cmake(exiv2) ( =  0.28.3) exiv2-devel ( =  0.28.3-3.el10_0.2) exiv2-devel(x86-64) ( =  0.28.3-3.el10_0.2) pkgconfig(exiv2) ( =  0.28.3)"

URI_exiv2-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exiv2-doc-0.28.3-3.el10_0.2.noarch.rpm;unpack=0"
RDEPENDS:exiv2-doc = ""
RPROVIDES:exiv2-doc = "exiv2-doc ( =  0.28.3-3.el10_0.2)"
