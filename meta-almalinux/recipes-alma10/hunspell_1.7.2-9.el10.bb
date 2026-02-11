
PN = "hunspell"
PE = "0"
PV = "1.7.2"
PR = "9.el10"
PACKAGES = "hunspell hunspell-devel hunspell-filesystem"


URI_hunspell = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-1.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hunspell = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libncursesw.so.6()(64bit) ( ) hunspell-en-US ( ) hunspell-filesystem ( =  1.7.2-9.el10)"
RPROVIDES:hunspell = "libhunspell-1.7.so.0()(64bit) ( ) hunspell ( =  1.7.2-9.el10) hunspell(x86-64) ( =  1.7.2-9.el10)"

URI_hunspell-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-devel-1.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hunspell-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) /usr/bin/pkg-config ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) /usr/bin/perl ( ) pkgconfig ( ) perl(Getopt::Long) ( ) perl(locale) ( ) libhunspell-1.7.so.0()(64bit) ( ) hunspell ( =  1.7.2-9.el10)"
RPROVIDES:hunspell-devel = "hunspell-devel ( =  1.7.2-9.el10) hunspell-devel(x86-64) ( =  1.7.2-9.el10) pkgconfig(hunspell) ( =  1.7.2)"

URI_hunspell-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-filesystem-1.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hunspell-filesystem = ""
RPROVIDES:hunspell-filesystem = "hunspell-filesystem ( =  1.7.2-9.el10) hunspell-filesystem(x86-64) ( =  1.7.2-9.el10)"
