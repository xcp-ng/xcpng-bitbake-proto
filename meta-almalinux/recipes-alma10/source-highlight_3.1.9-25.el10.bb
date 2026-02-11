
PN = "source-highlight"
PE = "0"
PV = "3.1.9"
PR = "25.el10"
PACKAGES = "source-highlight source-highlight-devel"


URI_source-highlight = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/source-highlight-3.1.9-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:source-highlight = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libboost_regex.so.1.83.0()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) ( )"
RPROVIDES:source-highlight = "libsource-highlight.so.4()(64bit) ( ) source-highlight ( =  3.1.9-25.el10) source-highlight(x86-64) ( =  3.1.9-25.el10)"

URI_source-highlight-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/source-highlight-devel-3.1.9-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:source-highlight-devel = "/usr/bin/pkg-config ( ) boost-devel ( ) libsource-highlight.so.4()(64bit) ( ) source-highlight(x86-64) ( =  3.1.9-25.el10)"
RPROVIDES:source-highlight-devel = "pkgconfig(source-highlight) ( =  3.1.9) source-highlight-devel ( =  3.1.9-25.el10) source-highlight-devel(x86-64) ( =  3.1.9-25.el10)"
