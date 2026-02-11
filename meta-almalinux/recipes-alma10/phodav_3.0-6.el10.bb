
PN = "phodav"
PE = "0"
PV = "3.0"
PR = "6.el10"
PACKAGES = "libphodav libphodav-devel spice-webdavd chezdav"


URI_libphodav = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libphodav-3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libphodav = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libsoup-3.0.so.0()(64bit) ( )"
RPROVIDES:libphodav = "libphodav-3.0.so.0()(64bit) ( ) libphodav-3.0.so.0(LIBPHODAV1_0.0)(64bit) ( ) libphodav(x86-64) ( =  3.0-6.el10) libphodav ( =  3.0-6.el10)"

URI_libphodav-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libphodav-devel-3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libphodav-devel = "/usr/bin/pkg-config ( ) pkgconfig(libxml-2.0) ( ) libphodav-3.0.so.0()(64bit) ( ) libphodav(x86-64) ( =  3.0-6.el10) pkgconfig(gio-unix-2.0) ( >=  2.44) pkgconfig(libsoup-3.0) ( >=  3.0.0)"
RPROVIDES:libphodav-devel = "libphodav-devel ( =  3.0-6.el10) libphodav-devel(x86-64) ( =  3.0-6.el10) pkgconfig(libphodav-3.0) ( =  3.0)"

URI_spice-webdavd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-webdavd-3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-webdavd = "/bin/sh ( ) systemd-units ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) avahi ( ) libavahi-gobject.so.0()(64bit) ( )"
RPROVIDES:spice-webdavd = "spice-webdavd ( =  3.0-6.el10) spice-webdavd(x86-64) ( =  3.0-6.el10)"

URI_chezdav = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/chezdav-3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:chezdav = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libavahi-gobject.so.0()(64bit) ( ) libphodav-3.0.so.0()(64bit) ( ) libphodav-3.0.so.0(LIBPHODAV1_0.0)(64bit) ( )"
RPROVIDES:chezdav = "chezdav ( =  3.0-6.el10) chezdav(x86-64) ( =  3.0-6.el10)"
