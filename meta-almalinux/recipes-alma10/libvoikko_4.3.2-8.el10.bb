
PN = "libvoikko"
PE = "0"
PV = "4.3.2"
PR = "8.el10"
PACKAGES = "libvoikko python3-libvoikko libvoikko-devel voikko-tools"


URI_libvoikko = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvoikko-4.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvoikko = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) voikko-fi ( )"
RPROVIDES:libvoikko = "libvoikko.so.1()(64bit) ( ) libvoikko ( =  4.3.2-8.el10) libvoikko(x86-64) ( =  4.3.2-8.el10)"

URI_python3-libvoikko = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libvoikko-4.3.2-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-libvoikko = "python(abi) ( =  3.12) libvoikko ( =  4.3.2-8.el10)"
RPROVIDES:python3-libvoikko = "python-libvoikko ( =  4.3.2-8.el10) python3-libvoikko ( =  4.3.2-8.el10) python3.12-libvoikko ( =  4.3.2-8.el10)"

URI_libvoikko-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvoikko-devel-4.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvoikko-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libvoikko.so.1()(64bit) ( ) libvoikko(x86-64) ( =  4.3.2-8.el10)"
RPROVIDES:libvoikko-devel = "libvoikko-devel ( =  4.3.2-8.el10) libvoikko-devel(x86-64) ( =  4.3.2-8.el10) pkgconfig(libvoikko) ( =  4.3.2)"

URI_voikko-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/voikko-tools-4.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:voikko-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libvoikko.so.1()(64bit) ( ) libvoikko(x86-64) ( =  4.3.2-8.el10)"
RPROVIDES:voikko-tools = "voikko-tools ( =  4.3.2-8.el10) voikko-tools(x86-64) ( =  4.3.2-8.el10)"
