
PN = "atkmm"
PE = "0"
PV = "2.28.4"
PR = "2.el10"
PACKAGES = "atkmm atkmm-devel atkmm-doc"


URI_atkmm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/atkmm-2.28.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:atkmm = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libsigc-2.0.so.0()(64bit) ( ) libglibmm-2.4.so.1()(64bit) ( ) glibmm24(x86-64) ( >=  2.46.2)"
RPROVIDES:atkmm = "libatkmm-1.6.so.1()(64bit) ( ) atkmm ( =  2.28.4-2.el10) atkmm(x86-64) ( =  2.28.4-2.el10)"

URI_atkmm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/atkmm-devel-2.28.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:atkmm-devel = "/usr/bin/pkg-config ( ) libatkmm-1.6.so.1()(64bit) ( ) atkmm(x86-64) ( =  2.28.4-2.el10) pkgconfig(atk) ( >=  2.12.0) pkgconfig(glibmm-2.4) ( >=  2.46.2)"
RPROVIDES:atkmm-devel = "atkmm-devel ( =  2.28.4-2.el10) atkmm-devel(x86-64) ( =  2.28.4-2.el10) pkgconfig(atkmm-1.6) ( =  2.28.4)"

URI_atkmm-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/atkmm-doc-2.28.4-2.el10.noarch.rpm;unpack=0"
RDEPENDS:atkmm-doc = "glibmm24-doc ( ) atkmm ( =  2.28.4-2.el10)"
RPROVIDES:atkmm-doc = "atkmm-doc ( =  2.28.4-2.el10)"
