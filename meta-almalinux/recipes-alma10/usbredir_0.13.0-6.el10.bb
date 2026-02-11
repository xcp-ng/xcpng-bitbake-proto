
PN = "usbredir"
PE = "0"
PV = "0.13.0"
PR = "6.el10"
PACKAGES = "usbredir usbredir-devel usbredir-tools"


URI_usbredir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbredir-0.13.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbredir = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libusb-1.0.so.0()(64bit) ( )"
RPROVIDES:usbredir = "libusbredirparser.so.1()(64bit) ( ) libusbredirparser.so.1(USBREDIRPARSER_0.8.0)(64bit) ( ) libusbredirhost.so.1()(64bit) ( ) libusbredirhost.so.1(USBREDIRHOST_0.8.0)(64bit) ( ) libusbredirparser.so.1(USBREDIRPARSER_0.10.0)(64bit) ( ) libusbredirparser.so.1(USBREDIRPARSER_0.11.0)(64bit) ( ) usbredir(x86-64) ( =  0.13.0-6.el10) usbredir ( =  0.13.0-6.el10)"

URI_usbredir-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbredir-devel-0.13.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbredir-devel = "/usr/bin/pkg-config ( ) libusbredirparser.so.1()(64bit) ( ) libusbredirhost.so.1()(64bit) ( ) pkgconfig(libusbredirparser-0.5) ( ) usbredir(x86-64) ( =  0.13.0-6.el10) pkgconfig(libusb-1.0) ( >=  1.0.9)"
RPROVIDES:usbredir-devel = "pkgconfig(libusbredirhost) ( =  0.13.0) pkgconfig(libusbredirparser-0.5) ( =  0.13.0) usbredir-devel ( =  0.13.0-6.el10) usbredir-devel(x86-64) ( =  0.13.0-6.el10)"

URI_usbredir-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbredir-tools-0.13.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbredir-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libusbredirhost.so.1()(64bit) ( ) libusbredirhost.so.1(USBREDIRHOST_0.8.0)(64bit) ( ) usbredir(x86-64) ( =  0.13.0-6.el10)"
RPROVIDES:usbredir-tools = "usbredir-tools ( =  0.13.0-6.el10) usbredir-tools(x86-64) ( =  0.13.0-6.el10)"
