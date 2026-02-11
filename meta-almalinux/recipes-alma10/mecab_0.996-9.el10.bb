
PN = "mecab"
PE = "0"
PV = "0.996"
PR = "9.el10"
PACKAGES = "mecab mecab-devel"


URI_mecab = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mecab-0.996-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mecab = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( )"
RPROVIDES:mecab = "libmecab.so.2()(64bit) ( ) config(mecab) ( =  0.996-9.el10) mecab ( =  0.996-9.el10) mecab(x86-64) ( =  0.996-9.el10)"

URI_mecab-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mecab-devel-0.996-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mecab-devel = "/usr/bin/sh ( ) libmecab.so.2()(64bit) ( ) mecab ( =  0.996-9.el10)"
RPROVIDES:mecab-devel = "mecab-devel ( =  0.996-9.el10) mecab-devel(x86-64) ( =  0.996-9.el10)"
