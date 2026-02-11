
PN = "libmtp"
PE = "0"
PV = "1.1.19"
PR = "9.el10"
PACKAGES = "libmtp libmtp-devel libmtp-examples"


URI_libmtp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmtp-1.1.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmtp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libusb-1.0.so.0()(64bit) ( )"
RPROVIDES:libmtp = "libmtp.so.9()(64bit) ( ) libmtp ( =  1.1.19-9.el10) libmtp(x86-64) ( =  1.1.19-9.el10)"

URI_libmtp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmtp-devel-1.1.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmtp-devel = "/usr/bin/pkg-config ( ) libmtp.so.9()(64bit) ( ) pkgconfig(libusb-1.0) ( ) libmtp(x86-64) ( =  1.1.19-9.el10)"
RPROVIDES:libmtp-devel = "libmtp-devel ( =  1.1.19-9.el10) libmtp-devel(x86-64) ( =  1.1.19-9.el10) pkgconfig(libmtp) ( =  1.1.19)"

URI_libmtp-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmtp-examples-1.1.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmtp-examples = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libmtp.so.9()(64bit) ( ) libmtp(x86-64) ( =  1.1.19-9.el10)"
RPROVIDES:libmtp-examples = "libmtp-examples ( =  1.1.19-9.el10) libmtp-examples(x86-64) ( =  1.1.19-9.el10)"
