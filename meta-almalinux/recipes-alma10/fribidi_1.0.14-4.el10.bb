
PN = "fribidi"
PE = "0"
PV = "1.0.14"
PR = "4.el10"
PACKAGES = "fribidi fribidi-devel"


URI_fribidi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fribidi-1.0.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fribidi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:fribidi = "libfribidi.so.0()(64bit) ( ) fribidi(x86-64) ( =  1.0.14-4.el10) fribidi ( =  1.0.14-4.el10)"

URI_fribidi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fribidi-devel-1.0.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fribidi-devel = "/usr/bin/pkg-config ( ) libfribidi.so.0()(64bit) ( ) fribidi(x86-64) ( =  1.0.14-4.el10)"
RPROVIDES:fribidi-devel = "fribidi-devel ( =  1.0.14-4.el10) fribidi-devel(x86-64) ( =  1.0.14-4.el10) pkgconfig(fribidi) ( =  1.0.14)"
