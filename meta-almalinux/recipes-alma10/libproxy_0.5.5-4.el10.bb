
PN = "libproxy"
PE = "0"
PV = "0.5.5"
PR = "4.el10"
PACKAGES = "libproxy libproxy-bin libproxy-devel"


URI_libproxy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libproxy-0.5.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libproxy = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcurl.so.4()(64bit) ( ) libduktape.so.207()(64bit) ( )"
RPROVIDES:libproxy = "libproxy.so.1()(64bit) ( ) libproxy.so.1(LIBPROXY_0.4.16)(64bit) ( ) libproxy.so.1(LIBPROXY_0.5.5)(64bit) ( ) libproxy ( =  0.5.5-4.el10) libproxy(x86-64) ( =  0.5.5-4.el10) libproxy-duktape ( =  0.5.5-4.el10) libproxy-gnome ( =  0.5.5-4.el10) libproxy-kde ( =  0.5.5-4.el10) libproxy-mozjs ( =  0.5.5-4.el10) libproxy-pac ( =  0.5.5-4.el10) libproxy-pacrunner ( =  0.5.5-4.el10) libproxy-webkitgtk4 ( =  0.5.5-4.el10) python3-libproxy ( =  0.5.5-4.el10)"

URI_libproxy-bin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libproxy-bin-0.5.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libproxy-bin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libproxy.so.1()(64bit) ( ) libproxy.so.1(LIBPROXY_0.4.16)(64bit) ( ) libproxy(x86-64) ( =  0.5.5-4.el10)"
RPROVIDES:libproxy-bin = "libproxy-bin ( =  0.5.5-4.el10) libproxy-bin(x86-64) ( =  0.5.5-4.el10)"

URI_libproxy-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libproxy-devel-0.5.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libproxy-devel = "/usr/bin/pkg-config ( ) pkgconfig(gobject-2.0) ( ) libproxy.so.1()(64bit) ( ) libproxy(x86-64) ( =  0.5.5-4.el10)"
RPROVIDES:libproxy-devel = "libproxy-devel ( =  0.5.5-4.el10) libproxy-devel(x86-64) ( =  0.5.5-4.el10) pkgconfig(libproxy-1.0) ( =  0.5.5)"
