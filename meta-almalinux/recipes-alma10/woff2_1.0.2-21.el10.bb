
PN = "woff2"
PE = "0"
PV = "1.0.2"
PR = "21.el10"
PACKAGES = "woff2 woff2-devel woff2-tools"


URI_woff2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/woff2-1.0.2-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:woff2 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libbrotlidec.so.1()(64bit) ( ) libbrotlienc.so.1()(64bit) ( )"
RPROVIDES:woff2 = "libwoff2common.so.1.0.2()(64bit) ( ) libwoff2dec.so.1.0.2()(64bit) ( ) libwoff2enc.so.1.0.2()(64bit) ( ) woff2 ( =  1.0.2-21.el10) woff2(x86-64) ( =  1.0.2-21.el10)"

URI_woff2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/woff2-devel-1.0.2-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:woff2-devel = "/usr/bin/pkg-config ( ) libwoff2dec.so.1.0.2()(64bit) ( ) libwoff2enc.so.1.0.2()(64bit) ( ) pkgconfig(libbrotlidec) ( ) pkgconfig(libwoff2common) ( ) libwoff2common.so.1.0.2()(64bit) ( ) pkgconfig(libbrotlienc) ( ) woff2(x86-64) ( =  1.0.2-21.el10)"
RPROVIDES:woff2-devel = "pkgconfig(libwoff2common) ( =  1.0.2) pkgconfig(libwoff2dec) ( =  1.0.2) pkgconfig(libwoff2enc) ( =  1.0.2) woff2-devel ( =  1.0.2-21.el10) woff2-devel(x86-64) ( =  1.0.2-21.el10)"

URI_woff2-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/woff2-tools-1.0.2-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:woff2-tools = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libwoff2common.so.1.0.2()(64bit) ( ) libwoff2dec.so.1.0.2()(64bit) ( ) libwoff2enc.so.1.0.2()(64bit) ( ) woff2(x86-64) ( =  1.0.2-21.el10)"
RPROVIDES:woff2-tools = "woff2-tools ( =  1.0.2-21.el10) woff2-tools(x86-64) ( =  1.0.2-21.el10)"
