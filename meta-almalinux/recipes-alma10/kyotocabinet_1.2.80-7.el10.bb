
PN = "kyotocabinet"
PE = "0"
PV = "1.2.80"
PR = "7.el10"
PACKAGES = "kyotocabinet-libs kyotocabinet kyotocabinet-apidocs kyotocabinet-devel"


URI_kyotocabinet-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kyotocabinet-libs-1.2.80-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kyotocabinet-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) liblzo2.so.2()(64bit) ( )"
RPROVIDES:kyotocabinet-libs = "libkyotocabinet.so.16()(64bit) ( ) kyotocabinet-lib ( =  1.2.80-7.el10) kyotocabinet-lib(x86-64) ( =  1.2.80-7.el10) kyotocabinet-libs ( =  1.2.80-7.el10) kyotocabinet-libs(x86-64) ( =  1.2.80-7.el10)"

URI_kyotocabinet = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kyotocabinet-1.2.80-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kyotocabinet = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libkyotocabinet.so.16()(64bit) ( ) kyotocabinet-libs(x86-64) ( =  1.2.80-7.el10)"
RPROVIDES:kyotocabinet = "kyotocabinet ( =  1.2.80-7.el10) kyotocabinet(x86-64) ( =  1.2.80-7.el10)"

URI_kyotocabinet-apidocs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kyotocabinet-apidocs-1.2.80-7.el10.noarch.rpm;unpack=0"
RDEPENDS:kyotocabinet-apidocs = ""
RPROVIDES:kyotocabinet-apidocs = "kyotocabinet-api-doc ( =  1.2.80-7.el10) kyotocabinet-apidocs ( =  1.2.80-7.el10)"

URI_kyotocabinet-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kyotocabinet-devel-1.2.80-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kyotocabinet-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libkyotocabinet.so.16()(64bit) ( ) kyotocabinet-libs(x86-64) ( =  1.2.80-7.el10)"
RPROVIDES:kyotocabinet-devel = "kyotocabinet-devel ( =  1.2.80-7.el10) kyotocabinet-devel(x86-64) ( =  1.2.80-7.el10) pkgconfig(kyotocabinet) ( =  1.2.80)"
