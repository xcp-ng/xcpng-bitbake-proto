
PN = "pangomm2.48"
PE = "0"
PV = "2.50.2"
PR = "4.el10"
PACKAGES = "pangomm2.48 pangomm2.48-devel pangomm2.48-doc"


URI_pangomm2.48 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pangomm2.48-2.50.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pangomm2.48 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.32)(64bit) ( ) libsigc-3.0.so.0()(64bit) ( ) libgiomm-2.68.so.1()(64bit) ( ) libglibmm-2.68.so.1()(64bit) ( ) libcairomm-1.16.so.1()(64bit) ( ) glibmm2.68(x86-64) ( >=  2.68.0) cairomm1.16(x86-64) ( >=  1.15.1) pango(x86-64) ( >=  1.49.4)"
RPROVIDES:pangomm2.48 = "libpangomm-2.48.so.1()(64bit) ( ) pangomm2.48 ( =  2.50.2-4.el10) pangomm2.48(x86-64) ( =  2.50.2-4.el10)"

URI_pangomm2.48-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pangomm2.48-devel-2.50.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pangomm2.48-devel = "/usr/bin/pkg-config ( ) libpangomm-2.48.so.1()(64bit) ( ) pkgconfig(giomm-2.68) ( >=  2.68.0) pangomm2.48(x86-64) ( =  2.50.2-4.el10) pkgconfig(cairomm-1.16) ( >=  1.15.1) pkgconfig(pangocairo) ( >=  1.49.4)"
RPROVIDES:pangomm2.48-devel = "pangomm2.48-devel ( =  2.50.2-4.el10) pangomm2.48-devel(x86-64) ( =  2.50.2-4.el10) pkgconfig(pangomm-2.48) ( =  2.50.2)"

URI_pangomm2.48-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pangomm2.48-doc-2.50.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:pangomm2.48-doc = "glibmm2.68-doc ( ) libsigc++30-doc ( ) pangomm2.48 ( =  2.50.2-4.el10)"
RPROVIDES:pangomm2.48-doc = "pangomm2.48-doc ( =  2.50.2-4.el10)"
