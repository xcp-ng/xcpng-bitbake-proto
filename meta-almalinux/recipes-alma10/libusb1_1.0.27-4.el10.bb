
PN = "libusb1"
PE = "0"
PV = "1.0.27"
PR = "4.el10"
PACKAGES = "libusb1 libusb1-devel libusb1-devel-doc libusb1-tests-examples"


URI_libusb1 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libusb1-1.0.27-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libusb1 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( )"
RPROVIDES:libusb1 = "libusb-1.0.so.0()(64bit) ( ) libusb1 ( =  1.0.27-4.el10) libusb1(x86-64) ( =  1.0.27-4.el10) libusbx ( =  1.0.27-4.el10)"

URI_libusb1-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libusb1-devel-1.0.27-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libusb1-devel = "/usr/bin/pkg-config ( ) libusb-1.0.so.0()(64bit) ( ) libusb1(x86-64) ( =  1.0.27-4.el10)"
RPROVIDES:libusb1-devel = "libusb1-devel ( =  1.0.27-4.el10) libusb1-devel(x86-64) ( =  1.0.27-4.el10) libusbx-devel ( =  1.0.27-4.el10) pkgconfig(libusb-1.0) ( =  1.0.27)"

URI_libusb1-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libusb1-devel-doc-1.0.27-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libusb1-devel-doc = "libusb1-devel ( =  1.0.27-4.el10)"
RPROVIDES:libusb1-devel-doc = "libusb1-devel-doc ( =  1.0.27-4.el10) libusbx-devel-doc ( =  1.0.27-4.el10)"

URI_libusb1-tests-examples = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libusb1-tests-examples-1.0.27-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libusb1-tests-examples = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libumockdev.so.0()(64bit) ( ) libumockdev-preload.so.0()(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libusb1(x86-64) ( =  1.0.27-4.el10)"
RPROVIDES:libusb1-tests-examples = "libusb1-tests-examples ( =  1.0.27-4.el10) libusb1-tests-examples(x86-64) ( =  1.0.27-4.el10) libusbx-tests-examples ( =  1.0.27-4.el10)"
