
PN = "geoclue2"
PE = "0"
PV = "2.7.2"
PR = "1.el10"
PACKAGES = "geoclue2 geoclue2-libs geoclue2-demos geoclue2-devel"


URI_geoclue2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/geoclue2-2.7.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geoclue2 = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) dbus ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libnotify.so.4()(64bit) ( ) libavahi-glib.so.1()(64bit) ( ) libmm-glib.so.0()(64bit) ( )"
RPROVIDES:geoclue2 = "application() ( ) group(geoclue) ( ) application(geoclue-demo-agent.desktop) ( ) geoclue2 ( =  2.7.2-1.el10) config(geoclue2) ( =  2.7.2-1.el10) geoclue2(x86-64) ( =  2.7.2-1.el10) user(geoclue) ( =  dSBnZW9jbHVlIC0gIlVzZXIgZm9yIGdlb2NsdWUiIC92YXIvbGliL2dlb2NsdWUgL3NiaW4vbm9sb2dpbgAA)"

URI_geoclue2-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/geoclue2-libs-2.7.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geoclue2-libs = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:geoclue2-libs = "libgeoclue-2.so.0()(64bit) ( ) geoclue2-libs ( =  2.7.2-1.el10) geoclue2-libs(x86-64) ( =  2.7.2-1.el10)"

URI_geoclue2-demos = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/geoclue2-demos-2.7.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geoclue2-demos = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgeoclue-2.so.0()(64bit) ( ) geoclue2-libs(x86-64) ( =  2.7.2-1.el10)"
RPROVIDES:geoclue2-demos = "application() ( ) application(geoclue-where-am-i.desktop) ( ) geoclue2-demos ( =  2.7.2-1.el10) geoclue2-demos(x86-64) ( =  2.7.2-1.el10)"

URI_geoclue2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/geoclue2-devel-2.7.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geoclue2-devel = "/usr/bin/pkg-config ( ) libgeoclue-2.so.0()(64bit) ( ) geoclue2-libs(x86-64) ( =  2.7.2-1.el10) pkgconfig(gio-2.0) ( >=  2.74.0) pkgconfig(gio-unix-2.0) ( >=  2.74.0) pkgconfig(glib-2.0) ( >=  2.74.0)"
RPROVIDES:geoclue2-devel = "geoclue2-devel ( =  2.7.2-1.el10) geoclue2-devel(x86-64) ( =  2.7.2-1.el10) pkgconfig(geoclue-2.0) ( =  2.7.2) pkgconfig(libgeoclue-2.0) ( =  2.7.2)"
