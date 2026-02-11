
PN = "pangomm"
PE = "0"
PV = "2.46.4"
PR = "3.el10"
PACKAGES = "pangomm pangomm-devel pangomm-doc"


URI_pangomm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pangomm-2.46.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pangomm = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libsigc-2.0.so.0()(64bit) ( ) libglibmm-2.4.so.1()(64bit) ( ) libcairomm-1.0.so.1()(64bit) ( ) cairomm1.0(x86-64) ( >=  1.2.2) glibmm2.4(x86-64) ( >=  2.48.0) pango(x86-64) ( >=  1.45.1)"
RPROVIDES:pangomm = "libpangomm-1.4.so.1()(64bit) ( ) pangomm ( =  2.46.4-3.el10) pangomm(x86-64) ( =  2.46.4-3.el10)"

URI_pangomm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pangomm-devel-2.46.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pangomm-devel = "/usr/bin/pkg-config ( ) libpangomm-1.4.so.1()(64bit) ( ) pangomm(x86-64) ( =  2.46.4-3.el10) pkgconfig(cairomm-1.0) ( >=  1.2.2) pkgconfig(glibmm-2.4) ( >=  2.48.0) pkgconfig(pangocairo) ( >=  1.45.1)"
RPROVIDES:pangomm-devel = "pangomm-devel ( =  2.46.4-3.el10) pangomm-devel(x86-64) ( =  2.46.4-3.el10) pkgconfig(pangomm-1.4) ( =  2.46.4)"

URI_pangomm-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pangomm-doc-2.46.4-3.el10.noarch.rpm;unpack=0"
RDEPENDS:pangomm-doc = "glibmm2.4-doc ( ) libsigc++20-doc ( ) pangomm ( =  2.46.4-3.el10)"
RPROVIDES:pangomm-doc = "pangomm-doc ( =  2.46.4-3.el10)"
