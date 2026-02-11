
PN = "libverto"
PE = "0"
PV = "0.3.2"
PR = "10.el10"
PACKAGES = "libverto libverto-libev libverto-devel libverto-glib libverto-glib-devel libverto-libev-devel libverto-libevent libverto-libevent-devel"


URI_libverto = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libverto-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libverto = "libverto.so.1()(64bit) ( ) libverto(x86-64) ( =  0.3.2-10.el10) libverto ( =  0.3.2-10.el10)"

URI_libverto-libev = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libverto-libev-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-libev = "rtld(GNU_HASH) ( ) libverto.so.1()(64bit) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) libev.so.4()(64bit) ( ) libverto(x86-64) ( =  0.3.2-10.el10)"
RPROVIDES:libverto-libev = "libverto-libev.so.1()(64bit) ( ) libverto-libev ( =  0.3.2-10.el10) libverto-libev(x86-64) ( =  0.3.2-10.el10) libverto-module-base ( =  0.3.2-10.el10)"

URI_libverto-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libverto-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libverto.so.1()(64bit) ( ) libverto(x86-64) ( =  0.3.2-10.el10)"
RPROVIDES:libverto-devel = "libverto-devel ( =  0.3.2-10.el10) libverto-devel(x86-64) ( =  0.3.2-10.el10) pkgconfig(libverto) ( =  0.3.2)"

URI_libverto-glib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-glib-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-glib = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) libverto.so.1()(64bit) ( ) libverto(x86-64) ( =  0.3.2-10.el10)"
RPROVIDES:libverto-glib = "libverto-glib.so.1()(64bit) ( ) libverto-glib(x86-64) ( =  0.3.2-10.el10) libverto-glib ( =  0.3.2-10.el10)"

URI_libverto-glib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-glib-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-glib-devel = "/usr/bin/pkg-config ( ) pkgconfig(libverto) ( ) libverto-glib.so.1()(64bit) ( ) libverto-devel(x86-64) ( =  0.3.2-10.el10) libverto-glib(x86-64) ( =  0.3.2-10.el10)"
RPROVIDES:libverto-glib-devel = "libverto-glib-devel ( =  0.3.2-10.el10) libverto-glib-devel(x86-64) ( =  0.3.2-10.el10) pkgconfig(libverto-glib) ( =  0.3.2)"

URI_libverto-libev-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-libev-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-libev-devel = "/usr/bin/pkg-config ( ) pkgconfig(libverto) ( ) libverto-libev.so.1()(64bit) ( ) libverto-devel(x86-64) ( =  0.3.2-10.el10) libverto-libev(x86-64) ( =  0.3.2-10.el10)"
RPROVIDES:libverto-libev-devel = "libverto-libev-devel ( =  0.3.2-10.el10) libverto-libev-devel(x86-64) ( =  0.3.2-10.el10) pkgconfig(libverto-libev) ( =  0.3.2)"

URI_libverto-libevent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-libevent-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-libevent = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libevent-2.1.so.7()(64bit) ( ) libverto.so.1()(64bit) ( ) libverto(x86-64) ( =  0.3.2-10.el10)"
RPROVIDES:libverto-libevent = "libverto-libevent.so.1()(64bit) ( ) libverto-libevent(x86-64) ( =  0.3.2-10.el10) libverto-module-base ( =  0.3.2-10.el10) libverto-libevent ( =  0.3.2-10.el10)"

URI_libverto-libevent-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libverto-libevent-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libverto-libevent-devel = "/usr/bin/pkg-config ( ) pkgconfig(libverto) ( ) libverto-libevent.so.1()(64bit) ( ) libverto-devel(x86-64) ( =  0.3.2-10.el10) libverto-libevent(x86-64) ( =  0.3.2-10.el10)"
RPROVIDES:libverto-libevent-devel = "libverto-libevent-devel ( =  0.3.2-10.el10) libverto-libevent-devel(x86-64) ( =  0.3.2-10.el10) pkgconfig(libverto-libevent) ( =  0.3.2)"
