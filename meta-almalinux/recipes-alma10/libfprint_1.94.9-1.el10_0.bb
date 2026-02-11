
PN = "libfprint"
PE = "0"
PV = "1.94.9"
PR = "1.el10_0"
PACKAGES = "libfprint libfprint-devel"


URI_libfprint = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfprint-1.94.9-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfprint = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libgudev-1.0.so.0()(64bit) ( ) libpixman-1.so.0()(64bit) ( ) libgusb.so.2()(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.0)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.2)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.4)(64bit) ( ) libgusb.so.2(LIBGUSB_0.2.8)(64bit) ( ) libgusb.so.2(LIBGUSB_0.3.3)(64bit) ( )"
RPROVIDES:libfprint = "metainfo() ( ) libfprint-2.so.2()(64bit) ( ) libfprint-2.so.2(LIBFPRINT_2.0.0)(64bit) ( ) metainfo(org.freedesktop.libfprint.metainfo.xml) ( ) libfprint ( =  1.94.9-1.el10_0) libfprint(x86-64) ( =  1.94.9-1.el10_0)"

URI_libfprint-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfprint-devel-1.94.9-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfprint-devel = "/usr/bin/pkg-config ( ) libfprint-2.so.2()(64bit) ( ) pkgconfig(gobject-2.0) ( >=  2.68) pkgconfig(gio-unix-2.0) ( >=  2.68) libfprint(x86-64) ( =  1.94.9-1.el10_0)"
RPROVIDES:libfprint-devel = "libfprint-devel ( =  1.94.9-1.el10_0) libfprint-devel(x86-64) ( =  1.94.9-1.el10_0) pkgconfig(libfprint-2) ( =  1.94.9)"
