
PN = "xdg-desktop-portal"
PE = "0"
PV = "1.20.0"
PR = "1.el10_0"
PACKAGES = "xdg-desktop-portal xdg-desktop-portal-devel"


URI_xdg-desktop-portal = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xdg-desktop-portal-1.20.0-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xdg-desktop-portal = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) dbus ( ) libgudev-1.0.so.0()(64bit) ( ) libgstreamer-1.0.so.0()(64bit) ( ) libpipewire-0.3.so.0()(64bit) ( ) libfuse3.so.3()(64bit) ( ) libfuse3.so.3(FUSE_3.0)(64bit) ( ) libgstpbutils-1.0.so.0()(64bit) ( ) fuse3 ( ) libdex-1.so.1()(64bit) ( ) libfuse3.so.3(FUSE_3.12)(64bit) ( ) libfuse3.so.3(FUSE_3.2)(64bit) ( ) geoclue2 ( >=  2.5.2) glib2(x86-64) ( >=  2.72.0) libportal(x86-64) ( >=  0.9.0) pipewire-libs(x86-64) ( >=  0.2.90)"
RPROVIDES:xdg-desktop-portal = "xdg-desktop-portal ( =  1.20.0-1.el10_0) xdg-desktop-portal(x86-64) ( =  1.20.0-1.el10_0)"

URI_xdg-desktop-portal-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xdg-desktop-portal-devel-1.20.0-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xdg-desktop-portal-devel = "/usr/bin/pkg-config ( ) xdg-desktop-portal(x86-64) ( =  1.20.0-1.el10_0)"
RPROVIDES:xdg-desktop-portal-devel = "pkgconfig(xdg-desktop-portal) ( =  1.20.0) xdg-desktop-portal-devel ( =  1.20.0-1.el10_0) xdg-desktop-portal-devel(x86-64) ( =  1.20.0-1.el10_0)"
