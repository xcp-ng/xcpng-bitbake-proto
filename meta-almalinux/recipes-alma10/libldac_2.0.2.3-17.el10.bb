
PN = "libldac"
PE = "0"
PV = "2.0.2.3"
PR = "17.el10"
PACKAGES = "libldac libldac-devel"


URI_libldac = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libldac-2.0.2.3-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libldac = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libldac = "libldacBT_abr.so.2()(64bit) ( ) libldacBT_enc.so.2()(64bit) ( ) libldac ( =  2.0.2.3-17.el10) libldac(x86-64) ( =  2.0.2.3-17.el10)"

URI_libldac-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libldac-devel-2.0.2.3-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libldac-devel = "/usr/bin/pkg-config ( ) libldac(x86-64) ( =  2.0.2.3-17.el10)"
RPROVIDES:libldac-devel = "libldac-devel ( =  2.0.2.3-17.el10) libldac-devel(x86-64) ( =  2.0.2.3-17.el10) pkgconfig(ldacBT-abr) ( =  2.0.2.3) pkgconfig(ldacBT-enc) ( =  2.0.2.3)"
