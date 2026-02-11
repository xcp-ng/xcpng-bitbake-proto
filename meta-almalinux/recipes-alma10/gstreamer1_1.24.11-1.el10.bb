
PN = "gstreamer1"
PE = "0"
PV = "1.24.11"
PR = "1.el10"
PACKAGES = "gstreamer1 gstreamer1-devel"


URI_gstreamer1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgio-2.0.so.0()(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libcap.so.2()(64bit) ( )"
RPROVIDES:gstreamer1 = "libgstreamer-1.0.so.0()(64bit) ( ) libgstbase-1.0.so.0()(64bit) ( ) libgstnet-1.0.so.0()(64bit) ( ) libgstcontroller-1.0.so.0()(64bit) ( ) libgstcheck-1.0.so.0()(64bit) ( ) libgstcoreelements.so()(64bit) ( ) libgstcoretracers.so()(64bit) ( ) gstreamer1 ( =  1.24.11-1.el10) gstreamer1(x86-64) ( =  1.24.11-1.el10)"

URI_gstreamer1-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-devel-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-devel = "/usr/bin/pkg-config ( ) libgstreamer-1.0.so.0()(64bit) ( ) pkgconfig(gio-2.0) ( ) libgstbase-1.0.so.0()(64bit) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gmodule-no-export-2.0) ( ) libgstnet-1.0.so.0()(64bit) ( ) pkgconfig(gio-unix-2.0) ( ) pkgconfig(gstreamer-1.0) ( ) pkgconfig(gstreamer-base-1.0) ( ) check-devel ( ) libgstcontroller-1.0.so.0()(64bit) ( ) libgstcheck-1.0.so.0()(64bit) ( ) gstreamer1 ( =  1.24.11-1.el10) glib2-devel(x86-64) ( >=  2.32.0) libxml2-devel(x86-64) ( >=  2.4.0) pkgconfig(glib-2.0) ( >=  2.64.0)"
RPROVIDES:gstreamer1-devel = "gstreamer1-devel ( =  1.24.11-1.el10) gstreamer1-devel(x86-64) ( =  1.24.11-1.el10) pkgconfig(gstreamer-1.0) ( =  1.24.11) pkgconfig(gstreamer-base-1.0) ( =  1.24.11) pkgconfig(gstreamer-check-1.0) ( =  1.24.11) pkgconfig(gstreamer-controller-1.0) ( =  1.24.11) pkgconfig(gstreamer-net-1.0) ( =  1.24.11)"
