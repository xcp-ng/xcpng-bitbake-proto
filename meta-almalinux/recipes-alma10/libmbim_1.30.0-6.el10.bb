
PN = "libmbim"
PE = "0"
PV = "1.30.0"
PR = "6.el10"
PACKAGES = "libmbim libmbim-utils libmbim-devel"


URI_libmbim = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libmbim-1.30.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmbim = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libmbim = "libmbim-glib.so.4()(64bit) ( ) libmbim(x86-64) ( =  1.30.0-6.el10) libmbim ( =  1.30.0-6.el10)"

URI_libmbim-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libmbim-utils-1.30.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmbim-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libmbim-glib.so.4()(64bit) ( ) libmbim(x86-64) ( =  1.30.0-6.el10)"
RPROVIDES:libmbim-utils = "libmbim-utils ( =  1.30.0-6.el10) libmbim-utils(x86-64) ( =  1.30.0-6.el10)"

URI_libmbim-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmbim-devel-1.30.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmbim-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gio-2.0) ( ) pkgconfig(gio-unix-2.0) ( ) glib2-devel(x86-64) ( ) libmbim-glib.so.4()(64bit) ( ) pkgconfig(glib-2.0) ( >=  2.56) libmbim(x86-64) ( =  1.30.0-6.el10)"
RPROVIDES:libmbim-devel = "libmbim-devel ( =  1.30.0-6.el10) libmbim-devel(x86-64) ( =  1.30.0-6.el10) pkgconfig(mbim-glib) ( =  1.30.0)"
