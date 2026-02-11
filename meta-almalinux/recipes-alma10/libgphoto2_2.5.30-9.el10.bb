
PN = "libgphoto2"
PE = "0"
PV = "2.5.30"
PR = "9.el10"
PACKAGES = "libgphoto2 libgphoto2-devel"


URI_libgphoto2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgphoto2-2.5.30-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgphoto2 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libltdl.so.7()(64bit) ( ) libgd.so.3()(64bit) ( ) libjpeg.so.62(LIBJPEGTURBO_6.2)(64bit) ( ) libxml2.so.2(LIBXML2_2.7.3)(64bit) ( ) libexif.so.12()(64bit) ( ) liblockdev.so.1()(64bit) ( )"
RPROVIDES:libgphoto2 = "libgphoto2.so.6()(64bit) ( ) libgphoto2_port.so.12()(64bit) ( ) libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) ( ) libgphoto2_port.so.12(LIBGPHOTO2_INTERNAL)(64bit) ( ) libgphoto2 ( =  2.5.30-9.el10) libgphoto2(x86-64) ( =  2.5.30-9.el10)"

URI_libgphoto2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgphoto2-devel-2.5.30-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgphoto2-devel = "/usr/bin/pkg-config ( ) /usr/bin/sh ( ) libgphoto2.so.6()(64bit) ( ) libgphoto2_port.so.12()(64bit) ( ) libgphoto2(x86-64) ( =  2.5.30-9.el10) pkgconfig(libexif) ( >=  0.6.13) pkgconfig(libgphoto2_port) ( >=  0.12.1)"
RPROVIDES:libgphoto2-devel = "gphoto2-devel ( =  2.5.30-9.el10) libgphoto2-devel ( =  2.5.30-9.el10) libgphoto2-devel(x86-64) ( =  2.5.30-9.el10) pkgconfig(libgphoto2) ( =  2.5.30) pkgconfig(libgphoto2_port) ( =  0.12.1)"
