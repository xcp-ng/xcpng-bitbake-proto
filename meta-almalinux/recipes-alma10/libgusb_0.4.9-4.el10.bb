
PN = "libgusb"
PE = "0"
PV = "0.4.9"
PR = "4.el10"
PACKAGES = "libgusb libgusb-devel"


URI_libgusb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgusb-0.4.9-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgusb = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libusb-1.0.so.0()(64bit) ( )"
RPROVIDES:libgusb = "libgusb.so.2()(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.0)(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.1)(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.7)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.11)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.2)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.4)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.5)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.8)(64bit) ( ) libgusb.so.2(LIBGUSB_0.3.1)(64bit) ( ) libgusb.so.2(LIBGUSB_0.3.3)(64bit) ( ) libgusb.so.2(LIBGUSB_0.3.5)(64bit) ( ) libgusb.so.2(LIBGUSB_0.3.6)(64bit) ( ) libgusb.so.2(LIBGUSB_0.3.8)(64bit) ( ) libgusb.so.2(LIBGUSB_0.4.0)(64bit) ( ) libgusb.so.2(LIBGUSB_0.4.1)(64bit) ( ) libgusb.so.2(LIBGUSB_0.4.3)(64bit) ( ) libgusb.so.2(LIBGUSB_0.4.4)(64bit) ( ) libgusb.so.2(LIBGUSB_0.4.7)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.9)(64bit) ( ) libgusb.so.2(LIBGUSB_0.3.10)(64bit) ( ) libgusb.so.2(LIBGUSB_0.4.5)(64bit) ( ) libgusb ( =  0.4.9-4.el10) libgusb(x86-64) ( =  0.4.9-4.el10)"

URI_libgusb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgusb-devel-0.4.9-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgusb-devel = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) pkgconfig(gobject-2.0) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgusb.so.2()(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.0)(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.1)(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.7)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.11)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.2)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.4)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.9)(64bit) ( ) libgusb.so.2(LIBGUSB_0.4.0)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) pkgconfig(gio-2.0) ( >=  2.44.0) pkgconfig(json-glib-1.0) ( >=  1.1.1) libgusb ( =  0.4.9-4.el10) pkgconfig(libusb-1.0) ( >=  1.0.9)"
RPROVIDES:libgusb-devel = "libgusb-devel ( =  0.4.9-4.el10) libgusb-devel(x86-64) ( =  0.4.9-4.el10) pkgconfig(gusb) ( =  0.4.9)"
