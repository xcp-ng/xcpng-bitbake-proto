
PN = "libpinyin"
PE = "0"
PV = "2.8.1"
PR = "9.el10"
PACKAGES = "libpinyin libpinyin-data libzhuyin libpinyin-devel libpinyin-tools"


URI_libpinyin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpinyin-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpinyin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libkyotocabinet.so.16()(64bit) ( ) libpinyin-data(x86-64) ( =  2.8.1-9.el10)"
RPROVIDES:libpinyin = "libpinyin.so.15()(64bit) ( ) libpinyin.so.15(LIBPINYIN)(64bit) ( ) libpinyin ( =  2.8.1-9.el10) libpinyin(x86-64) ( =  2.8.1-9.el10)"

URI_libpinyin-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpinyin-data-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpinyin-data = "libpinyin ( =  2.8.1-9.el10)"
RPROVIDES:libpinyin-data = "libpinyin-data(x86-64) ( =  2.8.1-9.el10) libpinyin-data ( =  2.8.1-9.el10)"

URI_libzhuyin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libzhuyin-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzhuyin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libkyotocabinet.so.16()(64bit) ( ) libpinyin ( =  2.8.1-9.el10)"
RPROVIDES:libzhuyin = "libzhuyin.so.15()(64bit) ( ) libzhuyin.so.15(LIBZHUYIN)(64bit) ( ) libzhuyin ( =  2.8.1-9.el10) libzhuyin(x86-64) ( =  2.8.1-9.el10)"

URI_libpinyin-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpinyin-devel-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpinyin-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) libpinyin.so.15()(64bit) ( ) libzhuyin.so.15()(64bit) ( ) libpinyin ( =  2.8.1-9.el10) libzhuyin ( =  2.8.1-9.el10)"
RPROVIDES:libpinyin-devel = "libpinyin-devel ( =  2.8.1-9.el10) libpinyin-devel(x86-64) ( =  2.8.1-9.el10) libzhuyin-devel ( =  2.8.1-9.el10) pkgconfig(libpinyin) ( =  2.8.1) pkgconfig(libzhuyin) ( =  2.8.1)"

URI_libpinyin-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpinyin-tools-2.8.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpinyin-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libkyotocabinet.so.16()(64bit) ( ) libpinyin ( =  2.8.1-9.el10)"
RPROVIDES:libpinyin-tools = "libpinyin-tools ( =  2.8.1-9.el10) libpinyin-tools(x86-64) ( =  2.8.1-9.el10)"
