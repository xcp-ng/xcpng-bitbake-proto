
PN = "libical"
PE = "0"
PV = "3.0.18"
PR = "3.el10"
PACKAGES = "libical libical-glib libical-devel libical-glib-devel libical-glib-doc"


URI_libical = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libical-3.0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libical = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libicuuc.so.74()(64bit) ( ) libicui18n.so.74()(64bit) ( ) tzdata ( )"
RPROVIDES:libical = "libical.so.3()(64bit) ( ) libicalvcal.so.3()(64bit) ( ) libicalss.so.3()(64bit) ( ) libical_cxx.so.3()(64bit) ( ) libicalss_cxx.so.3()(64bit) ( ) libical(x86-64) ( =  3.0.18-3.el10) libical ( =  3.0.18-3.el10)"

URI_libical-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libical-glib-3.0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libical-glib = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libical.so.3()(64bit) ( ) libical(x86-64) ( =  3.0.18-3.el10)"
RPROVIDES:libical-glib = "libical-glib.so.3()(64bit) ( ) libical-glib ( =  3.0.18-3.el10) libical-glib(x86-64) ( =  3.0.18-3.el10)"

URI_libical-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libical-devel-3.0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libical-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libical.so.3()(64bit) ( ) libical_cxx.so.3()(64bit) ( ) libicalss.so.3()(64bit) ( ) libicalss_cxx.so.3()(64bit) ( ) libicalvcal.so.3()(64bit) ( ) pkgconfig(icu-i18n) ( ) libical(x86-64) ( =  3.0.18-3.el10)"
RPROVIDES:libical-devel = "libical-devel(x86-64) ( =  3.0.18-3.el10) cmake(LibIcal) ( =  3.0.18) cmake(libical) ( =  3.0.18) libical-devel ( =  3.0.18-3.el10) pkgconfig(libical) ( =  3.0.18)"

URI_libical-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libical-glib-devel-3.0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libical-glib-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) libical-glib.so.3()(64bit) ( ) pkgconfig(libical) ( ) libical-devel(x86-64) ( =  3.0.18-3.el10) libical-glib(x86-64) ( =  3.0.18-3.el10)"
RPROVIDES:libical-glib-devel = "libical-glib-devel ( =  3.0.18-3.el10) libical-glib-devel(x86-64) ( =  3.0.18-3.el10) pkgconfig(libical-glib) ( =  3.0.18)"

URI_libical-glib-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libical-glib-doc-3.0.18-3.el10.noarch.rpm;unpack=0"
RDEPENDS:libical-glib-doc = ""
RPROVIDES:libical-glib-doc = "libical-glib-doc ( =  3.0.18-3.el10)"
