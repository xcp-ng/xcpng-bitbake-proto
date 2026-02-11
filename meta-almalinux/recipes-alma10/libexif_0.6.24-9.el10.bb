
PN = "libexif"
PE = "0"
PV = "0.6.24"
PR = "9.el10"
PACKAGES = "libexif libexif-devel libexif-doc"


URI_libexif = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libexif-0.6.24-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libexif = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libexif = "libexif.so.12()(64bit) ( ) libexif ( =  0.6.24-9.el10) libexif(x86-64) ( =  0.6.24-9.el10)"

URI_libexif-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libexif-devel-0.6.24-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libexif-devel = "/usr/bin/pkg-config ( ) libexif.so.12()(64bit) ( ) libexif(x86-64) ( =  0.6.24-9.el10)"
RPROVIDES:libexif-devel = "libexif-devel ( =  0.6.24-9.el10) libexif-devel(x86-64) ( =  0.6.24-9.el10) pkgconfig(libexif) ( =  0.6.24)"

URI_libexif-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libexif-doc-0.6.24-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libexif-doc = "libexif(x86-64) ( =  0.6.24-9.el10)"
RPROVIDES:libexif-doc = "libexif-doc ( =  0.6.24-9.el10) libexif-doc(x86-64) ( =  0.6.24-9.el10)"
