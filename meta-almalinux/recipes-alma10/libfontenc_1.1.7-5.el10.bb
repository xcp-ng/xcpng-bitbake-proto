
PN = "libfontenc"
PE = "0"
PV = "1.1.7"
PR = "5.el10"
PACKAGES = "libfontenc libfontenc-devel"


URI_libfontenc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfontenc-1.1.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfontenc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( )"
RPROVIDES:libfontenc = "libfontenc.so.1()(64bit) ( ) libfontenc ( =  1.1.7-5.el10) libfontenc(x86-64) ( =  1.1.7-5.el10)"

URI_libfontenc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfontenc-devel-1.1.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfontenc-devel = "/usr/bin/pkg-config ( ) libfontenc.so.1()(64bit) ( ) libfontenc ( =  1.1.7-5.el10)"
RPROVIDES:libfontenc-devel = "libfontenc-devel ( =  1.1.7-5.el10) libfontenc-devel(x86-64) ( =  1.1.7-5.el10) pkgconfig(fontenc) ( =  1.1.7)"
